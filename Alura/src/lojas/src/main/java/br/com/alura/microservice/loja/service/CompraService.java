package br.com.alura.microservice.loja.service;


import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.slf4j.Logger;
import br.com.alura.microservice.loja.client.FornecedorClient;
import br.com.alura.microservice.loja.dto.CompraDTO;
import br.com.alura.microservice.loja.dto.InfoFornecedorDTO;
import br.com.alura.microservice.loja.dto.InfoPedidoDTO;
import br.com.alura.microservice.loja.model.Compra;

@Service
public class CompraService {
   
	private static final Logger LOG = LoggerFactory.getLogger(CompraService.class);
	
	@Autowired
	private FornecedorClient fornecedorClient;

	public Compra realizaCompra(CompraDTO compra) {
		 
		final String estado = compra.getEndereco().getEstado();
	
		LOG.info("buscando informaçao do fornecedor de {}", estado);
		InfoFornecedorDTO info = fornecedorClient.getInfoPorEstado(compra.getEndereco().getEstado());
		
		LOG.info("realizando o pedido");
		InfoPedidoDTO pedido = fornecedorClient.realizaPedido(compra.getItens());
		
		         
				 System.out.println(info.getEndereco());
				 
				 Compra compraSalva = new Compra();
				 compraSalva.setPedidoId(pedido.getId());
				 compraSalva.setTempoDePreparo(pedido.getTempoDePreparo());
				 compraSalva.setEnderecoDestino(compra.getEndereco().toString());
				 
				 return compraSalva;
	}

	}
