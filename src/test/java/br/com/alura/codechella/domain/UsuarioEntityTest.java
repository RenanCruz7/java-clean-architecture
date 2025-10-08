package br.com.alura.codechella.domain;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

public class UsuarioEntityTest {
    @Test
    public void naoDeveCadastrarUsuarioComCpfInvalido() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> new Usuario("123456789-99", "nome", LocalDate.parse("1990-09-08"), "email@email.com"));
    }

    @Test
    public void deveCriarUsuarioUsantoFabrica(){
        FabricaDeUsuario fabrica = new FabricaDeUsuario();
        Usuario usuario = fabrica.comNomeCpfNasciment("nome", "123.456.789-99", LocalDate.parse("1990-09-08"));
        Assertions.assertEquals("nome", usuario.getNome());
        Assertions.assertEquals("123.456.789-99", usuario.getCpf());
        Assertions.assertEquals(LocalDate.parse("1990-09-08"), usuario.getNascimento());
    }
}
