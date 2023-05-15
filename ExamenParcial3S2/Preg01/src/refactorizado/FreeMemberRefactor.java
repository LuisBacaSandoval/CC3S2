package refactorizado;

//La clase FreeMember puede unirse a torneos, pero no puede organizar torneos
//Ahora esta clase es subclase de MemberRefactor, asi solo podra unirse a torneos de ajedrez
public class FreeMemberRefactor extends MemberRefactor{
    public FreeMemberRefactor(String name) {
        super(name);
    }

    @Override
    public void joinTournament() {
        System.out.println("Participarás en el torneo.");
    }
    //Ahora si se cumple LSP
    /*@Override
    public void organizeTournament() {
    }*/
}
