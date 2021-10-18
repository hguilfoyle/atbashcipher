public class Cipher {

    public static void main(String[] args) {
        String test = "APPLE";
        String test2 = "Hello world";
        String test3 = "Christmas is the 25th of December";

        System.out.println(cipher(test3));
    }

    public static String cipher(String input){
        //array to drop new letters into
        char[] charChanged = new char[input.length()];
        //int of new char for ASCII
        int charNum;
        //difference between where the letter is in the alphabet and the beginning
        int difference;
        //for return
        String changed;

        //Loop through the characters of the given string
        for (int i =0; i<input.length(); i++) {
            //change uppercase letters
            if(input.charAt(i) >= 65 && input.charAt(i) <=90) {
                difference = input.charAt(i) - 65;
                charNum = 90 - difference;
                charChanged[i] = (char) charNum;
            //change lowercase letters
            } else if(input.charAt(i) >= 97 && input.charAt(i) <=122) {
                difference = input.charAt(i)-97;
                charNum = 122 - difference;
                charChanged[i] = (char) charNum;
            //for other characters and spaces remaining the same.
            } else {
                charChanged[i] = input.charAt(i);
            }
        }
        changed = String.valueOf(charChanged);
        return changed;
    }
}
