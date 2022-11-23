public class First {
    public static void main(String[] args) {
        MySet set1 = new MySet(1, 2, 3);
        MySet set2 = new MySet(2, 3, 4, 5);

        System.out.println(set1.toString());
        System.out.println(set2.toString());
        System.out.println("Пересечение: " + set1.intersectSets(set2));
        System.out.println("Объединение: " + set1.unifySets(set2));
    }
}