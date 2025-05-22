public class Smartphone{
    private String brand;
    private String model;
    private Battery battery;
    private Display display;
    private Processor processor;
    private boolean isDisplayOn = false;

    public Smartphone(String brand, String model, Battery battery, Display display, Processor processor){
        this.brand = brand;
        this.model = model;
        this.battery = battery;
        this.display = display;
        this.processor = processor;
    }

    public Smartphone(String brand, String model, int batteryCapacity, double displaySize, String resolution, String processorModel, double processorSpeed){
        this.brand = brand;
        this.model = model;
        this.battery = new Battery(batteryCapacity);
        this.display = new Display(displaySize, resolution);
        this.processor = new Processor(processorModel, processorSpeed);
    }

    public String powerOn(){
        if(this.battery.isCharged()){
            this.display.turnOn();
            this.isDisplayOn = true;
            return "Powering on " + this.brand + " " + this.model;
        }else{
            return "Cannot power on: Battery depleted";
        }
    }

    public String powerOff(){
        this.display.turnOff();
        this.isDisplayOn = false;
        return "Powering off " + this.brand + " " + this.model;
    }

    public void chargeBattery(){
        this.battery.charge();
    }

    public String runApp(String appName){
        if(this.isDisplayOn){
            this.processor.processTask(appName);
            return appName + " running.";
        }else{
            return "Phone is off. Cannot run " + appName;
        }
    }

    public void upgradeComponent(Battery newBattery){
        this.battery = newBattery;
    }

    public void upgradeComponent(Display newDisplay){
        this.display = newDisplay;
    }

    public void upgradeComponent(Processor newProcessor){
        this.processor = newProcessor;
    }

    @Override
    public String toString(){
        return this.brand + " " + this.model + " Smartphone\n" + this.battery.toString() + "\n" + this.display.toString() + "\n" + this.processor.toString();
    }
}