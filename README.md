# Consulta de endereço por meio de CEP

Client para consumir  os dados de endereço do Web Service VIACEP usando OpenFeign.

Recebe como parâmetro o CEP informado e retorna uma estrutura XML com os seguintes campos: cep, logradouro, complemento, bairro localidade, uf ibgem gia,ddd e siafi.

# Desenvolvimento
## Tecnologias
- Docker
- Java 17
- Openfeign
- Spring-boot:3.0.6

## Executando o aplicativo localmente
A aplicação é construida a partir do maven. Para executar o projeto:
```
mvn spring-boot:run
``` 
## Executando o aplicativo via Docker

Realizar o build da image

```
docker build -t matheusrodriguesf/cep-service .
```
Para executar o contêiner

```
docker run -p 8080:8080 --name cep-service matheusrodriguesf/cep-service
```

## Como Usar:

### Requisição

Realizar uma requisição do tipo GET para o endpoint.

```
/api/endereco/01001000
```


### Resposta
```
{
<xmlcep>
    <cep>01001-000</cep>
    <logradouro>Praça da Sé</logradouro>
    <complemento>lado ímpar</complemento>
    <bairro>Sé</bairro>
    <localidade>São Paulo</localidade>
    <uf>SP</uf>
    <ibge>3550308</ibge>
    <gia>1004</gia>
    <ddd>11</ddd>
    <siafi>7107</siafi>
</xmlcep>
}
```

## Autor
Matheus Rodrigues

