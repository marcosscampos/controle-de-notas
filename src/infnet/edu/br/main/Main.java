package infnet.edu.br.main;

import infnet.edu.br.domain.AlunoRepository;

public class Main {

    public static void main(String[] args) {
        AlunoRepository repository = new AlunoRepository();
        repository.MenuPrincipal();
    }
}
