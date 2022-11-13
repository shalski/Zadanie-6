public class Animal {
    String species;
    String name;
    Double weight;
    Boolean isAlive;

    Animal(String species) {
        this.isAlive = true;
        this.species = species;
    }

    void feed() {
        if (this.isAlive) {
            this.weight += 0.5;
            System.out.println("dzięki za żarcie");
        } else {
            System.out.println("Co robisz, przecież to padlina, idioto");
        }
    }

    void takeForAWalk() {
        if (this.isAlive) {

            this.weight = this.weight - 0.5;
            System.out.println("Zwierzak schudl");

            if (this.weight <= 0) {
                this.isAlive = false;
                System.out.println("Przesadziles z ta dieta (zdechlo)");
            }

        } else {
            System.out.println("IJO IJO POLICJA WEZWANA");
        }
    }


    public String toString(){
        return species+" "+name+" "+isAlive+" "+weight;
    }
}
