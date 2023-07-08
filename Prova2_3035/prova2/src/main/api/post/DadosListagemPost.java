package prova3035.api.post;

public record DadosListagemPost(LocalDate criadoEm, String titulo, String descricao, String linkFoto, StringlinkVideo) {

    public DadosListagemPost(Post post) {
        this(post.getCriadoEm(),post.getTitulo(),post.getDescricao(),post.getLinkFoto(),post.getLinkVideo());
    }
}