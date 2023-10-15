import java.util.Scanner;
public class zadanie5 {
    public static void main(String[] args) {
        Scanner klawiatura = new Scanner(System.in);
        System.out.println("Podaj łańcuch znaków: ");
        String lancuch = klawiatura.nextLine();
        System.out.println("Podaj znak do zliczenia: ");
        char znak = klawiatura.next().charAt(0);
        int licznik = 0;
        for (int i = 0; i <lancuch.length();i++){
            if (lancuch.charAt(i) == znak){
                licznik++;
            }
        }
        System.out.println("Znak "+ znak +" w łańcuchu występował " + licznik +" razy ");
        klawiatura.close();
    }
}