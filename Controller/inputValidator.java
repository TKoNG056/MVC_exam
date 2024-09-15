package Controller;
import Model.*;

public class inputValidator {
    cow cow = new cow();
    public boolean checkeId(String id) {
        boolean isValid = true;
        if (!id.matches("\\d{8}") || id.startsWith("0")) {
            isValid = false;
        }
        if (!cow.cowIsHere(id)) {
            isValid = false;
        }
        return isValid;
    }
    public boolean isCow(String id) {
        return cow.isItCow(id);
    }

}
