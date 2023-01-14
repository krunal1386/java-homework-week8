package week8_Homework_1;

public class Task4_Homework {
 /*
         > Write a method with the name sumDigits that has one int parameter called
          number. If parameter is >= 10 then the method should process the number and
          return sum of all digits, otherwise return -1 to indicate an invalid value.

         > The numbers from 0-9 have 1 digit, so we don't want to process them, also we
           don't want to process negative numbers, so also return -1 for negative
           numbers.

         > For example calling the method sumDigits(125) should return 8 since 1 + 2 + 5 = 8.

         > Calling the method sumDigits(1) should return -1 as per requirements described above.
 */

    public static int sumDigits(int number) {
        if (number < 10) {
            return -1;
        }

        int sumDigits = 0;
        // Convert number to string
        String numberToString = Integer.toString(number);
        // Map through all char of the string
        for(char c : numberToString.toCharArray()) {
            // Convert the char to number again
            sumDigits += Integer.parseInt(String.valueOf(c));
        }
        return sumDigits;
    }

    public static void main(String[] args) {
        // Should return 15 => 5 + 5 + 5 = 15
        System.out.println("Sum of 555 is = " + sumDigits(555));
        // Should return 21 => 7 + 8 + 6 = 21
        System.out.println("Sum of 786 is = " + sumDigits(786));
        // Should return 27 => 9 + 9 + 9 = 27
        System.out.println("Sum of 999 is = " + sumDigits(999));
        // Should return -1
        System.out.println("Sum of -3 is = " + sumDigits(-3));
    }
}
