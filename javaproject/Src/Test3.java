import java.util.Scanner;
public class Test3{
    public static void main(String []args){
        int fact=1;
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter Number");
       int num=obj.nextInt();
        for(int i=1; i<=num; i++){
            fact=fact*i;

        }
        System.out.println("Factorial no of " + num + " is " + fact);

    }
}