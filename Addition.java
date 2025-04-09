import java.util.Scanner;

public class Addition{
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);

        System.out.print("\nEnter the first number: ");
        int num1=scanner.nextInt();
        
        System.out.print("\nEnter the second number: ");
        int num2=scanner.nextInt(); 

        System.out.print("\nEnter the third number: ");
         int num3=scanner.nextInt(); 

        int sum=num1+num2+num3;
        System.out.println("The sum of " +num1+ " " +num2+ " and "+num3+ " is"+sum);

        scanner.close();
    }
}
 
    

