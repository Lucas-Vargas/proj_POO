public class Endereco {
    private String rua,cidade,uf,cep;

    public Endereco(String rua,String cidade,String uf,String cep){
        this.rua = rua;
        this.cidade = cidade;
        this.uf = uf;
        this.cep = cep;
    }


    //--------GETTERS-----------
    public String getRua() {
        return rua;
    }

    public String getCidade() {
        return cidade;
    }

    public String getUf() {
        return uf;
    }

    public String getCep() {
        return cep;
    }

    //----------SETTERS----------------

}
