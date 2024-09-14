// Enum Class
enum Signal {
    RED, GREEN, YELLOW;
}

class Traffic {
    public static void main(String[] args) {

        // Enum Value
        Signal signal = Signal.RED;
        // Signal signal = Signal.YELLOW;
        // Signal signal = Signal.GREEN;

        if (signal == Signal.RED) {
            System.out.println("Stop!");
        } else if (signal == Signal.YELLOW) {
            System.out.println("Slow Down! Watch and Go.");
        } else {
            System.out.println("Go");
        }
    }
}
