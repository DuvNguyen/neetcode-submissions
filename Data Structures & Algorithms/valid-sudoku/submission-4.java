class Solution {
    public boolean isValidSudoku(char[][] board) {
     
     
        Set<Character>[] rows = new HashSet[9];
        Set<Character>[] cols = new HashSet[9];
        Set<Character>[] boxes = new HashSet[9];


        // init
        for (int k = 0; k < 9; k++) {
            rows[k] = new HashSet<>();
            cols[k] = new HashSet<>();
            boxes[k] = new HashSet<>();
        }


        for(int i = 0; i < 9; i++) {
            for(int j = 0; j < 9; j++) {
                if(board[i][j] != '.') {
                    char val = board[i][j];
                    int boxIndex = (i / 3) * 3 + (j / 3);

                    if(!rows[i].add(val) || ! cols[j].add(val) || !boxes[boxIndex].add(val)) return false; 
                    // 1st: check if it exists on row i
                    // 2nd: chekc if it exists on 
                    // 3rd. so imagine each box has an index so we dont care the exact ij of the elements
                }
            }
        }




        return true;
    }
}
// learning - NOT PRO, please dont judge