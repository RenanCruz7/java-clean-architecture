package br.com.alura.codechella.application.gateways;

import br.com.alura.codechella.domain.Usuario;

public interface RepositorioDeUsuario {
    Usuario cadastrarUsuario(Usuario usuario);
}
