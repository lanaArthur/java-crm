package com.dev.crm;

import jakarta.persistence.*;
import java.util.List;

@Entity
public class Cliente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String cnpj;
    private String razaoSocial;
    private String repNome;
    private String repEmail;
    private String repTelefone;
    private Double ultimaReceitaContratada;

    @ElementCollection
    @Enumerated(EnumType.STRING)
    private List<Operadora> operadorasAtuais;

    // Construtor vazio (obrigatório para o Java)
    public Cliente() {}

    // GETTERS E SETTERS (Isso resolve o problema do "{}")
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getCnpj() { return cnpj; }
    public void setCnpj(String cnpj) { this.cnpj = cnpj; }

    public String getRazaoSocial() { return razaoSocial; }
    public void setRazaoSocial(String razaoSocial) { this.razaoSocial = razaoSocial; }

    public String getRepNome() { return repNome; }
    public void setRepNome(String repNome) { this.repNome = repNome; }

    public String getRepEmail() { return repEmail; }
    public void setRepEmail(String repEmail) { this.repEmail = repEmail; }

    public String getRepTelefone() { return repTelefone; }
    public void setRepTelefone(String repTelefone) { this.repTelefone = repTelefone; }

    public Double getUltimaReceitaContratada() { return ultimaReceitaContratada; }
    public void setUltimaReceitaContratada(Double ultimaReceitaContratada) { this.ultimaReceitaContratada = ultimaReceitaContratada; }

    public List<Operadora> getOperadorasAtuais() { return operadorasAtuais; }
    public void setOperadorasAtuais(List<Operadora> operadorasAtuais) { this.operadorasAtuais = operadorasAtuais; }
}
