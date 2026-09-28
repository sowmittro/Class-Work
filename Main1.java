class Print {
    String documentName;
    double costperPage;

    double calculateCost(int pages) {
        return pages * costperPage;
    }

    double calculateCost(int pages, boolean colorprint) {
        if (colorprint) {
            return pages * costperPage * 2.5;
        }
        else {
            return pages * costperPage;
        }
    }
}

public class Main2 {
    public static void main(String[] args) {

        Print p = new Print();

        p.documentName = "Java Book";
        p.costperPage = 1.00;

        System.out.println("Black and white: " + p.calculateCost(10));
        System.out.println("Colorprint: " + p.calculateCost(10, true));
    }
}
