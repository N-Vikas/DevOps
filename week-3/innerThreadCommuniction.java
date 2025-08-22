package week4;
class Q{
	int num;
	boolean valueSet=false;
	//consumer will call this
	synchronized int get(){
		while(!valueSet) {
			try {
			wait();//until producer produce
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println("consumed:"+num);
		valueSet=false;
		notify();//notify to the producer
		return num;
	}
//closing consumer call class
//producer will call this

synchronized void put(int n) {
	while(valueSet) {
		try {
			wait();
		}catch(InterruptedException e) {
			e.printStackTrace();
	}
	num=n;
	System.out.println("producer:"+num);
	valueSet=true;
	}
	
}//closing producer call class

//producer Thread
class Producer implements Runnable{
	Q q;
	Producer(Q,q){
	this.q=q;
	new Thread(this,"producer").start();
}
public void run() {
	int i=0;
	while(true) {
		q.put(i++);
		try {
			Thread.sleep(1000);
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
	}
}
}
//consumer Thread
class Consumer implements Runnable{
	Q q;
	Consumer(Q,q){
		
	this.q=q;
	new Thread(this,"consumer").start();
}
public void run() {
	int i=0;
	while(true) {
		q.get();
		try {
			Thread.sleep(1000);
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
	}
}
}



public class innerThreadCommuniction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Q q=new Q();
		new producer(q);
		new consumer(q)

	}

}}
