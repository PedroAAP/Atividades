import java.util.Scanner;

public class Comparison {
    public static void main(String[] args){
           Scanner sc = new Scanner(System.in);

           int num1, num2;

        System.out.println("Digite o Primeiro número: ");
        num1 = sc.nextInt();

        System.out.println("Digite o Segundo número: ");
        num2 = sc.nextInt();

        if ( num1 == num2 )
            System.out.printf("%d == %d\n", num1, num2);
        if (num1 != num2)
            System.out.printf("%d != %d\n ", num1, num2 );
        if (num1 < num2)
            System.out.printf("%d < %d\n " , num1, num2 );
        if (num1 > num2 )
            System.out.printf("%d > %d\n ", num1, num2 ) ;
        if (num1 <= num2 )
            System.out.printf("%d <= %d\n ", num1, num2 ) ;
        if (num1 >= num2 )
            System.out.printf("%d >= %d\n ", num1, num2 ) ;


    }
}
