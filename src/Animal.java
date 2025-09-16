abstract class Animal {
    private String nome,raca;
    private int idade;

    public enum porteGeral{
        PEQUENO, MEDIO, GRANDE;
    }
    private porteGeral porte;

    public String getNome(){
        return nome;
    }

    public String getRaca(){
        return  raca;
    }

    public int getIdade(){
        return idade;
    }

    public porteGeral getPorte(){
        return porte;
    }


}

