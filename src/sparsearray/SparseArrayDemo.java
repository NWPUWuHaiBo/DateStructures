package sparsearray;

public class SparseArrayDemo {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        //创建一个二维数组
        int array[][] = new int[11][11];
        array[1][2] = 1;
        array[2][3] = 2;
        //打印一下原始数组
        for (int[] is : array) {
            for (int i : is) {
                System.out.printf("%d\t", i);
            }
            System.out.println();
        }

        //将原始数组转为稀疏数组
        //1.遍历原始数组，获取非0数字的总数
        int sum = 0;
        for (int[] is : array) {
            for (int i : is) {
                if (i != 0) {
                    sum++;
                }
            }
        }

        //根据sum创建稀疏数组
        int sparseArray[][] = new int[sum + 1][3];
        sparseArray[0][0] = array.length;
        sparseArray[0][1] = array[0].length;
        sparseArray[0][2] = sum;
        int count = 0;
        for (int i = 0; i < 11; i++) {
            for (int j = 0; j < 11; j++) {
                if (array[i][j] != 0) {
                    count++;
                    sparseArray[count][0] = i;
                    sparseArray[count][1] = j;
                    sparseArray[count][2] = array[i][j];
                }

            }
        }

        //打印一下稀疏数组
        for (int[] is : sparseArray) {
            System.out.printf("%d\t%d\t%d\t\n", is[0], is[1], is[2]);
        }

        //将稀疏数组转成二维数组
        int row = sparseArray[0][0];
        int clo = sparseArray[0][1];
        int array2[][] = new int[row][clo];

        for (int i = 1; i < sparseArray.length; i++) {
            array2[sparseArray[i][0]][sparseArray[i][1]] = sparseArray[i][2];
        }
        System.out.println("---------------------");
        //打印一下原始数组
        for (int[] is : array2) {
            for (int i : is) {
                System.out.printf("%d\t", i);
            }
            System.out.println();
        }
    }

}
