import java.util.LinkedList;
import java.util.Scanner;

public class LinkedListIntro {

    public static void main(String []argh) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter your data");
        System.out.println("First, N, the number of sequence members");
        System.out.println("Then, N sequence members themselves");
        int n = in.nextInt();
        LinkedList<Integer> s = new LinkedList<Integer>();
        for (int i = 0; i < n; i++) {
            s.addFirst(in.nextInt()); //add input to the list
        }
        System.out.println("The sequence is: "+s); // list output
    }
}
