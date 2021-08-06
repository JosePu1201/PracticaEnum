/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.practicaenum;

/**
 *
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
public enum Item {
    ID(),
    NUMERO(),
    SIMBOLO(),
    DECIMAL(),
    ERRO();
    private String tipo;
    private String entrada;

    private Item(String tipo, String entrada) {
        this.tipo = tipo;
        this.entrada = entrada;
    }

    private Item() {
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getEntrada() {
        return entrada;
    }

    public void setEntrada(String entrada) {
        this.entrada = entrada;
    }

    @Override
    public String toString() {
        return tipo + ": "+ entrada ;
    }
    
}
