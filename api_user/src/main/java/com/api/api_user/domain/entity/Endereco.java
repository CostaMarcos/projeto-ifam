package com.api.api_user.domain.entity;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;

import org.hibernate.validator.constraints.Length;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "endereco")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Endereco {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    @Column(name="cep")
    @NotBlank(message="O cep é obrigatório")
    @Length(message="O cep tem no máximo 11 caracteres", max=11)
    String cep;
    @Column(name="rua")
    @NotBlank(message="A rua é obrigatório")
    @Length(message="A rua pode ter no máximo 64 caracteres", max=64)
    String rua;
    @Column(name="bairro")
    @NotBlank(message="O bairro é obrigatório")
    @Length(message="O bairro pode ter no máximo 64 caracteres", max=64)
    String bairro;
    @Column(name="numero")
    @NotBlank(message = "O número é obrigatório")
    Integer numero;
    @Column(name="cidade")
    @NotBlank(message = "O cidade é obrigatória")
    @Length(message = "O campo cidade deve ter no máximo 64 caracteres", max=64)
    String cidade;
    @Column(name="uf")
    @NotBlank(message = "A uf é obrigatória")
    @Length(message = "O campo uf deve ter no maximo 20 caracteres", max=20)
    String cidade;
    
}

