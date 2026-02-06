package Mb;

import Lb.l;
import Tb.b;

public abstract class d {

    /* renamed from: a  reason: collision with root package name */
    protected final a f52035a;

    /* renamed from: b  reason: collision with root package name */
    protected final e f52036b;

    /* renamed from: c  reason: collision with root package name */
    protected final l f52037c;

    public enum a {
        Overwrite,
        Merge,
        AckUserWrite,
        ListenComplete
    }

    protected d(a aVar, e eVar, l lVar) {
        this.f52035a = aVar;
        this.f52036b = eVar;
        this.f52037c = lVar;
    }

    public l a() {
        return this.f52037c;
    }

    public e b() {
        return this.f52036b;
    }

    public a c() {
        return this.f52035a;
    }

    public abstract d d(b bVar);
}
