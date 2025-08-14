// Insertion Sort is a simple sorting algorithm that works the way we often sort playing cards in our hands:

// You start with the first element (already “sorted” by itself).

// Then you take the next element and insert it into the correct position among the elements before it.

// You keep doing this until all elements are in the right place.

// Online Java Compiler
// Use this editor to write, compile and run your Java code online
//Insertion sort
class Main {
    public static void main(String[] args) {
        int[] arr={4,1,5,2,3};
        for(int i=1;i<arr.length;i++){
            int curr=arr[i];
        int prev=i-1;
            while(prev>=0 && arr[prev]>curr){
                arr[prev+1]=arr[prev];
                prev--;
            }
            arr[prev+1]=curr;
        }
        for(int k=0;k<arr.length;k++){
            System.out.println(arr[k]);
        }
    }
}
