package br.com.caelum.ed.vetores.testes;

import br.com.caelum.ed.vetores.Aluno;
import br.com.caelum.ed.vetores.Vetor;

// 2) Escreva os testes unitários vistos neste capítulo. 
// Coloque os testes
// no pacote br.com.caelum.ed.vetores.testes.

public class TesteTamanhoLista {

	public static void main(String[] args) {
		Aluno a1 = new Aluno();
		Aluno a2 = new Aluno();
		Aluno a3 = new Aluno();
		
		a1.setNome("Rafael");
		a2.setNome("Paulo");
		
		Vetor lista = new Vetor();
		
		lista.adiciona(a1);
		lista.adiciona(a2);
		
		System.out.println(lista.tamanho());
		
		lista.adiciona(a3);
		
		System.out.println(lista.tamanho());

	}

}