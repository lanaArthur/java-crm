package com.dev.crm;

import jakarta.persistence.*;
import jakarta.validation.constraints.*;
import java.util.List;
import java.util.ArrayList;

@Entity
public class Cliente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank(message = "O nome é obrigatório")
    private String nome;

    @Size(min = 14, max = 14, message = "CNPJ deve ter 14 dígitos")
    @Column(unique = true)
    private String cnpj;

    @ElementCollection
    private List<String> operadorasAtuais;

    @OneToMany(mappedBy = "cliente", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Contato> contatos = new ArrayList<>();

    // Getters e Setters
    public Long getId() { 
        return id; 
    }

    public void setId(Long id) { 
        this.id = id; 
    }

    public String getNome() { 
        return nome; 
    }

    public void setNome(String nome) { 
        this.nome = nome; 
    }

    public String getCnpj() { 
        return cnpj; 
    }

    public void setCnpj(String cnpj) { 
        this.cnpj = cnpj; 
    }

    public List<String> getOperadorasAtuais() { 
        return operadorasAtuais; 
    }

    public void setOperadorasAtuais(List<String> operadorasAtuais) { 
        this.operadorasAtuais = operadorasAtuais;
    } 

    public List<Contato> getContatos() { 
        return contatos;
    }

    public void setContatos(List<Contato> contatos) { 
        this.contatos = contatos; 
    }
}
