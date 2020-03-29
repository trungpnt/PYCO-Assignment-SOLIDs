public class ClientModule {
    public static void main(String []args){
        SquaredMatrix sqMat_1 = new SquaredMatrix(5);
        SquaredMatrix sqMat_2 = new SquaredMatrix(5);
        SquaredMatrix res = sqMat_1.multiplyMatrix(sqMat_2);
        //After this line is executed, it will multiply and sort then print,
        //Implementing 3 responsibilities in only one method is not a good choice !
    }
}
