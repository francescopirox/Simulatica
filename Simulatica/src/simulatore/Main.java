package simulatore;

import simulatore.SourceBlock.Function;

public class Main {
	public static void main(String[] args) throws InterruptedException {
		SourceBlock sorgente=new SourceBlock(Function.SINE);
		ExitBlock fine=new ExitBlock();
		Block ampl=new AmplifierBlock(2);
		Block accumul=new AccumulatorBlock();
		sorgente.connect(ampl);
		ampl.connect(accumul);
		accumul.connect(fine);
		
		Runnable r=new Runnable() {
			public void run() {
				while(true)
				try {
					Thread.currentThread().sleep(100);
					fine.print();
					
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		};
		Thread T = new Thread(r);
		T.start();
		Thread.currentThread().sleep(1000);
		sorgente.start();
	}
}
