public class Galleria{
	private int lunghezza;
	
	public volatile int occupato = 0;
	
	public Galleria (int lun){
		this.lunghezza = lun;
	}
	
	public void acced(int lumacaId, String nome){
		
		while (occupato == 1){
			
		}
		
		Attesa.attendiCasuale(3000);
		
		occupato=1;
		
		System.out.println("Lumaca" +nome+"Entra in galleria");
		for(int i=1;i<lunghezza; i++){
			
			Attesa.attendiCasuale(1000);
			System.out.println("In galleria: " +nome+": "+i+ "\n");
			
		}
		System.out.println("la Lumaca : "+nome+" Esce da galleria");
		
		occupato=0;
		
	}
}
