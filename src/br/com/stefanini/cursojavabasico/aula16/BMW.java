package br.com.stefanini.cursojavabasico.aula16;

public class BMW extends Carro implements Conversivel, Utilitario {
// é possível extender apenas uma classe

    public BMW() {
        super();
    }

    @Override
    public double calcularTaxaAceleracao(double VelocidadeFinal, double tempoFinal) {
        System.out.println("BMW sobrescrita");
        return VelocidadeFinal / tempoFinal;
    }

    @Override
    public void piscarAlerta() {
        System.out.println("BMW piscando alerta ...");
    }

    @Override
    public void acionarTurbo() {

     }
    
    @Override
    public void passear() {

    }

    @Override
    public void abrirCapo() {

    }

}
