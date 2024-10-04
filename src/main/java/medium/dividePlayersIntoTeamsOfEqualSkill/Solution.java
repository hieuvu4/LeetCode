package medium.dividePlayersIntoTeamsOfEqualSkill;

import java.util.ArrayList;
import java.util.Arrays;

class Solution {
    public long dividePlayers(int[] skill) {
        if(skill.length % 2 != 0) return -1;
        Arrays.sort(skill);
        ArrayList<Integer> skillLvl = new ArrayList<>();
        long sum = 0;
        for(int i = 0; i < skill.length/2; i++) {
            int lvl = skill[i] + skill[skill.length-1-i];
            skillLvl.add(lvl);
            sum += skill[i] * skill[skill.length-1-i];
        }
        boolean check = skillLvl.stream().allMatch(skillLvl.get(0)::equals);
        return check? sum : -1;
    }
}