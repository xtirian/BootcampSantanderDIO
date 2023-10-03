public class TiposVariaveis {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        /* Os tipo de variaveis no Java são:
         * 
         * int :
         * byte : 
         * short :
         * long :
         * float :
         * double :
         * boolean :
         * char :
         * 
         * 
         * tipos primitivos e seus valores
         * 
         * byte: 1 byte: -128 a 127
         * short: 2byte: -32000 a 32000
         * int: 4bytes: -2.000.000.000 a 2.000.000.000 -- mais comum
         * long: 8bytes: de -9.000.000.000.000.000.000 a 9.000.000.000.000.000.000 
         * 
         * O JVM normalmente usa o int
         * 
         * 
         * float: 4bytes : -3,4028E + 38 a 3,4028E + 38
         * double: 8bytes: -1,7976E + 308 a 1,7976E + 308 -- mais comum
         *
         * 
         * A variavel é a identificação de um espaço em memória utilizadopelo nosso programa. 
         * 
         * sintaxe:
         * <Tipo> <Nome> <Atribuição>
        */

        int anoFabricacao = 2021;
        double salarioMinimo = 2500;

        byte idade = 123;
        short ano = 2023;
        int cep = 25250415;
        long cpf = 14893011782L; //O long precia terminar com L para saber que é um long e não um int
        float pi = 3.14F; // o tipo float precisa terminar com F no final
        double salario = 1275.33;


        //java é fortemente tipado!!!

        //você não pode colocar variaveis de maior capacidade dentro de variaveis de menor capacidade

        short numeroCurto  = 1 ;
        // a gente consegue colocar o short no int
        int numeroNormal = numeroCurto ;
        // mas não podemos colocar o int no short. Fara isto precisamos adaptar fazendo casting
        short numeroCurto2 = (short) numeroNormal ;


        //Para criar uma constante, ma variavel que nunca mudará o seu valor

        final float PI = 3.14F;

        //as constantes devem receber o seu nome em CAIXA ALTA




    }
}
