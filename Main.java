public class Main {
    public static void main(String[] args) {
        elevador meuElevador = new elevador(5);
        meuElevador.mostrarAndar();
        meuElevador.abrirPorta();
        meuElevador.subir();
        meuElevador.fecharPorta();
        meuElevador.subir();
        meuElevador.subir();
        meuElevador.subir();
        meuElevador.subir();
        meuElevador.subir();
        meuElevador.subir();
        meuElevador.mostrarAndar();
        meuElevador.statusPorta();
        meuElevador.descer();
        meuElevador.descer();
        meuElevador.descer();
        meuElevador.descer();
        meuElevador.descer();
    }
}