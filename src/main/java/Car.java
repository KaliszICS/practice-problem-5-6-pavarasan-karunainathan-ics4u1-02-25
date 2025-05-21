public class Car {
    
    //Composition
    Engine engine;
    Wheels wheels;

    public Car(Engine engine, Wheels wheels) {
        this.engine = engine;
        this.wheels = wheels;
    }

}
