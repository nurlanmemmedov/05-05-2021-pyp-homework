import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int enteredNumber = sc.nextInt();
        boolean res = isPalinDrome(enteredNumber);
        System.out.println(res);
    }

    public static boolean isPalinDrome(int number){
        int sum =0;
        int copy = number;
        while (number>0){
            sum=sum*10+number%10;
            number/=10;
        }
        return sum==copy;
    }
}
