public class ReverseArray{
    public static void main(String[] args){
        int [] numbers={1,4,5,6,9,0,2};
        int[] rev = new int[numbers.length];
        for (int i=0; i<numbers.length; i++){
            rev[i]=numbers[numbers.length-1-i];
        //    rev.add(numbers(i));
    // System.out.println("Reverse array"+ rev);
    }
            System.out.println("Reverse array"); 
            for (int num:rev){
                System.out.println(num + "");
            }

        }
}