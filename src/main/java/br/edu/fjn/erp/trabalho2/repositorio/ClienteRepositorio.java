/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.fjn.erp.trabalho2.repositorio;

import br.edu.fjn.erp.trabalho2.modelo.cliente.Cliente;
import br.edu.fjn.erp.trabalho2.repositorio.util.FabricaConexao;
import javax.enterprise.context.RequestScoped;
import javax.persistence.EntityManager;

/**
 *
 * @author emanu
 */
@RequestScoped
public class ClienteRepositorio {

    public void salvar(Cliente cliente){
        EntityManager gerenciador = FabricaConexao.obterGerenciador();
        try{
            gerenciador.getTransaction().begin();
            gerenciador.persist(cliente);
            gerenciador.getTransaction().commit();
        }catch(Exception e){
            //verifica se a transação está ativa ainda.
            //um erro pode encerrar a transação sem permitir
            //um rollback pelo programador.
            if (gerenciador.getTransaction().isActive()){
                gerenciador.getTransaction().rollback();
            }
            e.printStackTrace();
        }finally{
            gerenciador.close();
        }
    }
}
