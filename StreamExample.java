
import java.util.*;
import java.util.stream.Collectors;

public class StreamExample {

  static void printList(List<?> list) {
    list.forEach(System.out::println);
  }

  public static void main(String[] args) {

    List<String> list = Arrays.asList("apple", "banana", "cherry");
    List<Integer> list2 = Arrays.asList(1, 2, 3, 4, 5);

    printList(list);
    printList(list2);

  }
}
