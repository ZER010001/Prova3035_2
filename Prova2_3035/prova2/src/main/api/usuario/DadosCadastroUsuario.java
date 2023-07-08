package prova3035.api.usuario;

import jakarta.validation.Valid;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;

public record DadosCadastroUsuario(

        //---YURI VER SOBRE A VAlIDACAO---//

        @NotBlank
        String nome;

        @notBlank
        String nomeUsuario;

        @Pattern(regexp = "\\d{11}")
        String telefone;

        @DateTimeFormat(pattern = "yyyy-MM-dd")
        LocalDate criadoEm;

        @NotBlank
        @Email
        String email;

        @NotBlank
        String senha;

        String linkPerfil;