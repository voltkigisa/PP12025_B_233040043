package pertemuan12.modul10;

public class ParsePost {

    private MyStack stack;
    private String input;

    public ParsePost(String input) {
        super();
        setInput(input);
    }

    public String getInput() {
        return input;
    }

    public void setInput(String input) {
        this.input = input;
    }
    
    public int doParse() { 
        stack = new MyStack (20); 
        char ch; 
        int i; 
        int bil1, bil2, hasilops; 

        for (i = 0; i < input.length(); i++) { 
            ch= input.charAt(i); 
            stack.displayStack(""+ ch+ " ");
            if (ch >= '0' && ch <= '9') {
                stack.push((int) (ch-'0')); 
            }else {
                bil2 = stack.pop(); 
                bil1= stack.pop(); 
                switch(ch) { 
                case '+': hasilops = bil1+bil2 ; break; 
                case '-': hasilops = bil1-bil2 ; break; 
                case '*': hasilops = bil1*bil2 ; break; 
                case '/': hasilops = bil1/bil2 ; break; 
                default: hasilops = 0; 
                } 
                stack.push (hasilops); 
            } 
        } 
        hasilops = stack.pop(); 
        return hasilops; 
    }
}
