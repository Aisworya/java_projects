import java.util.Scanner;

class Aisha{
    public static void main(String[] args){
        int a, b, c;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter three  numbers");
        a = scanner.nextInt();
        b = scanner.nextInt();
        c = scanner.nextInt();
    
        if (a>b && a>c ){
            
            System.out.println("Largest no is" + a);
        }
        else if (b>c){
        
            System.out.println("Largest no is" + b);
        }
        else {
            
            System.out.println("Largest no is" + c);
            System.out.println("Largest no is(Testing)" + c);
             }   
            
     }
}