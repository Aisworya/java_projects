import java.util.Scanner;
public class factorialno{
    public static void main(String[] args){
    Scanner scanner=new Scanner(System.in);
    System.out.println("Enter a number");
    int a = scanner.nextInt();
    int fact=1;
    for(int i=1; i<=a; i++){
        fact= fact*i;
    }
    System.out.println("Factorial no of "+ a + " is "+  fact);
     }
}