class produto {
    private int codigo;
    private int qtd_estoque;
    private String descricao;
    private double valor;
    private double custo;
    private double margem_lucro;

    // Construtores
    public produto(int codigo, String descricao){
        this.codigo = codigo;
        this.descricao = descricao;
    }

    public produto(int codigo, String descricao, double valor, double custo, double margem_lucro){
        this.codigo = codigo;
        this.descricao = descricao;
        this.valor = valor;
        this.custo = custo;
        this.margem_lucro = margem_lucro;
    }

    public produto(int codigo, String descricao, double valor, double custo, double margem_lucro, int qtd_estoque){
        this.codigo = codigo;
        this.descricao = descricao;
        this.valor = valor;
        this.custo = custo;
        this.margem_lucro = margem_lucro;
        this.qtd_estoque = qtd_estoque;
    }

    // Setando valores 
    public void setValor(double valor){
        this.valor = valor;
    }

    public void setCusto(double custo){
        this.custo = custo;
    }

    public void setMargem_lucro(double margem_lucro){
        this.margem_lucro = margem_lucro;
    }

    // Enviando valores para fora da classe
    public double getValor(){
        return valor;
    }

    public double getCusto(){
        return custo;
    }

    public double getMargem_lucro(){
        return margem_lucro;
    }

    // Metodos da classe
    void compra(int quant){
        qtd_estoque = qtd_estoque + quant;
    }

    void venda(int quant){
        qtd_estoque = qtd_estoque - quant;
    }

    double calculaPrecoVenda(){
        return valor + custo + margem_lucro * (valor + custo);
    }
}