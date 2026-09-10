// import java.util.Scanner;

// public class ArrayP1 {

//     public static void Update(int marks[]) {
//         for (int i = 0; i < marks.length; i++) {
//             marks[i] = marks[i] + 1;
//         }
//     }

//     public static void main(String[] args) {
//         int marks[] = { 97, 98, 99 };
//         Update(marks);
       
//         for (int i = 0; i < marks.length; i++) {
//             System.out.print(marks[i] + " ");
//             ;
//         }
//         System.out.println();
       
//     }
// }

// int marks[] = new int[50];

// System.out.println(marks.length);
// Scanner sc = new Scanner(System.in);

// marks[0] = sc.nextInt();
// marks[1] = sc.nextInt();
// marks[2] = sc.nextInt();

// System.out.println("phy : " + marks[0]);
// System.out.println("chem : " + marks[1]);
// System.out.println("math : " + marks[2]);

// marks[2] = 100;
// System.out.println("math : " + marks[2]);

// int percentage = (marks[0] + marks[1] + marks[2]) / 3;
// System.out.println("percentage = " + percentage + "%");
// sc.close();


// linear search
// public class ArrayP1 {

//     public static int linearSearch(int numbers[],int key) {
//         for (int i = 0; i < numbers.length; i++) {
//             if (numbers[i] == key) {
//                 return i;
//             }
//         }
//         return -1;
//     }

//     public static void main(String[] args) {
//         int numbers[] = { 2,4,6,8,10,12,14,16 };
//         int key = 10;

//         int index =linearSearch(numbers, key);
//         if (index == -1) {
//             System.out.println("not found");
//         } else {
//             System.out.println("key is at index : "+index);
//         }
//     }
// }

// //largest number
// public class ArrayP1 {

//     public static int getlargestNum(int numbers[]) {
//         int largest = Integer.MIN_VALUE;
//         int smallest = Integer.MAX_VALUE;
//         for (int i = 0; i < numbers.length; i++) {
//             if (largest < numbers[i]) {
//                 largest = numbers[i];
//             }
//             if (smallest > numbers[i]) {
//                 smallest = numbers[i];
//             }
//         }
//         System.out.println("smallest value is : "+smallest);
//         return largest;
//     }

//     public static void main(String[] args) {
//         int numbers[] = { 1, 2, 6, 3, 5 };
//         System.out.println("largest value is : "+getlargestNum(numbers));
//     }
// }


//binary search
// public class ArrayP1 {

//     public static int binarySearch(int numbers[],int key) {
//         int start = 0, end = numbers.length - 1;

//         while (start<=end) {
//             int mid =(start +end)/2;
//             if(numbers[mid]==key){ 
//                 return mid;
//             }
//             if(numbers[mid]<key){
//                 start=mid+1;
//             }else{
//                 end=mid-1;
//             }
//         }
//         return -1;
//     }

//     public static void main(String[] args) {
//         int numbers[] = { 2, 4, 6, 8, 10, 12, 14 };
//         int key = 12;

//         System.out.println("index for key is : "+ binarySearch(numbers,key));
//     }
// }


//reverse a Array
// public class ArrayP1 {

//     public static void reverse(int numbers[]) {
//         int first = 0, last = numbers.length - 1;
 
//         while (first<last) {
//             int temp = numbers[last];
//             numbers[last] = numbers[first];
//             numbers[first] = temp;

//             first++;
//             last--;
//         }
        
//     }

//     public static void main(String[] args) {
//         int numbers[] = { 2, 4, 6, 8, 10, 12, 14 };

//         reverse(numbers);

//         for (int i = 0; i < numbers.length; i++) {
//             System.out.print (numbers[i] + " ");
//         }
//         System.out.println();
//     }
// }


//pairs in array 
// public class ArrayP1 {

//     public static void PrintPairs(int numbers[]) {
//         int tp = 0;
//         for (int i = 0; i < numbers.length; i++) {
//             int curr = numbers[i];
//             for (int j = i + 1; j < numbers.length; j++) {
//                 System.out.print("(" + curr + "," + numbers[j] + ")  ");
//                 tp++;
//             }
//             System.out.println();
//         }
//         System.out.println("total pair : "+tp);
//     }

//     public static void main(String[] args) {
//         int numbers[] = { 2, 4, 6, 8, 10, 12, 14 };

//         PrintPairs(numbers);
//     }
// }



//print subarrays
// public class ArrayP1 {

//     public static void PrintSubArrays(int numbers[]) {
//         int SA = 0;
//         for (int i = 0; i < numbers.length; i++) {
//             for (int j = i; j < numbers.length; j++) {
//                 for (int k = i; k <= j; k++) {
//                     System.out.print(numbers[k] + " ");
//                 }
//                 SA++;
//                 System.out.println();
//             }
//             System.out.println();
//         }
//         System.out.println("total no of sub Arrays : "+SA);
//     }

//     public static void main(String[] args) {
//         int numbers[] = { 2, 4, 6, 8, 10, 12, 14 };

//         PrintSubArrays(numbers);
//     }
// }



//maxSubarraysum
// public class ArrayP1 {

//     public static void maxSubarraysum(int numbers[]) {
//         int currsum = 0;
//         int maxSum=Integer.MIN_VALUE;

//         for (int i = 0; i < numbers.length; i++) {
//             for (int j = i; j < numbers.length; j++) {
//                 currsum = 0;
//                 for (int k = i; k <= j; k++) {
//                     System.out.print(numbers[k] + " ");
//                     currsum += numbers[k];
//                 }
//                 System.out.println("sum : "+currsum);
//                 if (maxSum < currsum) {
//                     maxSum = currsum;
//                 }
//             }
//             System.out.println();
//         }
//         System.out.println("max sum = " + maxSum);
//     }

//     public static void main(String[] args) {
//         int numbers[] = { 2, 4, 6, 8, 10, 12, 14 };

//         maxSubarraysum(numbers);
//     }
// }


//Prefix Sum
// public class ArrayP1 {

//     public static void maxSubarraysum(int numbers[]) {
//         int currsum = 0;
//         int maxSum = Integer.MIN_VALUE;
//         int prefix[] = new int[numbers.length];

//         prefix[0] = numbers[0];
//         for (int i = 1; i < prefix.length; i++) {
//             prefix[i] = prefix[i - 1] + numbers[i];
//         }

//         for (int i = 0; i < numbers.length; i++) {
//             for (int j = i; j < numbers.length; j++) {
//                 currsum = i == 0 ? prefix[i]: prefix[i]-prefix[i-1];
                
//                 if (maxSum < currsum) {
//                     maxSum = currsum;
//                 }
//             }
//         }
//         System.out.println("max sum = " + maxSum);
//     }

//     public static void main(String[] args) {
//         int numbers[] = { 2, 4, 6, 8, 10, 12, 14 };

//         maxSubarraysum(numbers);
//     }
// }



public class ArrayP1 {

    public static void kadanes(int numbers[]) {
        int ms = Integer.MIN_VALUE;
        int cs = 0;

        for (int i = 0; i < numbers.length; i++) {
            cs = cs + numbers[i];
            if (cs < 0) {
                cs = 0;
            }
            ms = Math.max(cs, ms);
        }
        System.out.println("our max subarray sum is : "+ms);
    }

    public static void main(String[] args) {
        int numbers[] = { -2,-3, 4, -1, -2, 5, 1, -3 };

        kadanes(numbers);
    }
}