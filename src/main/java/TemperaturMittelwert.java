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


    }
}
