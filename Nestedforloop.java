public class Nestedforloop {
    public static void main(String[] args) {
      int[][] myNumbers = { {1, 2, 3, 4}, {5, 6, 7} };
      for (int i = 0; i < myNumbers.length; ++i) {
          System.out.println("Length of the Array: " + myNumbers.length);
         for(int j = 0; j < myNumbers[i].length; ++j) { // i=3
            System.out.println(myNumbers[i][j]); //[0][0]
         }
      }
    }
 }
 