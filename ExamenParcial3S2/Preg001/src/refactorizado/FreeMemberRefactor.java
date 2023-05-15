package refactorizado;

//La clase FreeMember puede unirse a torneos, pero no puede organizar torneos
public class FreeMemberRefactor extends MemberRefactor{
    public FreeMemberRefactor(String name) {
        super(name);
    }

    @Override
    public void joinTournament() {
        System.out.println("Participarás en el torneo.");
    }
    //Ya no es obligatorio definir el comportamiento del método organizeTournament(),
    //ahora solamente las clases PremiunMember y VipMember son las que definen
    // el comportamiento del método organizeTournament()
    /*@Override
    public void organizeTournament() {
    }*/
}
