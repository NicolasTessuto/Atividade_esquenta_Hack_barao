public class chamado {

    private int codChamado;
    private String local;
    private String descricao;
    private String foto; //Usamos string ja que a foto esta associada a um Banco de dados e utilizariamos a
    //url para puxar a foto para a tela do usuário.


    public chamado(int codChamado, String local, String descricao) {
    }

    public chamado() {

    }

    public int getCodChamado() {
        return codChamado;
    }

    public void setCodChamado(int codChamado) {
        this.codChamado = codChamado;
    }

    public String getLocal() {
        return local;
    }

    public void setLocal(String local) {
        this.local = local;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getFoto() {
        return foto;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }
}
