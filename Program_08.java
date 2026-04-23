import java.util.*;

public class Program_08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();

        int n;
        System.out.printf("Enter number of elements: ");
        n = sc.nextInt();

        System.out.printf("Enter elements:\n");
        for(int i = 0; i < n; i++) {
            int num = sc.nextInt();
            list.add(num);
        }

        Collections.sort(list);

        System.out.printf("Sorted list in ascending order:\n");
        for(int i = 0; i < list.size(); i++) {
            System.out.printf("%d ", list.get(i));
        }

        sc.close();
    }
}