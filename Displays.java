class Displays {
    // instance variables
    private String name;
    private String date;
    private String info;
    
    // constructors
    public Displays (String name, String date, String info) {
        this.name = name;
        this.date = date;
        this.info = info;
    }

    // GETTERS - mahy not be needed considering void methods
    public String getDisplayName () {
        return name;
    }

    public String getDisplayDate () {
        return date;
    }
    
    public String getDisplayInfo () {
        return info;
    }

    // SETTERS - may not be needed considering void methods
    public void setDisplayName(String name) {
        this.name = name;
    }

    public void setDisplayDate (String date) {
        this.date = date;
    }

    public void setDisplayInfo(String info) {
        this.info = info;
    }

    // Displays for Exhibit 1
    public void A() {
        System.out.println();
    }

    public void B() {
        System.out.println();
    }

    public void C() {
        System.out.println();
    }

    // Displays for Exhibit 2
    public void D() {
        System.out.println();
    }

    public void EF() {
        System.out.println();
    }

    public void C() {
        System.out.println();
    }

    // Displays for Exhibit 3
}
