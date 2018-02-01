package org.chsi.kata.crackingthecodingint.stringsandarrays;

public class ZeroMatrix {

    public boolean isValid(int[][] matrix) {;
        int nbrOfColumns = matrix[0].length, nbrOfRows = matrix.length;
        for(int i = 1; i < nbrOfRows; i++) {
            if(matrix[i].length != nbrOfColumns) return false;
        }

        for(int i = 0 ; i < nbrOfRows; i++){
            for(int j = 0; j < nbrOfColumns; j++) {
                if(matrix[i][j] == 0)
                    if(!entireRowEqualsToZero(matrix[i]))
                            return false;
            }
        }
        return true;
    }

    private boolean entireRowEqualsToZero(int[] row) {
        for(int i = 0; i< row.length; i++) {
            if(row[i] != 0)
                return false;
        }
        return true;
    }
}
