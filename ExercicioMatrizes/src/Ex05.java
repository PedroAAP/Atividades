public class Ex05 {
    public static void main (String[] args){

        int n = 5;

        for (int i = 0; i < n; i++){
            for (int j = 0; j < n; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println();

        for (int i = 0; i < n; i++){
            for (int j = 0; j < n; j++){
                if (i==j) System.out.println("* ");
                else System.out.println(" ");
            }
            System.out.println();
        }
    }
}
