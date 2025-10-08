package br.com.alura.codechella.infra.gateways;

import br.com.alura.codechella.application.gateways.RepositorioDeUsuario;
import br.com.alura.codechella.domain.Usuario;
import br.com.alura.codechella.infra.persistence.UsuarioRepository;

public class RepositorioDeUsuarioJpa implements RepositorioDeUsuario {

    private final UsuarioRepository repositorio;

    public RepositorioDeUsuarioJpa(UsuarioRepository repositorio) {
        this.repositorio = repositorio;
    }

    @Override
    public Usuario cadastrarUsuario(Usuario usuario) {
        return repositorio.save((usuario));
    }
}
