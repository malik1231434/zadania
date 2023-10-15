import java.util.Scanner;
public class Zadanie16 {
    public static void main(String[] args) {
        Scanner klawiatura = new Scanner(System.in);
        System.out.println("Podaj miesięczny budżet: ");
        double budzet = klawiatura.nextDouble();
        double sumawydatkow = 0;
        while (true){
            System.out.println("Podaj wydatki");
            double wydatki = klawiatura.nextDouble();
            if (wydatki == 0){
                break;
            }
            sumawydatkow +=wydatki;
        }
        double roznica = budzet - sumawydatkow;
        System.out.println("Suma wydatkow w danym miesiacu "+ sumawydatkow);
        System.out.println("Różnica między budżetem a wydatkami: "+roznica);
        klawiatura.close();
    }
}
