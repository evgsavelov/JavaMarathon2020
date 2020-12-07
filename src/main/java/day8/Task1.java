package day8;

public class Task1 {
    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        for (int i = 0; i <= 2000; i++){
            System.out.print(i + " ");
        }
        long finish = System.currentTimeMillis();
        long timeConsumedMillis = finish - start;
        System.out.println();
        System.out.println(timeConsumedMillis);
        System.out.println();

        long start1 = System.currentTimeMillis();
        for (int i = 0; i <= 2000; i++) {
            StringBuilder sb = new StringBuilder(" ");
            sb.append(i);
            System.out.print(sb.toString());
        }
        long finish1 = System.currentTimeMillis();
        long timeConsumedMillis1 = finish1 - start1;
        System.out.println();
        System.out.println(timeConsumedMillis1);

    }
}
