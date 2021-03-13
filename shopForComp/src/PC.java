public class PC extends Computer{
    int Gpu;

    public PC(){
        Gpu = 1060 ;
    }
    public PC(int gpu) {
        Gpu = gpu;
    }

    public PC(int id ,int price, String brand, double screenSize, int gpu) {
        super(id ,price, brand, screenSize);
        Gpu = gpu;
    }

    public int getGpu() {
        return Gpu;
    }

    public void setGpu(int gpu) {
        Gpu = gpu;
    }

    @Override
    public String toString() {
        return "PC{" +super.toString()+
                " Gpu=" + Gpu +
                '}';
    }
}
