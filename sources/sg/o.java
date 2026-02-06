package Sg;

final class o {

    /* renamed from: a  reason: collision with root package name */
    public static final o f65092a = new o();

    /* renamed from: b  reason: collision with root package name */
    public static final m f65093b;

    static {
        String str = "[eE][+-]?" + "(\\p{Digit}+)";
        f65093b = new m("[\\x00-\\x20]*[+-]?(NaN|Infinity|((" + ('(' + "(\\p{Digit}+)" + "(\\.)?(" + "(\\p{Digit}+)" + "?)(" + str + ")?)|(\\.(" + "(\\p{Digit}+)" + ")(" + str + ")?)|((" + ("(0[xX]" + "(\\p{XDigit}+)" + "(\\.)?)|(0[xX]" + "(\\p{XDigit}+)" + "?(\\.)" + "(\\p{XDigit}+)" + ')') + ")[pP][+-]?" + "(\\p{Digit}+)" + ')') + ")[fFdD]?))[\\x00-\\x20]*");
    }

    private o() {
    }
}
