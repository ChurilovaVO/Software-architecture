import Fabric.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class Main {
    public static void main(String[] args) {

        List<ItemGenerator> itemGeneratorList = new ArrayList<>();
        itemGeneratorList.add(new GemGenerator());
        itemGeneratorList.add(new GoldGenerator());
        itemGeneratorList.add(new SilverGenerator());
        itemGeneratorList.add(new BronzeGenerator());
        itemGeneratorList.add(new HealthGenerator());
        itemGeneratorList.add(new LoveGenerator());
        itemGeneratorList.add(new PlatinumGenerator());
        itemGeneratorList.add(new SkillGenerator());

        Random random = ThreadLocalRandom.current();

        int countGem = 0;
        int countGold = 0;
        int countSilver = 0;
        int countBronze = 0;
        int countHealth = 0;
        int countLove = 0;
        int countPlatinum = 0;
        int countSkill = 0;

        List<ItemGenerator> resultRewardList = new ArrayList<>();

        while (resultRewardList.size() < 64) {
            int indexResult = random.nextInt(8);
            if (indexResult == 0 && countGem < 1) {
                resultRewardList.add(itemGeneratorList.get(indexResult));
                countGem++;
                itemGeneratorList.get(indexResult).openReward();
            } else if (indexResult == 1 && countGold < 3) {
                resultRewardList.add(itemGeneratorList.get(indexResult));
                countGold++;
                itemGeneratorList.get(indexResult).openReward();

            } else if (indexResult == 2 && countSilver < 10) {
                resultRewardList.add(itemGeneratorList.get(indexResult));
                countSilver++;
                itemGeneratorList.get(indexResult).openReward();

            } else if (indexResult == 3 && countBronze < 10) {
                resultRewardList.add(itemGeneratorList.get(indexResult));
                countBronze++;
                itemGeneratorList.get(indexResult).openReward();

            } else if (indexResult == 4 && countHealth < 10) {
                resultRewardList.add(itemGeneratorList.get(indexResult));
                countHealth++;
                itemGeneratorList.get(indexResult).openReward();

            } else if (indexResult == 5 && countLove < 10) {
                resultRewardList.add(itemGeneratorList.get(indexResult));
                countLove++;
                itemGeneratorList.get(indexResult).openReward();

            } else if (indexResult == 6 && countPlatinum < 10) {
                resultRewardList.add(itemGeneratorList.get(indexResult));
                countPlatinum++;
                itemGeneratorList.get(indexResult).openReward();

            } else if (indexResult == 7 && countSkill < 10) {
                resultRewardList.add(itemGeneratorList.get(indexResult));
                countSkill++;
                itemGeneratorList.get(indexResult).openReward();
            }
        }

    }
}
