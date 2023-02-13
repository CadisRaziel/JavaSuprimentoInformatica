package SuprimentoInformatica;

public class Invoice {

    private int codigoItem;
    private String descricao;
    private int quantidade;
    private float precoUnitario;

    public Invoice(int codigoItem, String descricao, int quantidade, float precoUnitario) {
        this.setCodigoItem(codigoItem);
        this.setDescricao(descricao);
        this.setPrecoUnitario(precoUnitario);
        this.setQuantidade(quantidade);

        //estao em validacoes nos seus SET
        //this.quantidade = quantidade;;
        //this.precoUnitario = precoUnitario;
    }

    public double getVoiceAmount() {
        return quantidade * precoUnitario;
    }

    public int getCodigoItem() {
        return codigoItem;
    }

    public void setCodigoItem(int codigoItem) {
        this.codigoItem = codigoItem;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getQuantidade() {
        if (quantidade < 0) {
            this.quantidade = quantidade;
        } else {
            this.quantidade = 0;
        }
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        //validações
        if (quantidade < 0) {
            this.quantidade = 0;
        } else {
            this.quantidade = quantidade;
        }
           }

    public float getPrecoUnitario() {
        return precoUnitario;
    }

    public void setPrecoUnitario(float precoUnitario) {
        //validações
        if (precoUnitario < 0) {
            this.precoUnitario = precoUnitario;
        } else {
            this.precoUnitario = 0.0f;
        }
        
    }

}
