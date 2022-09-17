import java.util.Scanner;
public class ManavKasaProgrami {
    public static void main(String[] args) {
        double armut = 2.14, elma = 3.67, domates = 1.11, muz = 0.95, patlican = 5.00, total, tarmut, telma, tdomates, tmuz, tpatlican;

        Scanner input = new Scanner(System.in);

        System.out.print("Armut Kaç Kilo ? ");
        tarmut = input.nextDouble();
        tarmut = armut * tarmut;

        System.out.print("Elma Kaç Kilo ? ");
        telma = input.nextDouble();
        telma = telma * elma;

        System.out.print("Domates Kaç Kilo ? ");
        tdomates = input.nextDouble();
        tdomates = tdomates * domates;

        System.out.print("Muz Kaç Kilo ? ");
        tmuz = input.nextDouble();
        tmuz = tmuz * muz;

        System.out.print("Patlıcan Kaç Kilo ? ");
        tpatlican = input.nextDouble();
        tpatlican = tpatlican * patlican;

        total = tarmut + telma + tdomates + tmuz + tpatlican;
        System.out.print("Toplam Tutar : " + total + " TL");

    }
}
