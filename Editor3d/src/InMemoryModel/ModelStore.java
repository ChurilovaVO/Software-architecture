package InMemoryModel;
import ModelElements.*;

import java.util.ArrayList;
import java.util.List;

//хранилище моделей
public class ModelStore implements IModelChanger{
    public List<PoligonalModel> models;
    public List<Scene> scenes;
    public List<Flash> flashes;
    public List<Camera> cameras;
    private IModelChangedObserver[] changedObservers;

    public ModelStore(IModelChangedObserver[] changedObservers) {
        this.changedObservers = changedObservers;
        this.scenes=new ArrayList<>();
        this.models=new ArrayList<>();
        this.flashes= new ArrayList<>();
        this.cameras= new ArrayList<>();
        models.add(new PoligonalModel(new ArrayList<Texture>()));
        flashes.add(new Flash());
        cameras.add(new Camera());
        scenes.add(new Scene(models,flashes,cameras));
    }

    public Scene getScene(int id){
        return scenes.get(id);
    }

    //регистрирует изменения
    @Override
    public void notifyChanger(IModelChanger sender) {

    }
}
