package j3;

import Ff.d;
import gh.C5988l;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.C6498u;
import yf.C6798l;

public class v extends t {

    /* renamed from: h  reason: collision with root package name */
    private final C2129F f22997h;

    /* renamed from: i  reason: collision with root package name */
    private int f22998i;

    /* renamed from: j  reason: collision with root package name */
    private String f22999j;

    /* renamed from: k  reason: collision with root package name */
    private d f23000k;

    /* renamed from: l  reason: collision with root package name */
    private Object f23001l;

    /* renamed from: m  reason: collision with root package name */
    private final List f23002m = new ArrayList();

    static final class a extends C6498u implements C6798l {

        /* renamed from: a  reason: collision with root package name */
        public static final a f23003a = new a();

        a() {
            super(1);
        }

        /* renamed from: a */
        public final String invoke(s sVar) {
            C6496s.h(sVar, "it");
            String C10 = sVar.C();
            C6496s.e(C10);
            return C10;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public v(C2129F f10, String str, String str2) {
        super(f10.d(w.class), str2);
        C6496s.h(f10, "provider");
        C6496s.h(str, "startDestination");
        this.f22997h = f10;
        this.f22999j = str;
    }

    /* renamed from: f */
    public u b() {
        u uVar = (u) super.b();
        uVar.a0(this.f23002m);
        int i10 = this.f22998i;
        if (i10 != 0 || this.f22999j != null || this.f23000k != null || this.f23001l != null) {
            String str = this.f22999j;
            if (str != null) {
                C6496s.e(str);
                uVar.v0(str);
            } else {
                d dVar = this.f23000k;
                if (dVar != null) {
                    C6496s.e(dVar);
                    uVar.t0(C5988l.a(dVar), a.f23003a);
                } else {
                    Object obj = this.f23001l;
                    if (obj != null) {
                        C6496s.e(obj);
                        uVar.u0(obj);
                    } else {
                        uVar.s0(i10);
                    }
                }
            }
            return uVar;
        } else if (d() != null) {
            throw new IllegalStateException("You must set a start destination route");
        } else {
            throw new IllegalStateException("You must set a start destination id");
        }
    }

    public final void g(t tVar) {
        C6496s.h(tVar, "navDestination");
        this.f23002m.add(tVar.b());
    }

    public final C2129F h() {
        return this.f22997h;
    }
}
