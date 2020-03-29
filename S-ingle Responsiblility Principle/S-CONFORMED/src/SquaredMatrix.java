import java.util.ArrayList;

class SquaredMatrix {
    private int size;
    private ArrayList<ArrayList<Integer>> elements;
    SquaredMatrix(){
        size = 0;
    }
    SquaredMatrix(int sz) {
        size = sz;
    }
    public int getSize(){
        return size;
    }
    public ArrayList<ArrayList<Integer>> getElements(){
        return elements;
    }
    public int getElementAtIndexes(int rowIndex, int colIndex){
        return elements.get(rowIndex).get(colIndex);
    }
    public void setElementAtIndexes(int rowIndex, int colIndex, int value){
        elements.get(rowIndex).set(colIndex,value);
    }

    public SquaredMatrix multiplyMatrix( SquaredMatrix b) {
        SquaredMatrix res = new SquaredMatrix(size);
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                res.setElementAtIndexes(i, j, 0);
                for (int k = 0; k < size; k++) {
                    int x = this.getElementAtIndexes(i, j) * b.getElementAtIndexes(i, j);
                    res.setElementAtIndexes(i, j, x);
                }
            }
        }
        return res;
    }

}
