package week8_Homework_1;

public class Task8_Homework {
  /*
        8.  Display left angle triangle of * using nested for loops
            *
            * *
            * * *
            * * * *
            * * * * *
 */

    //Main method
    public static void main(String[] args) {
        //i for rows and j for columns
        //row denotes the number of rows to be printed
        int i, j, rows = 5; //declare local variables
        for (i = 1; i <= rows; i++) //outer loop for rows
        {
            for (j = 1; j <= i; j++) //inner loop for columns
            {
                System.out.print("*"); //prints @
            }
            System.out.println(); //skips to a new line
        }
    }
}
