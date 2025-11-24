package udla.jaimeh.rp1.pc;

public class Gato extends Animal {
    private String color;
    private boolean esinterior;
    //Constructores y destructores

    public Gato(String nombre, int edad, String especie, String dueno, int id, String color, boolean esinterior) {
        super(nombre, edad, especie, dueno, id);
        this.color = color;
        this.esinterior = esinterior;
    }

    public Gato() {
    }
    //Metodos java

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isEsinterior() {
        return esinterior;
    }

    public void setEsinterior(boolean esinterior) {
        this.esinterior = esinterior;
    }
    //Metodos especiales
    public void mostrarInfoGato() {
        System.out.println("Nombre: " + getNombre());
        System.out.println("Edad: " + getEdad());
        System.out.println("Especie: " + getEspecie());
        System.out.println("Dueño: " + getDueno());
        System.out.println("ID: " + getId());
        System.out.println("Color: " + getColor());
        System.out.println("Es interior: " + isEsinterior());
    }
}
