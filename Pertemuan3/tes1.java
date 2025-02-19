package Pertemuan3;

public class tes1 {
    public static void main(String[] args) {
        StrukturList list1 = new StrukturList();
        StrukturList list2 = new StrukturList();

        list1.addTail(3);
        list1.addTail(2);
        list1.addTail(1);

        list2.addTail(1);
        list2.addTail(4);
        list2.addTail(5);
        list2.addTail(7);

        System.out.println("Element: ");
        list1.displayElement();
        System.out.println();
        list2.displayElement();
    }
}
