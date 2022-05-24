package com.project.estacionamento;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        Estacionamento estacionamento = new Estacionamento();

        estacionamento.estacionar(estacionamento.corsa);
        estacionamento.estacionar(estacionamento.palio);
        estacionamento.estacionar(estacionamento.uno);

        System.out.println("Já estão estacionados, " + estacionamento.estacionados);

    }
}
