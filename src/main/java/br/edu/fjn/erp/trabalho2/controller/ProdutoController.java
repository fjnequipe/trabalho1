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
import br.edu.fjn.erp.trabalho2.modelo.produto.Produto;
import br.edu.fjn.erp.trabalho2.repositorio.ProdutoRepositorio;
import javax.inject.Inject;

/**
 *
 * @author emanu
 */
@Controller
public class ProdutoController {

    @Inject
    private ProdutoRepositorio produtorepositorio;

    @Inject
    private Result result;    

    @Get("/produto")
    public void produto(){
        System.out.println("Produto");
    }

    @Post("/saveProduto")
    public void saveProduto(Produto produto){
        produtorepositorio.salvar(produto);
        result.include("msgSuccess", produto.getNome() + " salvo com sucesso!");
        result.redirectTo(this).produto();
    }
}
