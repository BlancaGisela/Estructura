package Musica;

public class ListaDe {
	private musica cabeza;{

	this.cabeza=null;
	
}

public musica getCabeza() {
	return cabeza;
}

public void setCabeza(musica cabeza) {
	this.cabeza = cabeza;
}

public boolean vacio() {
	boolean respuesta=true;
	if(this.cabeza!=null) {
		respuesta=false;
	}
	return respuesta;
}
public void insertar(NodoDe valor) {
	musica nuevo=new musica();
	nuevo.setValor(valor);
	nuevo.setSiguiente(null);
	nuevo.setAnterior(null);
	this.cabeza=nuevo;
}
public void insertarnodoadelante(NodoDe valor)
{
	if(vacio()) {
		insertar(valor);
	}
	else {
		musica nuevo=new musica();
		nuevo.setValor(valor);
		nuevo.setSiguiente(this.cabeza);
		this.cabeza.setAnterior(nuevo);
		nuevo.setAnterior(null);
		this.cabeza=nuevo;

	}
}


}
