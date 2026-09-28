package modelo;

public class Pelicula {
    
    private String titulo;
    private String autor;
    private String genero;
    private int estrenoYear;
    private int idPelicula;
    private int cantPrestamos;
    private int copiasDisponibles; //funciona como validador de si se puede prestar la pelicula, no importa si la pelicula esta atrasada (en todo, eso importaria del cliente)
    private int plazoEntrega; //en dias desde la fecha inicial, default en 0 (se actualiza cuando se presta)
    private boolean mayor18;
    
    public Pelicula() {
        titulo = "";
        autor = "";
        genero = "";
        estrenoYear = 0;
        idPelicula = 0;
        cantPrestamos = 0;
        copiasDisponibles = 0;
        plazoEntrega = 0;
        mayor18 = false;
    }

    public Pelicula(String titulo, String autor, String genero, int estrenoYear, int idPelicula, int copiasDisponibles, boolean mayor18) {
        this.titulo = titulo;
        this.autor = autor;
        this.genero = genero;
        this.estrenoYear = estrenoYear;
        this.idPelicula = idPelicula;
        cantPrestamos = 0;
        this.copiasDisponibles = copiasDisponibles;
        plazoEntrega = 0;
        this.mayor18 = mayor18;
    }

    public boolean prestar() {
        if (copiasDisponibles > 0) {
            copiasDisponibles --;
            cantPrestamos++;
            plazoEntrega = 7;
            return true;

        } else {
            return false;

        }
    }
    public void devolver() {
        copiasDisponibles ++;
        plazoEntrega = 0;
    }

    public void extenderPlazo(int dias){
        plazoEntrega += dias;
    }
    
    
    //getter y setters

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getEstrenoYear() {
        return estrenoYear;
    }

    public void setEstrenoYear(int estrenoYear) {
        this.estrenoYear = estrenoYear;
    }

    public int getIdPelicula() {
        return idPelicula;
    }

    public void setIdPelicula(int idPelicula) {
        this.idPelicula = idPelicula;
    }

    public int getCantPrestamos() {
        return cantPrestamos;
    }

    public void setCantPrestamos(int cantPrestamos) {
        this.cantPrestamos = cantPrestamos;
    }

    public int getCopiasDisponibles() {
        return copiasDisponibles;
    }

    public void setCopiasDisponibles(int copiasDisponibles) {
        this.copiasDisponibles = copiasDisponibles;
    }

    public int getPlazoEntrega() {
        return plazoEntrega;
    }

    public void setPlazoEntrega(int plazoEntrega) {
        this.plazoEntrega = plazoEntrega;
    }
    
    public boolean isMayor18()
    {
        return mayor18;
    }

    public void setMayor18(boolean mayor18)
    {
        this.mayor18 = mayor18;
    }

}