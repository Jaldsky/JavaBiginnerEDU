package Lesson48;

public enum Animal {
    DOG("СОБАКА"), CAT("КОШКА"), FROG("ЛЯГУШКА");
    //new DOG("СОБАКА") все выглядит по умолчанию так

    private String translation;

    Animal(){};

    Animal(String translation){
        this.translation = translation;
    }

    public String getTranslation(){
        return translation;
    }

    public String toString(){
        return "Перевод на русский язык: " + translation;
    }
}
