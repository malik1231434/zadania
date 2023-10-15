import java.util.Scanner;
public class zadanie {
    public static void main(String[] args) {
        Scanner klawiatura = new Scanner(System.in);
        System.out.println("Podaj dodatnią niezerową liczbę całkowitą: ");
        int liczba = klawiatura.nextInt();
        if (liczba <=0)
        {
            System.out.println("Podana liczba musi być dodatnia i niezerowa.");
        }
        else{
            int suma=0;
            System.out.println("Ciąg liczb od 1 do "+liczba+": ");
            for (int i = 1; i<=liczba;i++){
                System.out.print(i);
                suma+=i;
                if (i<liczba)
                {
                    System.out.print(", ");
                }
            }
            System.out.println("\nSuma liczb od 1 do "+liczba+"wynosi: "+suma);
        }

    }
}
