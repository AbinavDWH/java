 class Two_Sum {
     
    public static void main(String[] args) {
        int nums[]={ 3,2,4 };
        int i=0,j=1,l=nums.length;
        int target=6;
      //   int sum=(nums[i]+nums[j]);
        while(i<l&&target!=(nums[i]+nums[j])){
            j++;
           if(j>l-1){
            i++;
            j=i+1;
           }
            // sum=(nums[i]+nums[j]);
            
           // if(nums[i]+nums[j]==target) System.out.println(i+" "+j); 
        }
        
        if(i<l&&j<l&&nums[i]+nums[j]==target) System.out.println(i+" "+j); 
        else System.out.println("No such indices found");
    
}
}
