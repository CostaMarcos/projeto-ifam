package com.api.api_user.domain.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class EnderecoDto {
    Long id;
    String cep;
    String rua;
    String bairro;
    Integer numero;
    String cidade;
    String uf;
}
