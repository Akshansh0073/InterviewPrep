package static_keyword;

public class StaticA {

//	static int staticVariable;
//
//    // Static block
//    static {
//        // Initialize static variable
//        staticVariable = 12;
//        System.out.println("Static block initialized. Static variable value: " + staticVariable);
//    }
//    
//    //2
//    static int a = 20;
//    static int b = 30;
//    static int c = 40;
//    
////    StaticA() 
////    {
////       a = 200;
////    }
//    static void m1() {
//       b = 300;
//    }
//    static {
//       c = 400;
//    }
//    
//    
//    // 2.
//    static int a1 = 20;
////    StaticA() {
////       a1++;
////    }
//    void m2()  {
//       a1++;
//       System.out.println(a1);
//    }
//    
//    
//    // 3.
//    
//    StaticA() {
//        System.out.println("constructor");
//    }
//    static void m3() {
//        System.out.println("static method");
//    }
//    void m4(){
//        System.out.println("instance method");
//    }
//    static {
//        System.out.println("static block");
//    }
//    {
//        System.out.println("instance block");
//    }
    
		static int a = 20;
		   static {
		        a++;
		   }
		   {
		     a++;
		     System.out.println(a);
		   }
	   
    public static void main(String[] args) {
        // Accessing static variable
//        System.out.println("Value of staticVariable in main method: " + staticVariable);
//        
//        System.out.println(a);
//        System.out.println(b);
//        System.out.println(c);
//        
//        
          // 2. 
//        StaticA obj = new StaticA();
//        StaticA obj2 = new StaticA();
//        StaticA obj3 = new StaticA();
//        obj3.m2();
//      
        
//        //3 
//        StaticA obj4 = new StaticA();
//        m3();
//        obj4.m4();
        
        //4
    	StaticA obj = new StaticA();
    	StaticA obj2 = new StaticA();
    	StaticA obj3 = new StaticA();
    }
}
