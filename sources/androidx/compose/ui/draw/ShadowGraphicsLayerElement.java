package androidx.compose.ui.draw;

import J0.V;
import androidx.compose.ui.graphics.c;
import c1.h;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.C6498u;
import kotlin.jvm.internal.DefaultConstructorMarker;
import lf.C6514M;
import r0.C2511m0;
import r0.C2544x0;
import r0.g2;
import yf.C6798l;

@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0014\b\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B/\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\t¢\u0006\u0004\b\f\u0010\rJ\u001b\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00100\u000eH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0016\u001a\u00020\u00102\u0006\u0010\u0015\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001c\u001a\u00020\u001bHÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u001a\u0010 \u001a\u00020\u00072\b\u0010\u001f\u001a\u0004\u0018\u00010\u001eHÖ\u0003¢\u0006\u0004\b \u0010!R\u001d\u0010\u0004\u001a\u00020\u00038\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u0013\u0010*\u001a\u0004\b+\u0010,R\u001d\u0010\n\u001a\u00020\t8\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0011\u0010-\u001a\u0004\b.\u0010/R\u001d\u0010\u000b\u001a\u00020\t8\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b0\u0010-\u001a\u0004\b1\u0010/\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u00062"}, d2 = {"Landroidx/compose/ui/draw/ShadowGraphicsLayerElement;", "LJ0/V;", "Lr0/m0;", "Lc1/h;", "elevation", "Lr0/g2;", "shape", "", "clip", "Lr0/x0;", "ambientColor", "spotColor", "<init>", "(FLr0/g2;ZJJLkotlin/jvm/internal/DefaultConstructorMarker;)V", "Lkotlin/Function1;", "Landroidx/compose/ui/graphics/c;", "Llf/M;", "e", "()Lyf/l;", "d", "()Lr0/m0;", "node", "n", "(Lr0/m0;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "b", "F", "k", "()F", "c", "Lr0/g2;", "l", "()Lr0/g2;", "Z", "j", "()Z", "J", "i", "()J", "f", "m", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class ShadowGraphicsLayerElement extends V {

    /* renamed from: b  reason: collision with root package name */
    private final float f13258b;

    /* renamed from: c  reason: collision with root package name */
    private final g2 f13259c;

    /* renamed from: d  reason: collision with root package name */
    private final boolean f13260d;

    /* renamed from: e  reason: collision with root package name */
    private final long f13261e;

    /* renamed from: f  reason: collision with root package name */
    private final long f13262f;

    static final class a extends C6498u implements C6798l {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ShadowGraphicsLayerElement f13263a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(ShadowGraphicsLayerElement shadowGraphicsLayerElement) {
            super(1);
            this.f13263a = shadowGraphicsLayerElement;
        }

        public final void a(c cVar) {
            cVar.C(cVar.t1(this.f13263a.k()));
            cVar.O0(this.f13263a.l());
            cVar.y(this.f13263a.j());
            cVar.v(this.f13263a.i());
            cVar.z(this.f13263a.m());
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((c) obj);
            return C6514M.f71813a;
        }
    }

    public /* synthetic */ ShadowGraphicsLayerElement(float f10, g2 g2Var, boolean z10, long j10, long j11, DefaultConstructorMarker defaultConstructorMarker) {
        this(f10, g2Var, z10, j10, j11);
    }

    private final C6798l e() {
        return new a(this);
    }

    /* renamed from: d */
    public C2511m0 a() {
        return new C2511m0(e());
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ShadowGraphicsLayerElement)) {
            return false;
        }
        ShadowGraphicsLayerElement shadowGraphicsLayerElement = (ShadowGraphicsLayerElement) obj;
        return h.m(this.f13258b, shadowGraphicsLayerElement.f13258b) && C6496s.c(this.f13259c, shadowGraphicsLayerElement.f13259c) && this.f13260d == shadowGraphicsLayerElement.f13260d && C2544x0.q(this.f13261e, shadowGraphicsLayerElement.f13261e) && C2544x0.q(this.f13262f, shadowGraphicsLayerElement.f13262f);
    }

    public int hashCode() {
        return (((((((h.o(this.f13258b) * 31) + this.f13259c.hashCode()) * 31) + Boolean.hashCode(this.f13260d)) * 31) + C2544x0.w(this.f13261e)) * 31) + C2544x0.w(this.f13262f);
    }

    public final long i() {
        return this.f13261e;
    }

    public final boolean j() {
        return this.f13260d;
    }

    public final float k() {
        return this.f13258b;
    }

    public final g2 l() {
        return this.f13259c;
    }

    public final long m() {
        return this.f13262f;
    }

    /* renamed from: n */
    public void b(C2511m0 m0Var) {
        m0Var.n2(e());
        m0Var.m2();
    }

    public String toString() {
        return "ShadowGraphicsLayerElement(elevation=" + h.p(this.f13258b) + ", shape=" + this.f13259c + ", clip=" + this.f13260d + ", ambientColor=" + C2544x0.x(this.f13261e) + ", spotColor=" + C2544x0.x(this.f13262f) + ')';
    }

    private ShadowGraphicsLayerElement(float f10, g2 g2Var, boolean z10, long j10, long j11) {
        this.f13258b = f10;
        this.f13259c = g2Var;
        this.f13260d = z10;
        this.f13261e = j10;
        this.f13262f = j11;
    }
}
