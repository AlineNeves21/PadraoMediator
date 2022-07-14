public class RH {
    private static RH instancia = new RH();

    private RH() {}

    public static RH getInstancia() {
        return instancia;
    }

    public String receberElogioAdministracao(String mensagem) {
        return "O RH agradece seu contato.\n"+
                "A Administração respondeu sua demanda conforme mensagem a seguir.\n" +
                ">>" + Administracao.getInstancia().receberElogio(mensagem);
    }

    public String receberReclamacaoAdministracao(String mensagem) {
        return "O RH agradece seu contato.\n"+
                "A Administração respondeu sua demanda conforme mensagem a seguir.\n" +
                ">>" + Administracao.getInstancia().receberReclamacao(mensagem);
    }

    public String receberSugestaoAdministracao(String mensagem) {
        return "O RH agradece seu contato.\n"+
                "A Administração respondeu sua demanda conforme mensagem a seguir.\n" +
                ">>" + Administracao.getInstancia().receberSugestao(mensagem);
    }

}
