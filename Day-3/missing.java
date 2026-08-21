class missing{
    public int missingNumber(int[] nums) {
        int x=0;
        int enums=(nums.length*(nums.length+1))/2;
        for(int i=0;i<nums.length;i++){
            x+=nums[i];
        }
        return enums-x;
     }
}