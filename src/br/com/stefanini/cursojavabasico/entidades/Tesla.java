//pacote criado referente a aula 17.

package br.com.stefanini.cursojavabasico.entidades;

import br.com.stefanini.cursojavabasico.aula17.Carro;

public class Tesla extends Carro {

    private boolean dirigeSozinho;

    public Tesla() {
        super();
    }

    @Override
    public double calcularTaxaAceleracao(double VelocidadeFinal, double tempoFinal) {
        System.out.println("Tesla sobrescrita");
        return VelocidadeFinal * tempoFinal;
    }

    public boolean isDirigeSozinho() {
        return dirigeSozinho;
    }

    public void setDirigeSozinho(boolean dirigeSozinho) {
        this.dirigeSozinho = dirigeSozinho;
    }

}
