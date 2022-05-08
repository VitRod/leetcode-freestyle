package com.task21;

//21. Merge Two Sorted Lists
//Easy
   
//You are given the heads of two sorted linked lists list1 and list2.

//Merge the two lists in a one sorted list. 
//The list should be made by splicing together the nodes of the first two lists.

//Return the head of the merged linked list.

//Example 1:

//Input: list1 = [1,2,4], list2 = [1,3,4]
//Output: [1,1,2,3,4,4]
//Example 2:

//Input: list1 = [], list2 = []
//Output: []
//Example 3:

//Input: list1 = [], list2 = [0]
//Output: [0]

//Constraints:

//The number of nodes in both lists is in the range [0, 50].
//-100 <= Node.val <= 100
//Both list1 and list2 are sorted in non-decreasing order.

public class Solution21 {

	public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
		ListNode head = new ListNode(0); // dummy node
		ListNode temp = head; // temp node

		while (l1 != null && l2 != null) { // while both lists are not empty
			if (l1.val < l2.val) { // if l1 is smaller than l2
				temp.next = l1; // add l1 to the list
				l1 = l1.next; // move l1 to the next node
			} else {
				temp.next = l2; // add l2 to the list
				l2 = l2.next; // move l2 to the next node
			}
			temp = temp.next; // move temp to the next node
		}
		temp.next = l1 != null ? l1 : l2; // if l1 is empty, add l2 to the list
		return head.next;
	}
}
