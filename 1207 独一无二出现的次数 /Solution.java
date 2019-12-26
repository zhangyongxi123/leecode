/**
 * 给你一个整数数组 arr，请你帮忙统计数组中每个数的出现次数。
 * 
 * 如果每个数的出现次数都是独一无二的，就返回 true；否则返回 false。
 * 
 *  
 * 
 * 示例 1：
 * 
 * 输入：arr = [1,2,2,1,1,3] 输出：true 解释：在该数组中，1 出现了 3 次，2 出现了 2 次，3 只出现了 1
 * 次。没有两个数的出现次数相同。 示例 2：
 * 
 * 输入：arr = [1,2] 输出：false 示例 3：
 * 
 * 输入：arr = [-3,0,1,-3,1,1,1,-3,10,0] 输出：true  
 * 
 * 提示：
 * 
 * 1 <= arr.length <= 1000 -1000 <= arr[i] <= 1000
 * 
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/unique-number-of-occurrences
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */

class Solution {
	public static void main(String[] args) {
		int[] arr =new int[]{1,2,2,1,1,3};
		boolean flag = uniqueOccurrences(arr);
	System.out.println(flag);

	}

	public static boolean uniqueOccurrences(int[] arr) {
        Map<Integer,Integer> map=new HashMap<Integer,Integer>();
        Set<Integer> set=new HashSet<Integer>();

        //用map去统计出现的次数
        for(Integer data:arr){
            if(map.get(data)==null){
                map.put(data,1);
            }else{
                map.put(data,map.get(data)+1);
            }
        }

        //通过HashSet去重的机制判断 HashMap的value()方法返回所有的值,keySet()方法返回所有的键
        for(Integer i:map.values()){
            if(!set.add(i)){
                return false;
            }
        }
        return true;

    }
}

/**
 *  我的解题思路:
 * 				1.遍历数组,将数组里面的数作为map的key,次数作为value.
 * 				2.利用HashSet的不能插入重复元素的特性,将map里的value存入HashSet,如果都能插入,就返回true.有一个插不入就返回false,
 */	