import java.util.Scanner;
public class Ex02 {
    public  static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        int [][] m = new int[5][5];

        int somaImpares = 0;

        for (int i =0; i < 5; i++){
            for (int j = 0; j < 5; j++){
                System.out.print("Digite um valor: ");
                m[i][j] = sc.nextInt();

                if (m[i][j] % 2 !=0 ){
                    somaImpares += m[i][j];
                }
            }
        }
        System.out.println("Soma dos impares: " + somaImpares);

        for (int j = 0; j < 5; j++){
            int soma = 0;
            for (int i = 0; i < 5; i++){
                soma += m[i][j];
            }
            System.out.println("Soma coluna " + j + ":" + soma);
        }
        for (int i = 0 ; i < 5; i++){
            int soma = 0;
            for (int j = 0; j< 5; j++){
                soma += m[i][j];
            }
            System.out.println("Soma da linha" + i + ":" + soma);
        }
    }
}
