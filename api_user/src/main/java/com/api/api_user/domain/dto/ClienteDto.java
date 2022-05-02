package com.api.api_user.domain.dto;

import java.sql.Date;

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
}
