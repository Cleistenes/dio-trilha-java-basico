public class variaveis {
    public static void main(String[] args) {
        //os argumentos começam com índice 0
        String nome = args [0];
        String sobrenome = args [1];
        int idade = Integer.valueOf(args [2]);
        double altura = Double.valueOf(args [3]);

        System.out.println("Olá meu nome é " + nome + sobrenome);
        System.out.println("Tenho " + idade + "anos");
        System.out.println("MInha altura é" + altura + "cm");
    }
}