import java.util.ArrayList;
import java.util.List;

public class Problem3 {
    final static boolean SAMPLE = false;
    public static void main(String[] args){
        if(SAMPLE) {
            sample1();
        }
        else {
            sample2();
        }
    }
    static void sample1(){
        List<Integer> list1 = new ArrayList<Integer>();
        List<Integer> list2 = new ArrayList<Integer>();
        for(int i = 0; i < 10; i++){
            list1.add((int)(Math.random() * 10));
            list2.add((int)(Math.random() * 10));
        }
        System.out.println(list1);
        System.out.println(list2);
        System.out.println(zipList(list1,list2));
    }
    static void sample2(){
        List<String> list1 = new ArrayList<String>();
        List<Integer> list2 = new ArrayList<Integer>();
        list1.add("All"); list1.add("Computer");
        list1.add("Programming"); list1.add("is not just");
        list1.add("coding");
        for(int i = 0; i < 5; i++){
            list2.add((int)(Math.random() * 5));
        }
        System.out.println(list1);
        System.out.println(list2);
        System.out.println(zipList(list1,list2));
    }
    static <T1,T2> ArrayList<Pair<T1,T2>> zipList(List<T1> a, List<T2> b) {
        ArrayList<Pair<T1,T2>> result = new ArrayList<Pair<T1,T2>>();
        for(int i = 0; i < a.size(); i++) {
            result.add(new Pair(a.get(i), b.get(i)));
        }
        return result;
    }

}
class Pair<K,V>{
    K key; V value;
    Pair(K key, V value){
        this.key = key; this.value = value;
    }
    @Override
    public String toString() {
        return "(" + key + ", " + value + ")";
    }
}