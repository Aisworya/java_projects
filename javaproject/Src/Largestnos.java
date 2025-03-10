public class Largestnos{
    public static void main(String[] args){
        int[] largestElement= {10, 30, 100, 30,50};
        int l=largestElement[0];

        for (int i=1; i<largestElement.length; i++){
            if (largestElement[i]>l){
                l=largestElement[i];
            }
        }
        System.out.println("l=" + l);
    }
}