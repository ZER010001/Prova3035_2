package prova3035.api.usuario;

public record DadosListagemUsuario(String nome, String nomeUsuario, String linkPerfil) {

    public DadosListagemUsuario(Usuario usuario) {
        this(usuario.getNome(),usuario.getNomeUsuario(),usuario.getLinkPerfil());
    }

}