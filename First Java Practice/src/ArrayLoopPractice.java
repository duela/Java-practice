public class ArrayLoopPractice {
    public static void main(String[] args){
        String [] celebrities = {"Bruno Mars", "Sam Smith", "Taylor Swift", "Eminen", "Jay Z"};
        for(int i = 0; i < celebrities.length; i++) {
//            System.out.println(celebrities.length);

            String celebrity = celebrities[i];
            System.out.println(celebrity + " : " +celebrity.length());

//            celebrities[2] = "New Name";
//            String celebrityChange = celebrities[i];
//            System.out.println(celebrityChange + " : " +celebrityChange.length());
        }

//       for(String celebrity : celebrities){
//           System.out.println(celebrity);
//       }
       double [] numLists = {121.9, 200.8, 304.45, 12.4, 35.986, 78.90, 12.4, 400.67};

        // Sum all the element in the array
       double sum = 0;
       for(int index = 0; index < numLists.length; index++){
           sum = sum + numLists[index];
       }
        System.out.println("Total sum is " + sum);

        // Find the largest element in the array using Traditional For
        double maxElement = numLists[0];

       for(int index = 1; index < numLists.length; index++){
           if (maxElement < numLists[index]){
               maxElement = numLists[index];
           }
       }
       System.out.println("The largest element in the array is " + maxElement);

        // Find the smallest element in the array using Enhanced For
       double minElement = numLists[0];
        for (double numList : numLists) {
            if (minElement > numList) {
                minElement = numList;
            }
        }
        System.out.println("The smallest element in the array is " + minElement);

        //Find the average of the minimum and maximum value of the elements in the array
        double averageMinMaxElement = (maxElement + minElement) / 2;
        System.out.println("The average of the minimum and maximum value of the elements in the array is " + averageMinMaxElement);

        //Find the average value of the elements in the array
        double averageElement = (sum )/ numLists.length;
        System.out.println("The average element in the array is " + averageElement);


        //Find the Harmonic mean value of the elements in the array
        double harmonicSum = 0;
        double n = numLists.length;
        for (int index = 0; index < numLists.length; index++){
            harmonicSum = harmonicSum +  (1 / numLists[index]);
        }
        System.out.println("The harmonic mean of the array is " + (n / harmonicSum));

        //Find the geometric mean of the elements in the array

        double product = 1;
        int listLength = numLists.length;
        for (int index = 0; index < listLength; index++) {
            product = product * numLists[index];
        }
        double geometricMean = Math.pow(product , (1.0/ listLength));
        System.out.println("The average element in the array is " + geometricMean);


//       for(double numList: numLists){
//           System.out.println(numList);
//       }
    }
}
