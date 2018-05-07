public class TemperaturMittelwert {

    public static void main(String[] args) {

        int[] temp = new int[1000];

        // von 0 bis 40 Grad
        for (int i = 0; i < temp.length; i++) {

            temp[i] = (int)(Math.random()*41);

            System.out.println(temp[i] + "°");

        }

        int kl10 = 0;
        int gr10kl20 = 0;
        int grgl20 = 0;

        for (int i = 0; i < temp.length; i++) {

            if(temp[i] < 10) {
                kl10++;
            } else if(temp[i] < 20) {
                gr10kl20++;
            } else if(temp[i] >= 20) {
                grgl20++;
            }

        }

        System.out.println(kl10 + " Werte unter 10°");
        System.out.println(gr10kl20 + " Werte über 10° und unter 20°");
        System.out.println(grgl20 + " Werte 20° und darüber");

        System.out.println(kl10+gr10kl20+grgl20 + " = alle Werte");


        System.out.println(Vorkommen(temp, 0, 10) + " Werte unter 10°");
        System.out.println(Vorkommen(temp, 10, 20) + " Werte über 10° und unter 20°");
        System.out.println(Vorkommen(temp, 19, 40) + " Werte 20° und darüber");

        System.out.println(((Vorkommen(temp, 0, 10) + (Vorkommen(temp, 10, 20) + (Vorkommen(temp, 19, 40)) + " = alle Werte"))));



    }

    public static int Vorkommen (int[] Array, int Von, int Bis) {

        int vorkommen = 0;

        for (int i = 0; i < Array.length; i++) {

            if(Array[i] > Von && Array[i] < Bis) {
                vorkommen++;
            }

        }

        return vorkommen;
    }

}
