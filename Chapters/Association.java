package Chapters;
// Association (has a) -- Composition and Aggregation -- Relationship in Java 
// Composition -- Car has a strong relationship with Engine. The Engine object is created within the Car Class. 
// Aggregation -- Car has a weak relationship with MusicPlayer. The MusicPlayer object is passed to the Car class. 

class Engine{          // Composition Example
    void start() {
        System.out.println("Engine started");
    }

    void stop() {
        System.out.println("Engine stopped");
    }
}

class  MusicPlayer {  // Aggregation example
      void playMusic() {
        System.out.println("Playing music");
      }
    
      void stopMusic() {
        System.out.println("Music stopped");
      }
}

// Car class demonstrating both composition and aggregation

class Car {
    private Engine engine;
    private MusicPlayer musicPlayer;

    Car(MusicPlayer musicPlayer) {
        this.engine = new Engine();                 // Engine is created when Car is created
        this.musicPlayer = musicPlayer;       // Musicplayer is passed to Car
    }

    void drive() {
        engine.start();
        System.out.println("Car is driving");
        musicPlayer.playMusic();
    }

    void park() {
        System.out.println("Car is parked");
        engine.stop();
        musicPlayer.stopMusic();
    }
}

public class Association {
    public static void main(String[] args){
        MusicPlayer musicPlayer = new MusicPlayer();
        Car car = new Car(musicPlayer);
        car.drive();
        car.park();
    }

}
