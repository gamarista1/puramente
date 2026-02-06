package zg;

import Fg.S;
import Of.C5483a;
import kotlin.jvm.internal.C6496s;
import ng.f;

/* renamed from: zg.c  reason: case insensitive filesystem */
public final class C6836c extends C6834a implements C6839f {

    /* renamed from: c  reason: collision with root package name */
    private final C5483a f74002c;

    /* renamed from: d  reason: collision with root package name */
    private final f f74003d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C6836c(C5483a aVar, S s10, f fVar, C6840g gVar) {
        super(s10, gVar);
        C6496s.h(aVar, "declarationDescriptor");
        C6496s.h(s10, "receiverType");
        this.f74002c = aVar;
        this.f74003d = fVar;
    }

    public f a() {
        return this.f74003d;
    }

    public C5483a c() {
        return this.f74002c;
    }

    public String toString() {
        return "Cxt { " + c() + " }";
    }
}
