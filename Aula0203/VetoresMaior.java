import java.util.Scanner;
public class VetoresMaior{

     public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int mvet [], n, maior, i; 
        System.out.println("Digite a Quantide de números: ");
        n = sc.nextInt();

        mvet = new int[n]; 

    for ( i = 0; i < n; i++){
        System.out.println("Digite um número "+ (i+1) + "");
        mvet[i] = sc.nextInt();
    }

maior=mvet[0];

for (i=0;i<n;i++){
    if(mvet[i]>maior){
    maior=mvet[i];
        }
    }
    System.out.println("O maior elemento é " + maior + ":");
     }
}
