import java.util.Scanner;

public class VoiceController {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Say a command:");

        String command = scanner.nextLine().toLowerCase();

        switch (command) {
            case "play":
                System.out.println("Playing...");
                break;
            case "pause":
                System.out.println("Pausing...");
                break;
            case "stop":
                System.out.println("Stopping...");
                break;
            default:
                System.out.println("Command not recognized.");
                break;
        }
    }
}
