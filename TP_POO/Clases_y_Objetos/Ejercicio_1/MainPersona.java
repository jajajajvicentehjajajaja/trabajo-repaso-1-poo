public class MainPersona {
    public static void main(String[] args) {
        Persona p1 = new Persona("Alberto", 18);
        Persona p2 = new Persona("Juan", 18);

        System.out.println("La primera persona se llama " + p1.nombre + " y tiene " + p1.edad + " años");
        System.out.println("La segunda persona se llama " + p2.nombre + " y tiene " + p2.edad + " años");
    }
}