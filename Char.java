public class Char {
    String str;

    public String[] findChar() {

        int index1 = 100, index2 = 100;
        String char1 = "", char2 = "";

        String[] ch = new String[]{"+", "-", "/", "*"};

        for (int i = 0; i < ch.length; i++) {

            int indexChar = str.indexOf(ch[i]);
            int lastIndexChar = str.lastIndexOf(ch[i]);

            if (lastIndexChar != indexChar) {
                index1 = indexChar;
                index2 = lastIndexChar;

                char1 = ch[i];
                char2 = ch[i];

                break;
            }

            if (indexChar != -1){

                if (index1 == 100){
                    index1 = lastIndexChar;
                    char1 = ch[i];
                }
                else {
                    index2 = lastIndexChar;
                    char2 = ch[i];
                }
            }
        }
        String firstChar, secondChar;
        String[] operations = new String[2];

        if (index2 != 100) {

            if (index2 < index1){
                firstChar = char2;
                secondChar = char1;
            }
            else {
                firstChar = char1;
                secondChar = char2;
            }
            operations[0] = firstChar;
            operations[1] = secondChar;
        }
        else {
            operations[0] = char1;
        }
        return operations;
    }

}