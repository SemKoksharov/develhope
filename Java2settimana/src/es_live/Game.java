package es_live;
/*
Описание упражнения:
Представьте себе, что вы создаете простую игру, в которой несколько игроков соревнуются друг с другом.
У каждого игрока есть имя, счет, и он может бросить кубик, чтобы получить случайное количество очков от 1 до 6.
Требования:
Определите класс Player, который имеет следующие атрибуты:
Имя игрока.
Очки игрока.
Определите класс Dice, имеющий метод launch(), возвращающий случайное число от 1 до 6.
Определите класс Game, который управляет игрой:
Создайте массив объектов Player.
Позвольте игрокам бросить кубик и обновить свой счет.
Выведите счет каждого игрока после каждого броска кубика.
В конце выведите имя игрока, набравшего наибольшее количество очков.
Создайте метод, который печатает окончательный рейтинг.
*/

public class Game {

    private Player[] players;
    private Dice dice;

    public Game(Player[] players) {
        this.players = players;
        this.dice = new Dice();
    }

    public void startGame() {
        for (int i = 0; i < 6; i++) {
            System.out.println("Бросок " + (i + 1) + ":");
            for (Player player : players) {
                int launch = dice.launch();
                player.addScore(launch);
                System.out.println("Игрок " + player.getName() + " получил " + player.getScore());
            }
        }
        Player win = players[0];
        for (int i = 0; i < players.length; i++) {
            if (players[i].getScore() > win.getScore()) {
                win = players[i];
            }
        }
        System.out.println("Побеждает игрок " + win.getName() + " c колличеством очков " + win.getScore());
    }
}
