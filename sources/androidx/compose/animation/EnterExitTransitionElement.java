package androidx.compose.animation;

import J0.V;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import v.C2732o;
import w.n0;
import yf.C6787a;

@Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b)\b\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0001\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u001e\u0010\t\u001a\u001a\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0018\u00010\u0006R\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u001e\u0010\u000b\u001a\u001a\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0006R\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u001e\u0010\f\u001a\u001a\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0006R\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011\u0012\u0006\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001a\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001f\u001a\u00020\u001eHÖ\u0001¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010\"\u001a\u00020!HÖ\u0001¢\u0006\u0004\b\"\u0010#J\u001a\u0010&\u001a\u00020\u00122\b\u0010%\u001a\u0004\u0018\u00010$HÖ\u0003¢\u0006\u0004\b&\u0010'R\u001d\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0006¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+R:\u0010\t\u001a\u001a\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0018\u00010\u0006R\b\u0012\u0004\u0012\u00020\u00040\u00038\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/\"\u0004\b0\u00101R:\u0010\u000b\u001a\u001a\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0006R\b\u0012\u0004\u0012\u00020\u00040\u00038\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010-\u001a\u0004\b2\u0010/\"\u0004\b3\u00101R:\u0010\f\u001a\u001a\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0006R\b\u0012\u0004\u0012\u00020\u00040\u00038\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u001c\u0010-\u001a\u0004\b4\u0010/\"\u0004\b5\u00101R\"\u0010\u000e\u001a\u00020\r8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b6\u00107\u001a\u0004\b8\u00109\"\u0004\b:\u0010;R\"\u0010\u0010\u001a\u00020\u000f8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b<\u0010=\u001a\u0004\b>\u0010?\"\u0004\b@\u0010AR(\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\bB\u0010C\u001a\u0004\b\u0013\u0010D\"\u0004\bE\u0010FR\"\u0010\u0015\u001a\u00020\u00148\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\bG\u0010H\u001a\u0004\bI\u0010J\"\u0004\bK\u0010L¨\u0006M"}, d2 = {"Landroidx/compose/animation/EnterExitTransitionElement;", "LJ0/V;", "Landroidx/compose/animation/h;", "Lw/n0;", "Lv/j;", "transition", "Lw/n0$a;", "Lc1/r;", "Lw/n;", "sizeAnimation", "Lc1/n;", "offsetAnimation", "slideAnimation", "Landroidx/compose/animation/i;", "enter", "Landroidx/compose/animation/k;", "exit", "Lkotlin/Function0;", "", "isEnabled", "Lv/o;", "graphicsLayerBlock", "<init>", "(Lw/n0;Lw/n0$a;Lw/n0$a;Lw/n0$a;Landroidx/compose/animation/i;Landroidx/compose/animation/k;Lyf/a;Lv/o;)V", "d", "()Landroidx/compose/animation/h;", "node", "Llf/M;", "e", "(Landroidx/compose/animation/h;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "b", "Lw/n0;", "getTransition", "()Lw/n0;", "c", "Lw/n0$a;", "getSizeAnimation", "()Lw/n0$a;", "setSizeAnimation", "(Lw/n0$a;)V", "getOffsetAnimation", "setOffsetAnimation", "getSlideAnimation", "setSlideAnimation", "f", "Landroidx/compose/animation/i;", "getEnter", "()Landroidx/compose/animation/i;", "setEnter", "(Landroidx/compose/animation/i;)V", "g", "Landroidx/compose/animation/k;", "getExit", "()Landroidx/compose/animation/k;", "setExit", "(Landroidx/compose/animation/k;)V", "h", "Lyf/a;", "()Lyf/a;", "setEnabled", "(Lyf/a;)V", "i", "Lv/o;", "getGraphicsLayerBlock", "()Lv/o;", "setGraphicsLayerBlock", "(Lv/o;)V", "animation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
final class EnterExitTransitionElement extends V {

    /* renamed from: b  reason: collision with root package name */
    private final n0 f12217b;

    /* renamed from: c  reason: collision with root package name */
    private n0.a f12218c;

    /* renamed from: d  reason: collision with root package name */
    private n0.a f12219d;

    /* renamed from: e  reason: collision with root package name */
    private n0.a f12220e;

    /* renamed from: f  reason: collision with root package name */
    private i f12221f;

    /* renamed from: g  reason: collision with root package name */
    private k f12222g;

    /* renamed from: h  reason: collision with root package name */
    private C6787a f12223h;

    /* renamed from: i  reason: collision with root package name */
    private C2732o f12224i;

    public EnterExitTransitionElement(n0 n0Var, n0.a aVar, n0.a aVar2, n0.a aVar3, i iVar, k kVar, C6787a aVar4, C2732o oVar) {
        this.f12217b = n0Var;
        this.f12218c = aVar;
        this.f12219d = aVar2;
        this.f12220e = aVar3;
        this.f12221f = iVar;
        this.f12222g = kVar;
        this.f12223h = aVar4;
        this.f12224i = oVar;
    }

    /* renamed from: d */
    public h a() {
        return new h(this.f12217b, this.f12218c, this.f12219d, this.f12220e, this.f12221f, this.f12222g, this.f12223h, this.f12224i);
    }

    /* renamed from: e */
    public void b(h hVar) {
        hVar.w2(this.f12217b);
        hVar.u2(this.f12218c);
        hVar.t2(this.f12219d);
        hVar.v2(this.f12220e);
        hVar.p2(this.f12221f);
        hVar.q2(this.f12222g);
        hVar.o2(this.f12223h);
        hVar.r2(this.f12224i);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EnterExitTransitionElement)) {
            return false;
        }
        EnterExitTransitionElement enterExitTransitionElement = (EnterExitTransitionElement) obj;
        return C6496s.c(this.f12217b, enterExitTransitionElement.f12217b) && C6496s.c(this.f12218c, enterExitTransitionElement.f12218c) && C6496s.c(this.f12219d, enterExitTransitionElement.f12219d) && C6496s.c(this.f12220e, enterExitTransitionElement.f12220e) && C6496s.c(this.f12221f, enterExitTransitionElement.f12221f) && C6496s.c(this.f12222g, enterExitTransitionElement.f12222g) && C6496s.c(this.f12223h, enterExitTransitionElement.f12223h) && C6496s.c(this.f12224i, enterExitTransitionElement.f12224i);
    }

    public int hashCode() {
        int hashCode = this.f12217b.hashCode() * 31;
        n0.a aVar = this.f12218c;
        int i10 = 0;
        int hashCode2 = (hashCode + (aVar == null ? 0 : aVar.hashCode())) * 31;
        n0.a aVar2 = this.f12219d;
        int hashCode3 = (hashCode2 + (aVar2 == null ? 0 : aVar2.hashCode())) * 31;
        n0.a aVar3 = this.f12220e;
        if (aVar3 != null) {
            i10 = aVar3.hashCode();
        }
        return ((((((((hashCode3 + i10) * 31) + this.f12221f.hashCode()) * 31) + this.f12222g.hashCode()) * 31) + this.f12223h.hashCode()) * 31) + this.f12224i.hashCode();
    }

    public String toString() {
        return "EnterExitTransitionElement(transition=" + this.f12217b + ", sizeAnimation=" + this.f12218c + ", offsetAnimation=" + this.f12219d + ", slideAnimation=" + this.f12220e + ", enter=" + this.f12221f + ", exit=" + this.f12222g + ", isEnabled=" + this.f12223h + ", graphicsLayerBlock=" + this.f12224i + ')';
    }
}
