package refactorizado;

//Superclase
public abstract class MemberRefactor {

    //Reemplazar el atributo "nombre" por el atributo "name" donde sea necesario
    private final String name;
    public String getName() {
        return name;
    }
    public MemberRefactor(String name) {
        this.name = name;
    }
    public abstract void joinTournament();

    /*
    Tomamos este método de la clase MemberRefactor para agregarlo en la clase
    MemberComplement
    public abstract void organizeTournament();
    */
}
