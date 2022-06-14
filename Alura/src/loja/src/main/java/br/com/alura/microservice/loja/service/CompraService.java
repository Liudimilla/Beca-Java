package br.com.alura.microservice.loja.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import br.com.alura.microservice.loja.client.FornecedorClient;
import br.com.alura.microservice.loja.dto.CompraDTO;
import br.com.alura.microservice.loja.dto.InfoFornecedorDTO;
//Implementação com Spring Feign
@Service
public class CompraService {
	 
	
	@Autowired
	private FornecedorClient fornecedorClient;
	
public void realizaCompra(CompraDTO compra) {
		
	InfoFornecedorDTO info	= fornecedorClient.getInfoPorEstado(compra.getEndereco().getEstado());	
				
		System.out.println(info.getEndereco());
	}

}
