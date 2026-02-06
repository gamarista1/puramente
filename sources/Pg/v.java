package pg;

import java.util.List;

public class v extends RuntimeException {

    /* renamed from: a  reason: collision with root package name */
    private final List f72587a = null;

    public v(p pVar) {
        super("Message was missing required fields.  (Lite runtime could not determine which fields were missing).");
    }

    public C6649k a() {
        return new C6649k(getMessage());
    }
}
