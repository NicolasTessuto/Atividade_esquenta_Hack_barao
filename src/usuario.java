public class usuario {

    private String nome;
    private String email;
    private String cpf; //utilizamos como string para evitar erros de leitura, pontos ou traços
    private String senha;
    private String telefone; //utilizamos como string para evitar erros de leitura, como por exemplo se o usuaário digitar - ou ()


    public usuario(String nome, String email, String cpf, String senha, String telefone) {
        this.nome = nome;
        this.email = email;
        this.cpf = cpf;
        this.senha = senha;
        this.telefone = telefone;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }










}
