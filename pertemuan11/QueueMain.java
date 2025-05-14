package pertemuan11;

public class QueueMain {
    public static void main(String[] args) {
        StrukturQueue latihan4 = new StrukturQueue();
        StrukturQueue latihan5 = new StrukturQueue();
       
        System.out.println("### Sebelum ENQUEUE 3x ###");
        latihan4.displayElement();

        System.out.println("### Setelah ENQUEUE 3x ###");
        latihan4.enqueue(10);
        latihan4.enqueue(20);
        latihan4.enqueue(30);
        latihan4.displayElement();

        System.out.println("### Sebelum DEQUEUE 1x ###");
        latihan4.dequeue();
        latihan4.displayElement();

        System.out.println("### Sebelum DEQUEUE 4x ###");
        latihan5.displayElement();

        System.out.println("### Setelah DEQUEUE 4x ###");
        latihan5.enqueue(1);
        latihan5.enqueue(2);
        latihan5.enqueue(3);
        latihan5.enqueue(4);
        latihan5.displayElement();

        System.out.println("### Sebelum DEQUEUE 1x ###");
        latihan5.dequeue();
        latihan5.displayElement();

    }
}
