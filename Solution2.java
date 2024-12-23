import java.util.Scanner;

public class Solution2 {
    //program that find a given number is negative or positive
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number:");
        int num = scanner.nextInt();
        findSign(num);
    }
    //function to print the given number is positive or negative
    public static void findSign(int num){
        if(num < 0){
            System.out.println("The Entered number is negative");
        } else if (num > 0) {
            System.out.println("The Entered number is positive");
        }else {
            System.out.println("The Entered number is Zero");
        }
    }
}

