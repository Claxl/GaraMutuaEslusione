public class Attesa {
 
	public static void attendi (double numMilliSecondi){
       
		try { 
			Thread.sleep((long)(numMilliSecondi * 100));
		} 
		catch (InterruptedException e) {}
	} 

	public static void attendiCasuale (double numMilliSecondi){
       
		numMilliSecondi = Math.random() * numMilliSecondi;		
		try { 
			Thread.sleep((long)(numMilliSecondi ));
		} 
		catch (InterruptedException e) {}
	} 
  
  }
