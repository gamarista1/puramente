package Sd;

import sf.C6714a;

public enum n {
    INITIALIZED(0),
    STARTED(1),
    RESPONSE_RECEIVED(2),
    BODY_COMPLETED(3),
    BODY_STREAMING_STARTED(4),
    BODY_STREAMING_CANCELLED(5),
    ERROR_RECEIVED(6);
    

    /* renamed from: a  reason: collision with root package name */
    private final int f52477a;

    static {
        n[] a10;
        f52476j = C6714a.a(a10);
    }

    private n(int i10) {
        this.f52477a = i10;
    }

    public final int b() {
        return this.f52477a;
    }
}
