class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> mpp = new HashMap<Integer,Integer>();
        int[] arr= {0,0};
        for(int i=0;i<nums.length;i++)
        {
            int a = nums[i];
            int req=target-a;
            if(mpp.containsKey(req))
            {
                arr[0]=i;
                arr[1]=mpp.get(req);
                return arr;
            }
            if(!(mpp.containsKey(req)))
            {
                mpp.put(nums[i],i);
            }
        }
        return arr;
    }
}