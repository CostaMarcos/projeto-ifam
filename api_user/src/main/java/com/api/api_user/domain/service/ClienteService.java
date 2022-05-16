package com.api.api_user.domain.service;

import com.api.api_user.domain.dto.ClienteDto;
import com.api.api_user.domain.dto.ResponseDto;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ch.qos.logback.core.net.server.Client;

import com.api.api_user.domain.entity.Cliente;
import com.api.api_user.domain.enumeration.Status;
import com.api.api_user.domain.repository.ClienteRepository;
import java.util.List;
import java.util.stream.Collectors;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class ClienteService {
    @Autowired
    private ModelMapper modelMapper;

    @Autowired
    private ResponseDto responseDto;

    ClienteRepository clienteRepository;

    public ResponseDto createCliente(Cliente cliente) {
        responseDto.setId(clienteRepository.save(cliente).getId());
        responseDto.setMenssage("Cliente criado com sucesso!");
        responseDto.setStatus(Status.SUCCESS.value());
        return responseDto;
    }

    public List<ClienteDto> getAll() {
        List<ClienteDto> listClientDto = clienteRepository.findAll().stream()
            .map(Cliente -> modelMapper.map(Cliente, ClienteDto.class))
            .collect(Collectors.toList());

        return listClientDto;
    }

    public ResponseDto updateCliente(Long id, Cliente cliente) {
        if(clienteRepository.existsById(id)) {
            cliente.setId(id);
            responseDto.setId(clienteRepository.save(cliente).getId());
            responseDto.setStatus(Status.SUCCESS.value());
            responseDto.setMenssage("Cliente alterado com sucesso.");
        } else {
            responseDto.setMenssage("Cliente não encontrado.");
            responseDto.setStatus(Status.ERROR.value());
        }

        return responseDto;
    }

    public ResponseDto deleteCliente(Long id){
        responseDto.setId(id);
        if(clienteRepository.existsById(id)) {
            clienteRepository.deleteById(id);
            responseDto.setStatus(Status.SUCCESS.value());
            responseDto.setMenssage("Cliente removido com sucesso.");
        } else {
            responseDto.setStatus(Status.ERROR.value());
            responseDto.setMenssage("Cliente não encontrado.");
        }

        return responseDto;
    }

    public ClienteDto login(String login, String senha) {
        Cliente cliente = clienteRepository.findByLoginAndSenha(login, senha);
        return modelMapper.map(cliente, ClienteDto.class);
    }
}
