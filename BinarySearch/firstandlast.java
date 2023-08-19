public class firstandlast {
    public static void main(String[] args) {

    }
    class Solution {
        public int[] searchRange(int[] nums, int target) {
            int[] ans = {-1,-1};
            int startindex = search(nums,target,true);
            int endindex = search(nums,target,false);
            ans[0] = startindex;
            ans[1] = endindex;
            return ans;
        }
        int search(int[] nums,int target, boolean findstartindex){
            int ans = -1;
            int start = 0;
            int end = nums.length - 1;
            while (start <= end) {
                int mid = start + (end - start) / 2;
                if (target < nums[mid]) {
                    end = mid - 1;
                } else if (target > nums[mid]) {
                    start = mid + 1;
                } else {
                    ans = mid; //potential ans
                    if(findstartindex){ //if we have to find the satrt index
                        end = mid -1;
                    }
                    else{
                        start = mid + 1;  // if we have to find the end index
                    }
                }
            }
            return ans;
        }

    }

}
