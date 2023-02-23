import java.util.Date;

public class Operadores {
    public static void main(String[] args) {
        
        //Operador de atribuição
        String nome = "Carlos Nhatuve";
        int idade = 23;
        double peso = 58.7;
        char genero = 'M';
        boolean doadorOrgao = false;
        Date dataNascimento = new Date();

        //Operadores aritméticos
        double soma = 10.5 + 15.7;
        int subtracao = 145 - 34;
        int multiplicao = 45 * 13;
        int divisao = 15 / 3;
        int modulo = 18 % 3;
        double resultado = (10 * 7) + (20/4);

        //Operador de adicao em textos
        String nomeCompleto = "LINGUAGEM" + "JAVA";

        //Resultado das expressoes abaixo
        String concatenacao = "?";

        concatenacao = 1 + 1 + 1 + "1";

        concatenacao = 1 + "1" + 1 + 1;

        concatenacao = 1 + "1" + 1 + "1";

        concatenacao = "1" + 1 + 1 + 1;

        concatenacao = "1" + (1 + 1 + 1);

        //Operadores unários
         int numero = 5;
         int numero2 = -10;

         //Incremetação
         numero++;

         //Decrementação
         numero--;

         //Negação
         boolean variavel = true;
         System.out.println(!variavel);

         //Operador Ternário
         int a, b;
         a = 5;
         b = 6;
        String resultado1 = a==b ? "Verdade" : "Falso";

        //Operdadores relacionais
        int numeroA = 10;
        int numeroB = 20;

        boolean resultadoA = numeroA == numeroB;
        boolean resultadoB = numeroA != numeroB;
        boolean resultadoC = numeroA > numeroB;
        boolean resultadoD = numeroA >= numeroB;
        boolean resultadoE = numeroA < numeroB;
        boolean resultadoF = numeroA <= numeroB;

        //Operadores Lógicos
        boolean condicaoA = true;
        boolean condicaoB = false;

        if(condicaoA && condicaoB){
            System.out.println("YESIR!");
        }

        if(condicaoA || condicaoB){
            System.out.println("YESOR!");
        }


        

    }
}
