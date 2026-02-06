package di;

import ci.c;
import ci.e;
import java.util.Queue;
import org.slf4j.helpers.i;

public class a implements c {

    /* renamed from: a  reason: collision with root package name */
    String f67441a;

    /* renamed from: b  reason: collision with root package name */
    i f67442b;

    /* renamed from: c  reason: collision with root package name */
    Queue f67443c;

    public a(i iVar, Queue queue) {
        this.f67442b = iVar;
        this.f67441a = iVar.getName();
        this.f67443c = queue;
    }

    private void g(b bVar, e eVar, String str, Object[] objArr, Throwable th2) {
        d dVar = new d();
        dVar.j(System.currentTimeMillis());
        dVar.c(bVar);
        dVar.d(this.f67442b);
        dVar.e(this.f67441a);
        dVar.f(eVar);
        dVar.g(str);
        dVar.b(objArr);
        dVar.i(th2);
        dVar.h(Thread.currentThread().getName());
        this.f67443c.add(dVar);
    }

    private void h(b bVar, String str, Object[] objArr, Throwable th2) {
        g(bVar, (e) null, str, objArr, th2);
    }

    public void a(String str, Throwable th2) {
        h(b.ERROR, str, (Object[]) null, th2);
    }

    public boolean b() {
        return true;
    }

    public void c(String str, Throwable th2) {
        h(b.WARN, str, (Object[]) null, th2);
    }

    public void d(String str, Object... objArr) {
        h(b.TRACE, str, objArr, (Throwable) null);
    }

    public void e(String str, Object obj) {
        h(b.DEBUG, str, new Object[]{obj}, (Throwable) null);
    }

    public void f(String str) {
        h(b.WARN, str, (Object[]) null, (Throwable) null);
    }

    public String getName() {
        return this.f67441a;
    }

    public void warn(String str, Object... objArr) {
        h(b.WARN, str, objArr, (Throwable) null);
    }
}
