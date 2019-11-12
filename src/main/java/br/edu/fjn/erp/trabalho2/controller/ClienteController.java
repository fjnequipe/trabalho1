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
import br.edu.fjn.erp.trabalho2.modelo.cliente.Cliente;
import br.edu.fjn.erp.trabalho2.repositorio.ClienteRepositorio;
import javax.inject.Inject;

/**
 *
 * @author emanu
 */
@Controller
public class ClienteController {

    @Inject
    private ClienteRepositorio clienterepositorio;

    @Inject
    private Result result;

    @Get("/cliente")
    public void cliente(){
        System.out.println("Cliente");
    }

    @Post("/saveCliente")
    public void saveCliente(Cliente cliente){
        clienterepositorio.salvar(cliente);
        result.include("msgSuccess", cliente.getNome() + " salvo com sucesso!");
        result.redirectTo(this).cliente();
    }
}
