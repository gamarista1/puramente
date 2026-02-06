package com.amazon.a.a.n.a;

import android.app.Application;
import android.content.Intent;
import android.os.RemoteException;
import com.amazon.a.a.i.e;
import com.amazon.a.a.l.b;
import com.amazon.a.a.n.a.a.d;
import com.amazon.a.a.n.a.a.f;
import com.amazon.a.a.o.c;
import com.amazon.d.a.c;
import com.amazon.d.a.g;
import com.amazon.d.a.h;
import com.amazon.d.a.j;
import java.util.Map;

public abstract class a extends com.amazon.a.a.n.c.a {

    /* renamed from: b  reason: collision with root package name */
    private static final c f37305b = new c("AbstractCommandTask");
    @com.amazon.a.a.k.a

    /* renamed from: a  reason: collision with root package name */
    protected b f37306a;
    /* access modifiers changed from: private */
    @com.amazon.a.a.k.a

    /* renamed from: c  reason: collision with root package name */
    public Application f37307c;
    @com.amazon.a.a.k.a

    /* renamed from: d  reason: collision with root package name */
    private d f37308d;
    @com.amazon.a.a.k.a

    /* renamed from: e  reason: collision with root package name */
    private e f37309e;
    @com.amazon.a.a.k.a

    /* renamed from: f  reason: collision with root package name */
    private com.amazon.a.a.h.c f37310f;
    @com.amazon.a.a.k.a

    /* renamed from: g  reason: collision with root package name */
    private b f37311g;

    private void b(j jVar) {
        if (c.f37534a) {
            f37305b.a("Command executed successfully");
        }
        a(jVar);
    }

    private com.amazon.d.a.c i() {
        return new c.a() {
            public String a() {
                return a.this.c();
            }

            public String b() {
                return a.this.a_();
            }

            public Map c() {
                return a.this.b();
            }

            public String d() {
                return a.this.f37307c.getPackageName();
            }
        };
    }

    private void j() {
        if (!m()) {
            this.f37308d.b();
        }
    }

    /* access modifiers changed from: protected */
    public abstract void a(h hVar);

    /* access modifiers changed from: protected */
    public abstract void a(j jVar);

    /* access modifiers changed from: protected */
    public abstract String a_();

    /* access modifiers changed from: protected */
    public abstract Map<String, Object> b();

    /* access modifiers changed from: protected */
    public abstract String c();

    /* access modifiers changed from: protected */
    public abstract boolean d();

    /* access modifiers changed from: protected */
    public void e() {
    }

    /* access modifiers changed from: protected */
    public boolean f() {
        return true;
    }

    /* access modifiers changed from: protected */
    public String g() {
        return a_() + "_failure";
    }

