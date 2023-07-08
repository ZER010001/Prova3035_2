package prova3035.api.post;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;


@Table(name = "posts")
@Entity(name = "Post")
@Getter
@NoArgsConstructor
@AllArgsConstructor

public class Post {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private boolean deletado;
    private LocalDate criadoEm;
    private LocalDate atualizadoEm;
    private String titulo;
    private String descricao;
    private String linkFoto;
    private String linkVideo;
    private boolean privado;



    public Post(DadosPost dados) {
        this.deletado = false;
        this.criadoEm = dados.criadoEm();
        this.titulo = dados.titulo();
        this.descricao = dados.descricao();
        this.linkFoto = dados.linkFoto();
        this.linkVideo = dados.linkVideo();

        if(dados.privado != null){
            this.privado = false
        }else{
            this.privado = true
        }

    }


    public void atualizarPost(DadosAtualizacaoPost dados) {

        this.atualizadoEm = dados.atualizadoEm();

        if (dados.titulo() != null) {
            this.titulo = dados.titulo();
        }
        if (dados.descricao() != null) {
            this.descricao = dados.descricao();;
        }
        if (dados.linkFoto() != null) {
            this.linkFoto = dados.linkFoto();
        }
        if (dados.linkVideo() != null) {
            this.linkVideo = dados.linkVideo();
        }
        if (dados.privado() != null) {
            if(this.privado == false){
                this.privado = true;
            }else{
                this.privado = fakse;
            }
        }

    }

    public void excluir() {
        this.deletado = true;
    }

}
