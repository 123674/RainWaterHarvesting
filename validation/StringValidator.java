package validation;

public class StringValidator {
    
    private static DictReturnType mainValidate(String text,int maxLen) {
        if(text.length() == 0) {
            return new DictReturnType("Text must have atleast a characters");
        }
        if(text.length() > maxLen) {
            return new DictReturnType("Text must be less than"+maxLen+"characters");
        }

        return new DictReturnType(true,text);
    }

    public static DictReturnType validate(String text) {
        return mainValidate(text,3000);
    }
    public static DictReturnType validate(String text,int maxLen) {
        return mainValidate(text,maxLen);
    }
}
