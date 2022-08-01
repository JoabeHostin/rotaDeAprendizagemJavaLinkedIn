import java.util.Scanner;

public class MultipleChoice {

    Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

        MultipleChoice multipleChoice = new MultipleChoice();
        multipleChoice.run();
    }

    public void run() {


        String question = "Qual o nome do podcast que tem os integrantes do pânico?";
        String choiceOne = "flow";
        String choiceTwo = "ticaracaticast";
        String choiceThree = "podepah";
        String choiceFour = "venus";
        String answer = "";

        
        System.out.printf("Responda com a alternativa correta: %n%s  %n%s %n%s %n%s %n%s %n ",
            question, choiceOne,  choiceTwo, choiceThree, choiceFour, "");

        answer = input.nextLine();    

        if (answer.equals("ticaracaticast")) {
            System.out.println("Parabéns, você acertou!");
        } else {
            System.out.println("Você errou, a resposta correta é: ticaracaticast");
        }

    
    
    
    
    }

}
