/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
  public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
      if(l1 == null)
          return l2;
      if(l2 == null)
          return l1;
      ListNode temp = new ListNode(0);
      ListNode curr = temp;
      while(l1 != null && l2 != null){
          if(l1.val < l2.val) {
              curr.next = l1;
              curr = l1;
          }else{
              curr.next = l2;
              curr = l2;
          }
          
          if(curr == l1)
              l1 = l1.next;
          else 
              l2 = l2.next;
      
          if(l1 == null)
              curr.next = l2;
          else
              curr.next = l1;
          }
  return temp.next;     
  }
}   