class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer,Integer> freqMap = new HashMap();
        for(int i=0;i<nums.length;i++){
            freqMap.putIfAbsent(nums[i],0);
            freqMap.put(nums[i],freqMap.get(nums[i])+1);
        }
        PriorityQueue<Pair> pairs = new PriorityQueue<Pair>((a,b)->b.freq-a.freq);
        freqMap.forEach((key,value)->{
            pairs.add(new Pair(key,value));
        });
        int[] result = new int[k];
        for(int i=0;i<k;i++)
            result[i]=pairs.poll().val;
        return result;
    }
}
class Pair
{
    int val;
    int freq;
    Pair(int val,int freq){
        this.val=val;
        this.freq=freq;
    }
}