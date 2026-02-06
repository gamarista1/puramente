package kh;

import gh.C5978b;
import gh.C5986j;
import ih.f;
import java.util.Arrays;
import jh.e;
import kotlin.Lazy;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.C6498u;
import lf.C6531o;
import mf.C6559l;
import yf.C6787a;

/* renamed from: kh.y  reason: case insensitive filesystem */
public final class C6477y implements C5978b {

    /* renamed from: a  reason: collision with root package name */
    private final Enum[] f71728a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public f f71729b;

    /* renamed from: c  reason: collision with root package name */
    private final Lazy f71730c;

    /* renamed from: kh.y$a */
    static final class a extends C6498u implements C6787a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C6477y f71731a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f71732b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(C6477y yVar, String str) {
            super(0);
            this.f71731a = yVar;
            this.f71732b = str;
        }

        /* renamed from: a */
        public final f invoke() {
            f b10 = this.f71731a.f71729b;
            if (b10 == null) {
                return this.f71731a.c(this.f71732b);
            }
            return b10;
        }
    }

    public C6477y(String str, Enum[] enumArr) {
        C6496s.h(str, "serialName");
        C6496s.h(enumArr, "values");
        this.f71728a = enumArr;
        this.f71730c = C6531o.b(new a(this, str));
    }

    /* access modifiers changed from: private */
    public final f c(String str) {
        C6476x xVar = new C6476x(str, this.f71728a.length);
        for (Enum name : this.f71728a) {
            C6458j0.m(xVar, name.name(), false, 2, (Object) null);
        }
        return xVar;
    }

    /* renamed from: d */
    public Enum deserialize(e eVar) {
        C6496s.h(eVar, "decoder");
        int F10 = eVar.F(getDescriptor());
        if (F10 >= 0) {
            Enum[] enumArr = this.f71728a;
            if (F10 < enumArr.length) {
                return enumArr[F10];
            }
        }
        throw new C5986j(F10 + " is not among valid " + getDescriptor().i() + " enum values, values size is " + this.f71728a.length);
    }

    /* renamed from: e */
    public void serialize(jh.f fVar, Enum enumR) {
        C6496s.h(fVar, "encoder");
        C6496s.h(enumR, "value");
        int q02 = C6559l.q0(this.f71728a, enumR);
        if (q02 != -1) {
            fVar.w(getDescriptor(), q02);
            return;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(enumR);
        sb2.append(" is not a valid enum ");
        sb2.append(getDescriptor().i());
        sb2.append(", must be one of ");
        String arrays = Arrays.toString(this.f71728a);
        C6496s.g(arrays, "toString(...)");
        sb2.append(arrays);
        throw new C5986j(sb2.toString());
    }

    public f getDescriptor() {
        return (f) this.f71730c.getValue();
    }

    public String toString() {
        return "kotlinx.serialization.internal.EnumSerializer<" + getDescriptor().i() + '>';
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public C6477y(String str, Enum[] enumArr, f fVar) {
        this(str, enumArr);
        C6496s.h(str, "serialName");
        C6496s.h(enumArr, "values");
        C6496s.h(fVar, "descriptor");
        this.f71729b = fVar;
    }
}
