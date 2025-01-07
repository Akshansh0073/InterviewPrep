package lambda_and_anonymous;

public class Thread1 {

	
	public static void main(String[] args) {
		
		Runnable thread = () -> {
			
			for(int i=0;i<10;i++) {
				System.out.println("Value of i is : "+i);
				
				try {
					
					Thread.sleep(1000);
					
				} catch (Exception e) {
					e.printStackTrace();
				}
				
			}
		};
		
		Thread t = new Thread(thread);
		t.setName("akshansh");
		t.start();
	}

}
