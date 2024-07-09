public class Board {


    public char[][] cells;


    public Board(){
        cells = new char[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                cells[i][j] = '-';
            }
        }

    }

    public boolean isCellEmpty(int x, int y){
        return cells[x][y] == '-';
    }

    public boolean isFull(){
        for (int i = 0; i < cells.length; i++) {
            for (int j = 0; j < cells.length; j++) {
                if(cells[i][j]=='-'){
                    return false;
                }
            }
        }
        return true;
    }

    public void print(){
        for(char[] row : cells){
            for(char c: row){
                System.out.print(c);
            }
            System.out.println();
        }
    }

    public void place(int x, int y, char marker){
        if((x<3 && x>=0)&&(y<3 && y>=0)&& isCellEmpty(x,y)){
            this.cells[x][y] = marker;
        }
    }


}