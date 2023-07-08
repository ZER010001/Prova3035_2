package prova3035.api.post;

import jakarta.validation.constraints.NotNull;

public record DadosAtualizacaoUsuario(


        String titulo;

        String descricao;

        @DateTimeFormat(pattern = "yyyy-MM-dd")
        LocalDate criadoEm;

        String linkVideo

        String linkFoto;

        Boolean privado;