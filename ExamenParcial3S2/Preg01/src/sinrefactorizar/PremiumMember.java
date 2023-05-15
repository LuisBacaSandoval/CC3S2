package sinrefactorizar;

//La clase PremiumMember puede unirse a torneos de ajedrez u organizar tales torneos
public class PremiumMember extends Member{
    public PremiumMember(String nombre){
        super(nombre);
    }

    @Override
    public void joinTournament() {

    }

    @Override
    public void organizeTournament() {

    }
}
