class Solution {
    public boolean checkPossibility(int[] nums) {
        boolean returnFlag=false; 
        int size=nums.length;
        int c=0;
        
        for(int i=0; i<size-1;i++)
        {
            if( nums[i]>nums[i+1] )
		    {   
                //pehle ka number bada 
                
                if(i>0)
                {
                if(nums[i-1]<=nums[i+1])
                {
			        nums[i]=nums[i-1];
                }
			    else
                {
                    nums[i+1]=nums[i];
                }
                }
			    c++;
			if(c>1)
            {
			return false;
            }
                
		    }
        }
        
        return true;
        
        
    }
}