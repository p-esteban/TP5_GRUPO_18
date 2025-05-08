package tp5_grupo18;

public class Pelicula {
	

    private int id;
    private String nombre;
    private Categoria categoria;

    public Pelicula() {
        
        nombre = "Sin nombre";
    }
    
    public Pelicula(String nombre, Categoria categoria) {
        
        this.nombre = nombre;
        this.categoria = categoria;
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setId(int id) {
        this.id = id;
    }

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}
}
