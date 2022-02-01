package Home_Work_5.dto;

import java.util.Comparator;
import java.util.Map;

public class MapValueComparator<K, V> implements Comparator<V> {
    Map<K, V> map;
    final boolean sorts;

    public MapValueComparator(Map<K, V> map, boolean sorts){
        this.map = map;
        this.sorts = sorts;
    }

    @Override
    public int compare(Object keyA, Object keyB) {
        Comparable valueA = (Comparable) map.get(keyA);
        Comparable valueB = (Comparable) map.get(keyB);
        if(this.sorts){
            int valueCompare = valueA.compareTo(valueB);
            return valueCompare;
        } else {
            int valueCompare = valueB.compareTo(valueA);
            return valueCompare;
        }
    }
}
