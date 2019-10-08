/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public boolean isPalindrome(ListNode head) {
        if(head==null || head.next==null)
            return true; 
        int length =0 ;
        ListNode tortoise = head;
        ListNode hare = head; 
        while(hare!=null && hare.next!=null)
        {
            hare = hare.next.next;
            tortoise = tortoise.next; 
        }
         if (hare != null) 
         {
            tortoise = tortoise.next;
         }
        tortoise = reverseList(tortoise);
        hare = head; 
        while (tortoise != null) {
            if (hare.val != tortoise.val) 
            {
                return false;
            }
            hare = hare.next;
            tortoise = tortoise.next;
    
        }
        return true;        
    }
    
    
    public ListNode reverseList(ListNode head)
    {        
        ListNode prev = null; 
        ListNode curr = head; 
        while(curr!=null)
        {
            ListNode temp = curr.next; 
            curr.next = prev;
            prev = curr; 
            curr = temp;
        }

        return prev;
    }
}