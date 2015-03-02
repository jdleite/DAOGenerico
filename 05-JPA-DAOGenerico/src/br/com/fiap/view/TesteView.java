package br.com.fiap.view;

import javax.persistence.EntityManager;

import br.com.fiap.singleton.EMFactorySingleton;

public class TesteView {

	public static void main(String[] args) {
		EntityManager em = 
				EMFactorySingleton.getInstance()
				.createEntityManager();
		
		
	}
	
}