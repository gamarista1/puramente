package Q3;

import P3.C1299b;
import P3.v;
import androidx.work.D;
import androidx.work.impl.C1857q;
import androidx.work.impl.P;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.w;
import androidx.work.impl.z;
import androidx.work.w;
import java.util.LinkedList;
import java.util.UUID;

/* renamed from: Q3.b  reason: case insensitive filesystem */
public abstract class C1342b implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final C1857q f5452a = new C1857q();

    /* renamed from: Q3.b$a */
    class a extends C1342b {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ P f5453b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ UUID f5454c;

        a(P p10, UUID uuid) {
            this.f5453b = p10;
            this.f5454c = uuid;
        }

        /* JADX INFO: finally extract failed */
        /* access modifiers changed from: package-private */
        public void g() {
            WorkDatabase n10 = this.f5453b.n();
            n10.e();
            try {
                a(this.f5453b, this.f5454c.toString());
                n10.A();
                n10.i();
                f(this.f5453b);
            } catch (Throwable th2) {
                n10.i();
                throw th2;
            }
        }
    }

    /* renamed from: Q3.b$b  reason: collision with other inner class name */
    class C0137b extends C1342b {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ P f5455b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ String f5456c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ boolean f5457d;

        C0137b(P p10, String str, boolean z10) {
            this.f5455b = p10;
            this.f5456c = str;
            this.f5457d = z10;
        }

        /* access modifiers changed from: package-private */
        public void g() {
            WorkDatabase n10 = this.f5455b.n();
            n10.e();
            try {
                for (String a10 : n10.H().f(this.f5456c)) {
                    a(this.f5455b, a10);
                }
                n10.A();
                n10.i();
                if (this.f5457d) {
                    f(this.f5455b);
                }
            } catch (Throwable th2) {
                n10.i();
                throw th2;
            }
        }
    }

    public static C1342b b(UUID uuid, P p10) {
        return new a(p10, uuid);
    }

    public static C1342b c(String str, P p10, boolean z10) {
        return new C0137b(p10, str, z10);
    }

    private void e(WorkDatabase workDatabase, String str) {
        v H10 = workDatabase.H();
        C1299b C10 = workDatabase.C();
        LinkedList linkedList = new LinkedList();
        linkedList.add(str);
        while (!linkedList.isEmpty()) {
            String str2 = (String) linkedList.remove();
            D g10 = H10.g(str2);
            if (!(g10 == D.SUCCEEDED || g10 == D.FAILED)) {
                H10.i(str2);
            }
            linkedList.addAll(C10.b(str2));
        }
    }

    /* access modifiers changed from: package-private */
    public void a(P p10, String str) {
        e(p10.n(), str);
        p10.k().t(str, 1);
        for (w a10 : p10.l()) {
            a10.a(str);
        }
    }

    public androidx.work.w d() {
        return this.f5452a;
    }

    /* access modifiers changed from: package-private */
    public void f(P p10) {
        z.h(p10.g(), p10.n(), p10.l());
    }

    /* access modifiers changed from: package-private */
    public abstract void g();

    public void run() {
        try {
            g();
            this.f5452a.a(androidx.work.w.f19041a);
        } catch (Throwable th2) {
            this.f5452a.a(new w.b.a(th2));
        }
    }
}
