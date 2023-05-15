package refactorizado;

import java.util.List;

public class MainRefactor {
    public static void main(String[] args) {
        List<MemberComplement> miembros = List.of(
                new PremiumMemberRefactor("Abejita Azul"),
                new VipMemberRefactor("Kaperucita Feliz")
        );

        System.out.print(miembros.get(0).getName()+": ");
        miembros.get(0).organizeTournament();

        System.out.print(miembros.get(1).getName()+": ");
        miembros.get(1).organizeTournament();

    }
}
