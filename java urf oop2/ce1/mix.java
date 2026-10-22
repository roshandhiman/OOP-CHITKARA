// // /******************************************************************************

// // Welcome to GDB Online.
// // GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
// // C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
// // Code, Compile, Run and Debug online from anywhere in world.

// // *******************************************************************************/
// // class Student {
// //     private int rollNo;
// //     private String name;
// //     private int marks1;
// //     private int marks2;
// //     private int marks3;

// //     private static int studentCount = 0;

// //     public Student(int rollNo, String name,
// //                   int marks1, int marks2, int marks3) {
// //         this.rollNo=rollNo;
// //         this.name=name;this.marks1=marks1;this.marks2=marks2;this.marks3=marks3;
// //         studentCount++;
// //     }

// //     public int calculateTotal() {
// //         int sum=marks1+marks2+marks3;
// //         return sum;
// //     }

// //     public double calculatePercentage() {
// //         int a=calculateTotal();
// //         double p=(a/300)*100;
// //         return p;
// //     }

// //     public char getGrade() {
// //         int a=calculateTotal();
// //         if(a>90){
// //             return 'A';
// //         }
// //         else if(a>75){return 'B';}
// //         else if(a>60){return 'C';}
// //         else{return 'D';}
// //     }

// //     public void displayDetails() {
// //         int a=calculateTotal();
// //         double p=calculatePercentage();
// //         char g=getGrade();
// //         System.out.println(rollNo+name+a+p+g);
// //     }

// //     public static int getStudentCount() {
// //         return studentCount;
// //     }

// //     public static void main(String[] args) {
// //         Student s1 = new Student(101, "Aman", 90, 85, 95);
// //         Student s2 = new Student(102, "Riya", 70, 75, 80);
// //         Student s3 = new Student(103, "Karan", 50, 55, 60);

// //         s1.displayDetails();
// //         s2.displayDetails();
// //         s3.displayDetails();

// //         System.out.println("Total Students: " + getStudentCount());
// //     }
// // }
// class BankAccount {
//     protected int accountNumber;
//     protected double balance;

//     public BankAccount(int accountNumber, double balance) {
//         this.accountNumber=accountNumber;
//         this.balance=balance;
//     }

//     public void deposit(double amount) {
//         if(amount>0){
//             balance+=amount;
//         }
//     }

//     public void withdraw(double amount) {
//         if(amount>0 && amount<=balance){
//             balance-=amount;
//         }
//     }

//     public double calculateInterest() {
//         return 0.;
//     }

//     public void displayDetails() {
//         System.out.println(accountNumber+" "+balance);
//     }
// }

// class SavingsAccount extends BankAccount {
//     private double interestRate;

//     public SavingsAccount(int accountNumber,
//                           double balance,
//                           double interestRate) {
//       super(accountNumber,balance);
//       this.interestRate=interestRate;
//     }

//     @Override
//     public double calculateInterest() {
//         double i=balance*interestRate/100;
//         return i;
//     }

//     @Override
//     public void displayDetails() {
//         System.out.println(accountNumber+" "+balance+" "+calculateInterest());
//     }
// }

// class Main {
//     public static void main(String[] args) {
//         SavingsAccount s =
//             new SavingsAccount(101, 20000, 5);

//         s.deposit(5000);
//         s.withdraw(2000);

//         s.displayDetails();
//     }
// }