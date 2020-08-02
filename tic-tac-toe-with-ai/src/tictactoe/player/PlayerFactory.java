package tictactoe.player;

public class PlayerFactory {
    public static Player makePlayer (String p) {
        switch (p) {
            case "user":
                return new User();
            case "easy":
                return new Easy();
            case "medium":
                return new Medium();
            case "hard":
                return new Hard();
            default:
                return null;
        }
    }
}