package Latihan.Project;

public class Badminton {
    String player, gender;
    int power, speedPlayer;
    int speedKock = 0;
    int point = 0;
    Raket raket = new Raket();
    
    
    // Constructor tanpa parameter
    public Badminton() {}
    
    // Constructor dengan parameter
    public Badminton(String player, String gender, int power, int speedPlayer, String merk, int senar) {
        this.player = player;
        this.gender = gender;
        this.power = power;
        this.speedPlayer = speedPlayer;
        this.raket.merk = merk;
        this.raket.senar = senar;
    }
    
    // Behavior Menampilkan status player
    void statusPlayer() {
        System.out.println("========== PLAYER STATUS ==========");
        System.out.println("Name \t: " + getPlayer());
        System.out.println("Gender \t: " + getGender());
        System.out.println("Racket \t: " + raket.getMerk() + " (" + raket.getSenar() + " lbs)");
        System.out.println("Power \t: " + getPower());
        System.out.println("Speed \t: " + getSpeedPlayer());
    }
    
    // Behavior
    void startServe() {
        setSpeedKock(getSpeedKock() + 5);
        System.out.println(this.getPlayer() + " Melakukan servis!");
    }
    
    // Behavior
    void hitShuttlecock(Badminton penerima) {
        setSpeedKock(getSpeedKock() + this.getPower());

        if (getSpeedKock() > penerima.getSpeedPlayer()) {
            System.out.println(penerima.getPlayer() + " tidak bisa mengembalikan shuttlecock");
            score(this, penerima);
        } else {
            System.out.println(penerima.getPlayer() + " mengembalikan shuttlecock");
            setSpeedKock(getSpeedKock() - penerima.getPower());
        }
        
    }
    
    // Behavior
    void smashShuttlecock(Badminton penerima) {
        setSpeedKock(getSpeedKock() + (this.power * this.raket.senar));
        
        System.out.println(this.getPlayer() + " Melakukan smash!!");
        if (getSpeedKock() > penerima.getSpeedPlayer()) {
            System.out.println(penerima.getPlayer() + " tidak bisa mengembalikan shuttlecock");
            score(this, penerima);;
        } else {
            System.out.println(penerima.getPlayer() + " mengembalikan shuttlecock");
        }

    }

    // Behavior
    void score(Badminton player1, Badminton player2) {
        System.out.println("1 POINT for " + this.getPlayer());
        this.setPoint(getPoint() + 1);
        System.out.println(String.format("SCORE : %d - %d", player1.getPoint(), player2.getPoint()));
        setSpeedKock(0);
    }

    
    // Getter
    public String getPlayer() {
        return player;
    }
    public String getGender() {
        return gender;
    }
    public int getPower() {
        return power;
    }
    public int getSpeedPlayer() {
        return speedPlayer;
    }
    public int getSpeedKock() {
        return speedKock;
    }
    public Raket getRaket() {
        return raket;
    }
    public int getPoint() {
        return point;
    }
    
    // Setter
    public void setPlayer(String player) {
        this.player = player;
    }
    public void setGender(String gender) {
        this.gender = gender;
    }
    public void setPower(int power) {
        this.power = power;
    }
    public void setSpeedPlayer(int speedPlayer) {
        this.speedPlayer = speedPlayer;
    }
    public void setSpeedKock(int speedKock) {
        this.speedKock = speedKock;
    }
    public void setRaket(Raket raket) {
        this.raket = raket;
    }
    public void setPoint(int point) {
        this.point = point;
    }
}
