package kh;

import gh.C5978b;
import ih.C6000a;
import ih.f;
import ih.i;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.C6498u;
import kotlin.jvm.internal.DefaultConstructorMarker;
import lf.C6502A;
import lf.C6514M;
import yf.C6798l;

/* renamed from: kh.f0  reason: case insensitive filesystem */
public final class C6450f0 extends K {

    /* renamed from: c  reason: collision with root package name */
    private final f f71656c;

    /* renamed from: kh.f0$a */
    static final class a extends C6498u implements C6798l {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C5978b f71657a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ C5978b f71658b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(C5978b bVar, C5978b bVar2) {
            super(1);
            this.f71657a = bVar;
            this.f71658b = bVar2;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((C6000a) obj);
            return C6514M.f71813a;
        }

        public final void invoke(C6000a aVar) {
            C6496s.h(aVar, "$this$buildClassSerialDescriptor");
            C6000a aVar2 = aVar;
            C6000a.b(aVar2, "first", this.f71657a.getDescriptor(), (List) null, false, 12, (Object) null);
            C6000a.b(aVar2, "second", this.f71658b.getDescriptor(), (List) null, false, 12, (Object) null);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C6450f0(C5978b bVar, C5978b bVar2) {
        super(bVar, bVar2, (DefaultConstructorMarker) null);
        C6496s.h(bVar, "keySerializer");
        C6496s.h(bVar2, "valueSerializer");
        this.f71656c = i.b("kotlin.Pair", new f[0], new a(bVar, bVar2));
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public Object a(Pair pair) {
        C6496s.h(pair, "<this>");
        return pair.c();
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public Object c(Pair pair) {
        C6496s.h(pair, "<this>");
        return pair.d();
    }

    public f getDescriptor() {
        return this.f71656c;
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public Pair e(Object obj, Object obj2) {
        return C6502A.a(obj, obj2);
    }
}
