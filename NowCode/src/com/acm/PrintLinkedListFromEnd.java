package com.acm;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Han on 2017/09/15.
 */
public class PrintLinkedListFromEnd {
    public class Solution {

        public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {

            ArrayList<Integer> list=new ArrayList<Integer>();
            list.add(listNode.val);
            while (listNode.next!=null){
                list.add(listNode.next.val);
                listNode=listNode.next;
            }
            for (int i=0;i<list.size()/2;i++){
                int tmp=list.get(i);
                list.set(i,list.get(list.size()-1-i));
                list.set(list.size()-1-i,tmp);
            }
            return list;
        }
    }

    public class ListNode {
        int val;
        ListNode next = null;

        ListNode(int val) {
            this.val = val;
        }

    }
}
