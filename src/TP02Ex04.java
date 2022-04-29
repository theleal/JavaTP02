import java.lang.reflect.Array;
import java.util.Scanner;

public class TP02Ex04 {

    public static void main(String []args)


//Alunos: Luiz Gustavo Leal Cortez
//Alunos: Breno Santos

//4. Armazenar seis valores em uma matriz de ordem 2x3. Apresentar os valores na tela.
    {
        int media;
        int soma = 0;
        double maiorvalor = 0;
        Scanner leia = new Scanner(System.in);
        int[][] Array10; Array10 = new int[2][3];

        for(int i = 0; i < 2; i++)

        {

            for (int j = 0; j < 3; j++)

            {

                System.out.println("Informe [" + i + "][" + j + "]: ");
                Array10[i][j] = leia.nextInt();


            }

        }

        for (int i = 0; i < 2; i++) {

            for (int j = 0; j < 3; j++)
            {
                System.out.print("[" + Array10[i][j] + "] ");
            }
        }



    }
}

