import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Strudent strudent1 = new Strudent("ba", 27, "TB");
        Strudent strudent2 = new Strudent("bon", 28, "VN");
        Strudent strudent3 = new Strudent("nam", 29, "ND");

        Map<Integer, Strudent> strudentMap = new HashMap<Integer, Strudent>();
        strudentMap.put(1, strudent1);
        strudentMap.put(2, strudent2);
        strudentMap.put(3, strudent3);

        for (Map.Entry<Integer, Strudent> strudent:
             strudentMap.entrySet()) {
            System.out.println(strudent.toString());
        }

        System.out.println(".......Set");

        Set<Strudent> strudents = new HashSet<Strudent>();

        strudents.add(strudent1);
        strudents.add(strudent2);
        strudents.add(strudent3);

        for (Strudent strudent:
             strudents) {
            System.out.println(strudent.toString());
        }
    }
}
