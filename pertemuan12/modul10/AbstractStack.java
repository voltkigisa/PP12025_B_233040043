package pertemuan12.modul10;

public class AbstractStack {
    protected int[] array;
    private int TOP;
    private int capacity;
    public final int MIN= -1;
    private StringBuilder logPush; // untuk mencatat push
    
    public boolean isFull(){
        return TOP == capacity - 1;
    }

    public boolean isEmpty(){
        return TOP == MIN;
    }

    public int size(){
        return TOP + 1;
    }

    public void push(int data)
    {
        if(isFull()){
            System.out.println("Stack Penuh");
        } else {
           TOP++;
            array[TOP] = data;
            if (logPush.length() > 0) {
                logPush.append("; ");
            }
            logPush.append("push ").append(data);
        }
    }


    public AbstractStack(int capacity) {
        super();
        array = new int[capacity];
        setCapacity(capacity);
        TOP = MIN;
        this.logPush = new StringBuilder();
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    //pop
    public int pop() {
        int temp=0 ;
        if (isEmpty()) {
            System.out.println("Stack Kosong");
        } else {
            temp = array[TOP];
            TOP = TOP - 1;
        }
        return temp;
    }

    //peek
     public int peek() {
        if (isEmpty()) {
            System.out.println("Stack Kosong!");
            return -1;
        }
        return array[TOP];
    }

    public void displayElement(){
        if(isEmpty()){
            System.out.println("Size :"+size());
            System.out.println("IsEmpty :"+isEmpty());
            System.out.println("Full : "+isFull());
            System.out.println("TOP : "+TOP);
            System.out.print("Elemen From TOP : ");
            for (int i = TOP; i >= 0; i--) {
                    System.out.print(array[i] + " ");
                }
            System.out.println();
        } else{
            System.out.println(logPush.toString());
            System.out.println("Size: " + size());
            System.out.println("Empty: " + isEmpty());
            System.out.println("Full: " + isFull());
            if (!isEmpty()) {
                System.out.println("Top: " + array[TOP]);
                System.out.print("Elemen from TOP: ");
                for (int i = TOP; i >= 0; i--) {
                    System.out.print(array[i] + " ");
                }
                System.out.println();
            }
        }
    }
}
