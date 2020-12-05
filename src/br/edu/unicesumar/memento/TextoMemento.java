package br.edu.unicesumar.memento;

public class TextoMemento {
    protected String estadoTexto;
 
    public TextoMemento(String texto) {
        estadoTexto = texto;
    }
 
    public String getTextoSalvo() {
        return estadoTexto;
    }
}