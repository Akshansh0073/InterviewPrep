package lambda_and_anonymous;

public class Main {

	public static void main(String[] args) {
		
		System.out.println("System Starts...");
		
		
		SumInter a = (a1,b1) -> System.out.println(a1+b1);
		a.sum(2, 3);
		
		
		//3 lambda expression 
		MyInter i3 = () -> System.out.println("lambda implementation 1");
		i3.doSomething();
		
		MyInter i4 = () -> System.out.println("lambda implementation 2");
		i4.doSomething();
		
		
		//1 method
		MyInter m = new Impl();
		m.doSomething();
		
		
		//2 anonymous class
		// 1 implement
		MyInter i = new MyInter() {
			
			@Override
			public void doSomething() {
				System.out.println("doing something with anonymous 1");
				
			}
		};
		i.doSomething();
		
		// 2 implememnt
		MyInter i2 = new MyInter() {
			
			@Override
			public void doSomething() {
				System.out.println("doing something with anonymous 2");
				
			}
		};
		i2.doSomething();
		
		
		
		
		
	}
}
