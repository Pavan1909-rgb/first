// class Friend{
//     int add;
//     int sub;
//     int div;

//     public double print(){
//         double a=22,b=7;
//         System.out.println(a+b);
//         System.out.println(a-b);
//         System.out.println(a/b);
//         return 0;
//     }
// }

// class D{
//     public static void main(String[] args) {
//         Friend ch = new Friend();
//         ch.add = 12;
//         ch.sub = 10;
        
//         ch.print();

//     }
// }
// class Friend{
//     private int ab;

// }
// class D{
//     public static void main(String[] args) {
//         Friend ch = new Friend();
//         ch.ab = 10;
//         System.out.println();
//     }
// }

// class Friend{
//     private String name;
//     private int roll_no;
//     public String getname(){
//         return name;
//     }
//     public void setname(String n){
//         name = n;
//     }
//     public int getid(){
//         return roll_no;
//     }
//     public void setid(int n){
//         roll_no = n;
//     }
// }
// class D{
//     public static void main(String[] args) {
//         Friend ch = new Friend();
//         ch.setname("Virat kholi");
//         ch.setid(18);
//         System.out.println(ch.getid());
//         System.out.println(ch.getname());
//     }
// }

// class D{
//     D(String s){
//         System.out.println("Constructor");
//         System.out.println(s);
//     }
// }
// class Friend{
//     public static void main(String[] args) {
//         D m = new D("Pvn$$");

//     }
// }
// class Base{
//     public int x;
//     public int getx(){
//         return x;
//     }
//     public void setx(int x){
//        this. x = x;
//     //    System.out.println(x);
//     }
// }
// class Derived extends Base{
    
// }

// class D{
//     public static void main(String[] args) {
//         Base n = new Base();
//         n.setx(100);
//         System.out.println(n.getx());

//     }
// }