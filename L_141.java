/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */


 // O(n) space
public class Solution {
    public boolean hasCycle(ListNode head) {
        Set<ListNode> myset = new HashSet<ListNode>();
        while(head!=null)
        {
            if(myset.contains(head))
                return true;
            else
            {
                myset.add(head);
            }
            head=head.next;
        }
        return false;
    }
}

//O(1) space using two pointer technique
public class Solution {
    public boolean hasCycle(ListNode head) {
        if(head == null || head.next ==null)
            return false;
        
        ListNode one = head;
        ListNode two = head.next; 
        while(one!=two){
            if(two ==null || two.next == null)
                return false;
            one =one.next;
            two = two.next.next;
        }
         return true;   
        }
}

