package br.com.alura.forum.config.security;

import br.com.alura.forum.modelo.Usuario;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Service;

import java.util.Date;

@SuppressWarnings("ALL")
@Service
public class TokenService {

 @Value("${forum.jwt.experation}")
 private String experation;

 @Value("${forum.jwt.secret}")
 private String secret;

       public String gerarToken(Authentication authentication) {
       Usuario logado = (Usuario) authentication.getPrincipal();
       Date hoje = new Date();
       Date dataExpiracao = new Date(hoje.getTime()+ Long.parseLong(experation));

  return Jwts.builder()
          .setIssuer("API do forum da Alura")
          .setSubject(logado.getId().toString())
          .setIssuedAt(hoje)
          .setExpiration(dataExpiracao)
          .signWith(SignatureAlgorithm.HS256, secret)//criptografia de senha
  .compact();
  }
}
