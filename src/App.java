public class App {
    public static void main(String[] args) throws Exception {

        int[] myArray = Sorting.createArray(100);

        System.out.print( "Unsorted:\n"); 
        Sorting.display(myArray);
        
        Sorting.bubbleSortPractice(myArray);
        System.out.print("\n\nSorted:\n"); 
        Sorting.display(myArray);
        

        // Testing.testingTimeComplexity();
        // Testing.testingTimeComplexity();
        // Testing.testingTimeComplexity();

        // Testing.whatSortToWrite();

    }
}
