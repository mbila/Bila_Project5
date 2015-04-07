package com.company;

/**
 * Edited by Mike Bila
 * @author  Michael Kölling and David J. Barnes
 * @version 2011.08.08
 */

public class Game
{
    private Parser parser;
    private Room currentRoom;

    /**
     * Create the game and initialise its internal map.
     */
    public Game()
    {
        createRooms();
        parser = new Parser();
    }

    /**
     * Create all the rooms and link their exits together.
     */
    private void createRooms()
    {
        Room mainHall, dorms, lowerTower, upperTower, courtyard;

        // create the rooms
        mainHall = new Room("just inside the main entrance");
        dorms = new Room("in the dorm rooms");
        lowerTower = new Room("in the lower section of the tower");
        upperTower = new Room("in the upper section of the tower");
        courtyard = new Room("just outside the main entrance");

        mainHall.setExit("Up", dorms);
        mainHall.setExit("left", lowerTower);
        mainHall.setExit("right", courtyard);

        dorms.setExit("down", mainHall);

        lowerTower.setExit("right", mainHall);
        lowerTower.setExit("up", upperTower);

        upperTower.setExit("down", lowerTower);

        courtyard.setExit("left", mainHall);

        currentRoom = mainHall;
    }

    public void printMap() {
        System.out.println("Upper Tower    |     Dorms");
        System.out.println("     /\\               /\\ "); //the \\ will show up as one \. Errored when I used just one \
        System.out.println("     ||                ||");
        System.out.println("     \\/               \\/");
        System.out.println("LowerTower    <->   Main Hall    <->   Courtyard");
    }

    /**
     *  Main play routine.  Loops until end of play.
     */
    public void play()
    {
        printWelcome();
        printMap();

        boolean finished = false;
        while (! finished) {
            Command command = parser.getCommand();
            finished = processCommand(command);
        }
        System.out.println("Thank you for playing.  Good bye.");
    }

    /**
     * Print out the opening message for the player.
     */
    private void printWelcome()
    {
        System.out.println();
        System.out.println("Welcome to Hogwarts!");
        System.out.println("Hogwarts is a magical castle with a suspiciously low number of rooms!");
        System.out.println("Type 'help' for help menu.");
        System.out.println();
        System.out.println(currentRoom.getLongDescription());
    }

    /**
     * Given a command, process (that is: execute) the command.
     * @param command The command to be processed.
     * @return true If the command ends the game, false otherwise.
     */
    private boolean processCommand(Command command)
    {
        boolean wantToQuit = false;

        if(command.isUnknown()) {
            System.out.println("I don't know what you mean...");
            return false;
        }

        String commandWord = command.getCommandWord();
        if (commandWord.equals("help")) {
            printHelp();
        }
        else if (commandWord.equals("go")) {
            goRoom(command);
        }
        else if (commandWord.equals("quit")) {
            wantToQuit = quit(command);
        }
        return wantToQuit;
    }

    /**
     * Print out some help information.
     * Here we print some stupid, cryptic message and a list of the
     * command words.
     */
    private void printHelp()
    {
        System.out.println("Vague noises loom throughout the castle");
        System.out.println("You hear the low murmur of students in the halls");
        System.out.println();
        System.out.println("Available commands:");
        parser.showCommands();
    }

    /**
     * Try to in to one direction. If there is an exit, enter the new
     * room, otherwise print an error message.
     */
    private void goRoom(Command command)
    {
        if(!command.hasSecondWord()) {
            // if there is no second word, we don't know where to go...
            System.out.println("Which way you goin?");
            return;
        }

        String direction = command.getSecondWord();

        //trying to leave
        Room nextRoom = currentRoom.getExit(direction);

        if (nextRoom == null) {
            System.out.println("Not a chance you're going that way");
        }
        else {
            currentRoom = nextRoom;
            System.out.println(currentRoom.getLongDescription());
        }
    }

    private boolean quit(Command command)
    {
        if(command.hasSecondWord()) {
            System.out.println("Quit what?");
            return false;
        }
        else {
            return true;  // signal that we want to quit
        }
    }
}
