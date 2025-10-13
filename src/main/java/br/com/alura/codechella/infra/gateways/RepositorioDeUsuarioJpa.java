package br.com.alura.codechella.infra.gateways;

import br.com.alura.codechella.application.gateways.RepositorioDeUsuario;
import br.com.alura.codechella.domain.Usuario;
import br.com.alura.codechella.infra.persistence.UsuarioEntity;
import br.com.alura.codechella.infra.persistence.UsuarioRepository;

import java.util.List;

import static java.util.Arrays.stream;

public class RepositorioDeUsuarioJpa implements RepositorioDeUsuario {

    private final UsuarioRepository repositorio;
    private final UsuarioEntityMapper usuarioEntityMapper;

    public RepositorioDeUsuarioJpa(UsuarioRepository repositorio, UsuarioEntityMapper usuarioEntityMapper) {
        this.usuarioEntityMapper = usuarioEntityMapper;
        this.repositorio = repositorio;
    }

    @Override
    public Usuario cadastrarUsuario(Usuario usuario) {
        UsuarioEntity usuarioEntity = usuarioEntityMapper.toEntity(usuario);
        repositorio.save((usuarioEntity));
        return usuarioEntityMapper.toDomain(usuarioEntity);
    }

    @Override
    public List<Usuario> listarUsuarios() {
        return repositorio.findAll().stream()
                .map(usuarioEntityMapper::toDomain)
                .toList();
    }
}
