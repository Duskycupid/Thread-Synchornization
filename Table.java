package example;

public class Table 
{
	synchronized void printTable (int n ) {
//synchronized method

	for (int i = 1;i<=10;i++)
	{
		System.out.println (n*i);
		try {
		Thread.sleep(1000);
		}
		catch (Exception e )
		{
			System.out.println (e);
			
		}
		
		
	}}

}


class MyThread1 extends Thread {
	Table t;
	MyThread1 (Table t)
	{
		this.t = t;
	}
	public void run ()
	{
		t.printTable (100);
	}
	}
class TestSynchronization 
{
	public static void main (String [] args)
	{
		Table obj = new Table ();
		MyThread1 t1 = new MyThread1 (obj);
		t1.start();
				
	}
}