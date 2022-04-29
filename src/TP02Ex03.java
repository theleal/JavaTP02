import java.lang.reflect.Array;
import java.util.Scanner;

public class TP02Ex03 {

    public static void main(String []args)

//Alunos: Luiz Gustavo Leal Cortez
//Alunos: Breno Santos
//Entrar via teclado com “N” valores quaisquer. O valor “N” (que representa a quantidade de
//números) será digitado, deverá ser positivo, porém menor que vinte. Caso a quantidade não
//satisfaça a restrição, enviar mensagem de erro e solicitar o valor novamente. Após a
//digitação dos “N” valores, exibir:
//a. O maior valor;
//b. O menor valor;
//c. A soma dos valores;
//d. A média aritmética dos valores;
//e. A porcentagem de valores que são positivos;
//f. A porcentagem de valores negativos;

    {
        char resposta = 'S';
        int porcentagemp;
        int porcentagemn;
        int total;
        int negativos = 0;
        int positivos = 0;
        int menorvalor = 0;
        int tamanho;
        int media;
        int soma = 0;
        double maiorvalor = 0;
        Scanner leia = new Scanner(System.in);


        do

        {
            do {
                System.out.println("Digite o tamanho do array: ");
                tamanho = leia.nextInt();


            } while (tamanho > 20);


            int[] Array10;
            Array10 = new int[tamanho];


            for (int i = 0; i <= (tamanho - 1); i++) {

                System.out.println("Digite o valor " + i + ":");
                Array10[i] = leia.nextInt();
                soma += Array10[i];

                if (Array10[i] >= 0) {
                    positivos++;
                } else {
                    negativos++;
                }


                for (int j = 0; j <= tamanho; j++) {
                    if (Array10[i] > maiorvalor) {
                        maiorvalor = Array10[i];
                    }

                    if (Array10[i] < menorvalor) {
                        menorvalor = Array10[i];
                    }


                }


            }

            total = negativos+positivos;
            media = soma/tamanho;

            porcentagemp = (positivos*100)/tamanho;
            porcentagemn = (negativos*100)/tamanho;


            System.out.println("\n\nO maior valor eh: " +menorvalor);
            System.out.println("O maior valor eh: " +maiorvalor);
            System.out.println("A soma eh: " +soma);
            System.out.println("A media eh: " +media);
            System.out.println("Porcentagem de numeros positivos: " +porcentagemp + "%");
            System.out.println("Porcentagem de numeros negativos: " +porcentagemn + "%");


            System.out.println("\n\nVoce deseja continua? (S= Sim, N=Nao)");

            do {
                System.out.print("Você deseja continuar? (S/N) ");
                resposta = leia.next().charAt(0);
            } while ( resposta != 'S' && resposta != 'N');

        }while (resposta == 'S');


    }
}

