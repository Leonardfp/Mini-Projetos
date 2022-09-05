/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fila.encadeada;

public class Lista {

    private FilaEncadeada inicio;
    //lista vazia

    public Lista() {
        this.inicio = null;

    }

    public void inserir(int elemento) {
        FilaEncadeada nova = new FilaEncadeada();
        nova.setElemento(elemento); //inserir o elemento na caixa
        nova.setProximo(null); //Depois nao vem ninguem

        if (inicio == null) {
            inicio = nova;
        } else {
            FilaEncadeada aux;
            aux = inicio;
            while (aux.getProximo() != null) {
                aux = aux.getProximo();
            }
            aux.setProximo(nova);
        }
    }

    public int retirar() {
        FilaEncadeada aux = inicio;
        int elemento = aux.getElemento(inicio);
        inicio = aux.getProximo();
        return elemento;
    }

    public void listar() {
        if (inicio == null) {
            System.out.println("Lista vazia");
        } else {
            FilaEncadeada aux = inicio;
            while (aux != null) {
                System.out.println("Elemento viso " +aux.getElemento(aux));
                aux = aux.getProximo();
            }
        }
    }

    public boolean isEmpty() {
        return this.inicio == null;
    }
}
