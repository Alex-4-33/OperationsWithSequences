import java.util.Arrays;
import java.util.Scanner;

public class SequenceIntro {

    public static void main(String []argh) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter your data");
        System.out.println("First, N, the number of sequence members");
        System.out.println("Then, N sequence members themselves");
        int n = in.nextInt();
        int[] s = new int[n];
        int max = 0;
        for (int i = 0; i < n; i++){
            s[i] = in.nextInt();
            if (s[i] > max) {
                max = s[i]; // searching for the max element
            }
        }
        System.out.print(Arrays.toString(s)); // output of the whole sequence
        System.out.println();
        System.out.println("The maximum sequence number is "+max); // output of the max sequence member
    }
}
