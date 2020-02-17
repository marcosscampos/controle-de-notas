package infnet.edu.br.domain;

import javax.swing.*;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.IntStream;

public class AlunoRepository {
    Aluno [] turma = new Aluno[100];
    String tmp;

    public void CadastrarAluno() {

        do {
            Aluno aluno = new Aluno();
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

            for(int i = 0; i < turma.length; i++) {
                if (turma[i] == null) {
                    turma[i] = aluno;
                    break;
                }
                System.out.println(turma[i]);
            }

            tmp = JOptionPane.showInputDialog(null,
                    "Inserir novo aluno? (S/N)",
                    "Cadastro de Alunos",
                    JOptionPane.QUESTION_MESSAGE);

        } while (tmp.toLowerCase().equals("s"));


        MenuPrincipal();
        System.exit(0);
    }

    public void ConsultaBoletim() {

        do {
            Aluno aluno = new Aluno();

            tmp = JOptionPane.showInputDialog(null,
                    "Digite o RA do aluno:",
                    "Consulta Boletim",
                    JOptionPane.INFORMATION_MESSAGE);

            tmp = "Aluno: " + aluno.getAluno() + ", RA: " + aluno.getRegistroAluno() + "\n\n";
            tmp += "Nota 1: " + aluno.getNotaAv1() + "\n";
            tmp += "Nota 2: " + aluno.getNotaAv2() + "\n";
            tmp += "Média: " + aluno.getMedia() + "\n\n";
            tmp += "Você está " + aluno.getStatus();

            JOptionPane.showMessageDialog(null,
                    tmp,
                    "Resultado",
                    JOptionPane.INFORMATION_MESSAGE);

            JOptionPane.showInputDialog(null,
                    "Deseja consultar outro aluno? (S/N)",
                    "Consulta de aluno",
                    JOptionPane.INFORMATION_MESSAGE);

            IntStream.range(0, turma.length).findFirst().ifPresent(i -> turma[i] = aluno);

        } while (tmp.toLowerCase().equals("s"));

        MenuPrincipal();
        System.exit(0);

    }

    public void ConsultaNotaTurma() {
        System.out.println("Em implementação");
    }

    public double calculaMedia() {
        Aluno aluno = new Aluno();
        aluno.media = (aluno.notaAv1 + aluno.notaAv2) / 2;

        if (aluno.media >= 7) {
            aluno.status = "Aprovado.";
        } else if (aluno.media > 4 && aluno.media < 7) {
            aluno.status = "na Prova final.";
        } else if (aluno.media < 4) {
            aluno.status = "Reprovado.";
        }
        return aluno.media;
    }

    public void MenuPrincipal() {
        String[] opcoes = {
                "[1] Registrar as notas de um novo aluno.",
                "[2] Consultar boletim de um aluno.",
                "[3] Consultar notas da turma.",
                "[4] Sair."};

        JOptionPane.showMessageDialog(null,
                "Bem vindo ao Controle de Notas!",
                "Controle de notas",
                JOptionPane.INFORMATION_MESSAGE);

        String selecionarOpcao = (String) JOptionPane.showInputDialog(null,
                "Selecione o que deseja e depois clique em OK.",
                "Opções",
                JOptionPane.QUESTION_MESSAGE, null,
                opcoes, opcoes[0]);

        String opcaoSelecionada = selecionarOpcao.substring(0, 3);

        switch (opcaoSelecionada) {
            case "[1]": {
                CadastrarAluno();
                break;
            }
            case "[2]": {
                ConsultaBoletim();
                break;
            }
            case "[3]": {
                ConsultaNotaTurma();
                break;
            }
            case "[4]": {
                JOptionPane.showMessageDialog(null,
                        "Até logo!",
                        "Controle de Notas",
                        JOptionPane.INFORMATION_MESSAGE);
                break;
            }
            default: {
                JOptionPane.showMessageDialog(null,
                        "Operação inválida",
                        "Erro",
                        JOptionPane.WARNING_MESSAGE);
            }
        }
    }
}
