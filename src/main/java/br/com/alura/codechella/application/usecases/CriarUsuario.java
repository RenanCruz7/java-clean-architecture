package br.com.alura.codechella.application.usecases;

import br.com.alura.codechella.application.gateways.RepositorioDeUsuario;
import br.com.alura.codechella.domain.Usuario;

public class CriarUsuario {
    public CriarUsuario(RepositorioDeUsuario repositorio) {
        this.repositorio = repositorio;
    }

    private final RepositorioDeUsuario repositorio;

    public Usuario cadastrarUsuario(Usuario usuario) {
        return repositorio.cadastrarUsuario(usuario);
    }
}
