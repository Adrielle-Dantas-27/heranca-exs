public abstract class Animal {
    private String tipo;
    private String cor;
    private String raca;
    private String tamanho;

    //metodos 
    public abstract void comer(); //metodo abstrato que obriga todas as classses filhas a implementarem o metodo comer 

    public abstract void cacar();

    public abstract void beber();

    public abstract void reproduzir();

    //getters
    public String getCor() {
        return cor;
    }

    public String getRaca() {
        return raca;

    }

    public String getTamanho() {
        return tamanho;

    }
    public String getTipo() {
        return tipo;
    }

    //setters
    public void setCor(String cor) {
        this.cor = cor;

    }

    public void setRaca(String raca) {
        this.raca = raca;

    }

    public void setTamanho(String tamanho) {
        this.tamanho = tamanho;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }



    
}
