package MyCode;


import java.util.Scanner;

public class whileIO {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String str;
        while (sc.hasNext()){ str = sc.nextLine();
            while (str.length() > 8) {
                System.out.println(str.substring(0, 8));
                str = str.substring(8);
            }
        str = str + "00000000";
        System.out.println(str.substring(0, 8));
        }
    }
}
