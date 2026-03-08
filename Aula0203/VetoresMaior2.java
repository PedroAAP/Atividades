import java.util.Scanner;

public class VetoresMaior2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int mvet[], n, maior, menor;
        double media, soma = 0;

        System.out.println("Digite a Quantidade de números: ");
        n = sc.nextInt();

        mvet = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Digite o número " + (i + 1) + ": ");
            mvet[i] = sc.nextInt();
        }

        maior = menor = mvet[0];

        for (int i = 0; i < n; i++) {
            soma += mvet[i];

            if (mvet[i] > maior) {
                maior = mvet[i];
            }

            if (mvet[i] < menor) {
                menor = mvet[i];
            }
        }

        media = soma / n;

        System.out.println("O maior elemento é: " + maior);
        System.out.println("O menor elemento é: " + menor);
        System.out.println("A média é: " + media);

        sc.close();
    }
}