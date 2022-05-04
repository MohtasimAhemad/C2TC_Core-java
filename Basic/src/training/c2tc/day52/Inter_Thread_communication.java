/* The wait method to release the lock wait until notified 
 * it bits a all the thread waiting condition   */
package training.c2tc.day52;

class Customer
{    
	int amount=10000;    
    
	synchronized void withdraw(int amount)
	{    
		System.out.println("going to withdraw...");    
    
		if(this.amount<amount)
		{    
			System.out.println("Less balance; waiting for deposit..."+ this.amount);    
			try{
				wait();
			}
			catch(Exception e)
			{}    
		}    
		this.amount=this.amount-amount;    
		System.out.println("withdraw completed...");    
	}    
    
	synchronized void deposit(int amount)
	{    
		System.out.println("going to deposit...");    
		this.amount=this.amount+amount;    
		System.out.println("deposit completed... "+ this.amount);    
		notify();    
	}    
	}    
