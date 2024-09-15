package Controller;
import Model.*;

public class milkCalculator {
    cow cow = new cow();
    
    public int milkCalculate(String id) {
        int ageYear = cow.getAgeYear(id);
        int ageMonth = cow.getAgeMonth(id);

        if (ageYear == -1 || ageMonth == -1) {
            return 0; 
        }
        return ageYear + ageMonth;
    }


}
