import java.util.ArrayList;
import java.util.Scanner;

public class ex005 {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        ArrayList<String> nomes = new ArrayList<String>();

        System.out.println("Quantos nome deseja inserir ?? ");
        int n = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < n ; i++){
            System.out.println("Digite um nome: ");
            String nome = sc.nextLine();
            nomes.add(nome);
        }
        System.out.println("\nLista de nomes:");
        for (String nome : nomes){
            System.out.println(nome);
        }
    sc.close();
    }
}
