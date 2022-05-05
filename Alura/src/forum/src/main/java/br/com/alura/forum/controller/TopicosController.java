package br.com.alura.forum.controller;

import java.net.URI;
import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponentsBuilder;

import br.com.alura.forum.controller.dto.DetalhesDoTopicoDto;
import br.com.alura.forum.controller.dto.TopicoDto;
import br.com.alura.forum.controller.form.AtualizacaoTopicoForm;
import br.com.alura.forum.controller.form.TopicoForm;
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
	
	//Fazer a Listagem
	@GetMapping
	//Dto para puxar somente alguns atributos.
	public List<TopicoDto> lista(String nomeCurso) {
		if(nomeCurso == null) {
			List<Topico> topicos = topicoRepository.findAll();
			return TopicoDto.converter(topicos);
		}else {
			
		List<Topico> topicos = topicoRepository.findByCursoNome(nomeCurso);
		return TopicoDto.converter(topicos);
		
		
		
//		Para topico em memoria
//		Topico topico = new Topico("Dúvida", "Dúvida com Spring", new Curso("Spring", "Programação"));
//		return TopicoDto.converter(Arrays.asList(topico, topico, topico));
	}
	
	
//para devolver uma lista, com todos atributos....	
//	public List<TopicoDto> lista() {
//		Topico topico = new Topico("Dúvida", "Dúvida com Spring", new Curso("Spring", "Programação"));
//		
//		return TopicoDto.converter(Arrays.asList(topico, topico, topico));
//	}


	}
	//Fazer o cadastro
	@PostMapping 
	public ResponseEntity<TopicoDto> cadastrar(@RequestBody @Valid TopicoForm form, UriComponentsBuilder uriBuilder) {
		Topico topico = form.converter(cursoRepository);
		topicoRepository.save(topico);
		
		//devovera o codigo 201(um novo recurso foi criado com sucesso).
		URI uri = uriBuilder.path("/topicos/{id}").buildAndExpand(topico.getId()).toUri();
		return ResponseEntity.created(uri).body(new TopicoDto(topico));
		}
	   
	//para trazer a lista de detalhes.
	@GetMapping("/{id}")
	public ResponseEntity<DetalhesDoTopicoDto> detalhar(@PathVariable Long id) {
	    Optional<Topico> topico = topicoRepository.findById(id);
	        if (topico.isPresent()) {
	        return ResponseEntity.ok(new DetalhesDoTopicoDto(topico.get()));
	    }
	        return ResponseEntity.notFound().build();
	}
	 //para trazer alguns detalhes.
//	     public TopicoDto detalhar(@PathVariable Long id) {
//	     Topico topico = topicoRepository.getOne(id);
//	     return new TopicoDto(topico);
//	     }


	@PutMapping("/{id}")
	@Transactional
	public ResponseEntity<TopicoDto> atualizar(@PathVariable Long id, @RequestBody @Valid AtualizacaoTopicoForm form) {
	    Optional<Topico> optional = topicoRepository.findById(id);
	        if (optional.isPresent()) {
	        Topico topico = form.atualizar(id, topicoRepository);
	        return ResponseEntity.ok(new TopicoDto(topico));
	    }

	        return ResponseEntity.notFound().build();
	}
	
	@DeleteMapping("/{id}") 
	@Transactional
	public ResponseEntity<?> remover(@PathVariable Long id) {
	    Optional<Topico> optional = topicoRepository.findById(id);
	        if (optional.isPresent()) {
	            topicoRepository.deleteById(id);
	                return ResponseEntity.ok().build();
	      }
	        return ResponseEntity.notFound().build();

	    }
	
	}
	   
	
		
	

//Obs.: TopicoDTo; sai da API para o cliente  /TopicoForm; chega do cliente para API