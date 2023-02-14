public class PaqueteEstandar extends Paquete {
    public PaqueteEstandar(double tarifaInicial, int edad) {
        super(tarifaInicial, edad);
    }
    @Override
    double aplicarRecargo() {
        return this.tarifaInicial * 0.18;
    }
    @Override
    double aplicarIva() {
        return tarifaInicial * 0.02;
    }
}
