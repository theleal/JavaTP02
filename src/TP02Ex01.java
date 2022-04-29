import java.util.Scanner;

public class TP02Ex01 {

    public static void main(String []args){


        //Alunos: Luiz Gustavo Leal Cortez
        //Alunos: Breno Santos

       // 1. Entrar com dois valores via teclado, onde o segundo valor deverá ser maior que o primeiro.
         // Caso contrário solicitar novamente apenas o segundo valor.

        double v1;
        double v2;

        Scanner leia = new Scanner(System.in);

        System.out.println("Digite o valor 1: ");
        v1 = leia.nextDouble();


        do {
            System.out.println("Digite o valor  2: ");
            v2 = leia.nextDouble();
        }while (v2 > v1);

        if (v1 >= v2)
        {
            System.out.println("valor 1 é:" +v1);
            System.out.println("valor 1 é:" +v2);

        }





    }
}
