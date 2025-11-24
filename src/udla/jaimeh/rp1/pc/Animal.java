package udla.jaimeh.rp1.pc;

public class Animal {
    private String nombre;
    private int edad;
    private String especie;
    private String dueno;
    private int id;
    static int contadorID=1;
    //Constructores y destructores
    public Animal(String nombre, int edad, String especie, String dueno, int id) {
        this.nombre = nombre;
        this.edad = edad;
        this.especie = especie;
        this.dueno = dueno;
        this.id = contadorID++;
    }

    public Animal() {
    }
    //Metodos java

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public String getDueno() {
        return dueno;
    }

    public void setDueno(String dueno) {
        this.dueno = dueno;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public static int getContadorID() {
        return contadorID;
    }

    public static void setContadorID(int contadorID) {
        Animal.contadorID = contadorID;
    }

    //Metodos personalizados
    void mostrarinfo(){
        System.out.println("Nombre: "+this.nombre);
        System.out.println("Edad: "+this.edad);
        System.out.println("Especie: "+this.especie);
        System.out.println("Dueño: "+this.dueno);
        System.out.println("ID: "+this.id);
    }
}
