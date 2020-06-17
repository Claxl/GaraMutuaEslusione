/*
Main del programma 
*/


import java.util.Scanner;
public class Paralleli{
	public static void main(String[] args){
		Scanner tastiera = new Scanner(System.in);
		int Lmax =2;
		String nome;
		Lumaca[] p= new Lumaca[Lmax];
		Arbitro a=new Arbitro();
		GalleriaPeterson g=new GalleriaPeterson(5);
		/*  Richiamo del costruttore per impostare n lumache */
		for(int i=0;i<Lmax;i++){
			p[i] = new Lumaca(i,"Lumaca",a,g);
		}
		//Acquisizione-Richiamo setNome per impostare il nome
		for(int i = 0;i<Lmax;i++){
			System.out.println("Inserisci il "+(i+1)+" °  Nome");
			nome=tastiera.nextLine();
			p[i].setNome(nome);
		}
		//Partenza Threads
		for(int i=0;i<Lmax;i++){
			p[i].start();
		}
	}
}