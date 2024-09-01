public class Aves extends Animal {
    private String tamanhoBico;
    private boolean voar;

    public void voar() {
        if(voar == true) {
            System.out.println("este animal pode voar");
        } else {
            System.out.println("este animal nao pode voar :')");
        }

    }

    public void bicar() {
        System.out.println("esse animal está bicando");
    }

    @Override
    public void comer() {
        System.out.println("esse animal está comendo com o bico");
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

    public String getTamanhoBico() {
        return tamanhoBico;
    }

    public boolean getVoar() {
        return voar;
    }

    public void setTamanhoBico(String tamanhoBico) {
        this.tamanhoBico = tamanhoBico;
    }

    public void setVoar(boolean voar) {
        this.voar = voar;
    }

    
}
