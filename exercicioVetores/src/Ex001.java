public class Ex001 {
    public static void main(String[] args){
        String mes [] = {"Jan", "fev" , "Mar","Abril", "Mai",
                "Jun", "Jul","Ago","Set","Out","Nov","Dez" };
        int tot [] = {31,28,31,30,31,30,31,31,30,31,30,31};
        for (int i = 0; i<mes.length; i++ ){
            System.out.println("No mês " + mes[i] + " Tem " + tot[i] + " Dias" );
        }
    }
}
