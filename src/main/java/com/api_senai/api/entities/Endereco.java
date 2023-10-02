package com.api_senai.api.entities;

import lombok.Data;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;

@Data
public class Endereco {
 public String cep;
 public String logradouro;
 public String numero;
 public String complemento;
 private String bairro;
 private String localidade;
 private String uf;

 public Endereco getEnderecoByCep(String cep) {
  Endereco endereco = new Endereco();

  //Mandar o cep para o viaCep
 // HttpGet request = new HttpGet("https://viacep.com.br/ws/" + cep + "/json/") {

   //Tratar a resposta do viaCep
  }
 }










