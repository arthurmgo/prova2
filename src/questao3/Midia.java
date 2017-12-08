/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package questao3;

/**
 *
 * @author arthu
 */
public class Midia {


    private int numero;
    private int idadeCensura;
    private String titulo;
    private Categoria categoria;
    private float preco;

    public Midia(Categoria categoria) {
        this.categoria = categoria;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getIdadeCensura() {
        return idadeCensura;
    }

    public void setIdadeCensura(int idadeCensura) {
        this.idadeCensura = idadeCensura;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public float precoCategoria(){
        return categoria.precoLocacao(this.preco);
    }

    public float getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }
}
