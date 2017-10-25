package Musica;

public class NodoDe {
	private musica valor;
	private NodoDe siguiente;
	private NodoDe anterior;

	public NodoDe(musica val, NodoDe next,NodoDe back) {
		siguiente=next;
		anterior=back;
		valor=val;
	}


	public musica getValor() {
		return valor;
	}
	public void setValor(musica valor) {
		this.valor = valor;
	}
	public NodoDe getSiguiente() {
		return siguiente;
	}
	public void setSiguiente(NodoDe siguiente) {
		this.siguiente = siguiente;
	}
	public NodoDe getAnterior() {
		return anterior;
	}
	public void setAnterior(NodoDe anterior) {
		this.anterior = anterior;
	}


}