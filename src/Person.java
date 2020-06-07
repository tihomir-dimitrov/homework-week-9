import java.util.Scanner;

public class Person {
    public static void main(String[] args){

        Scanner user_input = new Scanner(System.in);

        String Name;
        System.out.print("Enter the name you desire: ");
        Name = user_input.next();

        String Person;
        Person = Name;
        System.out.println("The person who is controlling the machine is: "+ Person);
    }
}
