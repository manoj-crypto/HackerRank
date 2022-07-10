import java.util.SortedSet;
import java.util.TreeSet;

public class getSmallestAndLargest {
    public static String SmallestAndLargest(String s, int k) {
        String smallest = "";
        String largest = "";
        SortedSet<String> set=new TreeSet<String>();
        for(int i=0;i<s.length()-k;i++){
            set.add(s.substring(i,i+k));
        }
        System.out.println(set.first());
        System.out.println(set.last());
        return smallest + "\n" + largest;
    }

    public static void main(String[] args) {
        SmallestAndLargest("ManojisGoodBoy",3);
    }
}
