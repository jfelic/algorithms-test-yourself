public class App {
    public static void main(String[] args) throws Exception {

        Sorting arr = new Sorting(10);

        arr.insert(77);
        arr.insert(99);
        arr.insert(44);
        arr.insert(55);
        arr.insert(22);
        arr.insert(88);
        arr.insert(11);
        arr.insert(00);
        arr.insert(66);
        arr.insert(33);

        System.out.print( "Unsorted: "); arr.display(); System.out.println();
        
        arr.insertionSort();
        System.out.print("\nSorted: "); arr.display(); System.out.println();

        Testing.testingTimeComplexity();
        Testing.testingTimeComplexity();
        Testing.testingTimeComplexity();

        Testing.whatSortToWrite();

    }
}
