package com.folhapagamento;

import java.util.ArrayList;

import com.empregado.Empregado;

public class Search {
	private static int i;
	
	public static int searchEmpregado(ArrayList<Empregado> listaEmpregados, int nEmpregado){
		if (listaEmpregados.isEmpty()) {
			System.out.println("\nErro: Não há empregados cadastrados.\n");
			return -1;
		}
		
		for (i=0; i < listaEmpregados.size(); i++) {
			if (listaEmpregados.get(i).getNumeroEmpregado() == nEmpregado) {
				break;
			}
		}
		
		return i;
	}
	
	public static void searchAgenda(ArrayList<Empregado> listaEmpregados) {
		if (listaEmpregados.isEmpty()) {
			System.out.println("\nErro: Não há empregados cadastrados.\n");
			return;
		}
		
		for (i=0; i < listaEmpregados.size(); i++) {
			System.out.println(listaEmpregados.get(i).toString() + "\n");
		}
	}
	
}
