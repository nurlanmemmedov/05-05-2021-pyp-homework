public class Task6 {
    public static void main(String[] args) {

        //System.out.println(isUniqueOrNot(1234));
        System.out.println(isUniqieBinary(1329193814));
    }

    public static boolean isUniqueOrNot(int number){

        while (number>0){

            if (IsUnique(number)==1){
                return false;
            }
            number/=10;
        }

        return  true;

    }

    public static int IsUnique(int number){
        int checker=number/10;
        int count=0;

        while(checker>0){
            if(number%10==checker%10){
                count++;
                break;
            }
            checker/=10;
        }
        return count;
    }

    public static boolean isUniqieBinary(int num){
        int map = 0;
        int current, bitMask;
        while(num>0){
            current = num % 10;
            bitMask = 1 << current;
            if((map & bitMask) > 0) return false;
            map ^= bitMask;
            num /= 10;

        }
        return true;
    }


}
