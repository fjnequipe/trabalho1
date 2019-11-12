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
import br.edu.fjn.erp.trabalho2.modelo.venda.Venda;
import br.edu.fjn.erp.trabalho2.repositorio.VendaRepositorio;
import javax.inject.Inject;

/**
 *
 * @author emanu
 */
@Controller
public class VendaController {

    @Inject
    private VendaRepositorio vendarepositorio;

    @Inject
    private Result result;

    @Get("/venda")
    public void venda(){
        System.out.println("Venda");
    }

    @Post("/saveVenda")
    public void saveVenda(Venda venda){
        vendarepositorio.salvar(venda);
        result.include("msgSuccess", venda.getCodigo() + " salvo com sucesso!");
        result.redirectTo(this).venda();
    }
}
