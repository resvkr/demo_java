public class Main {
    // input num 3
    //  * * *
    //  * * *
    //  * * *


    /**
     * input 5
     *  *
     *  * *
     *  * * *
     *  * * * *
     *  * * * * *
     */

    /**
     * input 3
     *      *
     *    * *
     *  * * *
     */

    /**
     * input 3
     * *
     * * * *
     * * * * * *
     */


    static void showArray(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                System.out.print(arr[i][j] + "  ");
            }
            System.out.println();
        }
    }

    /**
     * input 3
     * *
     * * * *
     * * * * * *
     * *
     */
// таблиця множення+
// таблиця квардратів
    // draw a circle using just * not in array
    public static void main(String[] args) {
        showMultiplicationTable(10);
        showSquareTable(10);
        showCircle(5);

    }

    static void showMultiplicationTable(int num) {
        int[][] numsArr = new int[num][num];

        for (int i = 0; i < numsArr.length; i++) {

            for (int j = 0; j < numsArr.length; j++) {

                numsArr[i][j] = (i + 1) * (j + 1);
            }
        }
        showArray(numsArr);
        System.out.println();

    }

    static void showSquareTable(int num) {
        int[][] numsArr = new int[num][num];
        for (int i = 0; i < numsArr.length; i++) {

            for (int j = 0; j < numsArr.length; j++) {
                double temp = i * 10 + j;
                numsArr[i][j] = (int) Math.pow(temp, 2);
            }
        }

        showArray(numsArr);
    }

    static void showCircle(int num) {
        for (int i = 1; i <= num; i++) {
            for (int j = 0; j < num - i; j++) {
                System.out.print("  ");
            }
            for (int j = 0; j < i * 2; j++) {
                System.out.print("+ ");

            }
            System.out.println();

        }
        for (int i = num; i >= 1; i--) {
            for (int j = 0; j < num - i; j++) {
                System.out.print("  ");
            }
            for (int j = 0; j < i * 2; j++) {
                System.out.print("+ ");

            }
            System.out.println();
        }

    }
}
