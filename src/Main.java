import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        int arraySize = 3;
        int[] array = new int[arraySize];
        int element;
        int counter = 0;
        double summ = 0;
        int curPos = 0;
        Scanner scanner = new Scanner(System.in);
        element = scanner.nextInt();

        while (element != 0) {
            array[curPos] = element;
            if (curPos == array.length - 1) {
                arraySize += arraySize;
                int[] arrayNew = new int[arraySize];
                for (int i = 0; i < array.length; i++) {
                    arrayNew[i] = array[i];
                    counter+=1;
                    summ+=array[i];
                }
                array = arrayNew;
            }
            curPos++;
            element = scanner.nextInt();
        }
        double argg = Math.floor((summ/counter)*100)/100;
        System.out.println();
        System.out.println(counter+ " " + " "+ summ+ " " + argg);
    }
}
