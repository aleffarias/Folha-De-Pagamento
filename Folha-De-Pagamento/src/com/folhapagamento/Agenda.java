package com.folhapagamento;

import java.util.ArrayList;

import com.empregado.Empregado;

public class Agenda {
	
	public int searchEmpregado(ArrayList<Empregado> listaEmpregados, int nEmpregado){
		int i;
		
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
	
	
	public void consultaAgenda(ArrayList<Empregado> listaEmpregados) {
		if (listaEmpregados.isEmpty()) {
			System.out.println("\nErro: Não há empregados cadastrados.\n");
			return;
		}
		
		for (int i=0; i < listaEmpregados.size(); i++) {
			System.out.println(listaEmpregados.get(i).toString() + "\n\n");
		}
	}
	
	public void novaAgenda(ArrayList<Empregado> listaEmpregados, int index) {
		
	}
}
