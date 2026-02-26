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
public class ArrayP1 {

    public static void reverse(int numbers[]) {
        int first = 0, last = numbers.length - 1;
 
        while (first<last) {
            int temp = numbers[last];
            numbers[last] = numbers[first];
            numbers[first] = temp;

            first++;
            last--;
        }
        
    }

    public static void main(String[] args) {
        int numbers[] = { 2, 4, 6, 8, 10, 12, 14 };

        reverse(numbers);

        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println();
    }
}