package refactorizado;

//La clase PremiumMember puede unirse a torneos de ajedrez u organizar tales torneos
public class PremiumMemberRefactor extends MemberRefactor {
    public PremiumMemberRefactor(String nombre){
        super(nombre);
    }

    @Override
    public void joinTournament() {

    }

    @Override
    public void organizeTournament() {
        System.out.println("Torneo organizado...");
    }
}
