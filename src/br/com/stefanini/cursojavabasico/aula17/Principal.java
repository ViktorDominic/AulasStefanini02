package br.com.stefanini.cursojavabasico.aula17;

import br.com.stefanini.cursojavabasico.entidades.*;


public class Principal {
    
    static int valor = 10; 

    static void print() {
        System.out.println(valor);
    }
    
    //é preciso que seja estático o metódo que queremos 
    //chamar dentro de um outro objeto estático. 
    
    public static void main(String[] args) {
        valor = 10; 
        print();
        
        Carro bmw = new Carro();
        bmw.setMarca("BMW");
        bmw.setModelo("M3");
        bmw.setQuilometrosPorLitro(7.5);
        bmw.setVelocidadeMaxima(280);

        Carro mercedes = new Carro("Mercedes", "c180");

        BMW bmwDois = new BMW();
        Tesla tesla = new Tesla();
        tesla.isDirigeSozinho();

        Carro teslaDois = new Tesla();
        ((Tesla) teslaDois).setDirigeSozinho(true);
        System.out.println(((Tesla) teslaDois).isDirigeSozinho());

        Carro[] carros = new Carro[]{bmw, bmwDois, tesla, teslaDois};

        for (Carro carro : carros) {
            if (Constantes.MARCA_FAMOSA.equals(carro.getMarca())) {
                System.out.println("Carro de marca famosa");
            }
            if (carro instanceof Tesla) {
                System.out.println(((Tesla) carro).isDirigeSozinho());
            }
        }
        
        Calcular.soma(0, 0);
        
       

        //Constantes.MARCA_FAMOSA ="Porsche";
       // não é possivel alterar pois é final. 
       
        bmwDois.calcularTaxaAceleracao(100.5, 10);
        tesla.calcularTaxaAceleracao(100.5, 10);

    }

}
