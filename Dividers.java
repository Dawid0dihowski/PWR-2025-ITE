public class Dividers {

    public static void main(String[] args){
        dividers(16);
    }
    public static void dividers(int n){
        int licznik = 0;
        for(int i= 2; i<n ; i++){
            if(n%i == 0) {
                System.out.println(i);
                licznik++;
            }
        }
        if(licznik != 0){
            System.out.println("liczba nie jest pierwsza");
        }
        else {
            System.out.println("liczba jest pierwsza");
        }
    }
}
