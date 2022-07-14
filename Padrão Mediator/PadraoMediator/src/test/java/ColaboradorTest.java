import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ColaboradorTest {

    @Test
    void deveElogiarAdministracao() {
        Colaborador colaborador = new Colaborador();
        assertEquals("O RH agradece seu contato.\nA Administração respondeu sua demanda conforme mensagem a seguir.\n" +
                        ">>A Administração agradece a mensagem: Ótimo atendimento",
                colaborador.elogiarAdministracao("Ótimo atendimento"));
    }

    @Test
    void deveReclamarAdministracao() {
        Colaborador colaborador = new Colaborador();
        assertEquals("O RH agradece seu contato.\nA Administração respondeu sua demanda conforme mensagem a seguir.\n" +
                        ">>A Administração vai procurar melhorar o serviço da reclamação: Lentidão no atendimento",
                colaborador.reclamarAdministracao("Lentidão no atendimento"));
    }

    @Test
    void deveSugerirAdministracao() {
        Colaborador colaborador = new Colaborador();
        assertEquals("O RH agradece seu contato.\nA Administração respondeu sua demanda conforme mensagem a seguir.\n" +
                        ">>A Administração vai analisar a sugestão: Ampliar horário funcionamento",
                colaborador.sugerirAdministracao("Ampliar horário funcionamento"));
    }
}
