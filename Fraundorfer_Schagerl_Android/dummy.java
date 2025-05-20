public class dummy {
    public void helloWorld(){
        System.out.println("Hello World!");
    }

    public void thisIsANewMethod() { 
        System.out.print("this is new");
        int x = 4;
        int y = 24
        System.out.println("Ergebnis einer komplizierten Rechnung: " + y/x);
        System.out.println("NOCH komplizierter: " + y-x);
        y += 2*x;
        System.out.println("Finales Ergebnis nach VIELEN Rechnungen: " + y);
    }

    public int add(int x, int y) { // DON'T TOUCH! I don't know what this method does, but it makes everything work...
        return x + y;
    }

    public static void main(String[] args) {
        System.out.println("7 + 3 = " + add(7+3)); // = 10? I think...
    }
}