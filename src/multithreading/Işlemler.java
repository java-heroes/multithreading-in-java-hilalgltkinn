package multithreading;

public class Iþlemler implements Runnable {
	String name;
	public Iþlemler(String name) {
		this.name = name;
		System.out.println(name + "Ýþlem Oluþtu !");
	}

	@Override
	public void run() {
		try {
			for (int i = 5; i > 0; i--) {
				System.out.println(this.name +":"+ i);
				Thread.sleep(1000);
			}
		} catch (Exception e) {
			System.out.println(this.name + "hata ile karþýlaþýldý !");
		}
		System.out.println(name + "iþlem bitti");
		
	}

}
