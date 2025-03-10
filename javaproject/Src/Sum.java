public class Sum{
    public static void main(String[] args){
        int[] num={5,4,3,2,1};
        int sum=0;

        for(int i=0; i<num.length; i++){
            sum= sum+num[i];
        }
        System.out.println("sum ="+ sum);
    }
}