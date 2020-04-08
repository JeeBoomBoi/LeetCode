/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
  public ListNode middleNode(ListNode head) {
      ListNode curr = head;
      int p = size(head);
      if(p == 1) { 
          return head;
      }
      int q = p/2;
      for(int i=0 ; i<q-1 ; i++)
          curr = curr.next;
      ListNode temp = curr.next;
      return temp;
  }
  
  int size(ListNode head) {
      int count = 0;
      ListNode curr = head;
      while(curr!=null){
          curr=curr.next;
          count++;
      }
      return count;
  }
}