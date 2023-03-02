public class Eletronicos extends Produtos {
    private String marca;
    private String modelo;

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public Eletronicos(String marca, String modelo, String nome, double preco) {
        this.marca = marca;
        this.modelo = modelo;
    }

    public String puxaEletronico() {
        return ("eletronico: " + nome + "marca: " + marca + "modelo: " + "preço" + preco);
    }

}
