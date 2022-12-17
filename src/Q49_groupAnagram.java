import java.util.*;

public class Q49_groupAnagram{

    public static void main(String args[]){

        long startTime=System.currentTimeMillis();//initial start time
        String[] str={"eat", "tea", "tan", "ate", "nat", "bat"};;
        List<List<String>> list = anagram(str);

        for(List<String> s:list){
            System.out.println(s);
        }
        long totaltime=System.currentTimeMillis()-startTime;
        System.out.println(totaltime);//total time consumed by Program
    }


    static List<List<String>> anagram(String[] strs){

        if(strs.length == 0){
            return new ArrayList<>();
        }

        Map<String,List<String>> stringAnagramsMap=new HashMap<>();

        for(String s:strs){

            char[] arr=s.toCharArray();
            Arrays.sort(arr);
            String key = String.valueOf(arr);

            if (!stringAnagramsMap.containsKey(key))
                stringAnagramsMap.put(key, new ArrayList<>());

            stringAnagramsMap.get(key).add(s);



        }
        List<List<String>> resultList = new ArrayList<>();
        for (Map.Entry<String, List<String>> stringAnagrams : stringAnagramsMap.entrySet()) {
            resultList.add(stringAnagrams.getValue());
        }
        return resultList;
    }

}