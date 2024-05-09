public class ResultadoEscolar {
    public static void main(String[] args) {
        double nota = 5;

        if(nota >= 7) {
            System.out.println("Aprovado");
        }else if (nota < 5) {
            System.out.println("Reprovado");
        } else {
            System.out.println("Recuperação");
        }
    }
}
