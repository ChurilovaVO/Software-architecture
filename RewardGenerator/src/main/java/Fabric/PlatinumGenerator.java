package Fabric;

import Interface.IGameItem;
import Product.PlatinumReward;

public class PlatinumGenerator extends ItemGenerator{
    @Override
    public IGameItem createItem() {
        return new PlatinumReward();
    }
}
