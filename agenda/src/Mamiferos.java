public class Mamiferos extends Animal{
    private String sexo;
    private int quantidadePatas;

    
    public void correr() {
        System.out.println("esse animal está correndo de forma normal");

    }

    public void morder() {
        System.out.println("esse animal está mordendo");

    }
    
    public void lamber() {
        System.out.println("este animal está lambendo");

    }

    @Override
    public void comer() {
        System.out.println("esse animal está comendo");
    }

    @Override
    public void cacar() {
        System.out.println("esse animal está caçando");
    }

    @Override
    public void beber() {
        System.out.println("esse animal está bebendo água");
    }

    @Override
    public void reproduzir() {
        System.out.println("esse animal está no meio do coito, nao perturbe");
    }

    //getters
    public String getSexo() {
        return sexo;
    }

    public int getQuantidadePatas() {
        return quantidadePatas;
    }

    //setters
    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
    
    public void setQuantidadePatas(int quantidadePatas) {
        this.quantidadePatas = quantidadePatas;
    }

    


}
