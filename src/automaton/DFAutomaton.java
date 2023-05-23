package automaton;

public class DFAutomaton {

    private String[] alphabet;
    private State[] states;

    public DFAutomaton(String[] alphabet, State[] states) {
        if (isValid(states, alphabet.length)) {
            this.alphabet = alphabet;
            this.states = states;
        }
    }

    private boolean isValid(State[] states, int length) {
        for (State s : states) {
            if (s.length() != length) {
                return false;
            }
        }

        return true;
    }

    public boolean isAccepted(String entry) {
        int symbol, state = 0;

        for (char c : entry.toCharArray()) {
            symbol = -1;

            for (int i = 0; i < alphabet.length; i++) {
                if (alphabet[i].contains("" + c)) {
                    symbol = i;
                }
            }

            state = states[state].at(symbol);
            if (state == -1) {
                return false;
            }
        }

        return states[state].isValid();
    }
}
