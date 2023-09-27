package test.repository.impl;

import test.model.Hero;
import test.repository.IHeroRepo;
import test.utils.TestUtils;

import java.util.ArrayList;
import java.util.List;

public class HeroRepo implements IHeroRepo {

    private static final String PATH = "C:\\Users\\This PC\\Documents\\git\\GitProject\\Module_2\\Introduction\\src\\test\\data\\data.csv";
    private static final String COMMA = ",";

    @Override
    public void add(Hero hero) {

    }

    @Override
    public List<Hero> getHeroes() {
        return null;
    }

    @Override
    public Hero getHero() {
        return null;
    }


    private List<Hero> convertStringHero(List<String> data){
        List<Hero> heroes = new ArrayList<>();

        for (String str : data){
            String[] splitStr = str.split(COMMA);
            heroes.add(new Hero(
                    Integer.parseInt(splitStr[0]),
                    splitStr[1],
                    splitStr[2]
            ));
        }
        return heroes;
    }

    private List<Hero> readFromFile(){
        List<String> data = TestUtils.readText(PATH);
        return convertStringHero(data);
    }

    private List<String> convertHeroString(List<Hero> heroes){
        List<String> data = new ArrayList<>();
        for(Hero hero: heroes){
            data.add(
                    hero.getId()
                    + COMMA + hero.getName()
                    + COMMA + hero.getDescription()
            );
        }
        return data;
    }

    private void writeFromFile(List<Hero> heroes){
        List<String> data = convertHeroString(heroes);
        TestUtils.writeFile(PATH, data);
    }

}
