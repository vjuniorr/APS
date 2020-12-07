import java.util.Scanner;
public class main {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int codigo;
        int qtd_estoque;
        String descricao;
        double valor;
        double custo;
        double margem_lucro;

        System.out.println("Informe a quantidade de produtos para a revenda: ");
        int qtd = in.nextInt();

        RevendaComArray reArray = new RevendaComArray(qtd);

        int op = 0;
        while(op != 7){
            System.out.println("---------------||---------------");
            System.out.println("1 - Criar produto");
            System.out.println("2 - Comprar");
            System.out.println("3 - Venda");
            System.out.println("4 - Consultar preco");
            System.out.println("5 - Lista de precos");
            System.out.println("6 - Consultar e alterar produtos");
            System.out.println("7 - Sair");
            System.out.println("---------------||---------------");

            System.out.println("O que deseja fazer: ");
            op = in.nextInt();

            if(op == 1){
                System.out.println("Digite os dados do produto: ");
                System.out.println("Codigo: ");
                codigo = in.nextInt();
                System.out.println("Descricao: ");
                descricao = in.next();
                System.out.println("Valor da compra: ");
                valor = in.nextDouble();
                System.out.println("Custo: ");
                custo = in.nextDouble();
                System.out.println("Margem de lucro: ");
                margem_lucro = in.nextDouble();
                System.out.println("Quantidade no estoque: ");
                qtd_estoque = in.nextInt();

                Produto produto = new Produto(codigo, descricao, valor, custo, margem_lucro, qtd_estoque);
                reArray.inserirProduto(produto);

                System.out.println("Produto criado com sucesso");
            }else if(op == 2){
                System.out.println("Digite os dados da compra do produto");
                System.out.println("Codigo: ");
                codigo = in.nextInt();
                System.out.println("Quantidade comprada: ");
                qtd_estoque = in.nextInt();

                reArray.comprar(codigo, qtd_estoque);
            }else if(op == 3){
                System.out.println("Digite os dados da venda do produto");
                System.out.println("Codigo: ");
                codigo = in.nextInt();
                System.out.println("Quantidade vendida: ");
                qtd_estoque = in.nextInt();

                reArray.venda(codigo, qtd_estoque);
            }else if(op == 4){
                System.out.println("Digite o codigo do produto: ");
                codigo = in.nextInt();

                reArray.consultaPrecoVenda(codigo);
            }else if(op == 5){
                reArray.listaPrecos();
            }else if(op == 6){
                System.out.println("Digite o codigo do produto: ");
                codigo = in.nextInt();

                reArray.consultaProduto(codigo);
                
                System.out.println("Deseja alterar algum dado?");
                System.out.println("1 - Sim");
                System.out.println("2 - Nao");
                int op2 = in.nextInt();

                if(op2 == 1){
                    System.out.println("O que deseja alterar?");
                    System.out.println("1 - Valor de compra");
                    System.out.println("2 - Custo");
                    System.out.println("3 - Margem de lucro");
                    int op3 = in.nextInt();

                    if(op3 == 1){
                        System.out.println("Digite o novo valor de compra: ");
                        valor = in.nextDouble();

                        reArray.setValor(codigo, valor);
                    }else if(op3 == 2){
                        System.out.println("Digite o novo custo: ");
                        custo = in.nextDouble();

                        reArray.setCusto(codigo, custo);
                    }else if(op3 == 3){
                        System.out.println("Digite a nova margem de lucro: ");
                        margem_lucro = in.nextDouble();

                        reArray.setMargem(codigo, margem_lucro);
                    }
                }
            }
        }

        in.close();
        return;
    }
}
