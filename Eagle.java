public class Eagle extends Bird implements Fly {

    private boolean flying;
    private int altitude;

    public Eagle(String name) {
        super(name);
        this.flying = false;
        this.altitude = 0;
    }

    public int getAltitude() {
        return altitude;
    }

    public boolean isFlying() {
        return flying;
    }

    @Override
    public String sing() {
        return "Screech!";
    }

    @Override
    public void takeOff() {
        System.out.println(this.getName() + " takes off in the sky.");
    }

    @Override
    public void ascend(int increment) {
        System.out.println(this.getName() + " flies upward, altitude: " + (this.altitude += increment));
    }
    @Override
    public void glide() {
        System.out.println("glides into the air.");
    }
    @Override
    public void descend(int decrement) {
        System.out.println(this.getName() + " downward, altitude: " + (this.altitude -= decrement));
    }
    @Override
    public void land() {
        System.out.println(this.getName() + (this.getAltitude() > 1 ? " is too high, it can't land." : "lands on the ground."));
    }
}
