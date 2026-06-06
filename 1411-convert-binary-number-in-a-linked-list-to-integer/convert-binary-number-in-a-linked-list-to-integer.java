/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public int getDecimalValue(ListNode head) {
        ListNode prev = null,temp;
        while(head!=null){
            temp = new ListNode(head.val);
            temp.next=prev;
            head = head.next;
            prev = temp;
        }
        int x =0,y=1;
        while(prev!=null){
            x+=y*prev.val;
            prev=prev.next;
            y*=2;
        }
        return x;
        
    }
}