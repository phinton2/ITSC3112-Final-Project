class Player {
    // instance variables
    private String name;
    private int repPoints;
    private String repStatus;

    // if reputation = 0, fair
    // if reputation = -1, poor
    // if reputation = -2, bad
    // if reputation = 1, good
    // if reputation = 2, excellent

    // Constructors
    public Player (String name, int repPoints, String repStatus) {
        this.name = name;
        this.repPoints = repPoints;
        this.repStatus = repStatus;
    }

    public Player (String name, int repPoints) {
        this.name = name;
        this.repPoints = repPoints;
    }

    // Getters
    public String getReputation () {
        if (repPoints == -2) repStatus = "BAD";
        else if (repPoints == -1) repStatus = "POOR";
        else if (repPoints == 0) repStatus = "FAIR";
        else if (repPoints == 1) repStatus = "GOOD";
        else if (repPoints == 2) repStatus = "EXCELLENT";
        return name + " has a " + repStatus + " reputation with The Vastrooms museum.";
    }

    public void setReputation (int repPoints) {
        if (repPoints == -2) repStatus = "BAD";
        else if (repPoints == -1) repStatus = "POOR";
        else if (repPoints == 0) repStatus = "FAIR";
        else if (repPoints == 1) repStatus = "GOOD";
        else if (repPoints == 2) repStatus = "EXCELLENT";
    }
}
