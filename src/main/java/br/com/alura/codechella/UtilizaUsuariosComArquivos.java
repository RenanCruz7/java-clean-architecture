package br.com.alura.codechella;

import br.com.alura.codechella.domain.Usuario;
import br.com.alura.codechella.infra.gateways.RepositorioDeUsuarioEmArquivo;

import java.time.LocalDate;

public class UtilizaUsuariosComArquivos {

    public static void main(String[] args) {
        RepositorioDeUsuarioEmArquivo repositorioDeUsuarioEmArquivo = new RepositorioDeUsuarioEmArquivo();

        repositorioDeUsuarioEmArquivo.cadastrarUsuario(new Usuario("123.456.789-00", "João Silva",
                LocalDate.parse("2000-01-01"),"joao@hotmail.com"));

        repositorioDeUsuarioEmArquivo.cadastrarUsuario(new Usuario("123.456.789-00", "Renan Silva",
                LocalDate.parse("2000-01-01"),"renan@hotmail.com"));

        repositorioDeUsuarioEmArquivo.cadastrarUsuario(new Usuario("123.456.789-00", "Douglas Silva",
                LocalDate.parse("2000-01-01"),"Douglas@hotmail.com"));

        //System.out.println(repositorioDeUsuarioEmArquivo.listarUsuarios());
        repositorioDeUsuarioEmArquivo.gravaEmArquivo("usuarios.txt");

    }
}
