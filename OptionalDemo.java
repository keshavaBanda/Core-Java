
import java.util.Arrays;
import java.util.List;

public class OptionalDemo {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Keshava", "Laxmi", "Pavan", "Kishore");

        String name = names.stream()
                .filter(str -> str.contains("x"))
                .findFirst()
                .orElse("not found");

        System.out.println(name);
    }
}
