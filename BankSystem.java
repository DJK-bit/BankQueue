/**
 * The class BankSystem implements a real life bank system. 
 */
import java.util.Scanner;

public class BankSystem {

    private static int customerID = 1;
    public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);
    boolean isRunning = true; 

    System.out.println("Enter maximum number of customers in the bank");
    int capacity = scan.nextInt();
    MyQueue queue = new MyQueue(capacity); 
    
    while(isRunning){
        System.out.println(" 1. New customer arrive");
        System.out.println(" 2. Serve next customer");
        System.out.println(" 3. Show total number of waiting customers");
        System.out.println(" 4. Show all waiting customers");
        System.out.println(" 5. Exit");

        int input = scan.nextInt();

        if(input == 1){
            queue.enqueue(customerID);
            System.out.println("Customer "+customerID+" has entered");
            customerID++;
        }
        else if(input == 2){
            int customer = queue.dequeue();
            System.out.println("Bank has served "+customer);
        }
        else if(input == 3){
            System.out.println("There are currently "+queue.size()+" customers waiting");
        }
        else if(input == 4){
            queue.print();
            System.out.println();
        }
        else if(input == 5){
            isRunning = false;
    }
    }
    scan.close();
    }
}