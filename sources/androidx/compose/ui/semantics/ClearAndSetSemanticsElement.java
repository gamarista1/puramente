package androidx.compose.ui.semantics;

import J0.V;
import O0.c;
import O0.j;
import O0.l;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import yf.C6798l;

@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003B\u001b\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\r\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019R#\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00048\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0014\u0010!\u001a\u00020\u001e8VX\u0004¢\u0006\u0006\u001a\u0004\b\u001f\u0010 ¨\u0006\""}, d2 = {"Landroidx/compose/ui/semantics/ClearAndSetSemanticsElement;", "LJ0/V;", "LO0/c;", "LO0/l;", "Lkotlin/Function1;", "LO0/v;", "Llf/M;", "properties", "<init>", "(Lyf/l;)V", "d", "()LO0/c;", "node", "e", "(LO0/c;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "b", "Lyf/l;", "getProperties", "()Lyf/l;", "LO0/j;", "t", "()LO0/j;", "semanticsConfiguration", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class ClearAndSetSemanticsElement extends V implements l {

    /* renamed from: b  reason: collision with root package name */
    private final C6798l f14100b;

    public ClearAndSetSemanticsElement(C6798l lVar) {
        this.f14100b = lVar;
    }

    /* renamed from: d */
    public c a() {
        return new c(false, true, this.f14100b);
    }

    /* renamed from: e */
    public void b(c cVar) {
        cVar.m2(this.f14100b);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ClearAndSetSemanticsElement) && C6496s.c(this.f14100b, ((ClearAndSetSemanticsElement) obj).f14100b);
    }

    public int hashCode() {
        return this.f14100b.hashCode();
    }

    public j t() {
        j jVar = new j();
        jVar.D(false);
        jVar.C(true);
        this.f14100b.invoke(jVar);
        return jVar;
    }

    public String toString() {
        return "ClearAndSetSemanticsElement(properties=" + this.f14100b + ')';
    }
}
