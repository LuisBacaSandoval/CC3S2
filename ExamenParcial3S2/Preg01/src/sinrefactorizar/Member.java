package sinrefactorizar;

//Superclase
public abstract class Member {
    //Reemplazar el atributo "nombre" por el atributo "name", asi no se generará errores
    private final String name;
    public Member(String nombre) {
        this.name = nombre;
    }
    public abstract void joinTournament();
    public abstract void organizeTournament();
}
