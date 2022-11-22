
class Numero implements Runnable{
	
	 
		 private int i;
		 private static int cont = 0;
		 private int identificacao;
		 public void run() {
		 while(i<11) {
		
	     System.out.println("Thread " + identificacao + ": " + i++);
	     try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();;
			}
		 }
		 System.out.println("Execução " + identificacao + " finalizada");
		 }
			 
		 public Numero() {
		 cont++;
		 identificacao = cont;
	
}
}

	  public class Main{
	public static void main(String[] args) {
		 
		 Numero r1 = new Numero();
		 Numero r2 = new Numero();
		 Numero r3 = new Numero();
		 Thread t = new Thread(r1);
		 Thread h = new Thread(r2);
		 Thread n = new Thread(r3);
		 
		 t.start();
		  try {
				t.join(); 
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
		 h.start();
		  try {
			 h.join(); 
		} catch (InterruptedException e) {
				
			e.printStackTrace();
		}
		 
		 n.start();
			
	}
}

