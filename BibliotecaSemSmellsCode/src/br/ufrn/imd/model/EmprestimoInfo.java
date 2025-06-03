package br.ufrn.imd.model;

class EmprestimoInfo {
    private String borrower;
    private String date;
    private int durationDays;

    public EmprestimoInfo(String borrower, String date, int durationDays) {
        this.borrower = borrower;
        this.date = date;
        this.durationDays = durationDays;
    }

    public String getBorrower() {
        return borrower;
    }

    public String getDate() {
        return date;
    }

    public int getDurationDays() {
        return durationDays;
    }
}
