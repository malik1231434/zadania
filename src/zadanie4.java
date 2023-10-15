public class zadanie4 {
    public static void main(String[] args) {
        int dni = 5;
        double wynagrodzenie = 25;
        double suma = 0;
        System.out.println("Dzień\nWynagrodzenie (zł)");
        for (int dzien=1; dzien<=dni;dzien++){
            System.out.println(dzien+" dzień"+"\n"+wynagrodzenie);
            suma+=wynagrodzenie;
            wynagrodzenie *=2;
        }
        System.out.println("Suma wynagrodzenia za " + dni +" dni = " + suma +" zł");
    }
}
