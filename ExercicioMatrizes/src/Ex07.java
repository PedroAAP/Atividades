import java.util.Scanner;

public class Ex07 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num [][] = new int[2][2];

        for (int i = 0; i < 2; i++) {
                for (int j = 0; j < 2; j++) {
                    System.out.print("Digite aqui os números da matriz: ");
                    num[i][j] = sc.nextInt();
                }
        }
        for (int i = 0; i < 2; i++){
            for (int j = 0; j < 2; j++){
                System.out.print(num[i][j] + " ");
            }
            System.out.println();
        }
    }
}
