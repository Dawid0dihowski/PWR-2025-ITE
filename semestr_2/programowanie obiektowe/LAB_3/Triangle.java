import java.util.Scanner;

public class Triangle {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in); // tworzymy obiekt scaner
        System.out.println("Podaj liczbę rzędów ");
        int number = scan.nextInt(); //wsadzamy do 'number' co wpisalismy w klawiatrzue typu int

        print_triangle(number);
    }
    public static void print_triangle(int N){
        int[][] tab = new int[N][N]; //inicjalizacja tablicy dwuwymiarowej
        for(int i = 0; i<N; i++){
            for(int j = 0; j<=i; j++){
                if(i == 0 || i == j  ){
                    tab[i][j] = 1;
                }
                else{
                    tab[i][j] = silnia(i)/(silnia(j)*silnia(i - j));
                }
            }

        }
        for (int i = 0; i < N; i++) { //wyswietla tablice z 0
            for (int x = 0; x < N - i-1; x++) { // dodawanie 0 na poczatku
                System.out.print(0 + " ");
            }
            for (int j = 0; j <= i; j++) { // dodawanie 0 pomiedzy
                System.out.print(0 + " ");
                System.out.print(tab[i][j] + " ");
            }

            for (int y = 0; y <=  N - i - 1  ; y++) { // dodawanie 0 na koncu
                System.out.print(0 + " ");
            }
            System.out.println();
        }
    }
    public static int silnia(int a){ // zwraca silnie
        int wynik = 1;
        for(int i = 1; i <= a  ; i++){
            wynik *=i;
        }
        return wynik;
    }
}
