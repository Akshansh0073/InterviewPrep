package lambda_and_anonymous;

public class Main2 {

	public static void main(String[] args) {
		
		
		
		MyItnter2 i = new MyItnter2() {
			
			@Override
			public void b() {
				System.out.println("hw");
				
			}
			
			@Override
			public void a() {
				System.out.println("hw");
				
			}
		};
		i.a();
		i.b();
	}
}
