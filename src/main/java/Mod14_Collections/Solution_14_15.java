package Mod14_Collections;

/*
Антипирамида
*/

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

public class Solution_14_15 {
    static Map<Voter, Map<String, String>> corporatePyramid = new HashMap<>();

    public static void main(String[] args) {
        setRewards();
        printMap(corporatePyramid);
    }

    public static void setRewards() {
        List<Voter> VOTER_LIST = Voter.generateVoters();
        for (Voter voter : VOTER_LIST) {
            if (Objects.equals(voter.getPersonalQuality(), "Good")) {
                corporatePyramid.put(voter, new Rewards().getGoodRewardsMap());
            }
            else if (Objects.equals(voter.getPersonalQuality(), "Holy")) {
                corporatePyramid.put(voter, new Rewards().getHolyRewardsMap());
            }
        }
    }

    public static void printMap(Map<?, ?> map) {
        map.forEach((key, value) -> System.out.println(key + " : " + value));
    }
}
