package Qb;

import Qb.e;
import Tb.b;
import Tb.i;
import Tb.n;
import com.fasterxml.jackson.core.util.MinimalPrettyPrinter;

public class c {

    /* renamed from: a  reason: collision with root package name */
    private final e.a f52250a;

    /* renamed from: b  reason: collision with root package name */
    private final i f52251b;

    /* renamed from: c  reason: collision with root package name */
    private final i f52252c;

    /* renamed from: d  reason: collision with root package name */
    private final b f52253d;

    /* renamed from: e  reason: collision with root package name */
    private final b f52254e;

    private c(e.a aVar, i iVar, b bVar, b bVar2, i iVar2) {
        this.f52250a = aVar;
        this.f52251b = iVar;
        this.f52253d = bVar;
        this.f52254e = bVar2;
        this.f52252c = iVar2;
    }

    public static c b(b bVar, i iVar) {
        return new c(e.a.CHILD_ADDED, iVar, bVar, (b) null, (i) null);
    }

    public static c c(b bVar, n nVar) {
        return b(bVar, i.b(nVar));
    }

    public static c d(b bVar, i iVar, i iVar2) {
        return new c(e.a.CHILD_CHANGED, iVar, bVar, (b) null, iVar2);
    }

    public static c e(b bVar, n nVar, n nVar2) {
        return d(bVar, i.b(nVar), i.b(nVar2));
    }

    public static c f(b bVar, i iVar) {
        return new c(e.a.CHILD_MOVED, iVar, bVar, (b) null, (i) null);
    }

    public static c g(b bVar, i iVar) {
        return new c(e.a.CHILD_REMOVED, iVar, bVar, (b) null, (i) null);
    }

    public static c h(b bVar, n nVar) {
        return g(bVar, i.b(nVar));
    }

    public static c n(i iVar) {
        return new c(e.a.VALUE, iVar, (b) null, (b) null, (i) null);
    }

    public c a(b bVar) {
        return new c(this.f52250a, this.f52251b, this.f52253d, bVar, this.f52252c);
    }

    public b i() {
        return this.f52253d;
    }

    public e.a j() {
        return this.f52250a;
    }

    public i k() {
        return this.f52251b;
    }

    public i l() {
        return this.f52252c;
    }

    public b m() {
        return this.f52254e;
    }

    public String toString() {
        return "Change: " + this.f52250a + MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR + this.f52253d;
    }
}
