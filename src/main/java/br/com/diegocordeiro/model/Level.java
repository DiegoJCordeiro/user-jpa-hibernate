package br.com.diegocordeiro.model;

public enum Level {

    READER(1, "Low"),
    WRITER(2, "Medium"),
    ADMIN(3, "High");

    private final Integer level;

    private final String description;

    Level(Integer level, String description){

        this.level = level;
        this.description = description;
    }

    public Integer getLevel() {

        return this.level;
    }

    public String getDescription() {

        return this.description;
    }
}
