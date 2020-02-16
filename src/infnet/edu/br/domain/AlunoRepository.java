package infnet.edu.br.domain;

import javax.swing.*;

public class AlunoRepository {
    Aluno aluno = new Aluno();

    public void CadastrarAluno() {

        String tmp;

        tmp = JOptionPane.showInputDialog(null,
                "Qual o nome do aluno?",
                "Cadastro de Alunos",
                JOptionPane.QUESTION_MESSAGE);
        aluno.setAluno(tmp);

        tmp = JOptionPane.showInputDialog(null,
                "Qual o RA do aluno?",
                "Registro do Aluno",
                JOptionPane.QUESTION_MESSAGE);
        aluno.setRegistroAluno(Integer.parseInt(tmp));

        tmp = JOptionPane.showInputDialog(null,
                "Qual a Nota 1 do aluno?",
                "Cadastro de Nota",
                JOptionPane.QUESTION_MESSAGE);
        aluno.setNotaAv1(Double.parseDouble(tmp));

        tmp = JOptionPane.showInputDialog(null,
                "Qual a Nota 2 do aluno?",
                "Cadastro de Nota",
                JOptionPane.QUESTION_MESSAGE);
        aluno.setNotaAv2(Double.parseDouble(tmp));

        calculaMedia();

        tmp = "Aluno: " + aluno.getAluno() + ", RA: " + aluno.getRegistroAluno() + "\n";
        tmp += "Nota 1: " + aluno.getNotaAv1() + "\n";
        tmp += "Nota 2: " + aluno.getNotaAv2() + "\n";
        tmp += "Média: " + aluno.getMedia() + "\n";
        tmp += "Você está " + aluno.getStatus();

        JOptionPane.showMessageDialog(null, tmp);
        System.exit(0);
    }

    public void ConsultaBoletim() {
    }

    public void ConsultaNotaTurma() {
    }

    public double calculaMedia() {
        aluno.media = (aluno.notaAv1 + aluno.notaAv2) / 2;

        if (aluno.media >= 7) {
            aluno.status = "Aprovado";
        } else if (aluno.media > 4 && aluno.media < 7) {
            aluno.status = "na Prova final";
        } else if (aluno.media < 4) {
            aluno.status = "Reprovado";
        }

        return aluno.media;
    }
}
