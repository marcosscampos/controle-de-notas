package infnet.edu.br;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {
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
                CadastrarNotas();
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

    public static void CadastrarNotas() {
        String cadastraAluno = JOptionPane.showInputDialog(null,
                "Digite o nome do aluno:",
                "Cadastrar Aluno",
                JOptionPane.QUESTION_MESSAGE);
        System.out.println(cadastraAluno);

        double notaAv1 = Double.parseDouble(JOptionPane.showInputDialog(null,
                "Digite a nota do AV1:",
                "Cadastrar nota do aluno",
                JOptionPane.QUESTION_MESSAGE));
        System.out.println(notaAv1);

        double notaAv2 = Double.parseDouble(JOptionPane.showInputDialog(null,
                "Digite a nota do AV2:",
                "Cadastrar nota do aluno",
                JOptionPane.QUESTION_MESSAGE));
        System.out.println(notaAv2);
    }

    public static void ConsultaBoletim() {

    }

    public static void ConsultaNotaTurma() {

    }
}
