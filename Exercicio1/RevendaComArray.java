

public class RevendaComArray{
    private Produto[] produtos;
    private int indice = 0;

    RevendaComArray(int qtd_produtos){
        this.produtos = new Produto[qtd_produtos];
    }

    public void inserirProduto(Produto new_produto){
        if(indice < produtos.length){
            produtos[indice] = new_produto;
            indice++;
        }else{
            System.out.println("Nao a espaco no array");
        }

        return;
    }

    public boolean comprar(int cod, int qtd){
        for(Produto produto : this.produtos){
            if(produto.getCodigo() == cod){
                produto.compra(qtd);
                return true;
            }
        }
        
        System.out.println("Produto nao existe no array");
        return false;
    }

    public boolean venda(int cod, int qtd){
        for(Produto produto : this.produtos){
            if(produto.getCodigo() == cod){
                produto.venda(qtd);
                return true;
            }
        }
        
        System.out.println("Produto nao existe no array");
        return false;
    }

    public boolean consultaPrecoVenda(int cod){
        for(Produto produto : this.produtos){
            if(produto.getCodigo() == cod){
                System.out.println(produto.calculaPrecoVenda());
                return true;
            }
        }
        
        System.out.println("Produto nao existe no array");
        return false;
    }

    public void listaPrecos(){
        for(Produto produto : this.produtos){
            System.out.println("-----------||----------");
            System.out.println("Codigo: " + produto.getCodigo());
            System.out.println("Descricao: " + produto.getDescricao());
            System.out.println("Valor de venda: " + produto.calculaPrecoVenda());
            System.out.println("-----------||----------");

            return;
        }
    }

    public void consultaProduto(int codigo){
        for(Produto produto : this.produtos){
            if(produto.getCodigo() == codigo){
                System.out.println("Valor de compra: " + produto.getValor());
                System.out.println("Custo: " + produto.getCusto());
                System.out.println("Margem de lucro: " + produto.getMargem_lucro());

                return;
            }
        }

        System.out.println("Nao ha produto com o codigo passado");
    }

    public void setValor(int codigo, double valor){
        for(Produto produto : this.produtos){
            if(produto.getCodigo() == codigo){
                produto.setValor(valor);
                System.out.println("Valor do produto alterado para " + valor);
                return;
            }
        }
    }

    public void setCusto(int codigo, double custo){
        for(Produto produto : this.produtos){
            if(produto.getCodigo() == codigo){
                produto.setCusto(custo);
                System.out.println("Custo do produto alterado para " + custo);
                return;
            }
        }
    }

    public void setMargem(int codigo, double margem){
        for(Produto produto : this.produtos){
            if(produto.getCodigo() == codigo){
                produto.setMargem_lucro(margem);
                System.out.println("Margem do produto alterado para " + margem);
                return;
            }
        }
    }

}
