public class AutoFabrik {
    private int produzierteWagen = 0;

    public void produziere(String marke, int hubraum, String farbe, boolean checkHeftGepflegt, boolean schaeden){
        Auto neuAuto = new Auto(marke, hubraum, farbe, checkHeftGepflegt, schaeden);
        produzierteWagen++;
        neuAuto.gebeWerteAus();
    }
}
