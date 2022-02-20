package services;

public class StairsService {

    public StairsService() {
    }

    public String stairsDraw(int n){

        String stairs = "";
        int aux = n-1; //it will help to put the limit change of space and asterisk

        for (int i = 0; i<n; i++){//row
            for (int j = 0; j<n; j++){//column

                if(j==n-1)//the end of column break row
                    stairs = stairs+"*\n";

                else if(j<aux)//it run until the asterisk
                    stairs = stairs+" ";

                else
                    stairs = stairs+"*";

            }
            aux--;//it will help to draw the stair line in diagonal
        }

        return stairs;
    }
}
