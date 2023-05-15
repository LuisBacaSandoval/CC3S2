package refactorizado;

//Superclase
public abstract class MemberRefactor {
    public String getName() {
        return name;
    }

    //Reemplazar el atributo "nombre" por el atributo "name" donde sea necesario
    private final String name;
    public MemberRefactor(String name) {
        this.name = name;
    }
    public abstract void joinTournament();
    //El método organizeTournament(), ahora no es obligatorio definir su comportamiento,
    //en todas las subclases, esto hace que podamos cumplir LSP
    public void organizeTournament(){
        System.out.println("No puede organizar torneos...");
    }
}
