package com.dev.crm;

import org.springframework.web.bind.annotation.*;
import jakarta.validation.Valid; // ADICIONE ESTA LINHA
import java.util.List;

@RestController
@RequestMapping("/clientes")
public class ClienteController {

    private final ClienteRepository repository;

    public ClienteController(ClienteRepository repository) {
        this.repository = repository;
    }

    @GetMapping
    public List<Cliente> listar() {
        return repository.findAll();
    }

    @PostMapping
    public Cliente adicionar(@Valid @RequestBody Cliente cliente) { // ADICIONADO @Valid
        return repository.save(cliente);
    }

    @GetMapping("/{id}")
    public Cliente selecionarPorId(@PathVariable Long id) {
        return repository.findById(id).orElse(null);
    }

    @DeleteMapping("/{id}")
    public void deletar(@PathVariable Long id) {
        repository.deleteById(id);
    }

    @PutMapping("/{id}")
    public Cliente atualizar(@PathVariable Long id, @Valid @RequestBody Cliente clienteModificado) { // ADICIONADO @Valid
        clienteModificado.setId(id);
        return repository.save(clienteModificado);
    }
}
