package 有效的数独;

import java.util.HashSet;

/**
 * @author YUChangcan
 * @date 2022/7/5 - 9:30
 */
class Solution {
    public boolean isValidSudoku(char[][] board) {
        int len = board.length;

        for (int i = 0; i < len; i++) {
            HashSet row = new HashSet();
            HashSet column = new HashSet();
            HashSet grid = new HashSet();
            for (int j = 0; j < len; j++) {//两个循环固定行遍历列和固定列遍历行
                if (board[i][j] != '.' && !row.add(board[i][j]))
                    return false;

                if (board[j][i] != '.' && !column.add(board[j][i]))
                    return false;

                int a = (i / 3) * 3 + j / 3;//遍历行列时，转换为遍历九宫格
                int b = (i % 3) * 3 + j % 3;
                if (board[a][b] != '.' && !grid.add(board[a][b]))
                    return false;
            }
        }
        return true;
    }
}
