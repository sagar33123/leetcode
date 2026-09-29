class Solution {
    public int totalMoney(int n) {
        int sum=0;
        int monday=1;
        while(n>0){
            for(int j=monday;j<monday+7&&n>0;j++){
                    sum=sum+j;
                    n--;
                }
                monday++;

            

            
            
            
            
        }
    return sum;
    }
}