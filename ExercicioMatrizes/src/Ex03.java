import java.util.Scanner;
public class Ex03 {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        int [][] m = new int[3][5];

        int pares = 0, impares =0;
        boolean repetido = false;

        for (int i = 0; i < 3; i++ ){
            for (int j = 0; j < 5; j++){
            System.out.print("Digite o valor: "  );
                m[i][j] = sc.nextInt();
            }
        }

        for (int [] linha : m){
            for (int n :linha){
                if (n % 2 ==0 ) pares++;
                else impares++;
            }
        }
        for (int i =0; i < 3; i ++ ){
            for (int j = 0; j < 5; j++ ){
                for (int x = 0; x < 3; x++){
                    for (int y = 0; y < 5; y++ ){
                        if (i != x || j != y ){
                            if (m[i][j] == m[x][y]){
                                repetido = true;
                            }
                        }
                    }
                }
            }
        }
        System.out.println("Tem repetido ? " + repetido);
        System.out.println("Pares: " + pares);
        System.out.println("Ímpares: " + impares);
    }
}
