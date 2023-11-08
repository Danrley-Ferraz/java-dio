public class Aula08 {
    
    public static void main(String[] args){

        String nomeUm = "Danrley";
        String nomeDois = "Arthur";

        System.out.println(nomeUm == nomeDois);

        // Podemos também usar o == para comparação, nesse caso nomeUm não é igualç a nomeDois e a resposta virá como False

        int numero1 = 10;
        int numero2 = 2;


        boolean simNao = numero1 == numero2;

        if(numero1 < numero2){

            System.out.println("A nossa condição é verdadeira");
        }

        else
            System.out.println("A nossa condição é falsa");

        System.out.println("numeroUm é igual a numeroDois? " + simNao);

        simNao = numero1 != numero2;

        System.out.println("numeroUm é diferente a numeroDois? " + simNao);

        simNao = numero1 > numero2;

        System.out.println("numeroUm é maior que numeroDois? " + simNao);

        simNao = numero1 < numero2;

        System.out.println("numeroUm é menor que numeroDois? " + simNao);

    }
}
