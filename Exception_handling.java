import java.util.Scanner;
public class Exception_handling  
{
    public static void main(String[] args) 
    {
        Scanner get= new Scanner(System.in);
        System.out.print("Enter a  num1:");
        int num1 =get.nextInt();
        System.out.print("Enter a  num2:");
        int num2 = get.nextInt();
        try{
             System.out.println("The division value of number is:"+(num1/num2));
        }
        catch(Exception e)
        {
            System.out.println("The number cannot divided by ZERO!!!!");
        System.out.print("Enter a  num1:");
        num1 =get.nextInt();
        System.out.print("Enter a  num2:");
        num2 = get.nextInt();
         System.out.print("The division value of number is:"+(num1/num2));
        }
        finally{
            System.out.println("Program executed as Successfully!");
        }
    }
}
