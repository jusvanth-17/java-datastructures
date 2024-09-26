class BuySell {
    public int maxProfit(int[] prices) {
        int min=prices[0],max=0;
        for(int i=1;i<prices.length;i++){
            min=Math.min(min,prices[i]);
            max=Math.max(max,prices[i]-min);
        }
        return max;
    }
    public static void main(String[] args) {
        BuySell b=new BuySell();
        int arr[]={2,10,7,1,5,3,6,4};
        System.out.println(b.maxProfit(arr));
    }
}