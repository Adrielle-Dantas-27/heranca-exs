public class App {

    public static void main(String[] args) {
        // if (args.length > 0 && "Adrielle".equals(args[0])) {
        //     System.out.println("Adrielle é linda");
        // } else {
        //     System.out.println("Seu feio!");
        // }
        // // System.out.println(args[0]);
        // // System.out.println(args[1]);

        Cachorro cachorro = new Cachorro();
        Leao leao = new Leao();
        Vaca vaca = new Vaca();
        // Galinha galinha = new Galinha();
        // Lagartixa lagartixa = new Lagartixa();
        
        cachorro.setCor("caramelo");
        cachorro.setQuantidadePatas(4);
        cachorro.setRaca("vira-lata");
        cachorro.setSexo("femea");
        cachorro.setTamanho("medio");

        System.out.println(cachorro.getCor());
        System.out.println(cachorro.getRaca());
        System.out.println(cachorro.getSexo());
        
        System.out.println("cachorro: ");
        cachorro.correr();

        System.out.println("leao: " );
        leao.correr();

        System.out.println("vaca: ");
        vaca.correr();



        
        
    }
}