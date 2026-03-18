public class elevador {
    private int andarAtual;
    private int totalAndares;
    private boolean portaAberta;

    public elevador(int totalAndares) {
        this.andarAtual = 0;
        this.totalAndares = totalAndares;
        this.portaAberta = false;
    }

    public void subir() {
        if (portaAberta) {
            System.out.println("A porta está aberta! Feche para subir");
        } else if (andarAtual < totalAndares) {
            andarAtual++;
            System.out.println("Subindo... Andar atual: " + andarAtual);
        } else {
            System.out.println("Você já está no último andar, andar:" + totalAndares);
        }
    }

    public void descer() {
        if (portaAberta) {
            System.out.println("A porta está aberta! Feche para descer");
        } else if (andarAtual > 0) {
            andarAtual--;
            System.out.println("Descendo... Andar atual: " + andarAtual);
        } else {
            System.out.println("O elevador já está no térreo, andar:" + andarAtual);
        }
    }

    public void abrirPorta() {
        this.portaAberta = true;
        System.out.println("Porta aberta");
    }

    public void fecharPorta() {
        this.portaAberta = false;
        System.out.println("Porta fechada");
    }

    public void statusPorta() {
        System.out.println("Status da porta: " + (portaAberta ? "Aberta" : "Fechada"));
    }

    public void mostrarAndar() {
        System.out.println("Painel: Andar " + andarAtual);
    }
}