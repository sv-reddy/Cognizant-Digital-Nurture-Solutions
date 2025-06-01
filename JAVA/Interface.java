interface Playable {
    void play();
}

class Game implements Playable {
    @Override
    public void play() {
        System.out.println("Playing the game...");
    }
}

public class Interface {
    public static void main(String[] args) {
        Playable g = new Game(); 
        g.play(); 
    }
}
