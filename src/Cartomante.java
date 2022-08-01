import java.util.Scanner;

public class Cartomante {
    /**
     * @author: Joabe Hostin
     **/
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Bem vindo a cartomante!");
        System.out.println("digite um número de 1 a 9");

        int numero = input.nextInt();

        if (numero >= 1 && numero <= 9) {

            if (numero < 5) {
                System.out.println("Você terá um ótimo dia");
            } else {
                System.out.println("Você terá um dia ruim");
            }

        } else {
            System.out.println("Você digitou um número inválido");
        }
        input.close();
    }

}
