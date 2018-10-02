package entity;

public class tarefas {

    private long idtarefa;
    private String nametarefa;
    private String textotarefa;
    private long dono;


    public long getIdtarefa() {
        return idtarefa;
    }

    public void setIdtarefa(long idtarefa) {
        this.idtarefa = idtarefa;
    }

    public String getNametarefa() {
        return nametarefa;
    }

    public void setNametarefa (String nametarefa) {
        this.nametarefa = nametarefa;
    }

    public String getTextotarefa() {
        return textotarefa;
    }

    public void setTextotarefa (String textotarefa) {
        this.textotarefa = textotarefa;
    }

    public void setDono(long dono) {
        this.dono = dono;
    }

    public long getDono() {
        return dono;
    }

}
