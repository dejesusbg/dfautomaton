package automaton;

public class State {

    private int[] transitions;
    private boolean valid;

    public State(int[] transitions, boolean valid) {
        this.transitions = transitions;
        this.valid = valid;
    }

    public boolean isValid() {
        return valid;
    }

    public void setValid(boolean valid) {
        this.valid = valid;
    }
    
    public int at(int i) {
        return (i >= 0) ? transitions[i] : -1;
    }

    public int length() {
        return transitions.length;
    }

    @Override
    public String toString() {
        String s = "";

        for (int i = 0; i < transitions.length - 1; i++) {
            s += transitions[i] + ", ";
        }

        s += transitions[transitions.length - 1];
        return "[" + s + "], " + valid;
    }

}
