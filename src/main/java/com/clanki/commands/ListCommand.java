package com.clanki.commands;

import com.clanki.objects.Flashcard;
import com.clanki.objects.FlashcardList;
import com.clanki.ui.Ui;

import java.util.ArrayList;

public class ListCommand extends Command {

    @Override
    public void execute(FlashcardList flashcardList, Ui display) {
        ArrayList<Flashcard> flashcards = flashcardList.getFlashCards();
        if (flashcards.size() > 0) {
            System.out.println("Here is your list of flashcards:");
            display.printFlashCards(flashcards);
        }
        if (flashcards.size() == 0) {
            System.out.println("Your list of flashcards is empty.");
        }
    }
}