package pertemuan7.modul4;

public class StrukturListTestL4 {
    public static void main(String[] args) {
        StrukturList list = new StrukturList();
        list.addHead(3);
        list.addHead(6);
        list.addHead(2);
        list.addTail(5);
        list.addTail(1);

        System.out.println("Element: ");
        list.displayElement();

        System.out.println("\n\nElement setelah di removeTail ");
        list.removeTail();
        list.displayElement();
        
        System.out.println("\n\nElement setelah di removeHead ");
        list.removeHead();
        list.displayElement();

        System.out.println("\n\nElement setelah di removeHead ");
        list.removeTail();
        list.displayElement();
    }
}
