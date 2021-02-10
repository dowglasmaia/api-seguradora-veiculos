[![Build Status](https://travis-ci.com/dowglasmaia/api-seguradora-veiculos.svg?branch=main)](https://travis-ci.com/github/dowglasmaia/api-seguradora-veiculos)

## API - SEGURADORA DE VEICULOS

### Tecnologias usadas no desenvolvimento:
```
Linguagem de Programação: Java 8.
Framework: Spring Boot 2xx
Banco de Dados: MongoDB
Gerenciador de Dependencias: Gradle.
```
## Requisitos do Sistema:
```
- Entidade: Cliente - Realizar as operações de CRUD :
- Atributos da Entidade: 
* Nome
* CPF
* Cidade
* UF
** NOTA: Todos os dados são obrigatórios / CPF deve ser válido e único
-------------------------------------------------------------------

- Entidade: Apolice - Realizar as operações de CRUD:
- Atributos da Entidade:
* Número
* Vigência (início e fim)
* Placa do veículo
* Valor
** NOTA: Todos os dados são obrigatórios / Toda apólice deve pertencer a um cliente / O número da apólice deve ser gerado aleatoriamente e único.
---------------------------------------------------------------------
OBS.: Consultar apólice por número (endpoint separado).
 - na consulta mostra todos os dados da apolice, informar em campo se a apólice venceu ou não e Informar em campo quantos dias para vencer, ou há quantos dias venceu.
 ```

### Documentação da API  realizada com SwaggerAPI.
```Teste de API
exemplo: http://localhost:8080/swagger-ui.html#/
```
