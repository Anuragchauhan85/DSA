
//Hollow rectangle pattern
// public class AdvPattern {

//     public static void hollow_rectange(int totRow, int totCols) {
//         for (int i = 1; i <= totRow; i++) {
//             for (int j = 1; j <= totCols; j++) {
//                 if (i == 1 || i == totRow || j == 1 || j == totCols) {
//                     System.out.print("*");
//                 } else {
//                     System.out.print(" ");
//                 }
//             }
//             System.out.println();
//         }
//     }

//     public static void main(String[] args) {
//         hollow_rectange(4,5 );
//     }
// }

// half Pyramid
// public class AdvPattern {

//     public static void half_pyramid( int n) {
//         for (int i = 1; i <= n; i++) {
//             for (int j = 1; j <= n - i; j++) {
//                 System.out.print(" ");
//             }
//             for (int j = 1; j <= i; j++) {
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//     }

//     public static void main(String[] args) {
//        half_pyramid(4);
//     }
// }

//half invertd num pyramid
// public class AdvPattern {

//     public static void invertedNumPyramid(int n) {
//         for (int i = 1; i <= n; i++) {
//             for (int j = 1; j <= (n-i)+1; j++) {
//                 System.out.print(j);
//             }
//             System.out.println();
//         }
//     }

//     public static void main(String[] args) {
//         invertedNumPyramid(5);
//     }
// }



//flyoid triangle
// public class AdvPattern {

//     public static void floyid(int n,int counter) {
//         for (int i = 1; i <= n; i++) {

//             for (int j = 1; j <= i; j++) {
//                 System.out.print(counter+" " );
//                 counter++;
//             }
//             System.out.println();
//         }
//     }

//     public static void main(String[] args) {
//         floyid(5,1);
//     }
// }

//01 triangle
// public class AdvPattern {

//     public static void triangle01(int n) {
//         for (int i = 1; i <= n; i++) {

//             for (int j = 1; j <= i; j++) {
//                 if ((i + j) % 2 == 0) {
//                     System.out.print("1");
//                 } else {
//                     System.out.print("0");
//                 }
//             }
//             System.out.println();
//         }
//     }

//     public static void main(String[] args) {
//         triangle01(5);
//     }
// }



//butterfly pattern
// public class AdvPattern {

//     public static void Butterfly(int n) {
//         for (int i = 1; i <= n; i++) {

//             for (int j = 1; j <= i; j++) {
//                 System.out.print("*");
//             }
//             for (int j = 1; j <= 2 * (n - i); j++) {
//                 System.out.print(" ");
//             }
//             for (int j = 1; j <= i; j++) {
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//         for (int i = n; i >= 1; i--) {

//             for (int j = 1; j <= i; j++) {
//                 System.out.print("*");
//             }
//             for (int j = 1; j <= 2 * (n - i); j++) {
//                 System.out.print(" ");
//             }
//             for (int j = 1; j <= i; j++) {
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//     }

//     public static void main(String[] args) {
//         Butterfly(4);
//     }
// }



//Rhombus
// public class AdvPattern {

//     public static void rhombus(int n) {
//         for (int i = 1; i <= n; i++) {

//             for (int j = 1; j <= n - i; j++) {
//                 System.out.print(" ");
//             }
//             for (int j = 1; j <= n;j++){
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//     }

//     public static void main(String[] args) {
//         rhombus(4);
//     }
// }


//hollow Rhombus
// public class AdvPattern {

//     public static void hollowRhombus(int n) {
//         for (int i = 1; i <= n; i++) {

//             for (int j = 1; j <= n - i; j++) {
//                 System.out.print(" ");
//             }
            
//             for (int j = 1; j <= n; j++) {
//                 if(i == 1 || i == n || j == 1 ||j == n){
//                    System.out.print("*");
//                 }else{
//                     System.out.print(" ");
//                 }
//             }

//             System.out.println();
//         }
//     }

//     public static void main(String[] args) {
//         hollowRhombus(4);
//     }
// }



//Diamond pattern
// public class AdvPattern {

//     public static void diamond(int n) {
//         for (int i = 1; i <= n; i++) {

//             for (int j = 1; j <= n - i; j++) {
//                 System.out.print(" ");
//             }
//             for (int j = 1; j <= 2 * i - 1; j++) {
//                 System.out.print("*");
//             }

//             System.out.println();
//         }
//         for (int i = n; i >= 1; i--) {

//             for (int j = 1; j <= n - i; j++) {
//                 System.out.print(" ");
//             }
//             for (int j = 1; j <= 2 * i - 1; j++) {
//                 System.out.print("*");
//             }

//             System.out.println();
//         }
//     }

//     public static void main(String[] args) {
//         diamond(4);
//     }
// }