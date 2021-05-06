public class Main {
    public static void main(String[] args) {
//        int i=5;
//        int a=++i;
//        System.out.println("i="+i);
//        System.out.println("a="+a);
        Print("Salam",1);
    }

//    public static void Print(String text){
//        System.out.println(text);
//    }

    public static void Print(String text,int... strArr){
        if(strArr.length==0){
            System.out.println("One str");
        }else{
            System.out.println("More str");
        }
    }
}
