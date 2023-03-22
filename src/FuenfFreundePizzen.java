public class FuenfFreundePizzen {

    public static void main(String[] args) {
        Pizza[] pizzas = {
                new Pizza("Pizza Salami", 30, 7.50),
                new Pizza("Pizza Funghi", 28, 8.50),
                new Pizza("Pizza Taleggio", 32, 16.95),
                new Pizza("Pizza Tonno", 28, 10.50),
                new Pizza("Pizza Hawaii", 20, 7.80)};

        Pizza bestePizza = Pizza.bestePizza(pizzas);

        System.out.println("Die Pizza mit dem besten Preisleistungsverhältnis ist: " + bestePizza.getName() + "!");
    }

}
