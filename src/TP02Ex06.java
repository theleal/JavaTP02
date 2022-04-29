import java.util.Scanner;

public class TP02Ex06 {

    public static void main(String []args)


//Alunos: Luiz Gustavo Leal Cortez
//Alunos: Breno Santos

//5. Armazenar seis nomes em uma matriz de ordem 2x3. Apresentar os nomes na tela.
    {
        int media;
        int soma = 0;
        double maiorvalor = 0;
        Scanner leia = new Scanner(System.in);
        String [][] Array10; Array10 = new String[2][3];

        for(int i = 0; i < 2; i++)

        {

            for (int j = 0; j < 3; j++)

            {

                System.out.println("Informe o nome [" + i + "][" + j + "]: ");
                Array10[i][j] =  Array10[i][j] = leia.next();


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

