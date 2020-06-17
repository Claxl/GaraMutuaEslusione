/*
Classe lumaca estende la classe Thread e serve per far partire le lumache.
Gli attributi fondamentali saranno "lumacaId" e "nome" i quali vengono portati come parametri a galleria.accedi
*/
public class Lumaca extends Thread{
	private String nome;
	private Arbitro arbitro;
	private int lumacaID;
	private GalleriaPeterson galleria;
	public Lumaca(int i,String nome, Arbitro a,GalleriaPeterson g){
		this.nome=nome;
		this.arbitro=a;
		this.lumacaID=i;
		this.galleria=g;
	}
	public void setNome(String nome){
		this.nome=nome;
	}
	public String getNome(){
		return nome;
	}
	public void corri(){
		for(int i=0;i<=10;i++){
			Attesa.attendiCasuale(1000);
			System.out.println(nome + " : " + i );
		}
		galleria.accedi(lumacaID,nome);
			
		for(int i=11;i<=20;i++){
			Attesa.attendiCasuale(1000);
			System.out.println(nome + " : " + i );
		}	
		
		arbitro.registraArrivi(this);
		
	}
	public void run(){
		corri();
	}
	
}
