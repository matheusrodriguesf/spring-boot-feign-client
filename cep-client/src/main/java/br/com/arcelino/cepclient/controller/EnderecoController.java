package br.com.arcelino.cepclient.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.arcelino.cepclient.client.ViaCepClient;
import br.com.arcelino.cepclient.model.Endereco;
import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/api")
@RequiredArgsConstructor
public class EnderecoController {

    private final ViaCepClient viaCepClient;

    @GetMapping(value = "/endereco/{cep}")
    public Endereco buscarEnderecoPorCep(@PathVariable String cep) {
        return viaCepClient.buscarEnderecoPorCep(cep);
    }
}
