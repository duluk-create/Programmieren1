public class Pizza {
    String name;
    int durchmesser;
    double preis;

    public Pizza(String name, int durchmesser, double preis){
        this.name = name;
        this.durchmesser = durchmesser;
        this.preis = preis;
    }


    public static Pizza bestePizza(Pizza[] pizzas){
        double durchmesserPreis = 0;
        int index = 0;
        for (int i = 0; i < pizzas.length; i++) {
            double verhaeltnis = pizzas[i].getDurchmesser()/pizzas[i].getPreis();
            if(verhaeltnis > durchmesserPreis) {
                durchmesserPreis = verhaeltnis;
                index = i;
            }
        }
        return pizzas[index];
    }


    public double getPreis() {
        return preis;
    }

    public int getDurchmesser() {
        return durchmesser;
    }

    public String getName() {
        return name;
    }



}
