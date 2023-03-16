import java.util.Scanner;
import dataStructures.hashMapImpementation;

public class Main {
    public static void main(String[] args) {
        System.out.println("Data structure Projects");
        System.out.println("Select the Data Structure to test and 0 to exit");
        System.out.println("1. Hashmaps");
        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();

        switch(choice){
            case 1:
                System.out.println("Executing Hashmap");
                hashMapImpementation hashcode = new hashMapImpementation();
                hashcode.hashcodeLearning();
                break;
            default:
                System.out.println("Invalid option selected");
        }








    }
}