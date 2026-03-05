public class LoopingExampleOne {
    public  static void main(String[] args){
        for (int i = 1; i <10 ; i = i*2){
            System.out.println("Hello world: " + i + " ");
        }
        // print even numbers
        for (int i = 1; i <= 20; i++) {
            if (i % 2 == 1) {
                continue;
            }
            System.out.println(i);
        }


        // print out numbers
        for (int i = 1; i <= 20; i++) {
            if (i % 2 == 0) {
                continue;
            }
            System.out.println(i);
        }
    }
}
