import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

class SquaredMatrix {
    Scanner sc = new Scanner(System.in);
    private int size;
    private ArrayList<ArrayList<Integer>> elements;

    SquaredMatrix(){
        size = 0;
    }

    SquaredMatrix(int sz) {
        size = sz;
    }

    //This method should also be handed to another class !
    public SquaredMatrix initMatrix(int sz) {
        SquaredMatrix squaredMatrix = new SquaredMatrix(sz);
        for (int i = 0; i < sz; i++) {
            for (int j = 0; j < sz; j++) {
                System.out.println("Please enter each element !");
                sc.nextInt();
            }
        }
        return squaredMatrix;
    }

    public int getElementAtIndexes(int rowIndex, int colIndex){
        return elements.get(rowIndex).get(colIndex);
    }

    public void setElementAtIndexes(int rowIndex, int colIndex, int value){
        elements.get(rowIndex).set(colIndex,value);
    }

    // the problem starts here
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

        ////this method shouldn't be responsible for sorting!
        for (int i = 0; i < size; i++)
            elements.sort((Comparator<? super ArrayList<Integer>>) elements.get(i));

        ////this method shouldn't be responsible for printing !
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++)
                System.out.print(elements.get(i).get(j) + " ");
            System.out.println();
        }

        return res;
    }


}
