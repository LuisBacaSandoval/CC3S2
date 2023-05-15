package sinrefactorizar;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Member> miembros = List.of(
                new PremiumMember("Abejita Azul"),
                new VipMember("Kaperucita Feliz"),
                new FreeMember("Inspectora Motita")
        );

        miembros.get(2).organizeTournament();
    }
}
