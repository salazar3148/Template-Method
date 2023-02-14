public class PaquetePremium extends Paquete {
    public PaquetePremium(double tarifaInicial, int edad) {
        super(tarifaInicial, edad);
    }
    @Override
    double aplicarRecargo() {
        return this.tarifaInicial * 0.1;
    }
    @Override
    double aplicarIva() {
        return tarifaInicial * 0.03;
    }
}
