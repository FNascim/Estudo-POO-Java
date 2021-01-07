package reporEstoque;

public class VerificaEstoque {
    public static void main(String[] args) {
        Produto produto = new Produto();
        produto.nome = "Bolacha";
        produto.quantidadeEstoque = 5;

        System.out.println(produto.repor());
    }

}
