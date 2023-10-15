import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class Zadanie6 {
    public static void main(String[] args) {
        Scanner klawiatura = new Scanner(System.in);
        System.out.println("Podaj ścieżkę pliku: ");
        String sciezka = klawiatura.nextLine();
        System.out.println("Podaj znak do zliczenia: ");
        char znak = klawiatura.next().charAt(0);
        int licznik = 0;
        try {
            File plik = new File(sciezka);
            Scanner czytnikPliku = new Scanner(plik);
            while (czytnikPliku.hasNextLine())
            {
                String linia = czytnikPliku.nextLine();
                for (int i = 0; i < linia.length();i++)
                {
                    if (linia.charAt(i)==znak)
                    {
                        licznik++;
                    }
                }
            }
            czytnikPliku.close();
            System.out.println("Liczba wystąpień znaku "+ znak + "w pliku: "+ licznik);

        } catch (FileNotFoundException e) {
            System.out.println("Nie można odnaleźć pliku");
        }
        klawiatura.close();
    }
}
