public class Unterprogramme {

    public static void main(String[] args) {

        String text1 = "Heute ist ein schöner Tag.";

        System.out.println(ZeichenZählen(text1, 'e'));

    }

    public static String ZeichenZählen (String Text, char GesBuchstabe) {

        char[] text = Text.toCharArray();

        int vorkommen = 0;

        String ausgabe = "";

        for(int i = 0; i < text.length; i++) {

            if(text[i] == GesBuchstabe){
                vorkommen++;
            }

        }

        ausgabe = "Anzahl der " + GesBuchstabe + "'s im Text: " + vorkommen;

        return ausgabe;
    }

}
