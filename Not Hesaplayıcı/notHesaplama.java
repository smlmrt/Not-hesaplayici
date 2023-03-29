import java.util.Scanner;

public class notHesaplama{

    public static void main(String[] args){
        int quiz, midterm, ffinal;
        double average; 

        Scanner input = new Scanner(System.in);
        System.out.printf("Quiz: ");
        quiz = input.nextInt();
        System.out.printf("Midterm: ");
        midterm = input.nextInt();
        System.out.printf("Final: ");
        ffinal = input.nextInt();

        average = (quiz * 0.2) + (midterm * 0.2) + (ffinal * 0.6);
        System.out.println("Average: " + average);
        String result = (average >= 50) ? "You have passed the course" : "You did not pass the course";
        System.out.println(result);
    }
}