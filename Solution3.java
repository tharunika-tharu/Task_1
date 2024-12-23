import java.util.Scanner;

public class Solution3 {
    //program to reverse the given number using loop
    public static void main(String[] args) {
        //input from user
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the numbers to reverse:");
        int num = scanner.nextInt();

        int reverse = reverseNum(num);
        System.out.println("Reversed number:"+reverse);
    }
    //function to reverse given number using loop
    public static int reverseNum(int num){
        int reverse = 0;
        while( num != 0){
            int digit = num % 10;
            reverse = reverse * 10 + digit;
            num = num /10 ;
        }
        return reverse;
    }
}
