import java.util.Scanner;
public class ex06 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int [][] m = new int[3][3];

        for (int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                m[i][j] = sc.nextInt();
            }
        }
        int soma = m[0][0] + m[0][1] + m[0][2];
        boolean magico = true;

        for (int i = 0; i < 3; i++){
            int s = 0;
            for(int j = 0; j < 3; j++){
                s += m[i][j];
            }
            if(s != soma ) magico = false;
        }
        for(int j = 0 ; j < 3; j++){
            int s = 0;
            for (int i = 0; i < 3; i++){
                s += m[i][j];
            }
            if (s != soma)magico = false;
        }
        int d1 = m[0][0] + m[1][1] + m[2][2];
        int d2 = m[0][2] +m[1][1] + m[2][0];

        if (d1 != soma || d2 != soma)magico = false;

        System.out.println("É quadrado magico ? " + magico);
    }
}
