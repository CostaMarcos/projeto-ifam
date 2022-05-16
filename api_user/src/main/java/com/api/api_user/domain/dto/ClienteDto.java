package com.api.api_user.domain.dto;

import java.sql.Date;
import com.api.api_user.domain.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ClienteDto {
    Long id;
    String cpf;
    String nome;
    Boolean sexo;
    Date DataNascimento;
    EnderecoDto endereco;

    String login;
    String senha;
    String email;
}
