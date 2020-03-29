package com.kodilla.rps;

public class Game {
    private String userName;
    private int rounds;

    public void playGame() {
        userName = UserDialogs.getUserName();
        rounds = UserDialogs.getRounds();

        int round = 1;
        while (round <= rounds){

            round++;
        }
    }
}
