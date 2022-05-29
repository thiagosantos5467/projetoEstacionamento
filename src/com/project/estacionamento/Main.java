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

        System.out.print("Deseja estacionar seu carro? ");
        String aux = scan.nextLine();

        while (!aux.equals("sim")) {
            if (aux.equals("nao")) {
                System.out.println("Ok!");
                System.exit(0);
            } else {
                System.out.print("\nDigite uma opção valida!(sim ou nao)");
                aux = scan.nextLine();
            }
        }

        Carro newCar = new Carro();

        System.out.println("\nQual o nome do seu carro? ");
        String nomeAux = scan.nextLine();
        newCar.setNome(nomeAux);

        System.out.println("Qual a cor do seu carro? ");
        String auxCor = scan.nextLine();
        newCar.setCor(auxCor);

        System.out.println("Qual a placa do seu carro? ");
        String placaAux = scan.nextLine();
        newCar.setPlaca(placaAux);

        System.out.println("Qual a velocidade máxima do seu carro? ");
        int velMaxAux = scan.nextInt();
        newCar.setVelocidadeMaxima(velMaxAux);

        estacionamento.estacionar(newCar);

        System.out.println("Pronto, estacionamos o seu carro! ");
        System.out.println("\nAgora os carros estacionados são: " + estacionamento.estacionados);

        System.out.print("\nDigite 1 para retirar seu carro do estacionamento ou 2 para visualizar os carros estacionados: ");
        int auxInt = scan.nextInt();

        while (auxInt != 2) {
            if (auxInt == 1) {
                estacionamento.removerCarro(newCar);
                System.out.println("\nVeículo retirado!");
                System.out.println("Os carros estacionados agora são: " + estacionamento.estacionados);
                System.exit(0);
            } else {
                System.out.println("Digite uma opção válida!(1 ou 2)");
                auxInt = scan.nextInt();
            }
        }
        System.out.println("\nOk! Os carros estacionados são:\n" + estacionamento.estacionados);
        System.out.print("\nDigite o nome do carro que você deseja visualizar! ");
        aux = scan.next();

        while (!estacionamento.estacionados.contains(aux)) {
            System.out.println("\nDigite o nome de um carro válido: ");
            aux = scan.next();
        }
        System.out.println("\nAs características do " + aux + " são: ");
        int i = estacionamento.estacionados.indexOf(aux);
        System.out.println("\nNome: " + estacionamento.vagas.get(i).getNome());
        System.out.println("Cor: " + estacionamento.vagas.get(i).getCor());
        System.out.println("Placa: " + estacionamento.vagas.get(i).getPlaca());
        System.out.println("Velocidade máxima: " + estacionamento.vagas.get(i).getVelocidadeMaxima());
    }
}
