package InterviewQuestions;

public class DeadLock {

    private static final Object account = new Object();
    private static final Object transaction = new Object();

    public static void main(String[] args) {

        Thread debitCard = new Thread(() -> {

            synchronized (account) {
                System.out.println("Thread debitCard: " + "Holding account object");
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                System.out.println("Thread debitCard: " +
                        "Before Holding transaction object");
                synchronized (transaction) {
                    System.out.println("Thread debitCard: " +
                            "Holding account and transaction");
                }
            }
        });
        debitCard.setName("Debit Card Thread");

        Thread onlnePayment = new Thread(() -> {

            synchronized (transaction) {
                System.out.println("Thread onlnePayment: " + "Holding transaction object");
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                System.out.println("Thread onlnePayment: " +
                        "Before Holding account object");
                synchronized (account) {
                    System.out.println("Thread onlnePayment: " +
                            "Holding account and transaction");
                }
            }
        });
        onlnePayment.setName("Onlne Payment Thread");

        debitCard.start();
        onlnePayment.start();

        while(true){
            if(debitCard.getState() == Thread.State.BLOCKED &&
                    onlnePayment.getState() == Thread.State.BLOCKED) {
                System.out.println("Deadlock thread: " + onlnePayment.getName()
                + " and " +debitCard.getName());
                break;
            }
        }
    }
}
