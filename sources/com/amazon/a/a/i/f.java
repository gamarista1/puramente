package com.amazon.a.a.i;

import android.app.Activity;
import android.app.Dialog;
import com.amazon.a.a.k.a;
import com.amazon.a.a.k.d;
import com.amazon.a.a.n.b;
import com.amazon.a.a.o.c;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;

public class f implements e, d {

    /* renamed from: a  reason: collision with root package name */
    public static final c f37221a = new c("PromptManagerImpl");
    @a

    /* renamed from: b  reason: collision with root package name */
    private com.amazon.a.a.a.a f37222b;
    @a

    /* renamed from: c  reason: collision with root package name */
    private com.amazon.a.a.c.f f37223c;
    @a

    /* renamed from: d  reason: collision with root package name */
    private b f37224d;
    @a

    /* renamed from: e  reason: collision with root package name */
    private com.amazon.a.a.k.b f37225e;

    /* renamed from: f  reason: collision with root package name */
    private b f37226f;

    /* renamed from: g  reason: collision with root package name */
    private Set<b> f37227g = new LinkedHashSet();

    /* renamed from: h  reason: collision with root package name */
    private final AtomicBoolean f37228h = new AtomicBoolean(false);

    /* access modifiers changed from: private */
    public void c(b bVar) {
        if (this.f37228h.get()) {
            if (c.f37535b) {
                c cVar = f37221a;
                cVar.b("Prompt: " + bVar + " presented after app destruction expiring it now!");
            }
            bVar.c();
            return;
        }
        if (c.f37534a) {
            c cVar2 = f37221a;
            cVar2.a("Presening Prompt: " + bVar);
        }
        bVar.a(this);
        this.f37227g.add(bVar);
        if (this.f37226f == null) {
            Activity b10 = this.f37222b.b();
            if (b10 != null) {
                a(b10);
            }
        } else if (c.f37534a) {
            f37221a.a("Dialog currently showing, not presenting given dialog");
        }
    }

    /* access modifiers changed from: private */
    public void d(b bVar) {
        this.f37227g.remove(bVar);
        if (this.f37226f == bVar) {
            this.f37226f = null;
            Activity b10 = this.f37222b.b();
            if (b10 != null) {
                a(b10);
            }
        }
    }

    public void e() {
        b();
        c();
    }

    /* access modifiers changed from: private */
    public void b(Activity activity) {
        b bVar = this.f37226f;
        if (bVar != null) {
            a(bVar, activity);
        } else {
            a(activity);
        }
    }

    public void a(final b bVar) {
        if (c.f37534a) {
            c cVar = f37221a;
            cVar.a("Scheduling presentation: " + bVar);
        }
        this.f37225e.b(bVar);
        if (this.f37228h.get()) {
            if (c.f37535b) {
                c cVar2 = f37221a;
                cVar2.b("Prompt: " + bVar + " presented after app destruction expiring it now!");
            }
            bVar.c();
            return;
        }
        this.f37224d.a(com.amazon.a.a.n.b.d.FOREGROUND, new com.amazon.a.a.n.a() {
            public void a() {
                f.this.c(bVar);
            }

            public String toString() {
                return "Prompt Presentation on Main Thread: " + bVar + ", " + bVar.a();
            }
        });
    }

    /* renamed from: b */
    public void a(final b bVar) {
        this.f37224d.a(com.amazon.a.a.n.b.d.FOREGROUND, new com.amazon.a.a.n.a() {
            public void a() {
                f.this.d(bVar);
            }

            public String toString() {
                return "PromptManager:removeExpiredPrompt: " + bVar;
            }
        });
    }

    /* access modifiers changed from: private */
    public void d() {
        if (this.f37228h.compareAndSet(false, true)) {
            if (c.f37534a) {
                f37221a.a("PromptManager finishing....");
            }
            Iterator<b> it = this.f37227g.iterator();
            while (it.hasNext()) {
                it.remove();
                it.next().c();
            }
            b bVar = this.f37226f;
            if (bVar != null) {
                bVar.k();
            }
        }
    }

    private void b() {
        this.f37223c.a(new com.amazon.a.a.c.c<com.amazon.a.a.a.a.a>() {
            public com.amazon.a.a.c.d b() {
                return com.amazon.a.a.c.d.MIDDLE;
            }

            public com.amazon.a.a.c.b a() {
                return com.amazon.a.a.a.a.b.RESUME;
            }

            public void a(com.amazon.a.a.a.a.a aVar) {
                f.this.b(aVar.b());
            }
        });
    }

    private void a(Activity activity) {
        b a10 = a();
        if (a10 != null) {
            a(a10, activity);
        }
    }

    private void c() {
        this.f37223c.a(new com.amazon.a.a.c.c<com.amazon.a.a.a.a.c>() {
            public com.amazon.a.a.c.d b() {
                return com.amazon.a.a.c.d.FIRST;
            }

            public com.amazon.a.a.c.b a() {
                return com.amazon.a.a.a.a.d.DESTROY;
            }

            public void a(com.amazon.a.a.a.a.c cVar) {
                f.this.d();
            }
        });
    }

    private b a() {
        if (this.f37227g.isEmpty()) {
            return null;
        }
        return this.f37227g.iterator().next();
    }

    private void a(b bVar, Activity activity) {
        this.f37226f = bVar;
        bVar.a(activity);
    }

    public Dialog a(Activity activity, int i10) {
        if (c.f37534a) {
            c cVar = f37221a;
            cVar.a("onCreateDialog, id: " + i10 + ", activity: " + activity);
        }
        b bVar = this.f37226f;
        if (bVar == null) {
            if (c.f37534a) {
                f37221a.a("Showing dialog is null, returning");
            }
            return null;
        } else if (bVar.j() != i10) {
            if (c.f37534a) {
                c cVar2 = f37221a;
                cVar2.a("Showing dialog id does not match given id: " + i10 + ", returning");
            }
            return null;
        } else {
            if (c.f37534a) {
                c cVar3 = f37221a;
                cVar3.a("Creating dialog prompt: " + this.f37226f);
            }
            return this.f37226f.c(activity);
        }
    }

    public void a(Activity activity, boolean z10) {
        b bVar = this.f37226f;
        if (bVar != null) {
            bVar.a(activity, z10);
        }
    }
}
