package com.task61;

//61. Rotate List
//Medium

//Given the head of a linked list, rotate the list to the right by k places.

//Example 1:
//Input: head = [1,2,3,4,5], k = 2
//Output: [4,5,1,2,3]
//Example 2:

//Input: head = [0,1,2], k = 4
//Output: [2,0,1]

//Constraints:

//The number of nodes in the list is in the range [0, 500].
//-100 <= Node.val <= 100
//0 <= k <= 2 * 109

public class Solution61 {

	public ListNode rotateRight(ListNode head, int k) {
		if (head == null) { // edge case
			return head; // return null
		}
		ListNode copyHead = head; // copy head
		int len = 1; // length of list
		while (copyHead.next != null) { // iterate through list
			copyHead = copyHead.next; // move to next node
			len++; // increment length
		}
		copyHead.next = head; // link the taail to the head to make it a circle
		for (int i = len - k % len; i > 1; i--) { // iterate through the list
			head = head.next; // move to next node
		}
		copyHead = head.next; // copy head
		head.next = null; // break the circle
		return copyHead; // return the new head
	}
}
