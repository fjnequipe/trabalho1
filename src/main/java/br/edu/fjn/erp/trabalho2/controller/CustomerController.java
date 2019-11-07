/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.fjn.erp.trabalho2.controller;

import br.com.caelum.vraptor.Controller;
import br.com.caelum.vraptor.Get;
import br.com.caelum.vraptor.Post;
import br.com.caelum.vraptor.Result;
import br.edu.fjn.erp.trabalho2.cliente.Cliente;
import br.edu.fjn.erp.trabalho2.cliente.Endereco;
import br.edu.fjn.erp.trabalho2.cliente.Remedio;
import br.edu.fjn.erp.trabalho2.repositorio.util.FabricaConexao;
import br.edu.fjn.erp.trabalho2.venda.Venda;
import javax.inject.Inject;
import javax.persistence.EntityManager;

/**
 *
 * @author emanu
 */
@Controller
public class CustomerController {

    @Inject
    private Result result;

    @Get("/cliente")
    public void cliente(){
        System.out.println("Cliente");
    }

    @Post("/saveCliente")
    public void saveCliente(Cliente cliente){
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
            result.include("msgSuccess", cliente.getNome() + " salvo com sucesso!");
            result.redirectTo(this).cliente();
        }
    }

    @Get("/endereco")
    public void endereco(){
        System.out.println("Endereco");
    }

    @Post("/saveEndereco")
    public void saveEndereco(Endereco endereco){
        EntityManager gerenciador = FabricaConexao.obterGerenciador();
        try{
            gerenciador.getTransaction().begin();
            gerenciador.persist(endereco);
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
            result.include("msgSuccess", endereco.getCodigo() + " salvo com sucesso!");
            result.redirectTo(this).endereco();
        }
    }

    @Get("/remedio")
    public void remedio(){
        System.out.println("Remedio");
    }

    @Post("/saveRemedio")
    public void saveRemedio(Remedio remedio){
        EntityManager gerenciador = FabricaConexao.obterGerenciador();
        try{
            gerenciador.getTransaction().begin();
            gerenciador.persist(remedio);
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
            result.include("msgSuccess", remedio.getNome() + " salvo com sucesso!");
            result.redirectTo(this).remedio();
        }
    }

    @Get("/venda")
    public void venda(){
        System.out.println("Venda");
    }

    @Post("/saveVenda")
    public void saveVenda(Venda venda){
        EntityManager gerenciador = FabricaConexao.obterGerenciador();
        try{
            gerenciador.getTransaction().begin();
            gerenciador.persist(venda);
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
            result.include("msgSuccess", venda.getCliente() + " salvo com sucesso!");
            result.redirectTo(this).venda();
        }
    }
}
