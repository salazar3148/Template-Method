public abstract class Paquete {
    protected double tarifaInicial;
    protected int edad;
    public Paquete(double tarifaInicial, int edad) {
        this.tarifaInicial = tarifaInicial;
        this.edad = edad;
    }
    public double calcularPaquete(){
        double total = tarifaInicial;
        if(validarMayorEdad()){
            total += aplicarRecargo();
            total += aplicarIva();
        }
        return total;
    }
    public boolean validarMayorEdad(){
        return edad >= 18;
    }
    abstract double aplicarRecargo();
    abstract double aplicarIva();
}
