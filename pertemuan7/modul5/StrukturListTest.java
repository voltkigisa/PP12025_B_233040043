package pertemuan7.modul5;

public class StrukturListTest {
    public static void main(String[] args) {
        StrukturList list = new StrukturList();
        list.addHead(3);
        list.addHead(6);
        list.addHead(2);
        list.addMid(5,4);
        list.addTail(1);

        System.out.println("Element: ");
        list.displayElement();

        System.out.println("\n\nElement setelah di removeMid ");
        list.removeMid(5);
        list.displayElement();
        
        System.out.println("\n\nElement setelah di removeMid ");
        list.removeMid(6);
        list.displayElement();

        System.out.println("\n\nElement setelah di removeMid ");
        list.removeMid(3);
        list.displayElement();
    }
}
