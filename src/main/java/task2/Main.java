package task2;

public class Main {

    public static void main(String[] args) {
        Pojazd pojazd = new Pojazd();
        Samochod samochod = new Samochod();

        System.out.println(pojazd.opis());
        pojazd.staraMetoda();
        System.out.println(samochod.opis());
        samochod.staraMetoda();
        samochod.nowaMetoda();

        Obliczenie dodawanie = (a, b) -> a + b;

        System.out.println(dodawanie.wykonaj(10,2));
    }
}
