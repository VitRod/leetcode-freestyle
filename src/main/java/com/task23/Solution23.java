package com.task23;

//23. Merge k Sorted Lists
//Hard       

//You are given an array of k linked-lists lists, each linked-list is sorted in ascending order.

//Merge all the linked-lists into one sorted linked-list and return it.      
   
//Example 1:         
  
//Input: lists = [[1,4,5],[1,3,4],[2,6]]   
//Output: [1,1,2,3,4,4,5,6]
//Explanation: The linked-lists are:
//[
//1->4->5,
//1->3->4,
//2->6
//]
//merging them into one sorted list:
//1->1->2->3->4->4->5->6
//Example 2:

//Input: lists = []
//Output: []
//Example 3:

//Input: lists = [[]]
//Output: []

//Constraints:

//k == lists.length
//0 <= k <= 104
//0 <= lists[i].length <= 500
//-104 <= lists[i][j] <= 104
//lists[i] is sorted in ascending order.
//The sum of lists[i].length will not exceed 104.

public class Solution23 {
	public ListNode mergeKLists(ListNode[] lists) {
        if(lists.length == 0) return null; // return null if there is no list
        if(lists.length == 1) return lists[0]; // return the only list if there is only one list
        ListNode head = new ListNode(0); // create a dummy node
        ListNode cur = head; // create a pointer to the dummy node
        while(true){ // loop until all the lists are merged
            int min = Integer.MAX_VALUE; // initialize the minimum value to be the largest possible value
            int index = -1; // initialize the index to be -1
            for(int i = 0; i < lists.length; i++){ // loop through all the lists
// if the current list is not null and the current list's value is smaller than the minimum value
                if(lists[i] != null && lists[i].val < min){ 
                    min = lists[i].val; // update the minimum value
                    index = i; // update the index
                }
            }
            if(index == -1) break; // break if there is no list left
            cur.next = lists[index]; // add the current list to the dummy node
            cur = cur.next; // move the pointer to the next node
            lists[index] = lists[index].next; // move the pointer to the next list
        }
        
        return head.next; // return the dummy node's next node
    }
}
