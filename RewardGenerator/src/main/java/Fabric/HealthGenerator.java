package Fabric;

import Interface.IGameItem;
import Product.HealthReward;

public class HealthGenerator extends ItemGenerator{
    @Override
    public IGameItem createItem() {
        return new HealthReward();
    }
}
