package sinrefactorizar;

//La clase FreeMember puede unirse a torneos, pero no puede organizar torneos
public class FreeMember extends Member{
    public FreeMember(String name) {
        super(name);
    }

    @Override
    public void joinTournament() {

    }

    @Override
    public void organizeTournament() {
        //Esta parte del código no es compatible con LSP
        // Al pensar en generar una excepción estamos violando LSP
        System.out.println("No puede organizar torneos...");
    }
}
