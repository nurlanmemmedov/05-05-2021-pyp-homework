public class Task {
    public static void main(String[] args) {
        System.out.println(getSumOfPrimeDigits(123456));
    }
    public static boolean isPrime(int number){
        for (int i=2;i<=number/2;i++){
            if(number%i==0){
                return false;
            }
        }
        return true;
    }
    public static int getSumOfPrimeDigits(int number){
        int sum=0;
        while (number>0){
            if(isPrime(number%10)){
                sum+=number%10;
            }
            number/=10;
        }
        return sum;
    }
}


