public class Largest {
    public static void main(String[] args){
        int[] largestnos={10, 20, 40, 60};
        int l=largestnos[0];
        for(int i=1; i< largestnos.length; i++ ){
            if (largestnos[i]> l){
                l= largestnos[i];
            }
        }
        System.out.println("l = "+ l);
        
    }
}