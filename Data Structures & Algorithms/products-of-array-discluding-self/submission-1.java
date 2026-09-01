class Solution {
    public int[] productExceptSelf(int[] nums) {
        int zeros=0,  idx=-1,prod=1;
        int n=nums.length;

        for(int i=0;i<n;i++){
            if(nums[i]==0){
                zeros++;
                idx=i;
            }else{
                prod*=nums[i];
            }
        }
        int[] res=new int[n];
        Arrays.fill(res,0);

        if(zeros==0){
            for(int i=0;i<n;i++){
                res[i]=prod/nums[i];
            }
        }
        else if(zeros==1){
            res[idx]=prod;
        }
        return res;
    }
}  
