package com.nowcoder.swordForOffer;

import java.util.Stack;

public class ReverseList {
    public static void TestReverseList(){
        ListNode head = new ListNode(0);
        ListNode curr = head;
        for(int i = 1; i < 11; i++)
        {
            curr = curr.next = new ListNode(i);
        }
        ListNode newHead = ReverseList(head);
        curr = newHead;
        while(curr != null)
        {
            System.out.println(curr.val);
            curr = curr.next;
        }
    }

    // 不停的把第二个元素插入到头部：头插法
    private static ListNode ReverseList(ListNode head){
        if(head == null)
        {
            return null;
        }
        ListNode curr = head.next;
        while(head != null)
        {
            ListNode temp = curr.next;
            head.next = temp;
            curr.next = head;
            head = curr;
            curr = temp;
        }
        return head;
    }

    // 找到尾部，向尾部插入前面的结点：尾插法
//    private static ListNode ReverseList(ListNode head){
//        if(head == null)
//        {
//            return null;
//        }
//        // 获取尾部结点
//        ListNode tail = null;
//        ListNode curr = head;
//        while(curr.next != null)
//        {
//            curr = curr.next;
//        }
//        tail = curr;
//
//        // 向尾部插入前面的结点
//        curr = head;
//        while(head != tail)
//        {
//            head = head.next;
//            curr.next = tail.next;
//            tail.next = curr;
//            curr = head;
//        }
//        return tail;
//    }

    // 栈倒法
//    private static ListNode ReverseList(ListNode head){
//        if(head == null)
//        {
//            return null;
//        }
//        Stack<ListNode> nodeStack = new Stack<>();
//        ListNode curr = head;
//        while(curr != null)
//        {
////            System.out.print(curr.val + " ");
//            nodeStack.push(curr);
//            curr = curr.next;
//        }
//        System.out.println();
//        ListNode reversedHead = nodeStack.pop();
//        curr = reversedHead;
//        while(!nodeStack.empty())
//        {
////            System.out.print(curr.val + " ");
//            curr = curr.next = nodeStack.pop();
//        }
//        curr.next = null;
////        System.out.println();
//        return reversedHead;
//    }
}
