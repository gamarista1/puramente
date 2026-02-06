package androidx.compose.foundation.text.input.internal;

import J.C1228y;
import J0.V;
import M.n0;
import M.q0;
import P.G;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;

@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\b\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u001f\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u001a\u001a\u00020\u00192\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u000b\u0010$\u001a\u0004\b%\u0010&¨\u0006'"}, d2 = {"Landroidx/compose/foundation/text/input/internal/LegacyAdaptingPlatformTextInputModifier;", "LJ0/V;", "LM/n0;", "LM/q0;", "serviceAdapter", "LJ/y;", "legacyTextFieldState", "LP/G;", "textFieldSelectionManager", "<init>", "(LM/q0;LJ/y;LP/G;)V", "d", "()LM/n0;", "node", "Llf/M;", "e", "(LM/n0;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "b", "LM/q0;", "getServiceAdapter", "()LM/q0;", "c", "LJ/y;", "getLegacyTextFieldState", "()LJ/y;", "LP/G;", "getTextFieldSelectionManager", "()LP/G;", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
final class LegacyAdaptingPlatformTextInputModifier extends V {

    /* renamed from: b  reason: collision with root package name */
    private final q0 f13145b;

    /* renamed from: c  reason: collision with root package name */
    private final C1228y f13146c;

    /* renamed from: d  reason: collision with root package name */
    private final G f13147d;

    public LegacyAdaptingPlatformTextInputModifier(q0 q0Var, C1228y yVar, G g10) {
        this.f13145b = q0Var;
        this.f13146c = yVar;
        this.f13147d = g10;
    }

    /* renamed from: d */
    public n0 a() {
        return new n0(this.f13145b, this.f13146c, this.f13147d);
    }

    /* renamed from: e */
    public void b(n0 n0Var) {
        n0Var.n2(this.f13145b);
        n0Var.m2(this.f13146c);
        n0Var.o2(this.f13147d);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LegacyAdaptingPlatformTextInputModifier)) {
            return false;
        }
        LegacyAdaptingPlatformTextInputModifier legacyAdaptingPlatformTextInputModifier = (LegacyAdaptingPlatformTextInputModifier) obj;
        return C6496s.c(this.f13145b, legacyAdaptingPlatformTextInputModifier.f13145b) && C6496s.c(this.f13146c, legacyAdaptingPlatformTextInputModifier.f13146c) && C6496s.c(this.f13147d, legacyAdaptingPlatformTextInputModifier.f13147d);
    }

    public int hashCode() {
        return (((this.f13145b.hashCode() * 31) + this.f13146c.hashCode()) * 31) + this.f13147d.hashCode();
    }

    public String toString() {
        return "LegacyAdaptingPlatformTextInputModifier(serviceAdapter=" + this.f13145b + ", legacyTextFieldState=" + this.f13146c + ", textFieldSelectionManager=" + this.f13147d + ')';
    }
}
