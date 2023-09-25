package ModelElements;

import java.util.ArrayList;
import java.util.List;

public class PoligonalModel{
    public List<Poligon> poligons;
    public List<Texture> texture;

    public PoligonalModel(List<Texture> texture) {
        this.texture = texture;
        this.poligons=new ArrayList<>();
    }
}
