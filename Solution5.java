import java.util.Scanner;

public class Solution5 {
    public static void main(String[] args) {
        //purchase amount input
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the purchased amount:");
        int purchasedAmt = scanner.nextInt();

        int finalAmount = findDiscount(purchasedAmt);
        System.out.println("The final payable amount:"+finalAmount);
    }

    //function to calculate the discount amount
    public static int findDiscount(int purchaseAmt){
        int discount = 0;
        if(purchaseAmt <= 500){
            discount = 0;
        } else if (purchaseAmt > 500 && purchaseAmt <=1000 ) {
            discount = purchaseAmt * 10/100 ;
        } else if (purchaseAmt > 1000) {
            discount = purchaseAmt * 20/100;
        }
        return purchaseAmt - discount;
    }
}
