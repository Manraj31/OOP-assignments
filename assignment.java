//1) even or odd
import java.util.Scanner;

// public class assignment{
//     public static void main(String[] args){
//         Scanner sc= new Scanner(System.in);
//         int n=sc.nextInt();
//         for(int i=1;i<=n;i++){
//             if(i%2==0){
//                 System.out.println(i+"->Even");
//             }
//             else{
//                 System.out.println(i+"->Odd");
//             }
//         }

//     }
// }

//2)Multiplication Tables
// public class assignment{
//     public static void main(String[] args){
//         Scanner sc= new Scanner(System.in);
//         int n=sc.nextInt();
//         for(int i=0;i<=10;i++){
//             System.out.println(n+"X"+i+"="+(i*n));
//         }

//     }
// }

//3)Prime Numbers in a Range
// public class assignment{
//     public static void main(String[] args){
//         Scanner sc= new Scanner(System.in);
//         int n=sc.nextInt();
//         int m=sc.nextInt();
//         int count;
//         for(int i=n;i<=m;i++){
//             count=0;
//             for(int j=2;j<=i;j++){
//                 if(i%j==0){
//                     count++;
//                 }
//             }
//             if(count==1){
//                 System.out.println(i);
//             }
//         }
//     }
// }

//4)Number guessing game
// public class assignment{
//     public static void main(String[] args){
//         int num=27;
//         boolean guessed=false;
//         Scanner sc= new Scanner(System.in);
//         for(int i=0;i<5;i++){
//             int n=sc.nextInt();
//             if(n==num){
//                 System.out.println("Congratulations! You guessed it.");
//                 guessed=true;
//                 break;
//             }
//             else if(n<num){
//                 System.out.println("Too Low");
//             }
//             else if(n>num){
//                 System.out.println("Too High");
//             }

//         }
//         if(guessed!=true){
//             System.out.println("Better Luck Next Time!");
//         }
//     }
// }


//5) Strong number in range
// public class assignment{
//     public static void main(String[] args){
//         Scanner sc= new Scanner(System.in);
//         int n=sc.nextInt();
//         int m=sc.nextInt();
//         int fact;
//         int total;
//         for(int i=n;i<m;i++){
//             total=0;
//             int temp=i;
//             while (temp>0) {
//                 int digit=temp%10;
//                 fact=1;
//                 if(digit==0){
//                     fact=1;
//                 }
//                 else{
//                     for(int j=1;j<=digit;j++){
//                     fact*=j;
//                 }
//                 }
//                 total+=fact;
//                 temp=temp/10;
//             }
//             if(total==i){
//                 System.out.println(i);
//                 continue;
//             }
//         }
//     }
// }