/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.fjn.erp.trabalho2.venda;

import br.edu.fjn.erp.trabalho2.cliente.Cliente;
import br.edu.fjn.erp.trabalho2.cliente.Remedio;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 *
 * @author emanu
 */
@Entity
@Table(name="Venda")
public class Venda {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer codigo;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn
    private Cliente cliente;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn
    private Remedio remedio;

    private Double valor;

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Remedio getRemedio() {
        return remedio;
    }

    public void setRemedio(Remedio remedio) {
        this.remedio = remedio;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }
}
