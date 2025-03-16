import java.util.Scanner;

public class Contator {

    public static void main(String[] args) {
       try (Scanner terminal = new Scanner(System.in)) {
        System.out.println("Digite o primeiro parametro");
           int primeiroParametro = terminal.nextInt();
           System.out.println("Digite o segundo parametro");
           int segundoParametro = terminal.nextInt();

           try {
               contar(primeiroParametro, segundoParametro);
           } catch (ParametrosInvalidosException e) {
                  System.out.println(e.getMessage());
           }
    }

        
    }

    static void contar (int primeiroParametro, int segundoParametro) throws ParametrosInvalidosException {
        if (primeiroParametro < 0 || segundoParametro < 0) {
            throw new ParametrosInvalidosException("Os parametros devem ser maiores que zero");
        }
        if (primeiroParametro > segundoParametro) {
            throw new ParametrosInvalidosException("O primeiro parametro deve ser menor que o segundo");
        }
        for (int i = primeiroParametro; i <= segundoParametro; i++) {
            System.out.println(i);
        }
    }
    
}

//Desafio Concluido