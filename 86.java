/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
  public ListNode partition(ListNode head, int x) {
      ListNode lesstemp = new ListNode(0);   //Linkedlist of elements less than x
      ListNode greateqtemp = new ListNode(0);  //Linkedlist of elements greater than or equal to x
      
      ListNode lesshead = lesstemp;       //head of linkedlist with elements smaller than x
      ListNode greateqhead = greateqtemp;  //head of linkedlist with elements greater than or equal to x
      
      ListNode curr = head;
      while(curr!=null){
          if(curr.val<x) {
              lesstemp.next = curr;
              lesstemp = lesstemp.next;
          }
          else {
              greateqtemp.next = curr;
              greateqtemp = greateqtemp.next;
          }
          curr = curr.next;
      }
      
      lesstemp.next = greateqhead.next;  //Linking 2 separate lists together 
      greateqtemp.next = null;
      
      return lesshead.next;
  }
}