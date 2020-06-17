/*
Classe più importante per la mutua esclusione, il suo compito è far si che la mutua esclusione venga attuata tramite l'algoritmo di peterson.
*/

public class GalleriaPeterson{
	private  int lunghezza =0;
	private volatile int turno ;
	private volatile boolean voglioEntrare[];
	public GalleriaPeterson(int lun){
		voglioEntrare = new boolean [2];
		this.lunghezza=lun;
	}
	public void accedi(int lumacaId,String nome){
		voglioEntrare[lumacaId]=true;
		int altroId = 1-lumacaId; /*imposto altroId all'opposto dell'id della lumaca           
							sottrae uno a lumacaId per far verificare nel caso l'id sia 1 0
							ed in caso sia  0 1
							*/
		turno=altroId;
		
		
		
		while(voglioEntrare[altroId]&&turno==altroId){}//attesa attiva
			
		Attesa.attendiCasuale(1000);
			
		System.out.println(nome+" è entrato in galleria");
			//inizio sez. Critica
		for(int i=0;i<lunghezza;i++){
			System.out.println("\t"+"La lumaca "+nome+"   "+i);
			Attesa.attendiCasuale(1000);
		}
		//Fine sez.critica
		Attesa.attendiCasuale(1000);
		
		voglioEntrare[lumacaId]=false;
		System.out.println("È uscita dalla galleria  "+nome);
		
	}
}
