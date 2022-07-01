package br.com.stefanini.cursojavabasico.aula15;

// fiz as alteraçoes possiveis para poder implementar o tratamente de excecao da aula 15.

public class ExceptionPrincipal {

    public static void main(String[] args) throws Exception {
        ExceptionBMW bmwDois = new ExceptionBMW();
        bmwDois.piscarAlerta();
        
        ExceptionBMW bmwTres = null;
        
       // bmwTres.acelerar();
        
        try {
            bmwDois.setVelocidadeMaxima(10);

        } catch (NegocioException e) {
            System.out.println(e);
        } finally  {
            System.out.println("Passou aqui");
        }

        // Exceptions mercedes = new Exceptions("Mercedes", "c180");
        // ExceptionBMW bmwDois = new ExceptionBMW();
        //Tesla tesla = new Tesla();
        //tesla.isDirigeSozinho();
        //  Carro teslaDois = new Tesla();
        // ((Tesla) teslaDois).setDirigeSozinho(true);
        // System.out.println(((Tesla) teslaDois).isDirigeSozinho());
        // Carro[] carros = new Carro[]{bmw, bmwDois, tesla, teslaDois};
        // for (Carro carro : carros) {
        //     if (carro instanceof Tesla) {
        //          System.out.println(((Tesla) carro).isDirigeSozinho());
        //       }
        //   }
        //   bmwDois.calcularTaxaAceleracao(100.5, 10);
        //    tesla.calcularTaxaAceleracao(100.5, 10);
        // }
    }

}
