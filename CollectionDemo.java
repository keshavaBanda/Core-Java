import java.util.Hashtable;
import java.util.Map;

public class CollectionDemo {
    public static void main(String args[]) {
        Map<String, Integer> marks = new Hashtable<String, Integer>();

        marks.put("Mathematices", 89);
        marks.put("Physics", 70);
        marks.put("Chemistry", 36);
        marks.put("Computer Science", 99);
        marks.put("Chemistry", 59);
        System.out.println(marks.get("Physics"));

        for(String sub: marks.keySet()){
            System.out.println(sub +" : "+ marks.get(sub));
        }
       
    }
}
