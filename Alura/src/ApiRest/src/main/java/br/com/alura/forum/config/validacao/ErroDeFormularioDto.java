package br.com.alura.forum.config.validacao;

public class ErroDeFormularioDto {
	private String campo;
    private String erro;

    public ErroDeFormularioDto(String campo, String erro) {
        this.campo = campo;
            this.erro = erro;
  }

    public String getCampo() {
        return campo;
    }

    public String getErro() {
        return erro;
        
//        List<FieldError> fieldErrors = exception.getBindingResult().getFieldErrors();
//        fieldErrors.forEach(e -> {
//            ErroDeFormularioDto erro = new ErroDeFormularioDto(campo, erro); 
//         });
//
//         return dto;
//      }
//
//    }
    }
}
