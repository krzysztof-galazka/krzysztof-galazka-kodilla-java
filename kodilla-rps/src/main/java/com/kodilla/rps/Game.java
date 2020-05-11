package com.kodilla.rps;

public class Game {
    private String userName;
    private int rounds;

    public void playGame() {
        userName = UserDialogs.getUserName();
        rounds = UserDialogs.getRounds();

        int round = 1;
        while (round <= rounds){
            //pobrac od uzytkownika jaki wybrał ruch
            //wylosować ruch computera - klasa game, osobna metoda
            //wywołać metodę, która określi kto zwyciężył
            //na podstawie zwycięzcy rundy zwiększyć punkty
            // wyświetlić statyski
            round++;
        }

        // wyświetlić statystyki końcowe
    }
}
