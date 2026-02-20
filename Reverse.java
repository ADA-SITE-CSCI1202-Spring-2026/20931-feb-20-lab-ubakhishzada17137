import java.util.Scanner;

public class Reverse {
    public static String reverse(String input) {
        String rvrs = "";
        for (int i = input.length() - 1; i >= 0; i--) {
            rvrs += input.charAt(i);
        }
        return rvrs;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word = sc.next();
        System.out.println(reverse(word));
        sc.close();
    }
}