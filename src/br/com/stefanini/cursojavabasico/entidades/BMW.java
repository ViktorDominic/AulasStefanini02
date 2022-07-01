package br.com.stefanini.cursojavabasico.entidades;

//pacote criado referente a aula 17.

import br.com.stefanini.cursojavabasico.aula17.Carro;

public class BMW extends Carro {

    public BMW() {
        super();
    }

    @Override
    public double calcularTaxaAceleracao(double VelocidadeFinal, double tempoFinal) {
        System.out.println("BMW sobrescrita");
        return VelocidadeFinal / tempoFinal;
    }

}
