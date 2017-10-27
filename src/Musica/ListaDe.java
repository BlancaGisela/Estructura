package Musica;

public class ListaDe {
	private NodoDe inicio;
	private NodoDe fin;


	public ListaDe()
	{
		inicio=null;
		fin=null;

	}
	public void insertaralinicio(musica valor)
	{
		if(inicio==null) {
			inicio=new NodoDe(valor,null,null);
			fin=inicio;
		}
		else {
			NodoDe nuevo=new NodoDe(valor,inicio,null);
			inicio.setAnterior(nuevo);
			inicio=nuevo;
		}
	}

	public boolean vacio(){

		if(fin==null&&inicio==null) {

			return true;
		}else 
			return false;
	}

	public void insertarfinal(musica valor) {
		if(fin==null) {
			fin=new NodoDe(valor,null,null);
			inicio=fin;
		}else {
			NodoDe nuevo=new NodoDe(valor,null,fin);
			fin.setSiguiente(nuevo);
			fin=nuevo;
		}

	}

	public musica  eliminarprimero() {
		musica valor=inicio.getValor();
		inicio=inicio.getSiguiente();
		if(inicio!=null) {
			inicio.setAnterior(null);

		}else {
			fin=null;
		}
		return valor;

	}

	public musica  eliminarultimo() {
		musica valor=fin.getValor();
		fin=fin.getAnterior();
		if(fin!=null) {
			inicio.setSiguiente(null);

		}else {
			inicio=null;
		}
		return valor;	
	}

	public StringBuilder verprimero() {
		StringBuilder cadena = new StringBuilder();
		NodoDe temp=inicio;
		cadena.append("");
		while(temp!=null) {
			cadena.append(temp.getValor());
			cadena.append("");
			temp=temp.getSiguiente();

		}
		cadena.append("");
		return cadena;
	}


	public StringBuilder verultimo() {
		StringBuilder cadena = new StringBuilder();
		NodoDe temp=fin;
		cadena.append("");
		while(temp!=null) {
			cadena.append(temp.getValor());
			cadena.append("");
			temp=temp.getAnterior();

		}
		cadena.append("");
		return cadena;
	}

}

