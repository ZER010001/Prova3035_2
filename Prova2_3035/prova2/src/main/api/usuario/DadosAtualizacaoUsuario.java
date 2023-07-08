package prova3035.api.usuario;

import jakarta.validation.constraints.NotNull;

public record DadosAtualizacaoUsuario(
        String nome;

        String nomeUsuario;

        @DateTimeFormat(pattern = "yyyy-MM-dd")
        LocalDate atualizadoEm

        @Pattern(regexp = "\\d{11}")
        String telefone;

        @Email
        String email;

        String senha;

        String linkPerfil;