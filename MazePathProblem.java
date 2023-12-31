import java.util.ArrayList;
public class MazePathProblem {
    static ArrayList<String> getMazePos(int currentRow, int currentCol, int endRow, int endCol){
        if(currentCol==endCol&&currentRow==endRow){
            ArrayList<String> result = new ArrayList<>();
            result.add("");
            return result;
        }

        if(currentCol>endCol || currentRow>endRow){
            ArrayList<String> result = new ArrayList<>();
            return result;
        }

        ArrayList<String> finalResult = new ArrayList<>();
        
        ArrayList<String> rightResult = getMazePos(currentRow, currentCol+1, endRow, endCol);
        for(String t: rightResult){
            finalResult.add("R"+t);
        }

        ArrayList<String> downResult = getMazePos(currentRow+1, currentCol, endRow, endCol);
        for(String t: downResult){
            finalResult.add("D"+t);
        }
        return finalResult;
    }

    public static void main(String[] args) {
        ArrayList<String> result = getMazePos(0,0,2,2);
        System.out.println(result);
    }
}
