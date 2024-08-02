package data;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.Random;

    @AllArgsConstructor
    @Getter
    public enum Data {
        PHONE("0756778899"),
        COUNTRY("Romania"),
        POSTCODE("021569"),
        STATE("Bucuresti"),
        CITY("Bucuresti"),
        ADDRESS("Sos. Pantelimon nr. 91, sector 2"),
        COMPANY("Academia Programatorilor"),
        EXPECTED_SUCCESS_MESSAGE("Continue"),
        PASSWORD("1029384756A@"),
        EMAIL(generateEmail()),
        LAST_NAME("Onica"),
        FIRST_NAME("Andrei"),
        RANDOM_QUANTITY(generateQuantity()),
        BASE_URL("https://tutorialsninja.com/demo/"),
        CART_BUTTON_TEXT("0 item(s) - $0.00");

        private final String value;

        public static String generateEmail(){
            Random rnd = new Random();
            int number = rnd.nextInt(10000);
            return "andrei" + number + "@gmail.com";
        }

        public static String generateQuantity() {
            Random rnd = new Random();
            int quantity = rnd.nextInt(10) + 1;
            return Integer.toString(quantity);
        }
    }