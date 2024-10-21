import java.util.Scanner;

public class FirstInitial {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //first line, top of s
        for (int i = 0; i < 2; i++) {
            System.out.print(" ");
        }
        for (int i = 0; i < 4; i++) {
            System.out.print("*");
        }
        System.out.println(); //2nd line and so on
        for (int i = 0; i < 8; i++) {
            System.out.print("*");
        }
        System.out.println();
        for (int i = 0; i < 3; i++) {
            System.out.print("*");
        }
        for (int i = 0; i < 3; i++) {
            System.out.print(" ");
        }
        for (int i = 0; i < 3; i++) {
            System.out.print("*");
        }
        System.out.println(); //middle part of s
        for (int i = 0; i < 2; i++) {
            System.out.print(" ");
        }
        for (int i = 0; i < 3; i++) {
            System.out.print("*");
        }
        System.out.println();
        for (int i = 0; i < 5; i++) {
            System.out.print(" ");
        }
        for (int i = 0; i < 3; i++) {
            System.out.print("*");
        }
        System.out.println(); //bottom of s
        for (int i = 0; i < 3; i++) {
            System.out.print("*");
        }
        for (int i = 0; i < 3; i++) {
            System.out.print(" ");
        }
        for (int i = 0; i < 3; i++) {
            System.out.print("*");
        }
        System.out.println();
        for (int i = 0; i < 8; i++) {
            System.out.print("*");
        }
        System.out.println();
        for (int i = 0; i < 2; i++) {
            System.out.print(" ");
        }
        for (int i = 0; i < 4; i++) {
            System.out.print("*");
        }
    }
}