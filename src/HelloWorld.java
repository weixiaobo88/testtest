import java.util.HashMap;
import java.util.Scanner;

public class HelloWorld {
	public static void main(String args[]){
		System.out.println("hello world!");
//        Scanner in = new Scanner(System.in);
//        String order = in.next();
////        System.out.println("input ..." + order);
//        if(order.length() == 0)
//            System.out.println("input ...");
//        else
//            System.out.println(Integer.valueOf(order).intValue() + "xxxx");
//        SetConsoleTextAttribute(ConOut, background|FOREGROUND_RED|FOREGROUND_INTENSITY);
//        System.out.println("\u001B[31m" + "test" + "\u001b[m");
        int[] a = new int[3];
        for(int i = 0; i < a.length; i++){
            a[i] = i;
        }
        for(int i = 0; i < a.length; i++){
            System.out.println(a[i]);
        } 
        changeArray( a );
        for(int i = 0; i < a.length; i++){
            System.out.println(a[i]);
        }
    }

    private static void changeArray(int[] a) {
        a[1] = 999;
        change2(a);
    }

    private static void change2(int[] a) {

        a[2] = 888;
    }
}
