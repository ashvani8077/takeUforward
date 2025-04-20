package Stack_and_Queue;

public class TheCelebrityProblem {
    public static void main(String[] args) {
        int mat[][]={
                {0,1,1,0},
                {0,0,0,0},
                {0,1,0,0},
                {1,1,0,0}
        };
        System.out.println(solutionBrute(mat));
        System.out.println(solutionOptimal(mat));

    }
    public static int solutionBrute(int mat[][]){
        int knowMe[]=new int[mat.length];
        int IKnow[]=new int[mat.length];
        for(int i=0;i< mat.length;i++){
            for (int j=0;j<mat.length;j++){
                if(mat[i][j]==1){
                    knowMe[j]++;
                    IKnow[i]++;
                }
            }
        }
        for(int i=0;i<mat.length;i++){
            if(knowMe[i]==mat.length-1&& IKnow[i]==0){
                return i;
            }
        }
        return -1;
    }

    public static int solutionOptimal(int mat[][]){
        int top=0;
        int down=mat.length-1;
        while (top<down){
            if(mat[top][down]==1){
                top++;
            }
            else{
                down--;
            }
        }
        int candidate=top;
        for(int i=0;i<mat.length;i++){
            if(i!=candidate&& (mat[candidate][i]==1 || mat[i][candidate]==0)){
                return -1;
            }
        }
        return down;
    }
}
