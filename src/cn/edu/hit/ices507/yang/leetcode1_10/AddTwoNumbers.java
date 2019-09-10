package cn.edu.hit.ices507.yang.leetcode1_10;

import cn.edu.hit.ices507.yang.model.ListNode;

public class AddTwoNumbers {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode result = new ListNode(0);
        ListNode p = l1, q = l2, temp = result;
        int carryNum = 0;
        while(p != null || q != null){
            int x = (p != null) ? p.val : 0;
            int y = (q != null) ? q.val : 0;
            carryNum = (x + y + carryNum) / 10;
            temp.next = new ListNode((x + y + carryNum) % 10);
            temp = temp.next;
            if(p != null){ p = p.next; }
            if(q != null){ q = q.next; }
        }
        if(carryNum != 0) {
            temp.next = new ListNode(1);
        }
        return result.next;
    }
}
