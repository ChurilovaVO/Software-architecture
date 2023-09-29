//5) Переписать код в соответствии с Dependency Inversion Principle:
//  Разорвать зависимость классов Car и PetrolEngine. У машины же может быть DieselEngine.
public class Car implements PetrolEngine {
    private TypeEngine engine;
    public Car(TypeEngine engine) {
        this.engine = engine;
    }

    @Override
    public void start() {
    }
}


