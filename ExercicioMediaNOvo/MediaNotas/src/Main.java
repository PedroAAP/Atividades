import javax.swing.JOptionPane;

 class MediaNotas {

  public static void main(String[] args) {

    // 1. Pergunta quantas notas serão avaliadas
    int quantidade = Integer.parseInt(
            JOptionPane.showInputDialog("Quantas notas deseja avaliar?")
    );

    // 2. Cria o vetor com o tamanho informado
    double[] notas = new double[quantidade];

    double soma = 0;

    // 3. Recebe as notas
    for (int i = 0; i < quantidade; i++) {

      notas[i] = Double.parseDouble(
              JOptionPane.showInputDialog("Digite a nota " + (i + 1) + ":")
      );

      soma += notas[i];
    }

    // 4. Calcula a média
    double media = soma / quantidade;

    // 5. Verifica aprovação
    String resultado;

    if (media >= 70) {
      resultado = "APROVADO ✅";
    } else {
      resultado = "REPROVADO ❌";
    }

    // 6. Mostra resultado final
    JOptionPane.showMessageDialog(
            null,
            "Média final: " + media + "\nResultado: " + resultado
    );
  }
}