import java.util.Scanner;

public class Testing {

    public static int random() {
        int randomNumber = (int)(Math.floor(Math.random() * 6) + 1);
        System.out.println(randomNumber);
        return randomNumber;
    }

    public static void whatSortToWrite() {
        int selector = random();
        if(selector == 1) {
            System.out.println("Bubble sort fucker");
        } else if (selector == 2) {
            System.out.println("Selection Sort");
        } else if(selector == 3) {
            System.out.println("Insertion sort");
        } else {
            System.out.println("Merge Sort");
        }

        int countDownSeconds = 600;

        
    }
        
    public static void testingTimeComplexity() {
        Scanner scnr = new Scanner(System.in);

        int selector = random();
        if(selector == 1) {
            System.out.println("What is the time complexity of a bubble sort?");
            String userInput = scnr.nextLine();
            while (!userInput.equals("O(n^2)")) {
                System.out.println("Wrong, try again");
                userInput = scnr.nextLine();
            }
            System.out.println("Correct!");
        } else if (selector == 2) {
            System.out.println("What is the time complexity of a selection sort?");
            String userInput = scnr.nextLine();
            while (!userInput.equals("O(n^2)")) {
                System.out.println("Wrong, try again");
                userInput = scnr.nextLine();
            }
            System.out.println("Correct!");
        } else if(selector == 3) {
            System.out.println("What is the time complexity of an insertion sort?");
            String userInput = scnr.nextLine();
            while(!userInput.equals("O(n^2)")) {
                System.out.println("Wrong, try again");
                userInput = scnr.nextLine();
            }
            System.out.println("Correct!");
        } else if (selector == 4) {
            System.out.println("What is the time complexity of a merge sort?");
            String userInput = scnr.nextLine();
            while(!userInput.equals("nlogn") && !userInput.equals("O(nlogn)")) {
                System.out.println("Wrong, try again");
                userInput = scnr.nextLine();
            }
            System.out.println("Correct!");
        } else if (selector == 5) {
            System.out.println("What is the time complexity of a binary search?");
            String userInput = scnr.nextLine();
            while(!userInput.equals("logn") && !userInput.equals("O(logn)")) {
                System.out.println("Wrong, try again");
                userInput = scnr.nextLine();
            }
            System.out.println("Correct!");
        } else if (selector == 6) {
            System.out.println("What is the time complexity of a linear search?");
            String userInput = scnr.nextLine();
            while(!userInput.equals("n") && !userInput.equals("O(n)")) {
                System.out.println("Wrong, try again");
                userInput = scnr.nextLine();
            }
            System.out.println("Correct!");
        }

        //scnr.close();
    }
}
