package br.com.arcelino.cepclient.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import br.com.arcelino.cepclient.model.Endereco;

@FeignClient(name = "viacep", url = "${viacep.url}")
public interface ViaCepClient {

    @GetMapping(value = "/{cep}/xml", produces = MediaType.APPLICATION_XML_VALUE, consumes = MediaType.APPLICATION_XML_VALUE)
    Endereco buscarEnderecoPorCep(@PathVariable("cep") String cep);
}
