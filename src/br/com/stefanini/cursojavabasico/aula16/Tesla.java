package br.com.stefanini.cursojavabasico.aula16;

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

    @Override
    public void piscarAlerta() {
        System.out.println("Tesla piscando alerta...");
    }

}
