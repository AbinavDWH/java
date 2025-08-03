public class hNv {
    public static void main(String[] args) {
        
    int nums[] = {2,4,1,1,6,5};
        int l=nums.length;
    int c=0;int j;
        for(int i=1;i<l-1;i++){
            j=i+1;
           while(nums[i]==nums[j] && j!=l-1) j++;
            if((nums[i]>nums[i-1] && nums[i]>nums[j]) || (nums[i]<nums[j] && nums[i]<nums[i-1]))  c+=1;
        }
        System.out.println(c);

}
}
