package br.com.alura.forum.Controller;

import java.net.URI;


//import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponentsBuilder;

import br.com.alura.forum.Controller.dto.DetalhesDoTopicoDto;
import br.com.alura.forum.Controller.dto.TopicoDto;
import br.com.alura.forum.Controller.form.AtualizacaoTopicoForm;
import br.com.alura.forum.Controller.form.TopicoForm;
//import br.com.alura.forum.modelo.Curso;
import br.com.alura.forum.modelo.Topico;
import br.com.alura.forum.repository.CursoRepository;
import br.com.alura.forum.repository.TopicoRepository;


@RestController
@RequestMapping("/topicos")
public class TopicosController {

    @Autowired
        private TopicoRepository topicoRepository;
    @Autowired
        private CursoRepository cursoRepository;

    /*Para tratar o erro 404 na classe controller, devemos utilizar o método findById, ao invés do método getOne, 
     * e utilizar a classe ResponseEntity para montar a resposta de not found;
     */
        @GetMapping
        @Cacheable(value = "listaDeTopicos")//para guarda o retorno em cache
        public Page<TopicoDto> lista(@RequestParam (required = false) String nomeCurso,@PageableDefault(sort = "id", direction = Direction.DESC) Pageable paginaçao) {
        	//Pageable paginaçao = PageRequest.of(pagina, qtd, Direction.ASC, ordenaçao);//Direction.ASC ; para por ordem crescente.[para simplificar tiramos essa pagina]
        	
        	if (nomeCurso == null) {//@RequestParam e um resquest de paramentro/(required = false)para colocar como opçional
                Page<Topico> topicos = topicoRepository.findAll(paginaçao);
                return TopicoDto.converter(topicos);
              } else {
                    Page<Topico> topicos = topicoRepository.findByCursoNome(nomeCurso,paginaçao);
                        return TopicoDto.converter(topicos);
                }
            }

            @PostMapping
            @Transactional
            @CacheEvict(value = "listaDeTopicos", allEntries = true) // pedir para limpar o cache
            public ResponseEntity<TopicoDto> cadastrar(@RequestBody @Valid TopicoForm form,UriComponentsBuilder uriBuilder) {//RESPONSEENTITY - novo recurso foi criado com sucesso
            	
				Topico topico = form.converter(cursoRepository); // @Valid : Validações com Bean Validation
            	topicoRepository.save(topico);
            	

            	        URI uri = uriBuilder.path("/topicos/{id}").buildAndExpand(topico.getId()).toUri();
            	        return ResponseEntity.created(uri).body(new TopicoDto(topico));
            	   
            	        }
            //Para receber parâmetros dinâmicos no path da URL, devemos utilizar a anotação @PathVariable
            
            @GetMapping("/{id}") //Com tratamento de mensagem de erro .::
            public ResponseEntity<DetalhesDoTopicoDto> detalhar(@PathVariable Long id) {
                Optional<Topico> topico = topicoRepository.findById(id); //O método findById retorna um objeto Optional<>, que pode ou não conter um objeto.
                    if (topico.isPresent()) {
                    return ResponseEntity.ok(new DetalhesDoTopicoDto(topico.get()));
                }
                    return ResponseEntity.notFound().build();
            }
            	
// Para fazer o controle transacional automático, devemos utilizar a anotação @Transactional nos métodos do controller;
@PutMapping("/{id}")
@Transactional
public ResponseEntity<TopicoDto> atualizar(@PathVariable Long id, @RequestBody @Valid AtualizacaoTopicoForm form) {
    Topico topico = form.atualizar(id, topicoRepository);
    
    return ResponseEntity.ok(new TopicoDto(topico));
}
@DeleteMapping("/{id}")
public ResponseEntity<?> remover(@PathVariable Long id) {
    topicoRepository.deleteById(id);
        return ResponseEntity.ok().build();
}
}
//O método getOne lança uma exception quando o id passado como parâmetro não existir no banco de dados;
    