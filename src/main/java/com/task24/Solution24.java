package com.task24;

//24. Swap Nodes in Pairs   

//Given a linked list, swap every two adjacent nodes and return its head. 
//You must solve the problem without modifying the values in the list's nodes 
//(i.e., only nodes themselves may be changed.)

//Example 1:

//Input: head = [1,2,3,4]
//Output: [2,1,4,3]
//Example 2:

//Input: head = []
//Output: []
//Example 3:

//Input: head = [1]
//Output: [1]

//Constraints:

//The number of nodes in the list is in the range [0, 100].
//0 <= Node.val <= 100

public class Solution24 {

	public ListNode swapPairs(ListNode head) {
		if (head == null || head.next == null)
			return head; // return head if head is null or head.next is null
		ListNode dummy = new ListNode(0); // create a dummy node
		dummy.next = head;
		ListNode prev = dummy;
		ListNode cur = head; // create a pointer to the head
		ListNode next = head.next; // create a pointer to the next node
		while (cur != null && next != null) { // while cur and next are not null
			prev.next = next;
			cur.next = next.next;
			next.next = cur; // swap cur and next
			prev = cur; // update prev
			cur = cur.next; // update cur
			if (cur != null)
				next = cur.next; // updade next if cur is not null
		}
		return dummy.next; // return the head of the list
	}
}
