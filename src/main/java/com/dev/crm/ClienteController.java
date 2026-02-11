package com.dev.crm;

import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController // Avisa que esta classe expõe endpoints (URLs) para a web
@RequestMapping("/clientes") // Define que todos os caminhos começam com /clientes
public class ClienteController {

    private final ClienteRepository repository;

    // Construtor: O Spring injeta o repositório automaticamente aqui
    public ClienteController(ClienteRepository repository) {
        this.repository = repository;
    }

    @GetMapping // Quando alguém acessar GET /clientes
    public List<Cliente> listar() {
        return repository.findAll();
    }

    @PostMapping // Quando alguém enviar um POST /clientes (Cadastro)
    public Cliente adicionar(@RequestBody Cliente cliente) {
        return repository.save(cliente);
	}
}
