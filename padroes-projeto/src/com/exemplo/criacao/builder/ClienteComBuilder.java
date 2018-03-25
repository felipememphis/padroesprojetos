package com.exemplo.criacao.builder;

import java.util.Date;

public class ClienteComBuilder {

	private String nome;
    private Date dataNascimento;
    private String rg;
    private String cpf;
    private String email;

    private String logradouro;
    private Integer numero;
    private String complemento;
    private String bairro;
    private String cep;
    private String uf;
    private String cidade;

    private String telefoneResidencial;
    private String telefoneCelular;
    
    private ClienteComBuilder(Builder builder) {
        this.nome = builder.nome;
        this.dataNascimento = builder.dataNascimento;
        this.rg = builder.rg;
        this.cpf = builder.cpf;
        this.email = builder.email;
        this.logradouro = builder.logradouro;
        this.numero = builder.numero;
        this.complemento = builder.complemento;
        this.bairro = builder.bairro;
        this.cep = builder.cep;
        this.uf = builder.uf;
        this.cidade = builder.cidade;
        this.telefoneResidencial = builder.telefoneResidencial;
        this.telefoneCelular = builder.telefoneCelular;
    }
    
    public static class Builder {

        private String nome;
        private Date dataNascimento;
        private String rg;
        private String cpf;
        private String email;
        private String logradouro;
        private Integer numero;
        private String complemento;
        private String bairro;
        private String cep;
        private String uf;
        private String cidade;
        private String telefoneResidencial;
        private String telefoneCelular;

        public Builder comNome(String nome) {
            this.nome = nome;
            return this;
        }

        public Builder comDataNascimento(Date dataNascimento) {
            this.dataNascimento = dataNascimento;
            return this;
        }

        public Builder comRg(String rg) {
            this.rg = rg;
            return this;
        }

        public Builder comCpf(String cpf) {
            this.cpf = cpf;
            return this;
        }

        public Builder comEmail(String email) {
            this.email = email;
            return this;
        }

        public Builder noLogradouro(String logradouro) {
            this.logradouro = logradouro;
            return this;
        }

        public Builder noNumero(Integer numero) {
            this.numero = numero;
            return this;
        }

        public Builder noComplemento(String complemento) {
            this.complemento = complemento;
            return this;
        }

        public Builder noBairro(String bairro) {
            this.bairro = bairro;
            return this;
        }

        public Builder noCep(String cep) {
            this.cep = cep;
            return this;
        }

        public Builder naUf(String uf) {
            this.uf = uf;
            return this;
        }

        public Builder naCidade(String cidade) {
            this.cidade = cidade;
            return this;
        }

        public Builder comTelefoneResidencial(String telefoneResidencial) {
            this.telefoneResidencial = telefoneResidencial;
            return this;
        }

        public Builder comTelefoneCelular(String telefoneCelular) {
            this.telefoneCelular = telefoneCelular;
            return this;
        }

        public ClienteComBuilder build() {
            return new ClienteComBuilder(this);
        }
    }

    // getters e setters omitidos

    @Override
    public String toString() {
        return "ClienteComBuilder{" +
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
