// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class Main {
    void swap(int[] arr, int i, int j){
        int c=arr[i];
        arr[i]=arr[j];
        arr[j]=c;
    }
    public static void main(String[] args) {
        int arr[]={13,7,2,5,9,100};
        for(int i=0;i<arr.length;i++){
            for(int j=i;j<arr.length;j++){
                int smallestIdx=i;
                if(arr[smallestIdx]<arr[i]){
                    smallestIdx=j;
                }
            }
            swap(arr[],smallestIdx,i);
        }
    }
}
