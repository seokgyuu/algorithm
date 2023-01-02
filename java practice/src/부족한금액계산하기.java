class Solution {
    public long solution(int price, int money, int count) {
        long totalprice =0;
        
        for(int i=1; i<=count; i++){
            totalprice += price *i;
        }
        return (money - totalprice) >= 0 ? 0 : (money - totalprice) * -1;
    }
}