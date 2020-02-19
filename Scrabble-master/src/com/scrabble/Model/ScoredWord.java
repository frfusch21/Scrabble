package com.scrabble.Model;

import java.util.ArrayList;

public class ScoredWord extends ArrayList<Space>  {

    private int wordDirection;

    //Encapsulation
    public ScoredWord(int orientation) {
        wordDirection = orientation;
    }//end constructor

    public ScoredWord(ArrayList<Space> word, int orientation) {
        super(word);
        wordDirection = orientation;
    }

    public int getOrientation() {
        return wordDirection;
    }//end get orientation
    
    public void setOrientation(int orientation) {
        wordDirection = orientation;
    }
    //END Encapsulation
    
    @Override
    public String toString() {
        String currentWordString = new String();
        String returnString = new String();

        for (Space space : this) {
            returnString = currentWordString.concat(Character.toString(space.getAssignedTile().getLetter()));
        }

        return returnString;
    }

}
