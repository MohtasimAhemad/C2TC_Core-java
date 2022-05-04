package training.c2tc.day52;

public class Transaction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Customer obj = new Customer();
		new Thread()
		{
			public void run()
			{
				obj.withdraw(20000);
			}
		}.start();
		new Thread()
		{
			public void run()
			{
				obj.deposit(30000);
			}
		}.start();

	}

}
