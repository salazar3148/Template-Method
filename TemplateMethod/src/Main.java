public class Main {
    public static void main(String[] args) {
        PaqueteEstandar paquete1 = new PaqueteEstandar(150000, 19);
        System.out.println(paquete1.calcularPaquete());

        PaquetePremium paquete2 = new PaquetePremium(230000, 21);
        System.out.println(paquete2.calcularPaquete());

        PaqueteOro paquete3 = new PaqueteOro(400000, 17);
        System.out.println(paquete3.calcularPaquete());
    }
}