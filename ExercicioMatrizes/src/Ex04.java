import java.util.Scanner;
public class Ex04 {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        double [][] m = new double[4][4];

        for (int i = 0; i < 4; i++ ){
            for (int j = 0; j < 4; j++ ){
                m[i][j]=sc.nextDouble();
            }
        }
        System.out.print("Diagonal principal: ");
        for (int i = 0; i < 4; i++){
            System.out.print(m[i][i] + " ");
        }
        System.out.println();

        System.out.print("Diagonal secundária: ");
        for (int i = 0; i < 4; i++){
            System.out.print(m[i][3 - i ] + " ");
        }
        System.out.println();

        System.out.println("Matriz transposta: ");
        for (int i = 0; i < 4; i++ ){
            for (int j = 0 ; j < 4; j++){
                System.out.print(m[j][i] + " ");
            }
            System.out.println();
        }
    }
}
