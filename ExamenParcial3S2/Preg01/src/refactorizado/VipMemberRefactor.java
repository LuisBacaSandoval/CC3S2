package refactorizado;
//Ahora esta clase, es subclase de MemberComplement, asi podra unirse y organizar torneos de ajedrez
public class VipMemberRefactor extends MemberComplement{
    public VipMemberRefactor(String name) {
        super(name);
    }

    @Override
    public void joinTournament() {

    }

    @Override
    public void organizeTournament() {
        System.out.println("Torneo organizado...");
    }
}
