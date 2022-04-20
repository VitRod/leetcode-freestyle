package com.task71;

import java.util.Arrays;
import java.util.Deque;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Set;

// 71. Simplify Path
// Medium

// Given a string path, which is an absolute path (starting with a slash '/')
//  to a file or directory in a Unix-style file system, convert it to the simplified canonical path.

// In a Unix-style file system, a period '.' refers to the current directory, 
// a double period '..' refers to the directory up a level, and any multiple consecutive slashes 
// (i.e. '//') are treated as a single slash '/'. For this problem, 
// any other format of periods such as '...' are treated as file/directory names.

// The canonical path should have the following format:

// The path starts with a single slash '/'.
// Any two directories are separated by a single slash '/'.
// The path does not end with a trailing '/'.
// The path only contains the directories on the path 
// from the root directory to the target file or directory (i.e., no period '.' or double period '..')
// Return the simplified canonical path.

 

// Example 1:

// Input: path = "/home/"
// Output: "/home"
// Explanation: Note that there is no trailing slash after the last directory name.
// Example 2:

// Input: path = "/../"
// Output: "/"
// Explanation: Going one level up from the root directory is a no-op, as the root level is the highest level you can go.
// Example 3:

// Input: path = "/home//foo/"
// Output: "/home/foo"
// Explanation: In the canonical path, multiple consecutive slashes are replaced by a single one.
 

// Constraints:

// 1 <= path.length <= 3000
// path consists of English letters, digits, period '.', slash '/' or '_'.
// path is a valid absolute Unix path.


public class Solution71 {
	 public String simplifyPath(String path) {
	        Deque<String> stack = new LinkedList<>(); // use a stack to store the path
	        Set skipSet = new HashSet<>(Arrays.asList("..", ".", "")); // set of strings to skip
	        for (String dir : path.split("/")) { // split the path into directories
	            if (dir.equals("..") && !stack.isEmpty()) { // if the directory is ".." and the stack is not empty
	                stack.pop(); // pop the last directory
	            } else if (!skipSet.contains(dir)) { // if the directory is not ".." or "."
	                stack.push(dir); // push the directory to the stack
	            }
	        }
	        String result = ""; // initialize the result
	        for(String dir : stack) { // iterate through the stack
	            result = "/" + dir + result; // add the directory to the result
	        }
	        return result.isEmpty() ? "/" : result; // if the result is empty, return "/"
	    }
	}