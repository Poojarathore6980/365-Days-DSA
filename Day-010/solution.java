class solution{
    public void setZeroes(int[][] matrix){

        int m=matrix.length;
        int n=matrix[0].length;

        boolean firstrowZero=false;
        boolean firstColZero=false;

        // check if our first row contain any zero
        for(int j=0;j<n;j++){
            if(matrix[0][j]==0){
                firstrowZero=true;
                break;
            }
        }

        // check if first column contain any zero , if it contains , break
        for(int i=0;i<m;i++){
            if(matrix[i][0]==0){
                firstColZero=true;
                break;
            }
        }

        // marking
        for(int i=1;i<m;i++){
            for(int j=1;j<n;j++){
                if(matrix[i][j]==0){
                    matrix[i][0]=0;
                    matrix[0][j]=0;

                }
            }
        }

        // fill matrix
        for(int i=1;i<m;i++){
            for(int j=1;j<n;j++){
                if(matrix[i][0]==0 || matrix[0][j]==0){
                    matrix[i][j]=0;
                }
            }
        }

        // first row
        if(firstrowZero){
            for(int i=0;i<n;i++){
                matrix[0][j]=0;
            }
        }

        // first column
        if(firstColZero){
            for(int i=0;i<m;i++){
                matrix[i][0]=0;
            }
        }
    }
}


        
        