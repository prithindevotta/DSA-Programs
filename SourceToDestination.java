package cp;

public class SourceToDestination {

    static boolean[][] vis;

    static void printWay(int m, int n, int x, int y, int xf, int yf, StringBuilder out){

//        vis[x][y] = true;

        if(x == xf && y==yf){
            System.out.print(out.toString());
            System.out.println();
//            vis[x][y] = false;
            return;
        }
        if(safeToVis(m, n, x+1, y, vis)){
            out.append("R");
            printWay(m, n, x+1, y, xf, yf, out);
            if(out.length() > 0){
                out.deleteCharAt(out.length() - 1);
            }
        }

        if(safeToVis(m, n, x, y+1, vis)){
            out.append("U");
            printWay(m, n, x, y+1, xf, yf, out);
            if(out.length() > 0){
                out.deleteCharAt(out.length() - 1);
            }
        }
//        vis[x][y] = false;
    }

    private static boolean safeToVis(int m, int n, int x, int y, boolean[][] vis) {
        if(x<m && x>=0 && y<n && y>=0){
            return true;
        }
        return false;
    }

    public static void main(String[] args){
        vis = new boolean[5][5];
        StringBuilder out = new StringBuilder();
        printWay(5, 5, 1, 1, 3, 4, out);
    }
}
