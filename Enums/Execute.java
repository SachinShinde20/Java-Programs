enum Process {
    STARTED, ACEEPTED, RUNNING, COMPLETED, WAITTING;
}

public class Execute {
    public static void main(String[] args) {

        Process process = Process.STARTED;
        // Process process = Process.ACEEPTED;
        // Process process = Process.RUNNING;
        // Process process = Process.COMPLETED;
        // Process process = Process.WAITTING;

        switch (process) { // Use the variable weekDay here (Object Referance)
            case STARTED:
                System.out.println("Process is Stared");
                break;
            case ACEEPTED:
                System.out.println("Process is Accepted");
                break;
            case RUNNING:
                System.out.println("Process is Running");
                break;
            case COMPLETED:
                System.out.println("Process is Completed");
                break;
            default:
                System.out.println("Process is in Watting");
                break;
        }
    }
}
