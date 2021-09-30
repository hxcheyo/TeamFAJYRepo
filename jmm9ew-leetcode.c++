//Janai Malone, jmm9ew, leetcode solution
class Solution {
public:
    int removeElement(vector<int>& nums, int val) {
        int number = 0;
        for(int i: nums){
            if (i != val){
                nums[number] = i;
                number++;
            }
        }
        return number;
    }
};