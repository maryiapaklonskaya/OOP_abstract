public class Office {

    public static void main(String[] args) {
        Heating heating = new Heating();
        CoffeeMachine coffeeMachine = new CoffeeMachine();
        Toilet wcGirls = new Toilet();

        heating.setTemperature(32, "kawasaki");
        coffeeMachine.setStatus("on");
        wcGirls.setAvailability(false);

        Office office = new Office();
        office.OfficeSet(heating, coffeeMachine, wcGirls);

        office.officeCheck();
    }
    /*
        Create a base class called Office and use composition
        to give your office some features like
        heating, coffee machine, and etc.
     */
        private Heating heating;
        private CoffeeMachine coffeeMachine;
        private Toilet availability;


        public void OfficeSet(Heating heating, CoffeeMachine coffeeMachine, Toilet wcGirls) {
            this.heating = heating;
            this.coffeeMachine = coffeeMachine;
            this.availability = wcGirls;
        }

        public void officeCheck() {
            if(heating.temperature == 22) {
                System.out.println("Heating is set for: " + heating.temperature + " Celsius\nand name is: " + heating.name);
            } else {
                System.out.println("Heating is not perfect and is : " + heating.temperature + " Celsius\nand name is: " + heating.name);
            }
            System.out.println("Coffee machine is currently: " + coffeeMachine.state);
            System.out.println("WC is currently: " + availability.availability);


        }

}

class Heating {
    int temperature;
    String name;

    public void setTemperature(int temperature, String name) {
        this.temperature = temperature;
        this.name = name;
    }
}

class CoffeeMachine {
    String state;

    public void setStatus(String state) {
        this.state = state;
    }

}

class Toilet {
    boolean availability;

    public void setAvailability(boolean b) {
        this.availability = b;
    }
}


