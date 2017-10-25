package Musica;

public class musica {

	private String id;
	private String nombre;
	private String album;
	private String artista;
	public String getNombrecancion() {
		return nombre;
	}
	public void setNombrecancion(String nombrecancion) {
		this.nombre = nombrecancion;
	}
	private String genero;
	public String getId_cancion() {
		return id;
	}
	public void setId_cancion(String i) {
		this.id = i;
	}
	public String getAlbum() {
		return album;
	}
	public void setAlbum(String album) {
		this.album = album;
	}
	public String getArtista() {
		return artista;
	}
	public void setArtista(String artista) {
		this.artista = artista;
	}
	public String getGenero() {
		return genero;
	}
	public void setGenero(String genero) {
		this.genero = genero;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "ID: "+this.id+" \nNombre: "+this.nombre+"\n Artista :"+this.artista+"\nAlbum: "+this.album+"\nGenero: "+this.genero;
	}
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		musica temp=(musica) o;
		return this.id.compareTo(temp.getId_cancion());
	}

}