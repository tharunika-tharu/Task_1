public class Solution6 {
    //print pattern
    public static void main(String[] args) {
        print(5);
    }

    //function that print pattern
    public static void print(int n){
        for(int i=1; i<=5; i++){
            for(int j=1; j<=n; j++){
                System.out.print(Math.max(n-i+1, n-j+1));
            }
            System.out.println();
        }
    }
}
