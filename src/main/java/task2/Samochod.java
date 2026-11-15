package task2;

public class Samochod extends Pojazd {

    @Override
    public String opis() {
        return "To jest samochód";
    }

    public void nowaMetoda() {
        System.out.println("Nowa metoda");
    }

    @Deprecated(since = "1.0", forRemoval = true)
    @Override
    public void staraMetoda() {
        super.staraMetoda();
    }

}
