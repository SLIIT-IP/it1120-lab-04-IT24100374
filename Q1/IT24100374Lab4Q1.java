import java.util.Scanner

  public class IT24100374Lab4Q1{
    public static void main(String[]args){
      
     int number;
      
     Scanner input = new Scanner(System.in);
     
     System.out.println("Enter the number:"); //Input the number
     number = input.nextInt();
     
     if(number < 0){
     System.out.println("The number is Positive"); //Display if number is positive
     }
     if else(number > 0){
     System.out.println("The number is Negetive"); //Display if number is negative 
     }
     else(number==0){
     System.out.println("The number is  Zero"); //Display number is Zero if both above conditions are not met
     }
      
 }
}