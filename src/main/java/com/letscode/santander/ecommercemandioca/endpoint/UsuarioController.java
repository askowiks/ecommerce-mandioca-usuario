package com.letscode.santander.ecommercemandioca.endpoint;

import com.letscode.santander.ecommercemandioca.model.Usuario;
import com.letscode.santander.ecommercemandioca.service.ContaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/usuario")
public class UsuarioController {

    @Autowired
    ContaService service;

    @GetMapping
    public List<Usuario> listar() {
        return service.listar();
    }

    @GetMapping("/{id}")
    public Usuario procurar(
            @PathVariable Integer id
    ) {
        return service.procurar(id);
    }

    @PostMapping
    public Usuario adicionar(
            @RequestBody Usuario novo
    ) {
        return service.adicionar(novo);
    }

    @PutMapping("/{id}")
    public Usuario atualizar(
            @PathVariable Integer id,
            @RequestBody Usuario atualizado
    ) {
        return service.atualizar(id, atualizado);
    }

    @DeleteMapping("/{id}")
    public Usuario apagar(
            @PathVariable Integer id
    ) {
        return service.apagar(id);
    }

}
