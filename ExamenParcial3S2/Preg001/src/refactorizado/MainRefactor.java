package refactorizado;

import java.util.List;

public class MainRefactor {
    public static void main(String[] args) {
        List<MemberRefactor> miembros = List.of(
                new PremiumMemberRefactor("Abejita Azul"),
                new VipMemberRefactor("Kaperucita Feliz"),
                new FreeMemberRefactor("Inspectora Motita")
        );

        System.out.print(miembros.get(0).getName()+": ");
        miembros.get(0).organizeTournament();

        System.out.print(miembros.get(1).getName()+": ");
        miembros.get(1).organizeTournament();

        System.out.print(miembros.get(2).getName()+": ");
        miembros.get(2).organizeTournament();
    }
}
