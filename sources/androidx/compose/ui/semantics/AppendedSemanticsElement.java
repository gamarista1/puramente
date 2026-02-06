package androidx.compose.ui.semantics;

import J0.V;
import O0.c;
import O0.j;
import O0.l;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import yf.C6798l;

@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0004\b\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003B#\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000f\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u0019\u001a\u00020\u00042\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR#\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u00068\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R\u0014\u0010&\u001a\u00020#8VX\u0004¢\u0006\u0006\u001a\u0004\b$\u0010%¨\u0006'"}, d2 = {"Landroidx/compose/ui/semantics/AppendedSemanticsElement;", "LJ0/V;", "LO0/c;", "LO0/l;", "", "mergeDescendants", "Lkotlin/Function1;", "LO0/v;", "Llf/M;", "properties", "<init>", "(ZLyf/l;)V", "d", "()LO0/c;", "node", "e", "(LO0/c;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "b", "Z", "getMergeDescendants", "()Z", "c", "Lyf/l;", "getProperties", "()Lyf/l;", "LO0/j;", "t", "()LO0/j;", "semanticsConfiguration", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class AppendedSemanticsElement extends V implements l {

    /* renamed from: b  reason: collision with root package name */
    private final boolean f14098b;

    /* renamed from: c  reason: collision with root package name */
    private final C6798l f14099c;

    public AppendedSemanticsElement(boolean z10, C6798l lVar) {
        this.f14098b = z10;
        this.f14099c = lVar;
    }

    /* renamed from: d */
    public c a() {
        return new c(this.f14098b, false, this.f14099c);
    }

    /* renamed from: e */
    public void b(c cVar) {
        cVar.l2(this.f14098b);
        cVar.m2(this.f14099c);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AppendedSemanticsElement)) {
            return false;
        }
        AppendedSemanticsElement appendedSemanticsElement = (AppendedSemanticsElement) obj;
        return this.f14098b == appendedSemanticsElement.f14098b && C6496s.c(this.f14099c, appendedSemanticsElement.f14099c);
    }

    public int hashCode() {
        return (Boolean.hashCode(this.f14098b) * 31) + this.f14099c.hashCode();
    }

    public j t() {
        j jVar = new j();
        jVar.D(this.f14098b);
        this.f14099c.invoke(jVar);
        return jVar;
    }

    public String toString() {
        return "AppendedSemanticsElement(mergeDescendants=" + this.f14098b + ", properties=" + this.f14099c + ')';
    }
}
