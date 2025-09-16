public class Cliente {
    private String nome, documento;

    public Cliente(String nome, String documento) {
        this.nome = nome;
        this.documento = documento;
    }

    //-------------GETTERS--------------
    public String getNome(){
        return nome;
    }

    public String getDocumento(){
        return documento;
    }
    //-------------SETTERS--------------

}
