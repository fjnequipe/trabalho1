package br.edu.fjn.erp.trabalho2.venda;

import br.edu.fjn.erp.trabalho2.cliente.Cliente;
import br.edu.fjn.erp.trabalho2.cliente.Remedio;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Venda.class)
public abstract class Venda_ {

	public static volatile SingularAttribute<Venda, Remedio> remedio;
	public static volatile SingularAttribute<Venda, Cliente> cliente;
	public static volatile SingularAttribute<Venda, Integer> codigo;
	public static volatile SingularAttribute<Venda, Double> valor;

}

