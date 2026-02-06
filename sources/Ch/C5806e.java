package ch;

import kotlin.jvm.internal.DefaultConstructorMarker;
import yf.q;

/* renamed from: ch.e  reason: case insensitive filesystem */
public final class C5806e implements C5805d {

    /* renamed from: a  reason: collision with root package name */
    private final Object f67362a;

    /* renamed from: b  reason: collision with root package name */
    private final q f67363b;

    /* renamed from: c  reason: collision with root package name */
    private final q f67364c;

    /* renamed from: d  reason: collision with root package name */
    private final q f67365d;

    public C5806e(Object obj, q qVar, q qVar2) {
        this.f67362a = obj;
        this.f67363b = qVar;
        this.f67364c = qVar2;
        this.f67365d = C5812k.f67389a;
    }

    public q a() {
        return this.f67363b;
    }

    public q b() {
        return this.f67364c;
    }

    public q c() {
        return this.f67365d;
    }

    public Object d() {
        return this.f67362a;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C5806e(Object obj, q qVar, q qVar2, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(obj, qVar, (i10 & 4) != 0 ? null : qVar2);
    }
}
