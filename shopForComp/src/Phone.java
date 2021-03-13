public class Phone extends Computer{
    int cameraResolution;

    public  Phone(){
        this.cameraResolution = 1080;
    }
    public Phone(int cameraResolution) {
        this.cameraResolution = cameraResolution;
    }

    public Phone(int id ,String brand, double screenSize, int cameraResolution , int price) {
        super(id,price, brand, screenSize);
        this.cameraResolution = cameraResolution;
    }

    public int getCameraResolution() {
        return cameraResolution;
    }

    public void setCameraResolution(int cameraResolution) {
        this.cameraResolution = cameraResolution;
    }

    @Override
    public String toString() {
        return "Phone{ " + super.toString() +
                " cameraResolution=" + cameraResolution +
                '}';
    }
}
