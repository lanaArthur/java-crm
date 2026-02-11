package com.dev.crm;

import jakarta.persistence.Embeddable; 

@Embeddable
public class contato {
    private String nome;
    private String telefone;
    private String email;

    //GET & SET

    public String getNome() {return nome; }
    public void setNome(String nome) {this.nome = nome;}
    public String getTelefone() {return telefone; }
    public void setTelefone(String telefone) {this.telefone = telefone;}
    public String getEmail() {return email; }
    public void setEmail(String email) {this.email = email;}
 

}
