public class Custom {

   Integer rowNumber;
    Integer customerId;
    String  surname;
    Integer creditScore;
    String geography;
    String gender;
    Integer age;
    String tenure;
    Double beginningBalance;
    Double balance;
    Integer numOfProducts;
    String hasCrCard;
    String isActiveMember;
    Double estimatedSalary;
    String exited;
    Double currentLoanAmount;

    public Custom(Integer rowNumber, Integer customerId, String surname, Integer creditScore, String geography, String gender,
                  Integer age, String tenure, Double beginningBalance, Double balance, Integer numOfProducts, String hasCrCard, String isActiveMember, Double estimatedSalary, String exited, Double currentLoanAmount) {
        this.rowNumber = rowNumber;
        this.customerId = customerId;
        this.surname = surname;
        this.creditScore = creditScore;
        this.geography = geography;
        this.gender = gender;
        this.age = age;
        this.tenure = tenure;
        this.beginningBalance = beginningBalance;
        this.balance = balance;
        this.numOfProducts = numOfProducts;
        this.hasCrCard = hasCrCard;
        this.isActiveMember = isActiveMember;
        this.estimatedSalary = estimatedSalary;
        this.exited = exited;
        this.currentLoanAmount = currentLoanAmount;
    }
}
