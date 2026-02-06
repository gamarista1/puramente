package androidx.compose.ui.graphics;

import J0.V;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import r0.C2544x0;
import r0.b2;
import r0.g2;

@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b+\b\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0001\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\u0006\u0010\u000b\u001a\u00020\u0003\u0012\u0006\u0010\f\u001a\u00020\u0003\u0012\u0006\u0010\r\u001a\u00020\u0003\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\u0006\u0010\u0018\u001a\u00020\u0016\u0012\u0006\u0010\u001a\u001a\u00020\u0019¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001d\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010!\u001a\u00020 2\u0006\u0010\u001f\u001a\u00020\u0002H\u0016¢\u0006\u0004\b!\u0010\"J\u0010\u0010$\u001a\u00020#HÖ\u0001¢\u0006\u0004\b$\u0010%J\u0010\u0010'\u001a\u00020&HÖ\u0001¢\u0006\u0004\b'\u0010(J\u001a\u0010+\u001a\u00020\u00122\b\u0010*\u001a\u0004\u0018\u00010)HÖ\u0003¢\u0006\u0004\b+\u0010,R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b-\u0010.\u001a\u0004\b/\u00100R\u0017\u0010\u0005\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b1\u0010.\u001a\u0004\b2\u00100R\u0017\u0010\u0006\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u001d\u0010.\u001a\u0004\b3\u00100R\u0017\u0010\u0007\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b!\u0010.\u001a\u0004\b4\u00100R\u0017\u0010\b\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b5\u0010.\u001a\u0004\b6\u00100R\u0017\u0010\t\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b7\u0010.\u001a\u0004\b8\u00100R\u0017\u0010\n\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b9\u0010.\u001a\u0004\b:\u00100R\u0017\u0010\u000b\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b;\u0010.\u001a\u0004\b<\u00100R\u0017\u0010\f\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b=\u0010.\u001a\u0004\b>\u00100R\u0017\u0010\r\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b?\u0010.\u001a\u0004\b@\u00100R\u001d\u0010\u000f\u001a\u00020\u000e8\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\bA\u0010B\u001a\u0004\bC\u0010DR\u0017\u0010\u0011\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\bE\u0010F\u001a\u0004\bG\u0010HR\u0017\u0010\u0013\u001a\u00020\u00128\u0006¢\u0006\f\n\u0004\bI\u0010J\u001a\u0004\bK\u0010LR\u001d\u0010\u0017\u001a\u00020\u00168\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\bM\u0010B\u001a\u0004\bN\u0010DR\u001d\u0010\u0018\u001a\u00020\u00168\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\bO\u0010B\u001a\u0004\bP\u0010DR\u001d\u0010\u001a\u001a\u00020\u00198\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\bQ\u0010R\u001a\u0004\bS\u0010(\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006T"}, d2 = {"Landroidx/compose/ui/graphics/GraphicsLayerElement;", "LJ0/V;", "Landroidx/compose/ui/graphics/e;", "", "scaleX", "scaleY", "alpha", "translationX", "translationY", "shadowElevation", "rotationX", "rotationY", "rotationZ", "cameraDistance", "Landroidx/compose/ui/graphics/f;", "transformOrigin", "Lr0/g2;", "shape", "", "clip", "Lr0/b2;", "renderEffect", "Lr0/x0;", "ambientShadowColor", "spotShadowColor", "Landroidx/compose/ui/graphics/a;", "compositingStrategy", "<init>", "(FFFFFFFFFFJLr0/g2;ZLr0/b2;JJILkotlin/jvm/internal/DefaultConstructorMarker;)V", "d", "()Landroidx/compose/ui/graphics/e;", "node", "Llf/M;", "e", "(Landroidx/compose/ui/graphics/e;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "b", "F", "getScaleX", "()F", "c", "getScaleY", "getAlpha", "getTranslationX", "f", "getTranslationY", "g", "getShadowElevation", "h", "getRotationX", "i", "getRotationY", "j", "getRotationZ", "k", "getCameraDistance", "l", "J", "getTransformOrigin-SzJe1aQ", "()J", "m", "Lr0/g2;", "getShape", "()Lr0/g2;", "n", "Z", "getClip", "()Z", "o", "getAmbientShadowColor-0d7_KjU", "p", "getSpotShadowColor-0d7_KjU", "q", "I", "getCompositingStrategy--NrFUSI", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
final class GraphicsLayerElement extends V {

    /* renamed from: b  reason: collision with root package name */
    private final float f13370b;

    /* renamed from: c  reason: collision with root package name */
    private final float f13371c;

    /* renamed from: d  reason: collision with root package name */
    private final float f13372d;

    /* renamed from: e  reason: collision with root package name */
    private final float f13373e;

    /* renamed from: f  reason: collision with root package name */
    private final float f13374f;

    /* renamed from: g  reason: collision with root package name */
    private final float f13375g;

    /* renamed from: h  reason: collision with root package name */
    private final float f13376h;

    /* renamed from: i  reason: collision with root package name */
    private final float f13377i;

    /* renamed from: j  reason: collision with root package name */
    private final float f13378j;

    /* renamed from: k  reason: collision with root package name */
    private final float f13379k;

    /* renamed from: l  reason: collision with root package name */
    private final long f13380l;

    /* renamed from: m  reason: collision with root package name */
    private final g2 f13381m;

    /* renamed from: n  reason: collision with root package name */
    private final boolean f13382n;

    /* renamed from: o  reason: collision with root package name */
    private final long f13383o;

    /* renamed from: p  reason: collision with root package name */
    private final long f13384p;

    /* renamed from: q  reason: collision with root package name */
    private final int f13385q;

    public /* synthetic */ GraphicsLayerElement(float f10, float f11, float f12, float f13, float f14, float f15, float f16, float f17, float f18, float f19, long j10, g2 g2Var, boolean z10, b2 b2Var, long j11, long j12, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(f10, f11, f12, f13, f14, f15, f16, f17, f18, f19, j10, g2Var, z10, b2Var, j11, j12, i10);
    }

    /* renamed from: d */
    public e a() {
        return new e(this.f13370b, this.f13371c, this.f13372d, this.f13373e, this.f13374f, this.f13375g, this.f13376h, this.f13377i, this.f13378j, this.f13379k, this.f13380l, this.f13381m, this.f13382n, (b2) null, this.f13383o, this.f13384p, this.f13385q, (DefaultConstructorMarker) null);
    }

    /* renamed from: e */
    public void b(e eVar) {
        eVar.h(this.f13370b);
        eVar.m(this.f13371c);
        eVar.c(this.f13372d);
        eVar.n(this.f13373e);
        eVar.f(this.f13374f);
        eVar.C(this.f13375g);
        eVar.j(this.f13376h);
        eVar.k(this.f13377i);
        eVar.l(this.f13378j);
        eVar.i(this.f13379k);
        eVar.F0(this.f13380l);
        eVar.O0(this.f13381m);
        eVar.y(this.f13382n);
        eVar.g((b2) null);
        eVar.v(this.f13383o);
        eVar.z(this.f13384p);
        eVar.q(this.f13385q);
        eVar.u2();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GraphicsLayerElement)) {
            return false;
        }
        GraphicsLayerElement graphicsLayerElement = (GraphicsLayerElement) obj;
        return Float.compare(this.f13370b, graphicsLayerElement.f13370b) == 0 && Float.compare(this.f13371c, graphicsLayerElement.f13371c) == 0 && Float.compare(this.f13372d, graphicsLayerElement.f13372d) == 0 && Float.compare(this.f13373e, graphicsLayerElement.f13373e) == 0 && Float.compare(this.f13374f, graphicsLayerElement.f13374f) == 0 && Float.compare(this.f13375g, graphicsLayerElement.f13375g) == 0 && Float.compare(this.f13376h, graphicsLayerElement.f13376h) == 0 && Float.compare(this.f13377i, graphicsLayerElement.f13377i) == 0 && Float.compare(this.f13378j, graphicsLayerElement.f13378j) == 0 && Float.compare(this.f13379k, graphicsLayerElement.f13379k) == 0 && f.e(this.f13380l, graphicsLayerElement.f13380l) && C6496s.c(this.f13381m, graphicsLayerElement.f13381m) && this.f13382n == graphicsLayerElement.f13382n && C6496s.c((Object) null, (Object) null) && C2544x0.q(this.f13383o, graphicsLayerElement.f13383o) && C2544x0.q(this.f13384p, graphicsLayerElement.f13384p) && a.e(this.f13385q, graphicsLayerElement.f13385q);
    }

    public int hashCode() {
        return (((((((((((((((((((((((((((((Float.hashCode(this.f13370b) * 31) + Float.hashCode(this.f13371c)) * 31) + Float.hashCode(this.f13372d)) * 31) + Float.hashCode(this.f13373e)) * 31) + Float.hashCode(this.f13374f)) * 31) + Float.hashCode(this.f13375g)) * 31) + Float.hashCode(this.f13376h)) * 31) + Float.hashCode(this.f13377i)) * 31) + Float.hashCode(this.f13378j)) * 31) + Float.hashCode(this.f13379k)) * 31) + f.h(this.f13380l)) * 31) + this.f13381m.hashCode()) * 31) + Boolean.hashCode(this.f13382n)) * 961) + C2544x0.w(this.f13383o)) * 31) + C2544x0.w(this.f13384p)) * 31) + a.f(this.f13385q);
    }

    public String toString() {
        return "GraphicsLayerElement(scaleX=" + this.f13370b + ", scaleY=" + this.f13371c + ", alpha=" + this.f13372d + ", translationX=" + this.f13373e + ", translationY=" + this.f13374f + ", shadowElevation=" + this.f13375g + ", rotationX=" + this.f13376h + ", rotationY=" + this.f13377i + ", rotationZ=" + this.f13378j + ", cameraDistance=" + this.f13379k + ", transformOrigin=" + f.i(this.f13380l) + ", shape=" + this.f13381m + ", clip=" + this.f13382n + ", renderEffect=" + null + ", ambientShadowColor=" + C2544x0.x(this.f13383o) + ", spotShadowColor=" + C2544x0.x(this.f13384p) + ", compositingStrategy=" + a.g(this.f13385q) + ')';
    }

    private GraphicsLayerElement(float f10, float f11, float f12, float f13, float f14, float f15, float f16, float f17, float f18, float f19, long j10, g2 g2Var, boolean z10, b2 b2Var, long j11, long j12, int i10) {
        this.f13370b = f10;
        this.f13371c = f11;
        this.f13372d = f12;
        this.f13373e = f13;
        this.f13374f = f14;
        this.f13375g = f15;
        this.f13376h = f16;
        this.f13377i = f17;
        this.f13378j = f18;
        this.f13379k = f19;
        this.f13380l = j10;
        this.f13381m = g2Var;
        this.f13382n = z10;
        this.f13383o = j11;
        this.f13384p = j12;
        this.f13385q = i10;
    }
}
