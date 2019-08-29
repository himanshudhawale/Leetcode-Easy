/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */

 //O(n) space and time O(n+m) 
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        Set<ListNode> visited = new HashSet<ListNode>();
        while(headA!=null)
        {
            // if(visited.contains(headA))
            //     return headA;
            visited.add(headA);
            headA=headA.next;
        }
        while(headB!=null)
        {
            if(visited.contains(headB))
                return headB;
            visited.add(headB);
            headB=headB.next;
        }
        return null;
    }
}

//O(1) space
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        int lenA = 0, lenB = 0;
        //two temp heads to iterate for length
        ListNode one = headA;
        ListNode two = headB;
        
        while(one != null){
            lenA++;
            one = one.next;
        }
         while(two != null){
            lenB++;
            two = two.next;
        }
        
        //match the head to be equidistant from intersection point
        if(lenA >= lenB){
            while(lenA != lenB){
                headA = headA.next;
                lenA --;
            }
        }
        else {
             while(lenA != lenB){
                headB = headB.next;
                lenB --;
            }
        }
        
        //iterate both the head, if they are equal return any one head
        while((headA != headB) && (headA != null) && (headB != null)){
            headA = headA.next;
            headB = headB.next;
        }
        return headA;
    }
}