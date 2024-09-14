//Enum Class
enum Signal {
    red, green, yellow;
}

class Traffic {
    public static void main(String[] args) {

        // Enum Value
        Signal signal = Signal.red;
        // Signal signal = Signal.yellow;
        // Signal signal = Signal.green;

        if (signal == signal.red) {
            System.out.println("Stop!");
        } else if (signal == signal.yellow) {
            System.out.println("Slow Down! Watch and Go.");
        } else {
            System.out.println("Go");
        }
    }
}