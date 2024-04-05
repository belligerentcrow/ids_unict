public class MainEsami {
    public static void main(String[] args) {
    Studente s = new Studente();
    s.setNome("Alan", "Rossi"); // metodo della superclasse di s
    s.setMatr("M12345");
    s.nuovoEsame("Italiano", 8); // metodo della classe di s
    s.printAll(); // metodo della classe di s
    s.nuovoEsame("Fisica", 7);
    Perssona p = s; // p e' dichiarato di tipo Persona
    p.printAll(); // a runtim
    }
}

