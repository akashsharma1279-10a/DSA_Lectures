class Solution {
    public int search(int[] nums, int target) {
        int left=0, right=nums.length-1, mid=0;
        while(left<=right){
            mid=left+(right-left)/2;
            if(nums[mid]==target){
                return mid;
            }
            else if(nums[mid]<target){
                left=mid+1;
            }
            else if(nums[mid]> target){
                right=mid-1;
            }
        }
        return -1;
    }
}



//For finding a pivot.
class finding_pivot {
    public int search(int[] nums, int target) {
///////////////////////////////Method1:
        //Step 1: Find pivot.
        int left=0;
        int right=nums.length-1;
        int mid=0;
        while(left<right){
            mid=left+(right-left)/2;
            if(nums[mid]>nums[right]){
                left=mid+1;
            }
            else{
                right=mid;
            }
        }
        int pivot= left;
    }
}





