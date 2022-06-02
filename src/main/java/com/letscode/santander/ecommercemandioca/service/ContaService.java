package com.letscode.santander.ecommercemandioca.service;

import com.letscode.santander.ecommercemandioca.model.Usuario;
import com.letscode.santander.ecommercemandioca.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ContaService {

    @Autowired
    UsuarioRepository repository;

    public List<Usuario> listar() {
        return repository.findAll();
    }

    public Usuario procurar(Integer id) {
        return repository.findById(id).get();
    }

    private Usuario salvar(Integer id, Usuario paraSalvar) {
        if (id != null && procurar(id) != null) {
            paraSalvar.setId(id);
        }

        return repository.save(paraSalvar);
    }

    public Usuario adicionar(Usuario novo) {
        return salvar(null, novo);
    }

    public Usuario atualizar(Integer id, Usuario atualizado) {
        return salvar(id, atualizado);
    }

    public Usuario apagar(Integer id) {
        Usuario paraExcluir = procurar(id);
        repository.delete(paraExcluir);
        return paraExcluir;
    }

}
