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

//Mistakes use left<=right, i forget = init.
// 🔍 Why left <= right is important in binary search?
// Because we don't want to miss the last element!
// Think of this:
// Binary search keeps shrinking your search space.
// If you use while(left < right), then when only two elements are left, after one iteration, left might jump over and become equal to right. Then the loop breaks without checking that last possible index.



//For finding a pivot.
class finding_pivot {
    public int search(int[] nums, int target) {
///////////////////////////////Method1:
        //Step 1: Find pivot.
        left=0;
        right=nums.length-1;
        mid=0;
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
//We are not searching for a specific value, we are just trying to shrink the search space until we find the smallest one.
// We already set the conditions in a way that the loop stops once left == right — and at that moment, that position is guaranteed to be the pivot.
// So when we use:
// while(left < right)
// We are saying: keep searching until left and right become equal. When they become equal — stop — because that index is the answer (pivot). No need to run one more time.
