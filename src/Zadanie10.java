import java.util.Scanner;
public class Zadanie10 {
    public static void main(String[] args) {
        Scanner klawiatura = new Scanner(System.in);
        int najmniejsza = Integer.MAX_VALUE;
        int najwieksza = Integer.MIN_VALUE;
        System.out.println("Podaj liczby całkowite. Wpisz -99 aby zakończyć.");
        int liczba;
        do {
            System.out.println("Podaj liczbę: ");
            liczba = klawiatura.nextInt();
            if (liczba != -99) {
                najmniejsza = liczba;
            }
            if (liczba > najwieksza) {
                najwieksza = liczba;
            }
        }
        while (liczba !=-99);
        if (najmniejsza != Integer.MAX_VALUE){
            System.out.println("najmniejsza wprowadzona liczba to: "+ najmniejsza);
            System.out.println("Największa wprowadzona liczba to: "+ najwieksza);
        } else{
            System.out.println("Nie wprowadzono żadnych liczb");
        }
        klawiatura.close();
    }
    }

