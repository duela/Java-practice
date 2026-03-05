public class LoopingMultipleVariables {
    public static void main(String[] args){
        for (int i = 1, j = 10, z = -1; i < 10 ; i++, j--, z--) {
            System.out.println("i = " + i + " , j = " + j + " , z = " + z);
        }
    }
}
