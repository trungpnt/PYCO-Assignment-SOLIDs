import java.util.Scanner;
import java.util.concurrent.ConcurrentLinkedDeque;

public class ClientModule {

    private static Scanner sc = new Scanner(System.in);
    public static void initMatrix(SquaredMatrix squaredMatrix){
        MatrixManipulation matrixManipulation = new MatrixManipulation();
        System.out.println("Enter the size for this square matrix!");
        int sz = sc.nextInt();
        matrixManipulation.initMatrix(sz);
    }
    public static void sortMatrix(SquaredMatrix squaredMatrix){
        MatrixManipulation matrixManipulation = new MatrixManipulation();
        matrixManipulation.sort(squaredMatrix);
    }
    public static SquaredMatrix multiplyMatrix(SquaredMatrix a, SquaredMatrix b){
        MatrixManipulation matrixManipulation = new MatrixManipulation();
        SquaredMatrix result = new SquaredMatrix(a.getSize());
        result = a.multiplyMatrix(b);
        return result;
    }

    public static void print(SquaredMatrix a){
        MatrixManipulation matrixManipulation = new MatrixManipulation();
        matrixManipulation.print(a);
    }
    //THE ENTRY POINT
    public static void main(String []args){
        SquaredMatrix sqMat_1 = new SquaredMatrix();
        SquaredMatrix sqMat_2 = new SquaredMatrix();
        SquaredMatrix res = new SquaredMatrix();

        //Initializing
        ClientModule.initMatrix(sqMat_1);
        ClientModule.initMatrix(sqMat_2);

        //Multiplying and assigning to <res>
        res = sqMat_1.multiplyMatrix(sqMat_2);

        //Sorting
        ClientModule.sortMatrix(res);

        //Printing
        ClientModule.print(res);
    }
}
