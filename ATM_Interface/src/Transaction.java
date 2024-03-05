class Transaction {
    private String userId;
    private String type;
    private double amount;

    public Transaction(String userId, String type, double amount) {
        this.userId = userId;
        this.type = type;
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "User: " + userId + ", Type: " + type + ", Amount: $" + amount;
    }
}