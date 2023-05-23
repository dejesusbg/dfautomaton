package test;

import automaton.DFAutomaton;
import automaton.State;

public class DFA {

    public static void main(String[] args) {

        String[] romanAlphabet = {"I", "V", "X", "L", "C", "D", "M"};
        State[] romanStates = {
            new State(new int[]{1, 2, 3, 4, 5, 6, 7}, false),
            new State(new int[]{8, 9, 9, -1, -1, -1, -1}, true),
            new State(new int[]{1, -1, -1, -1, -1, -1, -1}, true),
            new State(new int[]{1, 2, 10, 11, 11, -1, -1}, true),
            new State(new int[]{1, 2, 3, -1, -1, -1, -1}, true),
            new State(new int[]{1, 2, 3, 4, 12, 13, 13}, true),
            new State(new int[]{1, 2, 3, 4, 5, -1, -1}, true),
            new State(new int[]{1, 2, 3, 4, 5, 6, 14}, true),
            new State(new int[]{9, -1, -1, -1, -1, -1, -1}, true),
            new State(new int[]{-1, -1, -1, -1, -1, -1, -1}, true),
            new State(new int[]{1, 2, 11, -1, -1, -1, -1}, true),
            new State(new int[]{1, 2, -1, -1, -1, -1, -1}, true),
            new State(new int[]{1, 2, 3, 4, 13, -1, -1}, true),
            new State(new int[]{1, 2, 3, 4, -1, -1, -1}, true),
            new State(new int[]{1, 2, 3, 4, 5, 6, 15}, true),
            new State(new int[]{1, 2, 3, 4, 5, 6, -1}, false)
        };

        String[] numAlphabet = {"1234567890", ".", "E", "+-"};
        State[] numStates = {
            new State(new int[]{2, 7, -1, 1}, false),
            new State(new int[]{2, 7, -1, -1}, false),
            new State(new int[]{2, 3, 4, -1}, true),
            new State(new int[]{3, -1, 4, -1}, true),
            new State(new int[]{6, -1, -1, 5}, false),
            new State(new int[]{6, -1, -1, -1}, false),
            new State(new int[]{6, -1, -1, -1}, true),
            new State(new int[]{3, -1, -1, -1}, false),};

        DFAutomaton roman = new DFAutomaton(romanAlphabet, romanStates);
        System.out.println("Is a valid roman number?: " + roman.isAccepted("XVI"));

        DFAutomaton numeric = new DFAutomaton(numAlphabet, numStates);
        System.out.println("Is a valid numeric constant?: " + numeric.isAccepted(".E2"));
    }
}
