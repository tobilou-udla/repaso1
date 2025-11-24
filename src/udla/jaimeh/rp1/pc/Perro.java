package udla.jaimeh.rp1.pc;

public class Perro extends Animal {
    private String raza;
    private String tamano;
    private boolean vacunasaldia;
    //Constructores y destructores

    public Perro(String nombre, int edad, String especie, String dueno, int id, boolean vacunasaldia, String tamano, String raza) {
        super(nombre, edad, especie, dueno, id);
        this.vacunasaldia = vacunasaldia;
        this.tamano = tamano;
        this.raza = raza;
    }

    public Perro() {
    }
    //Metodos java


    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public String getTamano() {
        return tamano;
    }

    public void setTamano(String tamano) {
        this.tamano = tamano;
    }

    public boolean isVacunasaldia() {
        return vacunasaldia;
    }

    public void setVacunasaldia(boolean vacunasaldia) {
        this.vacunasaldia = vacunasaldia;
    }
    //Metodos especiales
    public void mostrarInfoPerro() {
        System.out.println("Nombre: " + getNombre());
        System.out.println("Edad: " + getEdad());
        System.out.println("Especie: " + getEspecie());
        System.out.println("Dueño: " + getDueno());
        System.out.println("ID: " + getId());
        System.out.println("Raza: " + getRaza());
        System.out.println("Tamaño: " + getTamano());
        System.out.println("Vacunas al día: " + isVacunasaldia());
    }
}
