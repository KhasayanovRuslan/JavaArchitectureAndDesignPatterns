package patternFlyweight;

/*
 * Класс, показывающий работу шаблона проектирования "Приспособленец".
 * */
public class Application {

    public static void main (String [] args){
        FlyweightFactory factory = new FlyweightFactory();

        int [] characterCodes = {1,2,3};
        for (int nextCode : characterCodes){
            EnglishCharacter character = factory.getCharacter(nextCode);
            character.printCharacter();
        }
    }

}