package ex9_8;

class Persona {
    private String nom;
    private String dni;

    public Persona(String nom, String dni) {
        this.nom = nom;
        this.dni = dni;
    }

    @Override
    public String toString() {
        return "Nom: " + nom + ", DNI: " + dni;
    }
}
