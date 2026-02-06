package androidx.datastore.preferences.protobuf;

import java.util.List;

public class k0 extends RuntimeException {
    private static final long serialVersionUID = -7466929953374883507L;

    /* renamed from: a  reason: collision with root package name */
    private final List f16398a = null;

    public k0(O o10) {
        super("Message was missing required fields.  (Lite runtime could not determine which fields were missing).");
    }

    public C1752z a() {
        return new C1752z(getMessage());
    }
}
