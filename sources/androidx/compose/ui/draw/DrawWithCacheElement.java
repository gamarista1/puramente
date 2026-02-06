package androidx.compose.ui.draw;

import J0.V;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import o0.C2341d;
import yf.C6798l;

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u001b\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019R#\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00038\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d¨\u0006\u001e"}, d2 = {"Landroidx/compose/ui/draw/DrawWithCacheElement;", "LJ0/V;", "Landroidx/compose/ui/draw/a;", "Lkotlin/Function1;", "Lo0/d;", "Lo0/h;", "onBuildDrawCache", "<init>", "(Lyf/l;)V", "d", "()Landroidx/compose/ui/draw/a;", "node", "Llf/M;", "e", "(Landroidx/compose/ui/draw/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "b", "Lyf/l;", "getOnBuildDrawCache", "()Lyf/l;", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
final class DrawWithCacheElement extends V {

    /* renamed from: b  reason: collision with root package name */
    private final C6798l f13250b;

    public DrawWithCacheElement(C6798l lVar) {
        this.f13250b = lVar;
    }

    /* renamed from: d */
    public a a() {
        return new a(new C2341d(), this.f13250b);
    }

    /* renamed from: e */
    public void b(a aVar) {
        aVar.o2(this.f13250b);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof DrawWithCacheElement) && C6496s.c(this.f13250b, ((DrawWithCacheElement) obj).f13250b);
    }

    public int hashCode() {
        return this.f13250b.hashCode();
    }

    public String toString() {
        return "DrawWithCacheElement(onBuildDrawCache=" + this.f13250b + ')';
    }
}
