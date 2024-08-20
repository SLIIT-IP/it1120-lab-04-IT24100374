import java.util.Scanner;

public class IT24100374Lab4Q2{

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //Declare
        Double labMarks,examMarks, finalMark;
        int labPercentage,examPercentage;


        // Input and validate exam marks
        System.out.print("Enter the exam marks (0-100): "); 
        examMarks = input.nextDouble();

        if (examMarks < 0 || examMarks > 100) 
        {
            System.out.println("Invalid input for exam marks. Terminating program");
            return; // Exit the program if input is provided invalid
        }
        
        // Input and validate lab submission marks
        System.out.print("Enter the lab submission marks (0-100): "); 
        labMarks = input.nextDouble();

        if (labMarks < 0 || labMarks > 100) 
        {
            System.out.println("Invalid input for Lab marks. Terminating program");
            return; // Exit the program if invalid input is provided
        }

        // Input and validate percentage for exam marks
        System.out.print("Enter the percentage taken from the exam marks: ");
        examPercentage = input.nextInt();

        // Input and validate percentage for lab submission marks
        System.out.print("Enter the percentage taken from the lab submission marks: "); 
        labPercentage = input.nextInt();


        // Check if the percentages add up to 100
        if (examPercentage + labPercentage == 100) {
            // Calculate the final mark
            finalMark = ((examMarks * examPercentage) / 100) + ((labMarks * labPercentage) / 100);

            // Display the result
            System.out.println();
            System.out.print("The final mark is: "+ finalMark);
        } 
        else
        {
            System.out.println("The total percentage must add upto 100. Terminating Program.");
            return;
        }
    }
}
