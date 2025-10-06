package br.com.alura.codechella.domain;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

public class UsuarioTest {
    @Test
    public void naoDeveCadastrarUsuarioComCpfInvalido() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> new Usuario("123456789-99", "nome", LocalDate.parse("1990-09-08"), "email@email.com"));
    }
}
