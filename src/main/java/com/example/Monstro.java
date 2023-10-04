package com.example;

import java.util.List;

public class Monstro {

    private int id;
    private String name;
    private MonsterType type;
    private MonsterSpecies species;
    private String description;
    private ElementType elements;
    private Ailment ailments;
    private Location locations;
    private MonsterResistance resistances;
    private MonsterWeakness weakness;
    private MonsterReward rewards;

    public Monstro() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public class MonsterType {
        // Campos da classe MonsterType
    }

    public MonsterSpecies getSpecies() {
        return species;
    }

    public void setSpecies(MonsterSpecies species) {
        this.species = species;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public ElementType getElements() {
        return elements;
    }

    public void setElements(ElementType elements) {
        this.elements = elements;
    }

    public Ailment getAilments() {
        return ailments;
    }

    public void setAilments(Ailment ailments) {
        this.ailments = ailments;
    }

    public Location getLocations() {
        return locations;
    }

    public void setLocations(Location locations) {
        this.locations = locations;
    }

    public MonsterResistance getResistances() {
        return resistances;
    }

    public void setResistances(MonsterResistance resistances) {
        this.resistances = resistances;
    }

    public MonsterWeakness getWeakness() {
        return weakness;
    }

    public void setWeakness(MonsterWeakness weakness) {
        this.weakness = weakness;
    }

    public MonsterReward getRewards() {
        return rewards;
    }

    public void setRewards(MonsterReward rewards) {
        this.rewards = rewards;
    }

    // Classes internas aninhadas para representar objetos
    public class ElementType {
        // Campos da classe ElementType
    }

    public class Ailment {
        // Campos da classe Ailment
    }

    public class Location {
        // Campos da classe Location
    }

    public class MonsterResistance {
        // Campos da classe MonsterResistance
    }

    public class MonsterWeakness {
        // Campos da classe MonsterWeakness
    }

    public class MonsterReward {
        // Campos da classe MonsterReward
    }

    public class MonsterSpecies {
        // Campos da classe MonsterSpecies
    }
}