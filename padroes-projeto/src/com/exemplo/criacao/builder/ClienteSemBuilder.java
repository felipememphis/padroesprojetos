package com.exemplo.criacao.builder;

import java.util.Date;

public class ClienteSemBuilder {

	private String nome;
    private Date dataNascimento;
    private String rg;
    private String cpf;
    private String email;

    //poderia ser transformado para uma classe endereço
    private String logradouro;
    private Integer numero;
    private String complemento;
    private String bairro;
    private String cep;
    private String uf;
    private String cidade;

    private String telefoneResidencial;
    private String telefoneCelular;

    public ClienteSemBuilder(String nome, Date dataNascimento, String rg, String cpf, String email, String logradouro, Integer numero,
                             String complemento, String bairro, String cep, String uf, String cidade, String telefoneResidencial, String telefoneCelular) {
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.rg = rg;
        this.cpf = cpf;
        this.email = email;
        this.logradouro = logradouro;
        this.numero = numero;
        this.complemento = complemento;
        this.bairro = bairro;
        this.cep = cep;
        this.uf = uf;
        this.cidade = cidade;
        this.telefoneResidencial = telefoneResidencial;
        this.telefoneCelular = telefoneCelular;
    }

    public ClienteSemBuilder(String nome, Date dataNascimento, String rg, String cpf, String email, String logradouro, Integer numero,
                             String complemento, String bairro, String cep, String uf, String cidade, String telefoneCelular) {
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.rg = rg;
        this.cpf = cpf;
        this.email = email;
        this.logradouro = logradouro;
        this.numero = numero;
        this.complemento = complemento;
        this.bairro = bairro;
        this.cep = cep;
        this.uf = uf;
        this.cidade = cidade;
        this.telefoneCelular = telefoneCelular;
    }

    public ClienteSemBuilder(String nome, Date dataNascimento, String cpf, String email, String logradouro, Integer numero,
                             String complemento, String bairro, String cep, String uf, String cidade, String telefoneResidencial, String telefoneCelular) {
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.cpf = cpf;
        this.email = email;
        this.logradouro = logradouro;
        this.numero = numero;
        this.complemento = complemento;
        this.bairro = bairro;
        this.cep = cep;
        this.uf = uf;
        this.cidade = cidade;
        this.telefoneResidencial = telefoneResidencial;
        this.telefoneCelular = telefoneCelular;
    }

    public ClienteSemBuilder(String nome, Date dataNascimento, String cpf, String email, String logradouro, Integer numero,
                             String complemento, String bairro, String cep, String uf, String cidade, String telefoneCelular) {
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.cpf = cpf;
        this.email = email;
        this.logradouro = logradouro;
        this.numero = numero;
        this.complemento = complemento;
        this.bairro = bairro;
        this.cep = cep;
        this.uf = uf;
        this.cidade = cidade;
        this.telefoneCelular = telefoneCelular;
    }

    public ClienteSemBuilder(String nome, Date dataNascimento, String rg, String cpf, String email, String logradouro, Integer numero,
                             String bairro, String cep, String uf, String cidade, String telefoneCelular) {
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.rg = rg;
        this.cpf = cpf;
        this.email = email;
        this.logradouro = logradouro;
        this.numero = numero;
        this.bairro = bairro;
        this.cep = cep;
        this.uf = uf;
        this.cidade = cidade;
        this.telefoneCelular = telefoneCelular;
    }

    public ClienteSemBuilder(String nome, Date dataNascimento, String cpf, String email, String logradouro, Integer numero,
                             String bairro, String cep, String uf, String cidade, String telefoneCelular) {
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.cpf = cpf;
        this.email = email;
        this.logradouro = logradouro;
        this.numero = numero;
        this.bairro = bairro;
        this.cep = cep;
        this.uf = uf;
        this.cidade = cidade;
        this.telefoneCelular = telefoneCelular;
    }

    // getters e setters omitidos
    
    @Override
    public String toString() {
        return "ClienteSemBuilder{" +
                "nome='" + nome + '\'' +
                ", dataNascimento=" + dataNascimento +
                ", rg='" + rg + '\'' +
                ", cpf='" + cpf + '\'' +
                ", email='" + email + '\'' +
                ", logradouro='" + logradouro + '\'' +
                ", numero=" + numero +
                ", complemento='" + complemento + '\'' +
                ", bairro='" + bairro + '\'' +
                ", cep='" + cep + '\'' +
                ", uf='" + uf + '\'' +
                ", cidade='" + cidade + '\'' +
                ", telefoneResidencial='" + telefoneResidencial + '\'' +
                ", telefoneCelular='" + telefoneCelular + '\'' +
                '}';
    }
}
