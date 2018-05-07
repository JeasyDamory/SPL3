import java.util.Scanner;

public class Schaltjahr {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int Jahr = input.nextInt();


        if (SchaltjahrÜberprüfung(Jahr)) {

            System.out.println("Das Jahr " + Jahr + " ist ein Schaltjahr.");

        } else {

            System.out.println("Das Jahr " + Jahr + " ist kein Schaltjahr.");

        }



    }

    public static boolean SchaltjahrÜberprüfung (int Jahr) {

        boolean Überprüfung;

        if (Jahr%4 == 0 && Jahr%400 == 0 || Jahr%100 != 0) {

            Überprüfung = true;

        } else {

            Überprüfung = false;

        }

        return Überprüfung;
    }

}
