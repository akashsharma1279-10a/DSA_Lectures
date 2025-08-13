// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class Main {
    public static void swap(int i, int j, int[] arr){
        int c=0;
        c=arr[i];
        a=b;
        b=c;
    }
    public static void main(String[] args) {
        
        int arr[]={2,4,1,5,6};
        int n=arr.length;
        for(int i=0;i<arr.length-1;i++){
            for(int j=0;j<n-i-1;j++){
                if(arr[j]>arr[j+1]){
                    swap(arr[j],arr[j+1]);
                }
            }
        }
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }    
   }
}
        
//What do u think  the answer  will be it is wrong answer is {2,4,1,5,6}. The same no changes.                                   More specifically:

// Java is always pass-by-value — but when you pass an object, the "value" is actually a reference (a pointer to the object in memory).
// For primitives (int, double, etc.), the value is the actual number — so Java just copies it, and the original can’t be changed.
// You’re passing the values (copies) of a and b.


