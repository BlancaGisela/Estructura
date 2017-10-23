package Musica;

public class musica {

	private NodoDe valor;
	private musica siguiente;
	private musica anterior;
	public NodoDe getValor() {
		return valor;
	}
	public void setValor(NodoDe valor) {
		this.valor = valor;
	}
	public musica getSiguiente() {
		return siguiente;
	}
	public void setSiguiente(musica siguiente) {
		this.siguiente = siguiente;
	}
	public musica getAnterior() {
		return anterior;
	}
	public void setAnterior(musica anterior) {
		this.anterior = anterior;
	}
	


}
