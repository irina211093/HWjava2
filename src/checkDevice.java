public class checkDevice {
    public static void main(String[] args) {
        double temp1 = 105.5;
        double temp2 = 95.0;

        boolean isDeviceWorking = checkDevice(temp1, temp2);
        System.out.println("Is the device working correctly? " + isDeviceWorking);
    }

    public static boolean checkDevice(double temperature1, double temperature2) {
        return (temperature1 > 100 && temperature2 < 100);
    }
}


