import java.util.Scanner;
public class Paralleli{
	public static void main(String[] args){
		Scanner tastiera = new Scanner(System.in);
		int Lmax =2;
		String nome;
		Lumaca[] p= new Lumaca[Lmax];
		Arbitro a=new Arbitro();
		Galleria g=new Galleria(5);
		for(int i=0;i<Lmax;i++){
			p[i] = new Lumaca(i,"Calavita",a,g);
		}
		for(int i = 0;i<Lmax;i++){
			System.out.println("Inserisci la "+(i+1)+" °  Nome");
			nome=tastiera.nextLine();
			p[i].setNome(nome);
		}
		for(int i=0;i<Lmax;i++){
			p[i].start();
		}
	}
}
