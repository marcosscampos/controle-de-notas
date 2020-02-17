package infnet.edu.br.domain;

public class Aluno {

    protected String aluno;
    protected double notaAv1, notaAv2;
    protected double media;
    protected int registroAluno;
    protected String status;


    public void setRegistroAluno(int registro) {
        this.registroAluno = registro;
    }

    public int getRegistroAluno() {
        return registroAluno;
    }

    public String getAluno() {
        return aluno;
    }

    public void setAluno(String aluno) {
        this.aluno = aluno;
    }

    public double getNotaAv1() {
        return notaAv1;
    }

    public void setNotaAv1(double notaAv1) {
        this.notaAv1 = notaAv1;
    }

    public double getNotaAv2() {
        return notaAv2;
    }

    public void setNotaAv2(double notaAv2) {
        this.notaAv2 = notaAv2;
    }

    public double getMedia() {
        return media;
    }

    public void setMedia(double media) {
        this.media = media;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
