import java.util.Scanner;

public class CaseCheck{
    public static void main(String[] args) {
        System.out.print("Enter your name: ");
        Scanner input = new Scanner(System.in);
        char ch = input.next().trim().charAt(0);
        input.close();

        if(ch >= 'a' && ch <= 'z')
            System.out.println("Lowercase");
        else
            System.out.println("Uppercase");

        // String name = "Satyajit";
        // System.out.println(name.trim());
        // System.out.println(name.charAt(2));
    }
}