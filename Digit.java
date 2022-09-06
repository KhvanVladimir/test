public class Digit {

    String str;

    public int[] getDigits(String[] chars) throws Exception {

        int charFirstIndex, charSecondIndex, firstDigit, secondDigit, thirdDigit;
        int[] myDigits = new int[3];

        if (chars[1] == null){
            charFirstIndex = str.indexOf(chars[0]);

            firstDigit = Integer.parseInt(str.substring(0, charFirstIndex));
            secondDigit = Integer.parseInt(str.substring(charFirstIndex + 1));

            myDigits[0] = firstDigit;
            myDigits[1] = secondDigit;
        }
        else{
            charFirstIndex = str.indexOf(chars[0]);
            charSecondIndex = str.lastIndexOf(chars[1]);

            firstDigit = Integer.parseInt(str.substring(0, charFirstIndex));
            secondDigit = Integer.parseInt(str.substring(charFirstIndex + 1, charSecondIndex));
            thirdDigit = Integer.parseInt(str.substring(charSecondIndex + 1));

            myDigits[0] = firstDigit;
            myDigits[1] = secondDigit;
            myDigits[2] = thirdDigit;
        }
        this.checkDigit(myDigits);

        return myDigits;
    }
    public void checkDigit(int[] myDigits) throws Exception {

        for (int i = 0; i < myDigits.length - 1; i++){
            if (myDigits[i] < 1 || myDigits[i] > 10) {
                throw new Exception();
            }
        }
    }
}

