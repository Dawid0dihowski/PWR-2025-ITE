public class Printer {

    public static void main(String[] args){
        print_odd(9);
    }
    public static void print_odd(int N){
        for(int i= 0; i<N + 1; i++){
            if(i % 2 == 1) {
                System.out.println(i);
            }
        }
    }
}
