package ejercicio3_Pedido_Restaurante;

public class Postre {
    
    //atributos
    private String nombre;
    private double valor;

    //constructor
    public Postre(String nombre, double valor) {
        this.nombre = nombre;
        this.valor = valor;
    }

    // Getters y Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    //toString
    @Override
    public String toString() {
        return "Postre: " + nombre + ", Valor: " + valor + "€";
    }











}
