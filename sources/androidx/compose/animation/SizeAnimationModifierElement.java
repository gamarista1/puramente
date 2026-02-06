package androidx.compose.animation;

import J0.V;
import k0.c;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import w.C2763G;
import yf.p;

@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\b\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B9\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u001a\u0010\n\u001a\u0016\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\t\u0018\u00010\b¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0010\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u001b\u001a\u00020\u001a2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018HÖ\u0003¢\u0006\u0004\b\u001b\u0010\u001cR\u001d\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R+\u0010\n\u001a\u0016\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\t\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\r\u0010%\u001a\u0004\b&\u0010'¨\u0006("}, d2 = {"Landroidx/compose/animation/SizeAnimationModifierElement;", "LJ0/V;", "Landroidx/compose/animation/m;", "Lw/G;", "Lc1/r;", "animationSpec", "Lk0/c;", "alignment", "Lkotlin/Function2;", "Llf/M;", "finishedListener", "<init>", "(Lw/G;Lk0/c;Lyf/p;)V", "d", "()Landroidx/compose/animation/m;", "node", "e", "(Landroidx/compose/animation/m;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "b", "Lw/G;", "getAnimationSpec", "()Lw/G;", "c", "Lk0/c;", "getAlignment", "()Lk0/c;", "Lyf/p;", "getFinishedListener", "()Lyf/p;", "animation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
final class SizeAnimationModifierElement extends V {

    /* renamed from: b  reason: collision with root package name */
    private final C2763G f12225b;

    /* renamed from: c  reason: collision with root package name */
    private final c f12226c;

    /* renamed from: d  reason: collision with root package name */
    private final p f12227d;

    public SizeAnimationModifierElement(C2763G g10, c cVar, p pVar) {
        this.f12225b = g10;
        this.f12226c = cVar;
        this.f12227d = pVar;
    }

    /* renamed from: d */
    public m a() {
        return new m(this.f12225b, this.f12226c, this.f12227d);
    }

    /* renamed from: e */
    public void b(m mVar) {
        mVar.s2(this.f12225b);
        mVar.t2(this.f12227d);
        mVar.q2(this.f12226c);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SizeAnimationModifierElement)) {
            return false;
        }
        SizeAnimationModifierElement sizeAnimationModifierElement = (SizeAnimationModifierElement) obj;
        return C6496s.c(this.f12225b, sizeAnimationModifierElement.f12225b) && C6496s.c(this.f12226c, sizeAnimationModifierElement.f12226c) && C6496s.c(this.f12227d, sizeAnimationModifierElement.f12227d);
    }

    public int hashCode() {
        int hashCode = ((this.f12225b.hashCode() * 31) + this.f12226c.hashCode()) * 31;
        p pVar = this.f12227d;
        return hashCode + (pVar == null ? 0 : pVar.hashCode());
    }

    public String toString() {
        return "SizeAnimationModifierElement(animationSpec=" + this.f12225b + ", alignment=" + this.f12226c + ", finishedListener=" + this.f12227d + ')';
    }
}
