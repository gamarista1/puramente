package kotlin.coroutines.jvm.internal;

import qf.C6658d;
import qf.g;

public final class c implements C6658d {

    /* renamed from: a  reason: collision with root package name */
    public static final c f71744a = new c();

    private c() {
    }

    public g getContext() {
        throw new IllegalStateException("This continuation is already complete");
    }

    public void resumeWith(Object obj) {
        throw new IllegalStateException("This continuation is already complete");
    }

    public String toString() {
        return "This continuation is already complete";
    }
}
