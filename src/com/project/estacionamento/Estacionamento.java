package com.project.estacionamento;

import java.util.ArrayList;
import java.util.List;

public class Estacionamento {

    private final int numeroDeVagas = 10;

    public Estacionamento() {
    }

    public int getNumeroDeVagas() {
        return numeroDeVagas;
    }

    List<Carro> vagas = new ArrayList<>();

    Carro corsa = new Carro("corsa", "cinza", "XYZ-1234", 180);
    Carro uno = new Carro("uno", "preto", "QWE-1234", 200);
    Carro palio = new Carro("palio", "branco", "QWR-5432", 190);

    List<String> estacionados = new ArrayList<>();

    public void estacionar(Carro carro) {
        vagas.add(carro);
        estacionados.add(carro.getNome());
    }

    public void removerCarro(Carro carro) {
        vagas.remove(carro);
        estacionados.remove(carro.getNome());
    }
}
