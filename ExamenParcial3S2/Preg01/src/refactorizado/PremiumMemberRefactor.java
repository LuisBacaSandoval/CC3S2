package refactorizado;

//La clase PremiumMember puede unirse a torneos de ajedrez u organizar tales torneos
//Ahora esta clase es subclase de MemberComplement, asi podra unirse y organizar torneos de ajedrez
public class PremiumMemberRefactor extends MemberComplement {
    public PremiumMemberRefactor(String name) {
        super(name);
    }

    @Override
    public void joinTournament() {

    }

    @Override
    public void organizeTournament() {
        System.out.println("Torneo organizado");
    }
}
