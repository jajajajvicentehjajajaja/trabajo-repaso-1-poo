public class MainAuto {
    public static void main(String[] args) {
    	Auto auto1 = new Auto("Volkswagen", "Golf", "Negro");
        Auto auto2 = new Auto("Honda", "Civic", "Gris");
        Auto auto3 = new Auto("Peugeot", "208", "Amarillo");

        auto1.mostrarDatos();
        auto2.mostrarDatos();
        auto3.mostrarDatos();
    }
}