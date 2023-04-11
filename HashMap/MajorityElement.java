package HashMap;

import java.util.HashMap;

import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

/*
This class finds the majority element(s) in an array of integers.
A majority element is an element that appears more than n/3 times, where n is the length of the array.
*/
//public class MajorityElement {
//    /*
//    This method finds the majority element(s) in the given array of integers and prints them to console.
//    @param nums: an array of integers
//    */
//    public static void majority(int[] nums){
//        HashMap<Integer,Integer> map = new HashMap<>();
//        int n = nums.length;
//        for (int i = 0; i < n; i++) {
//            if (map.containsKey(nums[i])){ //true
//                map.put(nums[i],map.get(nums[i])+1);
//            }else { //false or element appeared first time
//                map.put(nums[i],1);
//            }
//        }
//        for (int key: map.keySet()) {
//            if (map.get(key) > n/3){
//                System.out.println(key);
//            }
//        }
//    }
//    /*
//    This method tests the majority method of MajorityElement class with an input array.
//    */
//    @Test
//    void testMajority() {
//        int[] nums = {1,3,3,3,2,5,1,3,1,5,1};
//        MajorityElement.majority(nums);
//    }
//}
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class MajorityElement {
    /*
     This method returns the majority element(s) in the given array of integers.
     @param nums: an array of integers
     @return a list of majority elements
     */
    public static List<Integer> majority(int[] nums){
        HashMap<Integer,Integer> map = new HashMap<>();
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            if (map.containsKey(nums[i])){
                map.put(nums[i],map.get(nums[i])+1);
            } else {
                map.put(nums[i],1);
            }
        }
        List<Integer> majorityElements = new ArrayList<>();
        for (int key: map.keySet()) {
            if (map.get(key) >= n/3){
                majorityElements.add(key);
            }
        }
        return majorityElements;
    }
    @Test
    void testMajorityWithSingleMajorityElement() {
        int[] nums = {1, 2, 3, 4, 5, 6, 7, 8, 9, 9, 9, 9};
        List<Integer> expected = new ArrayList<>();
        expected.add(9);
        List<Integer> actual = MajorityElement.majority(nums);
        assertEquals(expected, actual);
    }

    @Test
    void testMajorityWithMultipleMajorityElements() {
        int[] nums = {1, 2, 3, 3, 3, 4, 4, 4};
        List<Integer> expected = new ArrayList<>();
        expected.add(3);
        expected.add(4);
        List<Integer> actual = MajorityElement.majority(nums);
        assertEquals(expected, actual);
    }

    @Test
    void testMajorityWithNoMajorityElement() {
        int[] nums = {1, 2, 3, 4, 5, 6};
        List<Integer> expected = new ArrayList<>();
        List<Integer> actual = MajorityElement.majority(nums);
        assertEquals(expected, actual);
    }

    @Test
    void testMajorityWithEmptyArray() {
        int[] nums = {};
        List<Integer> expected = new ArrayList<>();
        List<Integer> actual = MajorityElement.majority(nums);
        assertEquals(expected, actual);
    }
}


