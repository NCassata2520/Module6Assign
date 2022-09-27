package edu.wctc;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class DiceGame {
    private final List<Player> players;
    private final List<Die> dice;
    private final int maxRolls;
    private Player currentPlayer;


    public DiceGame(int countPlayers, int countDice, int maxRolls, List<Player> players, List<Die> dice, int maxRolls1){
        this.players = players;
        this.dice = dice;
        this.maxRolls = maxRolls1;
        boolean allMatch = this.players.stream()
                .allMatch(player -> this.players.hashCode() > 2);
        return allMatch;
    }

    private List<Die> allDiceHeld(){

       List<Die> diceHeld = dice.stream()
               .allMatch(die -> die.isBeingHeld()  == true )
               return diceHeld;
    }

    public List<Die> autoHold (int faceValue){
        List<Die> hold = dice.stream()
                .filter(die -> die.isBeingHeld())
                .collect(Collectors.toList());
        return hold;


    }

    public boolean currentPlayerCanRoll(){
        boolean player = players.stream()
                boolean die = dice.stream()
        .filter(player1 -> player1.getRollsUsed()<3)
                .filter(player1 -> player1.isBeingHeld()<5);
        return player;
        return die;

    }

    public List<Player> getCurrentPlayerNumber(Object currentPlayer){
        List<Player> player = players.stream()
                .filter(player -> player.getPlayerNumber());
        return player;
    }

    public int getCurrentPlayerScore(){
        Player player = new Player();
        int playerscore = player.getScore();
        return playerscore;
    }

    public String getDiceResults(){
        Map<Die, List<Die>> mapByResult = dice.stream()
                .collect(Collectors.groupingBy(Die:: getFaceValue));
return mapByResult.toString();
    }

    public String getFinalWinner(){
   List<Player> player = players.stream()
            .max(Comparator.comparing(Player::getWins))
            .collect(Collectors.toList());
   return player.toString();
    }

    public String getGameResults(){
    List<Player> sorted = (List<Player>) players.stream()
        .sorted(Comparator.comparing(Player::getScore).reversed())
            .collect(Collectors.toList());
    sorted.forEach(System.out::println);
    return sorted.toString();
    }

    private boolean isHoldingDie(Optional<Die> faceValue){
        Optional<Die> holding = dice.stream().findAny();
        return isHoldingDie(holding);

    }

    public boolean nextPlayer(){
List<Player> player = players.stream()
        //not sure
    }

    public void playerHold(char dieNum){
        Die number = new Die();
        List<Die> filtered = (List<Die>) dice.stream();
        .filter( -> dice.getDieNum())

    }

    public List<Die> resetDice(){
List<Die> reset = dice.stream()
        .filter(die -> die.resetDie())
        .collect(Collectors.toList());
return reset;
    }

    public List<Player> resetPlayers(){
List<Player> player = players.stream()
        .count(players -> players.resetPlayer())
        .collect(Collectors.toList());
        return player;
    }

    public void rollDice(){
        List<Die> roll = dice.stream()
                //Not sure
    }

    public List<Die> scoreCurrentPlayer(){
        List<Die> player = players.stream()
                .max(player -> player.addWin())
                .collect(Collectors.toList());
        return player;
    }

    public void startNewGame(){
        List<Player> min = (List<Player>) players.stream()
                .min(Comparator.comparing(Player::getCurrentPlayerNumber));
    }

}
