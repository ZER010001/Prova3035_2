package prova3035.api.usuario;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;


@Table(name = "usuarios")
@Entity(name = "Usuario")
@Getter
@NoArgsConstructor
@AllArgsConstructor

public class Usuario {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private boolean deletado;
    private LocalDate criadoEm;
    private LocalDate atualizadoEm;
    private String nome;
    private String nomeUsuario;
    private String telefone;
    private String email;
    private String senha;
    private String linkPerfil;



    public Usuario(DadosCadastroUsuario dados) {
        this.deletado = false;
        this.criadoEm = dados.criadoEm();
        this.nome = dados.nome();
        this.nomeUsuario = dados.nomeUsuario();
        this.telefone = dados.telefone();
        this.email = dados.email();
        this.senha = dados.senha();
        this.linkPerfil = dados.linkPerfil();

    }

    public void atualizarInformacoes(DadosAtualizacaoUsuario dados) {

        this.atualizadoEm = dados.atualizadoEm();

        if (dados.nome() != null) {
            this.nome = dados.nome();
        }
        if (dados.nomeUsuario() != null) {
            this.nomeUsuario = dados.nomeUsuario();
        }
        if (dados.telefone() != null) {
            this.telefone = dados.telefone();
        }
        if (dados.email() != null) {
            this.email = dados.email();
        }

        if (dados.senha() != null) {
            this.senha = dados.senha();
        }
        if (dados.linkPerfil() != null) {
            this.linkPerfil = dados.linkPerfil();
        }

    }

    public void excluir() {
        this.deletado = true;
    }
}