import static java.lang.System.out;
import java.lang.reflect.Array;
import java.util.Scanner;

public class TP02Ex09 {

    public static void main(String []args)

    //Alunos: Luiz Gustavo Leal Cortez
    //Alunos: Breno Santos
    //Entrar com uma matriz de ordem MxN, onde a ordem também será escolhida pelo usuário,
    //sendo que no máximo 10x10. A matriz não precisa ser quadrática. Após a digitação dos
    //elementos, calcular e exibir a matriz transposta.


    {
        int constante;
        int M;
        int N;
        Scanner leia = new Scanner(System.in);



        do{
            System.out.println("Digite o valor de M: ");
            M= leia.nextInt();
        }while (M > 10 || M < 1);

        do{
            System.out.println("Digite o valor de M: ");
            N= leia.nextInt();
        }while (N > 10 || N < 1);

        int[][] Array10; Array10 = new int[M][N];

        for(int i = 0; i < M; i++)

        {
            for(int j = 0; j < N; j++) {

                System.out.print("Digite o valor [" + i + "]" + "[" + j + "] :");
                Array10[i][j] = leia.nextInt();

            }


        }



        System.out.print("\n Essa eh a matriz normal:" + "\n\n");

        for(int i = 0; i < M; i++)

        {
            for(int j = 0; j < N; j++) {

                out.print("[" + Array10[i][j] + "] ");

            }

            System.out.print("\n");



        }

        System.out.print("\n Essa eh a matriz transposta:" + "\n\n");

        for(int i = 0; i < N; i++)

        {
            for(int j = 0; j < M; j++) {

                out.print("[" + Array10[j][i] + "] ");

            }

            System.out.print("\n");



        }









    }
}

