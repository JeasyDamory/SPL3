import javax.swing.*;

public class WoerterRaten {

    public static void main(String[] args) {

        String Ratewort = JOptionPane.showInputDialog(null, "Wort das zu erraten ist bitte eingeben: ");

        char[] RatewortArr = Ratewort.toCharArray();

        JOptionPane.showMessageDialog(null, "Das Wort hat "
                + RatewortArr.length + " Buchstaben");


        boolean schleife = true;
        char RateBuchstabe = '?';
        char[] ErrateneBuchstaben = new char[RatewortArr.length];
        String StandErraten = "";


        for(int i = 0; i < ErrateneBuchstaben.length; i++) {

            ErrateneBuchstaben[i] = '*';

            }


        while(schleife) {

            RateBuchstabe = JOptionPane.showInputDialog(null, "Bitte einen Buchstaben raten:").charAt(0);

            StandErraten = "";

            for(int i = 0; i < RatewortArr.length; i++) {

                if(RatewortArr[i] == RateBuchstabe) {

                    ErrateneBuchstaben[i] = RateBuchstabe;

                }

                StandErraten = StandErraten + ErrateneBuchstaben[i];

            }


            JOptionPane.showMessageDialog(null, "Erraten: " + StandErraten);

            if (StandErraten.equals(Ratewort)) {
                schleife = false;
            }

        }


    }

}
