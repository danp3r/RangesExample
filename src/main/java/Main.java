import ranges.RangeMap;
import ranges.RangeSet;
import tree.IntRangeImpl;
import tree.Range;

public class Main {
    public static void main(String[] args) {
        // создаем rangeSet
        RangeSet<Integer> rangeSet = new RangeSet<>();

        Range<Integer> intRange = new IntRangeImpl(1, 5);
        // добавляем отрезок
        rangeSet.add(intRange);
        // добавляем отрезок
        rangeSet.add(new IntRangeImpl(3, 5));
        // пробуем добавить уже имеющийся отрезок
        rangeSet.add(new IntRangeImpl(3, 5));
        // проверяем есть ли такой отрезок в rangeSet (false)
        System.out.println(rangeSet.isContains(new IntRangeImpl(1, 3)));
        // печатаем весь rangeSet
        System.out.println(rangeSet);
        // проверяем есть ли такой отрезок в rangeSet (true)
        System.out.println(rangeSet.isContains(intRange));
        // удаляем отрезок
        rangeSet.delete(intRange);
        // печатаем весь rangeSet без удаленного элемента
        System.out.println(rangeSet);

        // создаем rangemap
        RangeMap<Integer, String> rangeMap = new RangeMap<>();

        // добавляем значения
        rangeMap.put(new IntRangeImpl(3, 9), "Range 1");
        rangeMap.put(new IntRangeImpl(5, 6), "Range 2");
        rangeMap.put(new IntRangeImpl(1, 1), "Range 8");
        // печатаем map
        System.out.println(rangeMap);

        // получаем значение
        System.out.println(rangeMap.get(new IntRangeImpl(5, 6)));

        // удаляем
        rangeMap.remove(new IntRangeImpl(3, 9));

        // печатаем map
        System.out.println(rangeMap);

        // проверяем есть ли такое значение в map
        System.out.println(rangeMap.isContainsKey(new IntRangeImpl(3, 9)));
        System.out.println(rangeMap.isContainsKey(new IntRangeImpl(1, 1)));

        // обновляем значение
        rangeMap.update(new IntRangeImpl(1, 1), "Updated range");
        // печатаем map
        System.out.println(rangeMap);
    }
}
