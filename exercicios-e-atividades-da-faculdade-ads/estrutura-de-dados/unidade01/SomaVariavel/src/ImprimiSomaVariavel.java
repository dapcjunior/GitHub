public class ImprimiSomaVariavel
{
    public static void main(String[] args)
    {
        int X = 15;
        int Y = 25;
        int soma = X + Y;

        System.out.println("A soma é: " + soma);
        System.out.printf("A soma emtre %d e %d é %d", X, Y, soma);

        /* Para impressao formatado
        * %d = inteiro
        * %s = String
        * %f = para numero com . flutuanto "f" representa a , virgula
        * \t = para tabulação
        * \n salto de linha
         */
    }
}
