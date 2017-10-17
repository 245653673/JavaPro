package designPattern.creationalPatterns.builderMode;

public interface PersonBuilder {
    void buildHead();
    void buildBody();
    void buildFoot();
    Person buildPerson();
}
