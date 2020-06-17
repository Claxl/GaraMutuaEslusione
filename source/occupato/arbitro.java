public class Arbitro{
	int contaarrivi;
	public Arbitro(){
		contaarrivi=0;
	}
	public void registraArrivi(Lumaca lumaca){
		contaarrivi++;
		if(contaarrivi==1){
			System.out.println("\t"+"Ha vinto il dittatore! " +lumaca.getNome());
		}else{
			System.out.println("\n"+contaarrivi+" ° Posto "+lumaca.getNome());
		}
	}
}
