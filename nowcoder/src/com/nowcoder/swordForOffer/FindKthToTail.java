package com.nowcoder.swordForOffer;

import java.util.Stack;

public class FindKthToTail {
    public static void main(String[] args)
    {
        ListNode head = new ListNode(0);
        ListNode curr = head;
        for(int i = 1; i < 11; i++)
        {
            curr = curr.next = new ListNode(i);
        }
        System.out.println(FindKthToTail(head, 2).val);
    }

    private static ListNode FindKthToTail(ListNode head, int k)
    {
        if (k <= 0)
        {
            return null;
        }
        ListNode fast = head, slow = head;
        for(int i = 1; i < k; i++)
        {
            if(fast == null)
            {
                return null;
            }
            fast = fast.next;
        }
        while(fast != null)
        {
            fast = fast.next;
            slow = slow.next;
        }
        return slow;
    }

//    private static ListNode FindKthToTail(ListNode head, int k)
//    {
//        if(k <= 0)
//        {
//            return null;
//        }
//        Stack<ListNode> nodeStack = new Stack<>();
//        ListNode curr = head;
//        while(curr != null)
//        {
//            nodeStack.push(curr);
//            curr = curr.next;
//        }
//        for(int i = 0; i < k - 1; i++)
//        {
//            if(nodeStack.empty())
//            {
//                return null;
//            }
//            nodeStack.pop();
//        }
//        if(nodeStack.empty())
//        {
//            return null;
//        }
//        return nodeStack.peek();
//    }
}
