import java.util.*;

public class TwoSum_Q1 {
    static Scanner sc=new Scanner(System.in);

    static List<Integer> check(List<Integer> values,int _target) {
        //   index, value
        Map<Integer, Integer> map = new HashMap<>();

      for (int i=0;i<values.toArray().length;i++){
          map.put(i, values.get(i));

      }

        List<Integer> indexs = null;
        for (int i = 0; i < values.toArray().length; i++) {
            int remaining = _target - values.get(i);
            if (map.containsValue(remaining)) {
            indexs = new ArrayList<>();
            indexs.add(i);
            indexs.add(map.get(remaining));}
        }
        return indexs;

    }





    public static void main(String R[]){

        System.out.println("Enter Target");
        int target=sc.nextInt();

        System.out.println("Enter Range");
        int range= sc.nextInt();
        System.out.println("Enter Array Of Integers");

        List<Integer> list=new ArrayList<>();
        int number;
        for (int i=0;i<range;i++){
            number= sc.nextInt();
            list.add(number);
        }

     List<Integer>valueIndex =  check(list,target);
          valueIndex.forEach((n)-> System.out.println(valueIndex.get(n)));
    }

}
