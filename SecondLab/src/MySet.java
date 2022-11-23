import java.util.*;
import java.util.stream.*;

public class MySet {
    private List<Integer> elements;

    public MySet(Integer... elements) {

        this(Arrays.asList(elements));
    }

    private MySet(List<Integer> elements) {

        this.elements = elements;
    }

    public MySet intersectSets(MySet other) {
        return new MySet(elements.stream()
                .filter(other.elements::contains)
                .collect(Collectors.toList()));
    }

    public MySet unifySets(MySet other) {
        return new MySet(Stream.concat(this.elements.stream(), other.elements.stream())
                .distinct()
                .collect(Collectors.toList()));
    }

    @Override
    public String toString() {

        return "Элементы=" + elements;
    }
}