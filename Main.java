// import java.util.Scanner;

// //user name
// //five subjects
// //percentage
// //50<marks then fail

// // class Main {
// //   public static void main(String[] args) {
// //     Scanner Sc = new Scanner(System.in);

// //     System.out.println("Enter x: "); 
// //     int a=Sc.nextInt();

// //     System.out.println("Enter y: ");
// //     int b=Sc.nextInt();

// //    if(a<b){
// //     System.out.println("Y is greater");
// //    }
// //    else{
// //     System.out.println("X is greater");
// //    }
// //   }
// // }

// class Main {
//   public static void main(String[] args) {
//     Scanner Sc = new Scanner(System.in);

//     System.out.println("Enter student's name: ");
//     String name = Sc.next();

//     System.out.println("Enter marks 1: ");
//     int a = Sc.nextInt();

//     System.out.println("Enter marks 2: ");
//     int b = Sc.nextInt();

//     System.out.println("Enter marks 3: ");
//     int c = Sc.nextInt();

//     System.out.println("Enter marks 4: ");
//     int d = Sc.nextInt();

//     System.out.println("Enter marks 5: ");
//     int e = Sc.nextInt();

//     double totalPercentage = (a + b + c + d + e) / 5.0 * 100;
//     if (totalPercentage > 90 && totalPercentage <= 100) {
//       System.out.println(name + ", Grade: A+");
//     } else if (totalPercentage > 80 && totalPercentage <= 90) {
//       System.out.println(name + ", Grade: A");
//     } else if (totalPercentage > 70 && totalPercentage <= 80) {
//       System.out.println(name + ", Grade: B");
//     } else if (totalPercentage > 60 && totalPercentage <= 70) {
//       System.out.println(name + ", Grade: C (Pass)"); // Added "Pass" for clarity
//     } else if (totalPercentage > 50 && totalPercentage <= 60) {
//       System.out.println(name + ", Grade: D");
//     } else if (totalPercentage > 40 && totalPercentage <= 50) {
//       System.out.println(name + ", Grade: F");
//     } else {
//       System.out.println(name + ", Invalid marks (below 40)");
//     }

//   }
// }

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);

        System.out.println("Enter student's name: ");
        String name = Sc.next();

        System.out.println("Enter marks 1 (out of 100): ");
        int marks1 = Sc.nextInt();

        System.out.println("Enter marks 2 (out of 100): ");
        int marks2 = Sc.nextInt();

        System.out.println("Enter marks 3 (out of 100): ");
        int marks3 = Sc.nextInt();

        System.out.println("Enter marks 4 (out of 100): ");
        int marks4 = Sc.nextInt();

        System.out.println("Enter marks 5 (out of 100): ");
        int marks5 = Sc.nextInt();

        double totalPercentage = (marks1 + marks2 + marks3 + marks4 + marks5) / 5.0 * 100;

        if (totalPercentage > 90 && totalPercentage <= 100) {
            System.out.println(name + ", Grade: A+");
        } else if (totalPercentage > 80 && totalPercentage <= 90) {
            System.out.println(name + ", Grade: A");
        } else if (totalPercentage > 70 && totalPercentage <= 80) {
            System.out.println(name + ", Grade: B");
        } else if (totalPercentage > 60 && totalPercentage <= 70) {
            System.out.println(name + ", Grade: C (Pass)");  // Added "Pass" for clarity
        } else if (totalPercentage > 50 && totalPercentage <= 60) {
            System.out.println(name + ", Grade: D");
        } else if (totalPercentage > 40 && totalPercentage <= 50) {
            System.out.println(name + ", Grade: F");
        } else {
            System.out.println(name + ", Invalid marks (below 40)");
        }
    }
}