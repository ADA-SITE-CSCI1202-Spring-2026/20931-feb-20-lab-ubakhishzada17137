import java.util.Scanner;

public class MinMax{
    public static int max(String[] input){
        int max = Integer.parseInt(input[0]);
        for (int i = 1; i<input.length; i++){
            int tmp = Integer.parseInt(input[i]);
            if (tmp > max){
                max = tmp;
            }
        }
        return max;
    }

    public static int min(String[] input){
        int min = Integer.parseInt(input[0]);

        for (int i = 1; i<input.length; i++){
            int tmp = Integer.parseInt(input[i]);
            if (tmp<min) min = tmp;
        }
        return min;

    }
    public static int[] minMax(String[] input) {

        int min = Integer.parseInt(input[0]);
        int max = Integer.parseInt(input[0]);

        for (int i = 1; i < input.length; i++) {
            int tmp = Integer.parseInt(input[i]);
            
            if (tmp < min) {
                min = tmp;
            } else if (tmp > max) { 
                max = tmp;
            }
        }

        return new int[]{min, max};
    }
    public static void main(String[] args){
        int resultMax = max(args);
        int resultMin = min(args);
        System.out.println("Max: " + resultMax);
        System.out.println("Min: "+ resultMin);

        Scanner sc = new Scanner(System.in);

        System.out.println("Number: ");

        int count = sc.nextInt();
        sc.nextLine();
        String[] numbers = new String[count];

        System.out.println("Enter " + count + " numbers:");
        for (int i = 0; i < count; i++) {
            System.out.print("Element " + i + ": ");
            numbers[i] = sc.next();
        }

        System.out.println("Max: " + max(numbers));
        System.out.println("Min: "+ min(numbers));
        sc.close();
        
    }
}