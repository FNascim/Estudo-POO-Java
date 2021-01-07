package reporEstoque;

public class Produto {
    String nome;
    Integer quantidadeEstoque;

    Boolean repor()
    {
        if (quantidadeEstoque <10)
        {
            return true;
        }
        else {
            return false;
        }
    }
}