    /* access modifiers changed from: protected */
    public String h() {
        return a_() + "_success";
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0079, code lost:
        if (com.amazon.a.a.o.c.f37534a != false) goto L_0x007b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x007b, code lost:
        f37305b.a("Task finished");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0080, code lost:
        j();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0089, code lost:
        if (com.amazon.a.a.o.c.f37534a == false) goto L_0x0080;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x008c, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a() {
        /*
            r5 = this;
            java.lang.String r0 = "----------------------------------------------"
            java.lang.String r1 = "Task finished"
            boolean r2 = com.amazon.a.a.o.c.f37534a     // Catch:{ all -> 0x0029 }
            if (r2 == 0) goto L_0x002b
            com.amazon.a.a.o.c r2 = f37305b     // Catch:{ all -> 0x0029 }
            r2.a(r0)     // Catch:{ all -> 0x0029 }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x0029 }
            r3.<init>()     // Catch:{ all -> 0x0029 }
            java.lang.String r4 = "Executing: "
            r3.append(r4)     // Catch:{ all -> 0x0029 }
            java.lang.String r4 = r5.a_()     // Catch:{ all -> 0x0029 }
            r3.append(r4)     // Catch:{ all -> 0x0029 }
            java.lang.String r3 = r3.toString()     // Catch:{ all -> 0x0029 }
            r2.a(r3)     // Catch:{ all -> 0x0029 }
            r2.a(r0)     // Catch:{ all -> 0x0029 }
            goto L_0x002b
        L_0x0029:
            r0 = move-exception
            goto L_0x0084
        L_0x002b:
            r5.e()     // Catch:{ all -> 0x0029 }
            boolean r0 = r5.d()     // Catch:{ all -> 0x0029 }
            if (r0 != 0) goto L_0x004c
            boolean r0 = com.amazon.a.a.o.c.f37534a     // Catch:{ all -> 0x0029 }
            if (r0 == 0) goto L_0x003f
            com.amazon.a.a.o.c r0 = f37305b     // Catch:{ all -> 0x0029 }
            java.lang.String r2 = "Execution not needed, quitting"
            r0.a(r2)     // Catch:{ all -> 0x0029 }
        L_0x003f:
            boolean r0 = com.amazon.a.a.o.c.f37534a
            if (r0 == 0) goto L_0x0048
            com.amazon.a.a.o.c r0 = f37305b
            r0.a(r1)
        L_0x0048:
            r5.j()
            return
        L_0x004c:
            boolean r0 = com.amazon.a.a.o.c.f37534a     // Catch:{ all -> 0x0029 }
            if (r0 == 0) goto L_0x006a
            com.amazon.a.a.o.c r0 = f37305b     // Catch:{ all -> 0x0029 }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x0029 }
            r2.<init>()     // Catch:{ all -> 0x0029 }
            java.lang.String r3 = "Executing Command: "
            r2.append(r3)     // Catch:{ all -> 0x0029 }
            java.lang.String r3 = r5.a_()     // Catch:{ all -> 0x0029 }
            r2.append(r3)     // Catch:{ all -> 0x0029 }
            java.lang.String r2 = r2.toString()     // Catch:{ all -> 0x0029 }
            r0.a(r2)     // Catch:{ all -> 0x0029 }
        L_0x006a:
            com.amazon.a.a.n.a.d r0 = r5.f37308d     // Catch:{ all -> 0x0029 }
            com.amazon.d.a.c r2 = r5.i()     // Catch:{ all -> 0x0029 }
            com.amazon.a.a.n.a.c r0 = r0.a((com.amazon.d.a.c) r2)     // Catch:{ all -> 0x0029 }
            r5.a((com.amazon.a.a.n.a.c) r0)     // Catch:{ all -> 0x0029 }
            boolean r0 = com.amazon.a.a.o.c.f37534a
            if (r0 == 0) goto L_0x0080
        L_0x007b:
            com.amazon.a.a.o.c r0 = f37305b
            r0.a(r1)
        L_0x0080:
            r5.j()
            goto L_0x008c
        L_0x0084:
            r5.a((java.lang.Throwable) r0)     // Catch:{ all -> 0x008d }
            boolean r0 = com.amazon.a.a.o.c.f37534a
            if (r0 == 0) goto L_0x0080
            goto L_0x007b
        L_0x008c:
            return
        L_0x008d:
            r0 = move-exception
            boolean r2 = com.amazon.a.a.o.c.f37534a
            if (r2 == 0) goto L_0x0097
            com.amazon.a.a.o.c r2 = f37305b
            r2.a(r1)
        L_0x0097:
            r5.j()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.a.a.n.a.a.a():void");
    }

    private void b(h hVar) {
        if (com.amazon.a.a.o.c.f37534a) {
            com.amazon.a.a.o.c cVar = f37305b;
            cVar.a("Command failed execution: " + hVar.b());
        }
        a(hVar);
    }

    private com.amazon.a.a.d.b b(Throwable th2) {
        if (th2 instanceof com.amazon.a.a.d.b) {
            return (com.amazon.a.a.d.b) th2;
        }
        if (th2 instanceof RemoteException) {
            return new d((RemoteException) th2);
        }
        return new com.amazon.a.a.n.a.a.h(th2);
    }

    /* access modifiers changed from: protected */
    public void b(com.amazon.a.a.d.b bVar) {
        com.amazon.a.a.o.c cVar = f37305b;
        cVar.b("On Exception!!!!: " + bVar);
    }

    private void a(c cVar) {
        if (com.amazon.a.a.o.c.f37534a) {
            com.amazon.a.a.o.c cVar2 = f37305b;
            cVar2.a("Received result from CommandService: " + cVar);
        }
        if (cVar == null) {
            if (com.amazon.a.a.o.c.f37534a) {
                f37305b.a("Received null result from command service, exiting task");
            }
        } else if (cVar.e() != null) {
            a(cVar.e());
        } else {
            this.f37311g.a(cVar.a(), this.f37308d.a());
            if (cVar.b() != null) {
                b(cVar.b());
            } else if (cVar.c() != null) {
                b(cVar.c());
            } else if (f()) {
                a(cVar.d());
            }
        }
    }

    private void a(g gVar) {
        throw new f(gVar);
    }

    private void a(com.amazon.d.a.f fVar) {
        if (com.amazon.a.a.o.c.f37534a) {
            f37305b.a("Handling Decision");
        }
        try {
            f fVar2 = new f(fVar);
            this.f37309e.a(fVar2);
            com.amazon.d.a.a i10 = fVar2.i();
            if (i10 == null) {
                if (com.amazon.a.a.o.c.f37534a) {
                    f37305b.a("DecisionChooser returned null!!, expiring");
                }
                a(fVar, e.EXPIRATION_DURATION_ELAPSED);
                return;
            }
            a(fVar, i10);
        } catch (com.amazon.a.a.n.a.a.e e10) {
            a(fVar, e10.a());
        }
    }

    private void a(com.amazon.d.a.f fVar, com.amazon.d.a.a aVar) {
        if (com.amazon.a.a.o.c.f37534a) {
            com.amazon.a.a.o.c cVar = f37305b;
            cVar.a("Handling customer choice: " + aVar);
        }
        Intent b10 = aVar.b();
        if (b10 != null) {
            if (com.amazon.a.a.o.c.f37534a) {
                f37305b.a("Choice has intent, scheduling it to be fired!!");
            }
            com.amazon.a.a.l.a a10 = this.f37306a.a(b10);
            if (a10 == null) {
                if (com.amazon.a.a.o.c.f37534a) {
                    f37305b.a("No result recived, expiring decision");
                }
                a(fVar, e.EXPIRATION_DURATION_ELAPSED);
            } else if (a10.d() == 0) {
                if (com.amazon.a.a.o.c.f37534a) {
                    f37305b.a("Result canceled, expiring decision");
                }
                a(fVar, e.ACTION_CANCELED);
            } else {
                if (com.amazon.a.a.o.c.f37534a) {
                    f37305b.a("Result received!!!, notifying service");
                }
                a(this.f37308d.a(aVar));
            }
        } else {
            if (com.amazon.a.a.o.c.f37534a) {
                f37305b.a("No intent given, choosing now");
            }
            a(this.f37308d.a(aVar));
        }
    }

    private void a(com.amazon.d.a.f fVar, e eVar) {
        if (com.amazon.a.a.o.c.f37534a) {
            com.amazon.a.a.o.c cVar = f37305b;
            cVar.a("Expiring Decision: " + fVar + ", reason: " + eVar);
        }
        a(this.f37308d.a(fVar, eVar));
    }

    private void a(Throwable th2) {
        if (com.amazon.a.a.o.c.f37534a) {
            com.amazon.a.a.o.c cVar = f37305b;
            cVar.a("Exception occurred while processing task: " + th2, th2);
        }
        com.amazon.a.a.d.b b10 = b(th2);
        b(b10);
        this.f37310f.a(a(b10));
    }

    /* access modifiers changed from: protected */
    public com.amazon.a.a.h.a a(com.amazon.a.a.d.b bVar) {
        com.amazon.a.a.h.a aVar = new com.amazon.a.a.h.a(g());
        aVar.a("subType", bVar.a()).a("reason", bVar.b()).a("context", bVar.c());
        return aVar;
    }
}
