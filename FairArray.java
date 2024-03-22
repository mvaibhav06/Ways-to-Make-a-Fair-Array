public class FairArray {
    public int waysToMakeFair(int[] nums) {
        int esum = 0;
        int osum = 0;

        int counter = 0;
        for(int i=0; i<nums.length; i++){
            for(int j=0; j<nums.length; j++){
                if(j==i) continue;
                if(j>i){
                    if((j-1)%2 == 0){
                        esum += nums[j];
                    }else{
                        osum += nums[j];
                    }
                }else{
                    if(j%2==0){
                        esum += nums[j];
                    }else{
                        osum += nums[j];
                    }
                }
            }
            if(esum == osum) counter++;
            esum = 0;
            osum = 0;
        }
        return counter;
    }
}
