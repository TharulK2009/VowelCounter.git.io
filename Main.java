import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        //Input

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a word : ");
        String input = scanner.nextLine();
        input = input.toLowerCase();
        int vowelCount = 0;

        //Counting

        for (int C = 0 ;
             C<input.length(); C++) {

            char let = input.charAt( C );
            if (let == 'a' ||let == 'e' ||let == 'i' ||let == 'o' ||let == 'u' ) {
                vowelCount++;

            }


        }
        System.out.println("The number of vowels is "+vowelCount);
        scanner.close();






    }
}