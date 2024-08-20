import java.util.Scanner;

  public class IT24100374Lab4Q3{
    public static void main(String[]args){
      
     int number;
      
     Scanner input = new Scanner(System.in);

     //Input the number 
     System.out.print("Enter the number: "); 
     number = input.nextInt();

     //If the number is >0 then Positive elseif number<0 then Negative else Zero 
     System.out.println((number>0) ? "The number is Positive" :(number<0)? "The number is Negative": "The number is Zero"); 
      
 }
}