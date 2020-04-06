import java.util.Scanner;

public class Console {
    public static int intro(String prompt, int min, int max) {
        /**
         * @num is the number typed by the user
         * intro checks that num is greater than min and less than max
         * it will tell the user to enter a num btwn min and max if its not & loop until done
         */
        Scanner input = new Scanner(System.in);
        int num;
        while (true){
            System.out.print(prompt);
            num=input.nextInt();
            if (num >= min && num <= max){
                break;
            }
            System.out.print("Enter a value between " + min + " and " + max);
        }
        return num;
    }
}
