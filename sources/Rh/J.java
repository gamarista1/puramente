package rh;

import Gh.C5407h;
import kotlin.jvm.internal.C6496s;

public abstract class J {
    public abstract void onClosed(I i10, int i11, String str);

    public void onClosing(I i10, int i11, String str) {
        C6496s.h(i10, "webSocket");
        C6496s.h(str, "reason");
    }

    public abstract void onFailure(I i10, Throwable th2, E e10);

    public void onMessage(I i10, C5407h hVar) {
        C6496s.h(i10, "webSocket");
        C6496s.h(hVar, "bytes");
    }

    public abstract void onMessage(I i10, String str);

    public void onOpen(I i10, E e10) {
        C6496s.h(i10, "webSocket");
        C6496s.h(e10, "response");
    }
}
