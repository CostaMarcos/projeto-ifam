package com.api.api_user.controller;

import javax.validation.Valid;

import com.api.api_user.domain.dto.ClienteDto;
import com.api.api_user.domain.dto.ResponseDto;
import com.api.api_user.domain.entity.Cliente;
import com.api.api_user.domain.service.ClienteService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import lombok.AllArgsConstructor;
import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/cliente")
public class ClientController {
    @Autowired
    private ClienteService clienteService;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public ResponseDto createUser(@Valid @RequestBody Cliente cliente){
        return clienteService.createCliente(cliente);
    }

    @GetMapping
    public List<ClienteDto> getAll() {
        return clienteService.getAll();
    }

    @PutMapping(value = "/{id}")
    public ResponseDto updateCliente(@Valid @PathVariable Long id, @Valid @RequestBody Cliente cliente) {
        return clienteService.updateCliente(id, cliente);
    }

    @DeleteMapping(value = "/{id}")
    public ResponseDto deleteCliente(@Valid @PathVariable Long id) {
        return clienteService.deleteCliente(id);
    }
}
