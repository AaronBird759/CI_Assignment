public class CILab implements CILabInterface {
    private String myString;

    @Override
    public String getString() {
        return myString;
    }

    @Override
    public void setString(String string) {
        myString = string;
    }

    @Override
    public boolean detectCapitalUse() {
        for (int i = 0; i < myString.length(); i++) {
            if (Character.isUpperCase(myString.charAt(i))) {
                return true;
            }
        }
        return false;
    }
}
