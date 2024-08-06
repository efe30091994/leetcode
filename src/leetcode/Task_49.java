package leetcode;

import java.util.*;

public class Task_49 {
    public static void main(String[] args) {
        String[] str = {"eat", "tea", "tan", "ate", "nat", "bat"};
        String[] str1 = {""};
        System.out.println(groupAnagrams(str));
    }


    public static List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> hashMap = new HashMap<>();
        for (String str : strs){
            char[] chars = str.toCharArray();
            Arrays.sort(chars);
            String s = String.copyValueOf(chars);

            hashMap.computeIfAbsent(s, v -> new ArrayList<>());
            hashMap.get(s).add(str);
        }

        return new ArrayList<>(hashMap.values());
    }

    // todo better solution
//    public static List<List<String>> groupAnagrams(String[] strs) {
//        List<List<String>> result = new ArrayList<>();
//        HashMap<String, List<String>> hashMap = new HashMap<>();
//        for (int i = 0; i < strs.length; i++) {
//            char[] chars = strs[i].toCharArray();
//            Arrays.sort(chars);
//            String str = String.copyValueOf(chars);
//            List<String> list;
//            if (hashMap.containsKey(str)) {
//                list = hashMap.get(str);
//            } else {
//                list = new ArrayList<>();
//            }
//            list.add(strs[i]);
//            hashMap.put(str, list);
//        }
//
//        for (Map.Entry<String, List<String>> entry : hashMap.entrySet()){
//            result.add(entry.getValue());
//        }
//
//        return result;
//    }

}
