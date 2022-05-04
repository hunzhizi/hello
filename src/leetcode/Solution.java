package leetcode;

import java.util.Comparator;
import java.util.HashMap;
import java.util.PriorityQueue;
import java.util.Set;

class Solution {
    public int[] topKFrequent(int[] nums, int k) {

        PriorityQueue<Node> priorityQueue = new PriorityQueue<>(new Comparator<Node>() {
            @Override
            public int compare(Node o1, Node o2) {
               return o1.value-o2.value;
            }
        });

        HashMap<Integer, Node> map = new HashMap<>();
        for (int num : nums) {
            if(map.containsKey(num)){
                map.get(num).value++;
            }else{
                Node node = new Node(num, 1);
                map.put(num,node);
            }
        }
        Set<Integer> keySet = map.keySet();
        for (Integer integer : keySet) {
           priorityQueue.add(map.get(integer)) ;
        }

        int[] ints = new int[k];
        for (int i = 0; i < ints.length; i++) {
            ints[i] = priorityQueue.remove().key;
        }
        return ints;

    }
    class Node{
        public int key;
        int value;

        public Node(int key, int value) {
            this.key = key;
            this.value = value;
        }
    }
}