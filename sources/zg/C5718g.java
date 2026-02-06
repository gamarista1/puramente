package Zg;

import Ug.K;
import qf.g;

/* renamed from: Zg.g  reason: case insensitive filesystem */
public final class C5718g implements K {

    /* renamed from: a  reason: collision with root package name */
    private final g f66973a;

    public C5718g(g gVar) {
        this.f66973a = gVar;
    }

    public g getCoroutineContext() {
        return this.f66973a;
    }

    public String toString() {
        return "CoroutineScope(coroutineContext=" + getCoroutineContext() + ')';
    }
}
