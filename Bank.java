package Com.Sample;

class RbiBank {
    public double getRateOfInterest() {
        return 5.0;
    }
}

class Sbi extends RbiBank {
    @Override
    public double getRateOfInterest() {
        return 6.5;
    }
}

class ICICI extends RbiBank {
    @Override
    public double getRateOfInterest() {
        return 7.5;
    }
}

public class Bank {
    public static void main(String[] args) {
        RbiBank rb = new RbiBank();
        RbiBank rb1 = new Sbi();
        Sbi s1 = new Sbi();
        ICICI i1 = new ICICI();

        System.out.println("RBI Interest Rate: " + rb.getRateOfInterest() + "%");
        System.out.println("SBI Interest Rate: " + s1.getRateOfInterest() + "%");
        System.out.println("ICICI Interest Rate: " + i1.getRateOfInterest() + "%");
        System.out.println(" NewSBI Interest Rate: " + rb1.getRateOfInterest() + "%");
    }
}
