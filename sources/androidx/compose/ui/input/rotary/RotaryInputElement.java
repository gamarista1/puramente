package androidx.compose.ui.input.rotary;

import J0.V;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import yf.C6798l;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\n\b\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B3\u0012\u0014\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0003\u0012\u0014\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0003¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0018\u001a\u00020\u00052\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019R%\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00038\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR%\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00038\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001b\u001a\u0004\b\u001f\u0010\u001d¨\u0006 "}, d2 = {"Landroidx/compose/ui/input/rotary/RotaryInputElement;", "LJ0/V;", "Landroidx/compose/ui/input/rotary/b;", "Lkotlin/Function1;", "LF0/b;", "", "onRotaryScrollEvent", "onPreRotaryScrollEvent", "<init>", "(Lyf/l;Lyf/l;)V", "d", "()Landroidx/compose/ui/input/rotary/b;", "node", "Llf/M;", "e", "(Landroidx/compose/ui/input/rotary/b;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "b", "Lyf/l;", "getOnRotaryScrollEvent", "()Lyf/l;", "c", "getOnPreRotaryScrollEvent", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
final class RotaryInputElement extends V {

    /* renamed from: b  reason: collision with root package name */
    private final C6798l f13446b;

    /* renamed from: c  reason: collision with root package name */
    private final C6798l f13447c;

    public RotaryInputElement(C6798l lVar, C6798l lVar2) {
        this.f13446b = lVar;
        this.f13447c = lVar2;
    }

    /* renamed from: d */
    public b a() {
        return new b(this.f13446b, this.f13447c);
    }

    /* renamed from: e */
    public void b(b bVar) {
        bVar.l2(this.f13446b);
        bVar.m2(this.f13447c);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RotaryInputElement)) {
            return false;
        }
        RotaryInputElement rotaryInputElement = (RotaryInputElement) obj;
        return C6496s.c(this.f13446b, rotaryInputElement.f13446b) && C6496s.c(this.f13447c, rotaryInputElement.f13447c);
    }

    public int hashCode() {
        C6798l lVar = this.f13446b;
        int i10 = 0;
        int hashCode = (lVar == null ? 0 : lVar.hashCode()) * 31;
        C6798l lVar2 = this.f13447c;
        if (lVar2 != null) {
            i10 = lVar2.hashCode();
        }
        return hashCode + i10;
    }

    public String toString() {
        return "RotaryInputElement(onRotaryScrollEvent=" + this.f13446b + ", onPreRotaryScrollEvent=" + this.f13447c + ')';
    }
}
