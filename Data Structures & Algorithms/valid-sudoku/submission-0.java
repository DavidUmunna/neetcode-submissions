class Solution {
    public boolean isValidSudoku(char[][] board) {
        List<HashSet<Integer>> rows= new ArrayList<>();
        List<HashSet<Integer>> cols= new ArrayList<>();
        List<HashSet<Integer>> subMat= new ArrayList<>();

        for (int i = 0; i < 9; i++) {
            rows.add(new HashSet<>());
            cols.add(new HashSet<>());
            subMat.add(new HashSet<>());
        }
         for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (board[i][j] == '.') continue;
                int val = (int) board[i][j];
                if (rows.get(i).contains(val)) return false;
                rows.get(i).add(val);
                if (cols.get(j).contains(val)) return false;
                cols.get(j).add(val);
                int idx = (i / 3) * 3 + (j / 3);
                if (subMat.get(idx).contains(val)) return false;
                subMat.get(idx).add(val);
            }
        }
        return true;

    }
}
