package br.com.stefanini.cursojavabasico.aula17;

// reutilizando o projeto das aulas passadas para estudar o conceito
// de variaveis e metodos estaticos. 
public class Carro {

    private String marca;
    private String modelo;
    private int velocidadeMaxima;
    private int taxaAcelaracao;
    private double quilometrosPorLitro;

    public Carro() {
        System.out.println("Construindo Carro . . .");
    }

    public Carro(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }

    public Carro(String mercedes) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void acelerar() {
        System.out.println("Acelerando . . .");
    }

    public void frear() {
        System.out.println("Freando . . .");
    }

    public double calcularTaxaAceleracao(double VelocidadeFinal, double velocidadeInicial, double tempoFinal, double tempoInicial) {
        return (VelocidadeFinal - velocidadeInicial) / (tempoFinal - tempoInicial) * 3.6;
    }

    public double calcularTaxaAceleracao(double VelocidadeFinal, double tempoFinal) {
        return (VelocidadeFinal - 0) / (tempoFinal - 0) * 3.6;
    }

    public String calcularTaxaAceleracao(int VelocidadeFinal, int tempoFinal) {
        return "" + (VelocidadeFinal - 0) / (tempoFinal - 0) * 3.6;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getVelocidadeMaxima() {
        return velocidadeMaxima;
    }

    public void setVelocidadeMaxima(int velocidadeMaxima) {
        if (velocidadeMaxima < 0) {
            System.out.println("Valor é inválido");
        } else {
            this.velocidadeMaxima = velocidadeMaxima;
        }
    }

    public int getTaxaAcelaracao() {
        return taxaAcelaracao;
    }

    public void setTaxaAcelaracao(int taxaAcelaracao) {
        this.taxaAcelaracao = taxaAcelaracao;
    }

    public double getQuilometrosPorLitro() {
        return quilometrosPorLitro;
    }

    public void setQuilometrosPorLitro(double quilometrosPorLitro) {
        this.quilometrosPorLitro = quilometrosPorLitro;
    }

    public boolean getChassi() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public boolean getPlaca() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public boolean getBancos() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void setBancos(int i) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void setVelocidade(int i) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void setChassi(int i) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void setPlaca(String xxX9999) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
