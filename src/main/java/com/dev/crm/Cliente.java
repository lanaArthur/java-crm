package com.dev.crm;

import jakarta.persistence.*;
import java.util.Set;

@Entity
public class Cliente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String razaoSocial;
    
    @Column(unique = true)
    private String cnpj;

    // Uso da classe Contato para o Representante
    @Embedded
    @AttributeOverrides({
        @AttributeOverride(name = "nome", column = @Column(name = "rep_nome")),
        @AttributeOverride(name = "telefone", column = @Column(name = "rep_telefone")),
        @AttributeOverride(name = "email", column = @Column(name = "rep_email"))
    })
    private Contato representanteLegal;

    // Uso da classe Contato para o Administrador
    @Embedded
    @AttributeOverrides({
        @AttributeOverride(name = "nome", column = @Column(name = "adm_nome")),
        @AttributeOverride(name = "telefone", column = @Column(name = "adm_telefone")),
        @AttributeOverride(name = "email", column = @Column(name = "adm_email"))
    })
    private Contato administrador;

    @ElementCollection
    @Enumerated(EnumType.STRING)
    private Set<Operadora> operadoras;

    private Double ultimaReceitaContratada;

    // Getters e Setters para todos os campos...
}
