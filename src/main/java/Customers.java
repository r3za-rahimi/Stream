public class Customers {
    private int rowNumber ;
    private long customerId ;
    private String surName ;
    private int creditScore ;
    private String geography ;
    private String gender ;
    private int age ;
    private int tenure ;
    //private String beginningBalance ;
    private double balance ;
    private int numOfProdducts ;
    private boolean hasCrCard ;
    private boolean isActiveMember ;
    private double estimatedSalary ;
    private boolean exited ;
    private long currentLoanAmount ;

    public Customers(int rowNumber, long customerId, String surName, int creditScore, String geography, String gender, int age, int tenure, double balance, int numOfProdducts, boolean hasCrCard, boolean isActiveMember, double estimatedSalary, boolean exited, long currentLoanAmount) {
        this.rowNumber = rowNumber;
        this.customerId = customerId;
        this.surName = surName;
        this.creditScore = creditScore;
        this.geography = geography;
        this.gender = gender;
        this.age = age;
        this.tenure = tenure;
        this.balance = balance;
        this.numOfProdducts = numOfProdducts;
        this.hasCrCard = hasCrCard;
        this.isActiveMember = isActiveMember;
        this.estimatedSalary = estimatedSalary;
        this.exited = exited;
        this.currentLoanAmount = currentLoanAmount;
    }

    public int getRowNumber() {
        return rowNumber;
    }

    public void setRowNumber(int rowNumber) {
        this.rowNumber = rowNumber;
    }

    public long getCustomerId() {
        return customerId;
    }

    public void setCustomerId(long customerId) {
        this.customerId = customerId;
    }

    public String getSurName() {
        return surName;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

    public int getCreditScore() {
        return creditScore;
    }

    public void setCreditScore(int creditScore) {
        this.creditScore = creditScore;
    }

    public String getGeography() {
        return geography;
    }

    public void setGeography(String geography) {
        this.geography = geography;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getTenure() {
        return tenure;
    }

    public void setTenure(int tenure) {
        this.tenure = tenure;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public int getNumOfProdducts() {
        return numOfProdducts;
    }

    public void setNumOfProdducts(int numOfProdducts) {
        this.numOfProdducts = numOfProdducts;
    }

    public boolean isHasCrCard() {
        return hasCrCard;
    }

    public void setHasCrCard(boolean hasCrCard) {
        this.hasCrCard = hasCrCard;
    }

    public boolean isActiveMember() {
        return isActiveMember;
    }

    public void setActiveMember(boolean activeMember) {
        isActiveMember = activeMember;
    }

    public double getEstimatedSalary() {
        return estimatedSalary;
    }

    public void setEstimatedSalary(double estimatedSalary) {
        this.estimatedSalary = estimatedSalary;
    }

    public boolean isExited() {
        return exited;
    }

    public void setExited(boolean exited) {
        this.exited = exited;
    }

    public long getCurrentLoanAmount() {
        return currentLoanAmount;
    }

    public void setCurrentLoanAmount(long currentLoanAmount) {
        this.currentLoanAmount = currentLoanAmount;
    }

    @Override
    public String toString() {
        return "Customers{" +
                "rowNumber=" + rowNumber +
                ", customerId=" + customerId +
                ", surName='" + surName + '\'' +
                ", creditScore=" + creditScore +
                ", geography='" + geography + '\'' +
                ", gender='" + gender + '\'' +
                ", age=" + age +
                ", tenure=" + tenure +
                ", balance=" + balance +
                ", numOfProdducts=" + numOfProdducts +
                ", hasCrCard=" + hasCrCard +
                ", isActiveMember=" + isActiveMember +
                ", estimatedSalary=" + estimatedSalary +
                ", exited=" + exited +
                ", currentLoanAmount=" + currentLoanAmount +
                '}';
    }
}
