public class ex03 {
    public static void main(String[] args) {
        int [] vetor = new int [50];
        for(int i = 0;i <50; i++){
            vetor[i] = 101 + i;
        }
        for(int i =0 ; i<50; i++){
            System.out.println("posição" + i + "=" + vetor[i]);
        }
    }
}
