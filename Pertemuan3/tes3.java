package Pertemuan3;

public class tes3 {
    public static void main(String[] args) {
        StrukturList list1 = new StrukturList();
        StrukturList list2 = new StrukturList();

        list1.addHead(1);
        list1.addHead(2);
        list1.addHead(3);

        list2.addHead(7);
        list2.addHead(5);
        list2.addHead(4);
        list2.addHead(1);

        System.out.println("Element: ");
        list1.displayElement();
        System.out.println();
        list2.displayElement();
    }
}
