class Solution {
    public boolean isValidSudoku(char[][] board) {


        for (int i = 0; i<9; i++){
            if (!checkrow(board, i)){
                return false;
            }
        }
        for (int col = 0; col<9; col++){
            if (!checkcol(board, col)){
                return false;
            }
        }
        for (int row = 0; row<9; row +=3){
            for (int col = 0; col<9; col +=3){
                if (!checksubbox(board, col, row, col+2, row+2)){
                    return false;
                }
            }
        }
        return true;
}



boolean checkrow(char[][] board, int row){
    int i = row;
    int j = 0;
        while (i<9){
            List<Integer> list = new ArrayList<>();
            while (j<9){
                if (board[i][j] != '.'){
                    int now = Character.getNumericValue(board[i][j]);
                if (list.contains(now)){
                    return false;
                }
                list.add(now);
                }
                j++;
            }
            i++;
        }
        return true;
}

boolean checkcol(char[][] board, int col){
    int i = 0;
    int j = col;
    List<Integer> list =  new ArrayList<>();
    while(i<9){
        if(board[i][col] != '.'){
            int now = Character.getNumericValue(board[i][col]);
            if (list.contains(now)){
                return false;
            }
            list.add(now);
        }
            i++;
    }
    return true;
}

boolean checksubbox(char[][] board, int col, int row, int colend, int rowend){
    List<Integer> list = new ArrayList<>();
    while(row <= rowend){
        int colum = col;
        while (colum<= colend){
            if (board[row][colum] != '.'){
                int now = Character.getNumericValue(board[row][colum]);
                if (list.contains(now)){
                    return false;
                }
                list.add(now);
            }
                colum++;
        }
            row++;


    }
    return true;
}

    }