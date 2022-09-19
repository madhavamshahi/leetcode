class Solution {
public:
    vector<int> twoSum(vector<int>& nums, int target) {
         unordered_map<int, int> map;
        vector<int> bb;
        for(int i = 0 ; i < nums.size(); i++)
        {
            if(map.find(target-nums[i]) != map.end())
            {
                bb.push_back(i);
                bb.push_back(map[target-nums[i]]);
                return bb;
            }
            map[nums[i]] = i;
        }
        return bb;
        
        
        
        
    }
};