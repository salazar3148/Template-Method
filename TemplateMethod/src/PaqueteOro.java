public class PaqueteOro extends Paquete{
    public PaqueteOro(double tarifaInicial, int edad) {
        super(tarifaInicial, edad);
    }
    @Override
    double aplicarRecargo() {
        return this.tarifaInicial * 0.05;
    }
    @Override
    double aplicarIva() {
        return tarifaInicial * 0.05;
    }
}
