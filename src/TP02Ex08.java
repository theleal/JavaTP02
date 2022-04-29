import static java.lang.System.out;
import java.lang.reflect.Array;
import java.util.Scanner;

public class TP02Ex08 {

    public static void main(String []args)

    //Alunos: Luiz Gustavo Leal Cortez
    //Alunos: Breno Santos
    //Entrar via teclado com doze valores e armazená-los em uma matriz de ordem 3x4. Após a
    //digitação dos valores solicitar uma constante multiplicativa, que deverá multiplicar cada
    //valor matriz e armazenar o resultado em outra matriz de mesma ordem, nas posições
    //correspondentes. Exibir as matrizes na tela, sob a forma matricial, ou seja, linhas por
    //colunas.


    {
        int constante;
        Scanner leia = new Scanner(System.in);
        int[][] Array10; Array10 = new int[3][4];
        int[][] Array20; Array20 = new int[3][4];

        for(int i = 0; i < 3; i++)

        {
            for(int j = 0; j < 4; j++) {

                System.out.print("Digite o valor [" + i + "]" + "[" + j + "] :");
                Array10[i][j] = leia.nextInt();
            }
        }


        System.out.print("Os valores sao:");
        for(int i = 0; i < 3; i++)

        {
            for(int j = 0; j < 4; j++)

            {

                System.out.print("[" + Array10[i][j] + "] ");
            }
        }

        System.out.println("\n\nDigite a constante multiplicativa: ");
        constante = leia.nextInt();


        System.out.print("\n Essae eh a nova matriz com os valores multiplicados:" +"\n\n");

        for(int i = 0; i < 3; i++)
        {
            for(int j = 0; j < 4; j++)

            {
                Array20[i][j] = (Array10[i][j] *constante);
                out.print("[" + Array20[i][j] + "] ");


            }
            System.out.println("\n");

        }

        System.out.print("\n Essa eh a antiga matriz:" + "\n\n");



        for(int i = 0; i < 3; i++)
        {
            for(int j = 0; j < 4; j++)

            {
                out.print("[" + Array10[i][j] + "] ");


            }
            System.out.println("\n");

        }

    }
}

