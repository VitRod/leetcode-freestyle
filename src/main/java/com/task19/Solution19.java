package com.task19;

//19. Remove Nth Node From End of List
//Medium
   
//Given the head of a linked list, remove the nth node from the end of the list and return its head.
           
//Example 1:                 

//Input: head = [1,2,3,4,5], n = 2        
//Output: [1,2,3,5]
//Example 2:

//Input: head = [1], n = 1   
//Output: []
//Example 3:
   
//Input: head = [1,2], n = 1      
//Output: [1]

//Constraints:

//The number of nodes in the list is sz.
//1 <= sz <= 30
//0 <= Node.val <= 100
//1 <= n <= sz

public class Solution19 {

	public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummy = new ListNode(0); // dummy node
        dummy.next = head; // dummy node points to head
        ListNode first = dummy; // first node
        ListNode second = dummy; // second node
        for (int i = 1; i <= n + 1; i++) { // move first n+1 nodes
            first = first.next; // first node moves forward
        }
        while (first != null) { // move first and second nodes together
            first = first.next; // first node moves forward
            second = second.next; // second node moves forward
        }
        second.next = second.next.next; // skip the node to be deleted
        return dummy.next; // return the new head
    }
}
