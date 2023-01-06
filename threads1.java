class Call implements Runnable
{
	String a;
	int x,time;
	Thread t;
	Call(String t1,int ti,int x1)
	{
		a=t1;
		x=x1;
		time=ti;
		t=new Thread(this,a);
		t.start();
	}
	public void run()
	{
		try{
			for(int i=0;i<x	;i++)
			{
				System.out.println(a);
				Thread.sleep(time);
			}
		    }
		catch(InterruptedException ie)
		{
			System.out.println("Interrupted ");
		}
	}
}

class threads1
{
public static void main(String xx[])
{
	new Call("BMS College of Engineering",10000,3);
	new Call("CSE",2000,10);
}
}