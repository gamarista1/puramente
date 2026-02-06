package mh;

import kotlin.jvm.internal.C6496s;

/* renamed from: mh.n  reason: case insensitive filesystem */
public final class C6597n extends C6596m {

    /* renamed from: c  reason: collision with root package name */
    private final boolean f72220c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C6597n(C6608z zVar, boolean z10) {
        super(zVar);
        C6496s.h(zVar, "writer");
        this.f72220c = z10;
    }

    public void n(String str) {
        C6496s.h(str, "value");
        if (this.f72220c) {
            super.n(str);
        } else {
            super.k(str);
        }
    }
}
