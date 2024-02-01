public class Sorting {
    
    private int[] arr;
    private static int nElems; // # of data items

    public Sorting(int size) {
        arr = new int[size]; // create the array
        nElems = 0; // no elements in array yet
    }

    public void insert(int value) {
        arr[nElems] = value; // insert
        nElems++; // increment size to keep track of insertion index
    }

    public void display() {
        for(int i = 0; i < arr.length; ++i) {
            System.out.print(arr[i] + " ");
        }
    }

    public void bubbleSortBook() {
        int i, j, temp;
        int n = arr.length;
        
        for(i = n - 1; i > 0; i--) { // instead of i = nElems - 1, we can use i = n - 1
            for(j = 0; j < i; j++) {
                if(arr[j] > arr[j + 1]) {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }


    public void selectionSortBook() {
        int n = arr.length;
        int minIndex;

        for(int i = 0; i < n-1; i++) {
            minIndex = i;
            for(int j = i + 1; j < n; j ++) {
                if(arr[j] < arr[minIndex]) {
                    minIndex = j; // min index is now the index of j (the new min value)
                }
            }
            if(minIndex != i) { // means we have a new min value
                int temp = arr[i];
                arr[i] = arr[minIndex];
                arr[minIndex] = temp; 
            }
        }
    }

    public void newBubbleSort() {
        int i,j,n;
        n = arr.length;
        for(i = n - 1; i > 0; i--) {
            for(j = 0; j < i; j++) {
                if(arr[j] > arr[j + 1]) {
                    int temp = arr[j]; // Lower index (higher value) is stored in temp
                    arr[j] = arr[j+1]; // higher index (lower value) overwrites arr[j]
                    arr[j + 1] = temp; // higher index is overwritten by higher value
                }
            }
        }
    }

    public void newerBubbleSort() {
        int i, j, temp;
        int n = arr.length;

        for(i = n - 1; i > 0; i--) {
            for(j = 0; j < i; j++) {
                if(arr[j] > arr[j+1]) {
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }

    }

    public void newSelectionSort() {
        int i, j, minIndex, temp;
        int n = arr.length;

        for(i = 0; i < n - 1; i++) {
            minIndex = i;
            for(j = i + 1; j < n; j++) {
                if(arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            if(minIndex != i) {
                temp = arr[i];
                arr[i] = arr[minIndex];
                arr[minIndex] = temp;
            }
        }
    }

    public void insertionSort() {
        int i, j;
        
                                            // i acts as a cutoff point in the array, separating
         for(i = 1; i < arr.length; i++) {  // the sorted portion (to the left of i) from the 
                                            // unsorted portion (to the right of i).
            int temp = arr[i];
            j = i;
            while(j > 0 && arr[j - 1] >= temp) {
                arr[j] = arr[j - 1];
                j--;
            }
        arr[j] = temp;
        }
    }
}
