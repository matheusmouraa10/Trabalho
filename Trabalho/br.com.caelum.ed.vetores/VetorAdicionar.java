package br.com.caelum.ed.vetores;

import java.util.Arrays;

public class VetorAdicionar {
    private Aluno[] alunos = new Aluno[100];
    private int totalDeAlunos = 0;

    public void adiciona(Aluno aluno){
        this.alunos[totalDeAlunos] = aluno;
        totalDeAlunos++;
    }

    private boolean posisaoValida(int posisao){
        return posisao >= && posisao <= this.totalDeAlunos; 
    }
}
