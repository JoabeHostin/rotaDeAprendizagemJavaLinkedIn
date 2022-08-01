import java.util.Scanner;

public class MultipleChoice {
    /**
     * @author: Joabe Hostin
     */
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
        boolean isNotCorrect = true;
        
        
        
        
        while(isNotCorrect){

        System.out.printf("%n%nResponda com a alternativa correta: %n%n%n%n%s %n%n %n%s %n%n%s %n%n%s %n%n%s %n%n%n",
        question, choiceOne,  choiceTwo, choiceThree, choiceFour, "");
        answer = input.nextLine();    

        if (answer.equals("ticaracaticast")) {
            System.out.println("-----------------------");
            System.out.println("-----------------------");
            System.out.println("Parabéns, você acertou!");
            System.out.println("-----------------------");
            System.out.println("-----------------------");
            isNotCorrect = false;
        } else {
            System.out.println("--------------------------");
            System.out.println("--------------------------");
            System.out.println("Você errou, tente de novo!");
            System.out.println("--------------------------");
            System.out.println("--------------------------");
        }


        }
    
    
    
    
    }

}
