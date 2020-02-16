package infnet.edu.br.console;

import javax.swing.*;
import infnet.edu.br.domain.AlunoRepository;

public class Main {

    public static void main(String[] args) {
        AlunoRepository repository = new AlunoRepository();

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
                repository.CadastrarAluno();
                break;
            }
            case "[2]": {
                repository.ConsultaBoletim();
                break;
            }
            case "[3]": {
                repository.ConsultaNotaTurma();
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
