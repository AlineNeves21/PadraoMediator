public class Pessoa {
    public String elogiarAdministracao(String mensagem) {
        return RH.getInstancia().receberElogioAdministracao(mensagem);
    }

    public String reclamarAdministracao(String mensagem) {
        return RH.getInstancia().receberReclamacaoAdministracao(mensagem);
    }

    public String sugerirAdministracao(String mensagem) {
        return RH.getInstancia().receberSugestaoAdministracao(mensagem);
    }
}
