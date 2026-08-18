import java.util.Scanner;

public class HelloWorld
{
    public static void main(String[] args)
    {
        System.out.println("HelloWorld!");
        squared();
    }
    public static void squared()
    {
        Scanner scan = new Scanner(System.in); // tworzymy obiekt scaner

        System.out.println("Podaj liczbę całkowitą: ");
        int number = scan.nextInt(); //wsadzamy do 'liczba' co wpisalismy w klawiatrzue typu int
        System.out.println("wynik = " + number* number);
    }


}
