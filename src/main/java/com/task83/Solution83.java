package com.task83;

//83. Remove Duplicates from Sorted List
//Easy

//Given the head of a sorted linked list, delete all duplicates 
//such that each element appears only once. Return the linked list sorted as well.

//Example 1:
//Input: head = [1,1,2]
//Output: [1,2]

//Example 2:

//Input: head = [1,1,2,3,3]
//Output: [1,2,3]

//Constraints:

//The number of nodes in the list is in the range [0, 300].
//-100 <= Node.val <= 100
//The list is guaranteed to be sorted in ascending order.

public class Solution83 {
	
	public ListNode deleteDuplicates(ListNode head) {
		if (head == null || head.next == null)
			return head; // if there is only one node or no node, return the head
		ListNode curr = head; // create a new node to store the current node
		while (curr.next != null) { // while the next node is not null
			if (curr.next.val == curr.val) { // if the next node is the same as the current node
				curr.next = curr.next.next; // delete the next node
			} else {
				curr = curr.next; // if the next node is not the same as the current node, move to the next node
			}
		}

		return head; // return the head
	}
}
