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
     *      *
     *    * * *
     *  * * * * *
     */

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
        int num = 10;
        int[][] numsArr = new int[num][num];

        for (int i = 0; i < numsArr.length; i++) {

            for (int j = 0; j < numsArr.length; j++) {

                numsArr[i][j] = (i + 1) * (j + 1);
            }
        }


        showArray(numsArr);
    }

    static void showArray(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                System.out.print(arr[i][j] + "  ");
            }
            System.out.println();
        }
    }
}
