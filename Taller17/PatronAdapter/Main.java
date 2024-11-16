public class Main {
    public static void main(String[] args) {
        ImpresoraLaser impresoraLaser = new ImpresoraLaser();
        ImpresoraInkJet impresoraInkJet = new ImpresoraInkJet();

        Impresora adapterLaser = new ImpresoraLaserAdapter(impresoraLaser);
        Impresora adapterInkJet = new ImpresoraInkJetAdapter(impresoraInkJet);

        adapterLaser.imprimir();
        adapterInkJet.imprimir();
    }
}
