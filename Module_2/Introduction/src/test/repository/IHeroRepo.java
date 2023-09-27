package test.repository;

import test.model.Hero;

import java.util.List;

public interface IHeroRepo {

    void add(Hero hero);

    List<Hero> getHeroes();

    Hero getHero();
}
