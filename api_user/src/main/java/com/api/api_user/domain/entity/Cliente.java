package com.api.api_user.domain.entity;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ForeignKey;
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
@Table(name = "cliente")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Cliente {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    @Column(name="cpf")
    @NotBlank(message="O CPF é obrigatório")
    @Length(message="O cpf tem no máximo 11 caracteres", max=11)
    String cpf;
    @Column(name="nome")
    @NotBlank(message="O nome é obrigatório")
    @Length(message="O nome pode ter no máximo 64 caracteres", max=64)
    String nome;
    @Column(name="sexo")
    @NotBlank(message="O sexo é obrigatório")
    Boolean sexo;
    @Column(name="DataNascimento")
    @NotBlank(message = "A data de nascimento é obrigatória")
    @Length(message = "O campo nascimento deve ser uma data")
    Date DataNascimento;
    @Column(name="endereco_id")
    @NotBlank(message = "O endereço é obrigatório")
    Long endereco_id;
}
