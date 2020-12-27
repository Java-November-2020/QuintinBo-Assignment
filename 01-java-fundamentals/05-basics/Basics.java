import java.util.ArrayList;
import java.util.Arrays;

public class Basics {

    public static void main(String[] args) {
            Counter();
            oddCounter();
            sumCounter();
            printArray(new int[]{1, 2, 3, 4, 5});
            findMax(new int[]{5, 10, 15, 20, 25});
            findMin(new int[]{10, 20, 30, 40, 50});
            arrayAverage(new int[]{5, 15, 25, 45, 95});
            oddArray();
            yGreaterThan(new int[]{3, 5, 7, 9, 11}, 5);
            squareArray(new Double[]{2.0, 3.0, 4.0, 5.0, 6.0});
            noNegatives(new int[]{-5, -3, -1, 0, 1, 3, 5});
            minMaxAverage(new int[]{5, 10, 15, 20, 25, 35});
            shiftArrayDown(new int[]{1, 2, 3, 4, 5});
        }

        public static void Counter(){
            for (int x = 0; x < 255; x++){
                System.out.println(x);}
        }

        public static void oddCounter(){
            for (int x = 0; x < 255; x++){
                if (x % 2 == 1)
                    System.out.println(x);}
        }

        public static void sumCounter(){
            int x;
            int sum = 0;
            for( x = 0; x < 255; x++) {
                sum += x;
            }
            System.out.printf("Number: " + x, " Sum: " + sum);
        }

        public static void printArray(int[] array){
            for(int x = 0; x < array.length; x++){
                System.out.println("Element " + x + ", value is " +array[x]);
            }
        }

        public static int findMax(int[] array){
            int max = 0;
            for (int x = 0; x < array.length; x++){
                if (array[x] > max)
                    max= array[x];
            }
            return max;
        }

        public static int findMin(int[] array){
            int min = array[0];
            for (int x = 0; x < array.length; x++){
                if (array[x] < min)
                    min = array[x];
            }
            return min;
        }

        public static double arrayAverage(int[] array){
            int sum = 0;
            for (int i : array) {
                sum += i;
            }
            return (double) sum / (double)array.length;
        }

        public static void oddArray(){
            ArrayList<Integer> odd = new ArrayList<Integer>();
            for (int x = 0; x < 255; x++){
                if (x % 2 == 1)
                    odd.add(x);
            }
        }

        public static int yGreaterThan(int[] array, int y){
            int count = 0;
            for(int x = 0; x < array.length; x++){
                if(x > y)
                    count++;
            }
            return count;
        }

        public static void squareArray(Double[] squared){
            for(int x = 0; x < squared.length; x++){
                squared[x]= Math.pow(squared[x], 2);
                System.out.println(Arrays.toString(squared));
            }
        }

        public static int[] noNegatives(int[] numbers) {
            for(int x = 0; x < numbers.length; x++){
                if(numbers[x] < 0)
                    numbers[x] = 0;
            }
            System.out.println(Arrays.toString(numbers));
            return numbers;
        }

        public static void minMaxAverage(int[] data){
            int min = findMin(data);
            int max = findMax(data);
            double avg = arrayAverage(data);
            data[0] = min;
            data[1] = max;
            data[2] = (int) avg;

            System.out.println(Arrays.toString(data));
        }

        public static int[] shiftArrayDown(int[] array1){
            int[] array2 = new int[array1.length];
            for (int x = 0; x <array1.length; x++){
                array2[x - 1] = array1[x];
                array2[array2.length] = 0;
            }
            System.out.println(Arrays.toString(array2));
            return array2;
        }
    }

