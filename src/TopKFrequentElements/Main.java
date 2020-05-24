package TopKFrequentElements;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        int[] nums = {1,2};
        int k = 2;
        List<Integer> res = topKFrequent(nums, k);
        for(int r : res){
            System.out.println(r);
        }
    }
    public static List<Integer> topKFrequent(int[] nums, int k) {

        HashMap<Integer,Integer> table1 = new HashMap();
        for(int num : nums){
            if(table1.containsKey(num)){
                table1.put(num, table1.get(num)+1);
            }else{
                table1.put(num, 1);
            }
        }


        List<List<Integer>> buckets = new ArrayList(nums.length + 1); // wont use 0th bucket
        for (int i = 0; i < nums.length + 1; i++) {
            buckets.add(new ArrayList<Integer>());
        }



        for(Map.Entry<Integer,Integer> entry : table1.entrySet()){
            int frequency = entry.getValue();
            List<Integer> bucket = buckets.get(frequency);
            bucket.add(entry.getKey());

        }


        List<Integer> res = new ArrayList();
        int size = buckets.size();

         while(k > 0 && res.size() <= k){
             List<Integer> bucket = buckets.get(size-1);
             if(bucket.size() > 0){
                 res.addAll(bucket);
                 k--;
             }
             size--;

         }
        //如果list的第i个位置是空的话，loop不会touch it
//        for (int i = buckets.size() - 1; i >= 0 && k > 0 ; i--) {
////            System.out.println(i);
////            System.out.println(k);
////            System.out.println("-----------");
//            List<Integer> bucket = buckets.get(i);
//            if(bucket.size() != 0){
//                res.addAll(bucket);
//                k--;
//            }
//
//        }

        return res;

    }
}
