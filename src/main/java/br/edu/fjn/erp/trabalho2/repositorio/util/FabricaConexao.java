/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.fjn.erp.trabalho2.repositorio.util;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author emanu
 */
public class FabricaConexao {
    private final static EntityManagerFactory fabrica = Persistence.createEntityManagerFactory("persistence");

    public static EntityManager obterGerenciador(){
        return fabrica.createEntityManager();
    }

    public static void fechar(){
        fabrica.close();
    }
}
