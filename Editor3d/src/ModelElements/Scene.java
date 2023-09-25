package ModelElements;

import java.util.List;

//класс Сцена
public class Scene {
    public int id=0;
    public List<PoligonalModel> models;
    public List<Flash> flashes;
    public List<Camera> cameras;

    //конструктор, должен принять заполненные списки моделей и камер, id присваивает автоматически
    public Scene(List<PoligonalModel> models, List<Flash> flashes, List<Camera> cameras) {
        this.id+=1;

        if (models.size()>0){
            this.models = models;
        } else {
            throw new RuntimeException("Должна быть хотя бы одна модель!");
        }

        this.flashes = flashes;

        if (cameras.size()>0){
            this.cameras = cameras;
        } else {
            throw new RuntimeException("Должна быть хотя бы одна камера!");
        }
    }

    public <T> T method1 (T flash){
        return flash;
    }
    public <T, E> T method2 (T model, E flash){
        return model;
    }

}
