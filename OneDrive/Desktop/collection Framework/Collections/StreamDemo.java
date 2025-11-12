import java.util.*;
import java.util.stream.*;

public class StreamDemo {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(1, 2, 3, 4, 4);

        List<Integer> res = nums.stream()
                .map(n -> n * 2)       // har element ko 2 se multiply kiya
                .collect(Collectors.toList());

        System.out.println(res);
    }
}
