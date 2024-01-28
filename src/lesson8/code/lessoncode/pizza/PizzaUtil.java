package lesson8.code.lessoncode.pizza;

    import lesson8.code.lessoncode.pizza.Pizza;
    import lesson6.code.lessoncode.scanner.UserInput;

    public class PizzaUtil {

        public Pizza createPizza(){
            UserInput ui = new UserInput();

            int diameterPizza = ui.inputInteger("Please enter first pizza diameter: ");

            int caloriesInOneCm = ui.inputInteger("Please enter 1 cm pizza calories: ");

            Pizza myNewPizza = new Pizza(diameterPizza, caloriesInOneCm);

            return myNewPizza;
        }


}
