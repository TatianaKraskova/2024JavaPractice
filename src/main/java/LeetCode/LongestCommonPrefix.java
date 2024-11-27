/*
Write a function to find the longest common prefix string amongst an array of strings.
If there is no common prefix, return an empty string "".

Example 1:
Input: strs = ["flower","flow","flight"]
Output: "fl"
 */

package main.LeetCode;

public class LongestCommonPrefix {
    public static void main(String[] args) {
        String[] strs = {"flower", "flow", "flight"};
        System.out.println(longestCommonPrefixPk(strs));
    }

    public static String longestCommonPrefixPk(String[] strs) {
	if (strs == null || strs.length == 0) {
	  return "";
	}

	String s = strs[0];
	int k=0;
        UP: for (;k<s.length(); k++) {
	  char ch = s.charAt(k);	
	  for (int j=1; j<strs.length; j++) {
	    if (k >= strs[j].length() || strs[j].charAt(k)!=ch)
	      break UP;
	  }
	}
	return (k==0)?"":s.substring(0,k);
    }


    public static String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) {
            return "";
        }
        String prefix = strs[0];
        for (int i = 1; i < strs.length; i++) {

            while (strs[i].indexOf(prefix) != 0) {
                prefix = prefix.substring(0, prefix.length() - 1);

                if (prefix.isEmpty()) {
                    return "";
                }
            }
        }
        return prefix;
    }
}
