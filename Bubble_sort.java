// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class Main {
    public static void swap(int a, int b){
        int c=0;
        c=a;
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




