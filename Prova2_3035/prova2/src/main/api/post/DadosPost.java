package prova3035.api.post;

import jakarta.validation.Valid;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;

public record DadosCadastroUsuario(

        //---YURI OOLHA SOBRE A VAlIDACAO ANTES DO DIA 7---//

        @NotBlank
        String titulo;

        @notBlank
        String descricao;

        @DateTimeFormat(pattern = "yyyy-MM-dd")
        LocalDate criadoEm;

        String linkVideo

        String linkFoto

        Boolean privado;