package W0;

import Q0.C1321d;
import Q0.C1322e;
import Q0.Q;
import Q0.S;
import java.util.List;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.C6498u;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.O;
import mf.C6565s;
import yf.C6798l;

/* renamed from: W0.k  reason: case insensitive filesystem */
public final class C1443k {

    /* renamed from: a  reason: collision with root package name */
    private Q f8578a = new Q(C1322e.g(), Q.f5291b.a(), (Q) null, (DefaultConstructorMarker) null);

    /* renamed from: b  reason: collision with root package name */
    private C1444l f8579b = new C1444l(this.f8578a.e(), this.f8578a.g(), (DefaultConstructorMarker) null);

    /* renamed from: W0.k$a */
    static final class a extends C6498u implements C6798l {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C1441i f8580a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ C1443k f8581b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(C1441i iVar, C1443k kVar) {
            super(1);
            this.f8580a = iVar;
            this.f8581b = kVar;
        }

        /* renamed from: a */
        public final CharSequence invoke(C1441i iVar) {
            String str;
            if (this.f8580a == iVar) {
                str = " > ";
            } else {
                str = "   ";
            }
            return str + this.f8581b.e(iVar);
        }
    }

    private final String c(List list, C1441i iVar) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Error while applying EditCommand batch to buffer (length=" + this.f8579b.h() + ", composition=" + this.f8579b.d() + ", selection=" + Q.q(this.f8579b.i()) + "):");
        C6496s.g(sb2, "append(value)");
        sb2.append(10);
        C6496s.g(sb2, "append('\\n')");
        C6565s.v0(list, sb2, "\n", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, new a(iVar, this), 60, (Object) null);
        String sb3 = sb2.toString();
        C6496s.g(sb3, "StringBuilder().apply(builderAction).toString()");
        return sb3;
    }

    /* access modifiers changed from: private */
    public final String e(C1441i iVar) {
        if (iVar instanceof C1433a) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("CommitTextCommand(text.length=");
            C1433a aVar = (C1433a) iVar;
            sb2.append(aVar.c().length());
            sb2.append(", newCursorPosition=");
            sb2.append(aVar.b());
            sb2.append(')');
            return sb2.toString();
        } else if (iVar instanceof O) {
            StringBuilder sb3 = new StringBuilder();
            sb3.append("SetComposingTextCommand(text.length=");
            O o10 = (O) iVar;
            sb3.append(o10.c().length());
            sb3.append(", newCursorPosition=");
            sb3.append(o10.b());
            sb3.append(')');
            return sb3.toString();
        } else if (iVar instanceof N) {
            return iVar.toString();
        } else {
            if (iVar instanceof C1439g) {
                return iVar.toString();
            }
            if (iVar instanceof C1440h) {
                return iVar.toString();
            }
            if (iVar instanceof P) {
                return iVar.toString();
            }
            if (iVar instanceof C1446n) {
                return iVar.toString();
            }
            if (iVar instanceof C1438f) {
                return iVar.toString();
            }
            StringBuilder sb4 = new StringBuilder();
            sb4.append("Unknown EditCommand: ");
            String w10 = O.b(iVar.getClass()).w();
            if (w10 == null) {
                w10 = "{anonymous EditCommand}";
            }
            sb4.append(w10);
            return sb4.toString();
        }
    }

    public final Q b(List list) {
        C1441i iVar;
        Exception e10;
        long b10;
        Q q10 = null;
        try {
            int size = list.size();
            int i10 = 0;
            iVar = null;
            while (i10 < size) {
                try {
                    C1441i iVar2 = (C1441i) list.get(i10);
                    try {
                        iVar2.a(this.f8579b);
                        i10++;
                        iVar = iVar2;
                    } catch (Exception e11) {
                        e10 = e11;
                        iVar = iVar2;
                        throw new RuntimeException(c(list, iVar), e10);
                    }
                } catch (Exception e12) {
                    e10 = e12;
                    throw new RuntimeException(c(list, iVar), e10);
                }
            }
            C1321d s10 = this.f8579b.s();
            long i11 = this.f8579b.i();
            Q b11 = Q.b(i11);
            b11.r();
            if (!Q.m(this.f8578a.g())) {
                q10 = b11;
            }
            if (q10 != null) {
                b10 = q10.r();
            } else {
                b10 = S.b(Q.k(i11), Q.l(i11));
            }
            Q q11 = new Q(s10, b10, this.f8579b.d(), (DefaultConstructorMarker) null);
            this.f8578a = q11;
            return q11;
        } catch (Exception e13) {
            iVar = null;
            e10 = e13;
            throw new RuntimeException(c(list, iVar), e10);
        }
    }

    public final void d(Q q10, Z z10) {
        boolean c10 = C6496s.c(q10.f(), this.f8579b.d());
        boolean z11 = true;
        boolean z12 = false;
        if (!C6496s.c(this.f8578a.e(), q10.e())) {
            this.f8579b = new C1444l(q10.e(), q10.g(), (DefaultConstructorMarker) null);
        } else if (!Q.g(this.f8578a.g(), q10.g())) {
            this.f8579b.p(Q.l(q10.g()), Q.k(q10.g()));
            z12 = true;
            z11 = false;
        } else {
            z11 = false;
        }
        if (q10.f() == null) {
            this.f8579b.a();
        } else if (!Q.h(q10.f().r())) {
            this.f8579b.n(Q.l(q10.f().r()), Q.k(q10.f().r()));
        }
        if (z11 || (!z12 && !c10)) {
            this.f8579b.a();
            q10 = Q.c(q10, (C1321d) null, 0, (Q) null, 3, (Object) null);
        }
        Q q11 = this.f8578a;
        this.f8578a = q10;
        if (z10 != null) {
            z10.d(q11, q10);
        }
    }

    public final Q f() {
        return this.f8578a;
    }
}
