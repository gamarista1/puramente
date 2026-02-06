package androidx.compose.ui.input.key;

import J0.V;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import yf.C6798l;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\n\b\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B3\u0012\u0014\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0003\u0012\u0014\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0003¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0018\u001a\u00020\u00052\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019R%\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00038\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR%\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00038\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001b\u001a\u0004\b\u001f\u0010\u001d¨\u0006 "}, d2 = {"Landroidx/compose/ui/input/key/KeyInputElement;", "LJ0/V;", "Landroidx/compose/ui/input/key/b;", "Lkotlin/Function1;", "LB0/b;", "", "onKeyEvent", "onPreKeyEvent", "<init>", "(Lyf/l;Lyf/l;)V", "d", "()Landroidx/compose/ui/input/key/b;", "node", "Llf/M;", "e", "(Landroidx/compose/ui/input/key/b;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "b", "Lyf/l;", "getOnKeyEvent", "()Lyf/l;", "c", "getOnPreKeyEvent", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
final class KeyInputElement extends V {

    /* renamed from: b  reason: collision with root package name */
    private final C6798l f13434b;

    /* renamed from: c  reason: collision with root package name */
    private final C6798l f13435c;

    public KeyInputElement(C6798l lVar, C6798l lVar2) {
        this.f13434b = lVar;
        this.f13435c = lVar2;
    }

    /* renamed from: d */
    public b a() {
        return new b(this.f13434b, this.f13435c);
    }

    /* renamed from: e */
    public void b(b bVar) {
        bVar.l2(this.f13434b);
        bVar.m2(this.f13435c);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof KeyInputElement)) {
            return false;
        }
        KeyInputElement keyInputElement = (KeyInputElement) obj;
        return C6496s.c(this.f13434b, keyInputElement.f13434b) && C6496s.c(this.f13435c, keyInputElement.f13435c);
    }

    public int hashCode() {
        C6798l lVar = this.f13434b;
        int i10 = 0;
        int hashCode = (lVar == null ? 0 : lVar.hashCode()) * 31;
        C6798l lVar2 = this.f13435c;
        if (lVar2 != null) {
            i10 = lVar2.hashCode();
        }
        return hashCode + i10;
    }

    public String toString() {
        return "KeyInputElement(onKeyEvent=" + this.f13434b + ", onPreKeyEvent=" + this.f13435c + ')';
    }
}
