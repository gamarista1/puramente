package androidx.compose.ui.platform;

import J0.V;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"Landroidx/compose/ui/platform/TestTagElement;", "LJ0/V;", "Landroidx/compose/ui/platform/o1;", "", "tag", "<init>", "(Ljava/lang/String;)V", "d", "()Landroidx/compose/ui/platform/o1;", "node", "Llf/M;", "e", "(Landroidx/compose/ui/platform/o1;)V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "b", "Ljava/lang/String;", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
final class TestTagElement extends V {

    /* renamed from: b  reason: collision with root package name */
    private final String f13673b;

    public TestTagElement(String str) {
        this.f13673b = str;
    }

    /* renamed from: d */
    public o1 a() {
        return new o1(this.f13673b);
    }

    /* renamed from: e */
    public void b(o1 o1Var) {
        o1Var.l2(this.f13673b);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TestTagElement)) {
            return false;
        }
        return C6496s.c(this.f13673b, ((TestTagElement) obj).f13673b);
    }

    public int hashCode() {
        return this.f13673b.hashCode();
    }
}
