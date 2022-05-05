package br.com.alura.forum.config.validacao;

import javax.management.loading.PrivateClassLoader;

/**
 * @author milla
 *
 */
public class ErroDeFormularioDto {
	
	private String campo;
	private String erro;
	
	//passar o campo e MSG de erro.
	public ErroDeFormularioDto(String campo, String erro) {
		super();
		this.campo = campo;
		this.erro = erro;
	}

	public String getCampo() {
		return campo;
	}

	public String getErro() {
		return erro;
	}
	
	

}
