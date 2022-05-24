package com.project.estacionamento;

public class Carro {

    protected String nome;
    protected String cor;
    protected String placa;
    protected int velocidadeMaxima;

    public Carro() {
    }

    public Carro(String nome, String cor, String placa, int velocidadeMaxima) {
        this.nome = nome;
        this.cor = cor;
        this.placa = placa;
        this.velocidadeMaxima = velocidadeMaxima;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public int getVelocidadeMaxima() {
        return velocidadeMaxima;
    }

    public void setVelocidadeMaxima(int velocidadeMaxima) {
        this.velocidadeMaxima = velocidadeMaxima;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
