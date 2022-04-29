import java.lang.reflect.Array;
import java.util.Scanner;

public class TP02Ex02 {

    public static void main(String []args)

            //Alunos: Luiz Gustavo Leal Cortez
          //Alunos: Breno Santos
           // 2. Entrar via teclado com dez valores positivos. Consistir a digitação e enviar mensagem de
    //erro, se necessário. Após a digitação, exibir:
    //a. O maior valor;
    //b. A soma dos valores;
    //c. A média aritmética dos valores.


    {
        int media;
        int soma = 0;
        double maiorvalor = 0;
        Scanner leia = new Scanner(System.in);
        int[] Array10; Array10 = new int[10];

            for(int i = 0; i <= 9; i++)

            {

                System.out.println("Digite o valor " +i + ":");
                Array10[i] = leia.nextInt();
                soma +=Array10[i];


                for(int j = 0; j <= 9; j++)

                {
                    if(Array10[i] > maiorvalor)
                    {
                        maiorvalor= Array10[i];
                    }
                }


            }

            media = soma/10;

            System.out.println("O maior valor eh: " +maiorvalor);
            System.out.println("A soma eh: " +soma);
            System.out.println("A media eh: " +media);









    }
}

