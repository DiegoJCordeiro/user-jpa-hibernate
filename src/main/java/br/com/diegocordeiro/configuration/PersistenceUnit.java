package br.com.diegocordeiro.configuration;

public enum PersistenceUnit {
    POSTGRESQL("user-jpa-hibernate-POSTGRES"),
    MYSQL("user-jpa-hibernate-MYSQL"),
    ORACLE("user-jpa-hibernate-ORACLE");


    private final String unit;

    PersistenceUnit(String unit) {
        this.unit = unit;
    }

    public String getUnit(){
        return this.unit;
    }
}
