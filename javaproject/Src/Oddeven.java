import java.util.Scanner;
public class Oddeven{
    public static void main(String[] args){
        System.out.println("Enter a number");
        Scanner obj=new Scanner(System.in);
        int num= obj.nextInt();
        if (num %2==0){
            System.out.println(num + " is Even number");
        }
        else{
            System.out.println(num + " is odd number");

        }

    }
}