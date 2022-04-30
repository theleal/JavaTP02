import static java.lang.System.out;
import java.lang.reflect.Array;
import java.util.Scanner;
public class TP02Ex11 {






        public static void main(String []args)

        //Alunos: Luiz Gustavo Leal Cortez
        //Alunos: Breno Santos
        //  Entrar com uma matriz de ordem MxM, onde a ordem também será escolhida pelo usuário,
        //sendo que no máximo será de ordem 10 e quadrática. Após a digitação dos elementos,
        //calcular e exibir a determinante

        {
            int constante;
            int det = 0;
            System.out.println("Digite a ordem da matriz, sendo o máximo 10"
                    + "");
            Scanner leia = new Scanner(System.in);
            Scanner ordem = new Scanner(System.in);
            int a = ordem.nextInt();
            int[][] Array10; Array10 = new int[a][a];
            while (a > 10) {
                System.out.println("Digite um valor menor que 10");

                a = ordem.nextInt();

            }



            for(int i = 0; i < a; i++)

            {
                for(int j = 0; j < a; j++) {

                    System.out.print("Digite o valor [" + i + "]" + "[" + j + "] :");
                    Array10[i][j] = leia.nextInt();
                }
            }


            System.out.print("Os valores sao: \n");
            for(int i = 0; i < a; i++)

            {
                for(int j = 0; j < a; j++)

                {

                    System.out.print("[" + Array10[i][j] + "] ");
                }

                System.out.println("\n");

                switch(a){
                    case 1:
                        det = Array10[0][0];

                        break;

                    case 2:
                        det = Array10[0][0] * Array10[1][1] - Array10[0][1] * Array10[1][0];

                        break;

                    default:
                        det = (Array10[0][0] * Array10[1][1] * Array10[2][2] + Array10[0][1] * Array10[1][2] * Array10[2][0] + Array10[0][2] * Array10[1][0] * Array10[2][1] - (Array10[0][2] * Array10[1][1] * Array10[2][0] + Array10[0][0] * Array10[1][2] * Array10[2][1] + Array10[0][1] * Array10[1][0] * Array10[2][2]));

                        break;
                }


                }
                System.out.println("a determinante eh" + det);





        }
}



