import java.util.Scanner;
public class zadanie2 {
    public static void main(String[] args) {
        Scanner klawiatura = new Scanner(System.in);
        System.out.println("Podaj prędkość pojazdu: ");
        double predkosc = klawiatura.nextDouble();
        if (predkosc<0)
        {
            System.out.println("Prędkość nie może być ujemna!");
            return;
        }
        System.out.println("Podaj czas podróży w godzinach: ");
        double czasPodrozy = klawiatura.nextDouble();
        if (czasPodrozy<0){
            System.out.println("Czas podróży musi być większy lub równy 1 godzinie");
            return;
        }
        System.out.println("Godzina\tPrzebyta odległość");
        for (int h = 1;h<=czasPodrozy;h++)
        {
            double odleglosc = predkosc*h;
            System.out.println(h+ "\t"+odleglosc);
        }
        klawiatura.close();
    }
}
