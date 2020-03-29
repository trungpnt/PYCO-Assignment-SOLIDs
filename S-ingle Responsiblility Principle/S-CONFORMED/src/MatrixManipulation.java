import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

class MatrixManipulation {
    Scanner sc = new Scanner(System.in);
    SquaredMatrix squaredMatrix;
    public SquaredMatrix initMatrix(int sz) {
        SquaredMatrix squaredMatrix = new SquaredMatrix(sz);
        for (int i = 0; i < sz; i++) {
            for (int j = 0; j < sz; j++) {
                System.out.println("Please enter each element !");
                sc.nextInt();
            }
        }
        this.squaredMatrix = squaredMatrix;
        return this.squaredMatrix;
    }

    public void sort(SquaredMatrix a){
        for (int i = 0; i < a.getSize(); i++)
            a.getElements().sort((Comparator<? super ArrayList<Integer>>) a.getElements().get(i));
    }

    public void print(SquaredMatrix a){
        for (int i = 0; i < a.getSize(); i++) {
            for (int j = 0; j < a.getSize(); j++)
                System.out.print(a.getElements().get(i).get(j) + " ");
            System.out.println();
        }
    }


}