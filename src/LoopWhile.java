import java.util.Scanner;   

public class LoopWhile {

public static void main(String[] args){


    Scanner input = new Scanner(System.in);
    boolean isOnRepeat = true;

    while(isOnRepeat){
        System.out.println("A musica está no repeat");
        System.out.println("Deseja parar de repetir? (s/n)");
        String answer = input.nextLine();

        if (answer.equals("s")){
            isOnRepeat = false;
        } 
    }

    System.out.println("Tocar próxima música");
}

}
