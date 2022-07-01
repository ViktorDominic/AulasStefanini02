package br.com.stefanini.cursojavabasico.aula15;

public class ExceptionBMW extends Exceptions {

    public ExceptionBMW() {
        super();
    }

    public double calcularTaxaAceleracao(double VelocidadeFinal, double tempoFinal) {
        System.out.println("BMW sobrescrita");
        return VelocidadeFinal / tempoFinal;
    }

    void piscarAlerta() {

    }

}
