package refactorizado;

public class VipMemberRefactor extends MemberRefactor{
    public VipMemberRefactor(String name){
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
