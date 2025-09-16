public class Consulta {
    private String descricao;
    private float precoBase;
    private boolean emergencial;

    public Consulta(String descricao, float precoBase, boolean emergencial) {
        this.descricao = descricao;
        this.precoBase = precoBase;
        this.emergencial = emergencial;
    }
}
