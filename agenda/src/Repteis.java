public class Repteis extends Animal{
    private int quantidadePatas;
    private boolean soltarRabo;

    public void ratejar() {
        System.out.println("esse animal está rastejando");
    }
    
    public void soltarRabo() {
        if (soltarRabo == true) {
            System.out.println("esse animal tem capacidade de soltar o rabo para se safar de um predador");
        } else {
            System.out.println("esse animal nao tem capacidade de soltar o rabo");
        }
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

    public int getQuantidadePatas() {
        return quantidadePatas;
    }

    public boolean getSoltarrabo() {
        return soltarRabo;
    }

    public void setQuantidadePatas(int quantidadePatas) {
        this.quantidadePatas = quantidadePatas;
    }

    public void setSoltarRabo(boolean soltarRabo) {
        this.soltarRabo = soltarRabo;
    }
}
