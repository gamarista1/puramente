package zg;

import Fg.S;
import Of.C5487e;
import kotlin.jvm.internal.C6496s;
import ng.f;

/* renamed from: zg.b  reason: case insensitive filesystem */
public final class C6835b extends C6834a implements C6839f {

    /* renamed from: c  reason: collision with root package name */
    private final C5487e f74000c;

    /* renamed from: d  reason: collision with root package name */
    private final f f74001d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C6835b(C5487e eVar, S s10, f fVar, C6840g gVar) {
        super(s10, gVar);
        C6496s.h(eVar, "classDescriptor");
        C6496s.h(s10, "receiverType");
        this.f74000c = eVar;
        this.f74001d = fVar;
    }

    public f a() {
        return this.f74001d;
    }

    public String toString() {
        return getType() + ": Ctx { " + this.f74000c + " }";
    }
}
