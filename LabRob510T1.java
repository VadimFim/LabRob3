public class LabRob510T1 {
    public static void main(String[] arg) {
        int i;

        System.out.println("For:");
        for (i = 500; i <= 650; i += 10) {
            System.out.print(i + " ");
        }

        System.out.println("\nWhile:");
        i = 500;
        while (i <= 650) {
            System.out.print(i + " ");
            i += 10;
        }

        System.out.println("\nDo-while:");
        i = 500;
        do {
            System.out.print(i + " ");
            i += 10;
        } while (i <= 650);
    }
}