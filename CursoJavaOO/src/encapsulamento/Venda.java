package encapsulamento;

public class Venda {
    public static void main(String[] args) {
        Pedido pedido = new Pedido();
        pedido.setCodigo(1);
        pedido.setSubTotal(20.5);
        pedido.setDesconto(2.05);
        //pedido.setTotal(18.45);

        System.out.println("Codigo do produto: " + pedido.getCodigo());
        System.out.println("Subtotal: " + pedido.getSubTotal());
        System.out.println("Desconto: " + pedido.getDesconto());
        System.out.println("total: " + pedido.getTotal());
    }
}
