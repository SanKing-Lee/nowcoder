package com.nowcoder.swordForOffer;

public class MergeList {
    public static ListNode Merge(ListNode list1, ListNode list2)
    {
        if(list1 == null)
        {
            return list2;
        }
        if(list2 == null)
        {
            return list1;
        }
        if(list1.val > list2.val)
        {
            return InsertList(list2, list1);
        }
        else
        {
            return InsertList(list1, list2);
        }
    }

    static ListNode InsertList(ListNode list1, ListNode list2)
    {
        ListNode curr = list1;
        while(list2 != null)
        {
            if(curr.next == null)
            {
                curr.next = list2;
                list2 = list2.next;
                continue;
            }
            if(curr.val <= list2.val && curr.next.val >= list2.val)
            {
                ListNode temp = list2;
                list2 = list2.next;
                temp.next = curr.next;
                curr.next = temp;
            }
            else
            {
                curr = curr.next;
            }
        }
        return list1;
    }

    public static void TestMergeList()
    {
        ListNode list1 = new ListNode(0);
        ListNode list2 = new ListNode(1);
        ListNode curr1 = list1;
        ListNode curr2 = list2;
        for(int i = 2; i < 11; i++)
        {
            if(i%2 == 0)
            {
                curr1 = curr1.next = new ListNode(i);
            }
            else{
                curr2 = curr2.next = new ListNode(i);
            }
        }
        ListNode newList = Merge(list1, list2);
        while(newList != null)
        {
            System.out.print(newList.val + " ");
            newList = newList.next;
        }
    }
}
