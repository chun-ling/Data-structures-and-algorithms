package 旋转图像;

/**
 * @author YUChangcan
 * @date 2022/7/5 - 16:34
 */
class Solution {//将一个n*n的图像数组顺时针旋转
    public void rotate(int[][] matrix) {
        int len = matrix.length;
        int temp[] = new int[len];
        int t;
        for(int i = 0;i < len/2;i++){//先上下交换，交换len/2次
            temp = matrix[i];
            matrix[i] = matrix[len - 1 - i];
            matrix[len - 1 - i] = temp;
        }

        for(int i = 0;i < len - 1;i++){//再转置
            for(int j = i + 1;j < len;j++){
                t = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = t;
            }
        }
    }
}
