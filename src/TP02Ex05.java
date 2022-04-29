import java.util.Scanner;

public class TP02Ex05 {

    public static void main(String []args)


//Alunos: Luiz Gustavo Leal Cortez
//Alunos: Breno Santos

//5. Armazenar seis valores em uma matriz de ordem 3x2. Apresentar os valores na tela.
    {
        int media;
        int soma = 0;
        double maiorvalor = 0;
        Scanner leia = new Scanner(System.in);
        int[][] Array10; Array10 = new int[3][2];

        for(int i = 0; i < 3; i++)

        {

            for (int j = 0; j < 2; j++)

            {

                System.out.println("Informe [" + i + "][" + j + "]: ");
                Array10[i][j] = leia.nextInt();


            }

        }

        for (int i = 0; i < 3; i++) {

            for (int j = 0; j < 2; j++)
            {
                System.out.print("[" + Array10[i][j] + "] ");
            }
        }



    }
}

