package Fabric;

import Interface.IGameItem;
import Product.LoveReward;

public class LoveGenerator extends ItemGenerator{
    @Override
    public IGameItem createItem() {
        return new LoveReward();
    }
}
