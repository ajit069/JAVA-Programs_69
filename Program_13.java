
class ObjectCounter {
    
    static int count = 0;   

    ObjectCounter() {
        count++;   
    }

    static void showCount() {
        System.out.printf("Total number of objects created: %d", count);
    }
}

public class Program_13 {
    public static void main(String[] args) {

        ObjectCounter obj1 = new ObjectCounter();
        ObjectCounter obj2 = new ObjectCounter();
        ObjectCounter obj3 = new ObjectCounter();

        ObjectCounter.showCount();  
    }
}