package com.company;
//Добавить метод в классе Main который называется createHeroes, в теле метода необходимо создать 3х героев с
// помощью класса Hero, используя при этом разные варианты конструкторов (либо первый либо второй).
// Затем поместить созданные экземпляры героев в массив и вернуть его с помощью команды return, как возвращаемый результат
// метода createHeroes. Hero[ ]
//Затем вызвать этот метод в методе main и распечатать информацию о всех героях массива через цикл.

public class Main {

    public static void main(String[] args) {

        Boss boss = new Boss();

        boss.setHealth(15);
        boss.setDamage(55);
        boss.setSuperPower("Magical");
        System.out.println(boss.getHealth() + " " + boss.getDamage() + " " + boss.getSuperPower());
        for (int i = 0; i < createHeroes().length ; i++) {
            System.out.println(createHeroes()[i].getHealth() + " " +
                    createHeroes()[i].getDamage() + " " + createHeroes()[i].getSuperPower());
        }
    }

        public static Hero[] createHeroes (){
        Hero hero = new Hero(30, 45, "Medik");
        Hero hero2 = new Hero (56, 45, "Golem");
        Hero hero3 = new Hero (50,65, "Magic");
        Hero[] heroes = {hero, hero2, hero3};
        return heroes;

        }

}
