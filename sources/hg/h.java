package Hg;

import sf.C6714a;

public enum h {
    CAPTURED_TYPE_SCOPE("No member resolution should be done on captured type, it used only during constraint system resolution"),
    INTEGER_LITERAL_TYPE_SCOPE("Scope for integer literal type (%s)"),
    ERASED_RECEIVER_TYPE_SCOPE("Error scope for erased receiver type"),
    SCOPE_FOR_ABBREVIATION_TYPE("Scope for abbreviation %s"),
    STUB_TYPE_SCOPE("Scope for stub type %s"),
    NON_CLASSIFIER_SUPER_TYPE_SCOPE("A scope for common supertype which is not a normal classifier"),
    ERROR_TYPE_SCOPE("Scope for error type %s"),
    UNSUPPORTED_TYPE_SCOPE("Scope for unsupported type %s"),
    SCOPE_FOR_ERROR_CLASS("Error scope for class %s with arguments: %s"),
    SCOPE_FOR_ERROR_RESOLUTION_CANDIDATE("Error resolution candidate for call %s");
    

    /* renamed from: a  reason: collision with root package name */
    private final String f63372a;

    static {
        h[] a10;
        f63371m = C6714a.a(a10);
    }

    private h(String str) {
        this.f63372a = str;
    }

    public final String b() {
        return this.f63372a;
    }
}
