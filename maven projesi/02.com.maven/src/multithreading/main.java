package multithreading;

public class main {
	public static void main(String[] args) {
		Iþlemler i1 = new Iþlemler("Ýlk");
		Thread t1 = new Thread(i1);
		
		Iþlemler i2 = new Iþlemler("Ýki");
		Thread t2 = new Thread(i2);
		t1.start();
		t2.start();
	}

}
