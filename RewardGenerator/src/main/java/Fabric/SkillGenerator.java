package Fabric;

import Interface.IGameItem;
import Product.SkillReward;

public class SkillGenerator extends ItemGenerator{
    @Override
    public IGameItem createItem() {
        return new SkillReward();
    }
}
