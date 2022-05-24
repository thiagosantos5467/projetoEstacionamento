package com.project.estacionamento;

import java.util.ArrayList;
import java.util.List;

public class Estacionamento {

    private final int numeroDeVagas = 10;

    public Estacionamento() {
    }

    List<Object> vagas = new ArrayList<>();

    Carro corsa = new Carro("corsa", "Cinza", "XYZ-1234", 180);
    Carro uno = new Carro("uno","Preto", "QWE-1234", 200);
    Carro palio = new Carro("palio","Branco", "QWR-5432", 190);

    List<String> estacionados = new ArrayList<>();

    public void estacionar(Carro carro){
        vagas.add(carro);
        estacionados.add(carro.getNome());
    }
}
