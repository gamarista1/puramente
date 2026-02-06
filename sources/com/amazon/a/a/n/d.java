package com.amazon.a.a.n;

import com.amazon.a.a.c.f;
import com.amazon.a.a.k.b;
import com.amazon.a.a.o.c;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

public class d implements com.amazon.a.a.k.d, b {

    /* renamed from: a  reason: collision with root package name */
    private static final c f37429a = new c("TaskManagerImpl");
    @com.amazon.a.a.k.a

    /* renamed from: b  reason: collision with root package name */
    private b f37430b;
    @com.amazon.a.a.k.a

    /* renamed from: c  reason: collision with root package name */
    private f f37431c;

    /* renamed from: d  reason: collision with root package name */
    private final AtomicBoolean f37432d = new AtomicBoolean(false);

    /* renamed from: e  reason: collision with root package name */
    private final Map<com.amazon.a.a.n.b.d, com.amazon.a.a.n.b.c> f37433e;

    private interface a {
        void a(a aVar, com.amazon.a.a.n.b.c cVar);
    }

    public d() {
        HashMap hashMap = new HashMap();
        this.f37433e = hashMap;
        com.amazon.a.a.n.b.d dVar = com.amazon.a.a.n.b.d.COMMAND;
        com.amazon.a.a.n.b.b a10 = com.amazon.a.a.n.b.b.a(dVar.name());
        com.amazon.a.a.n.b.d dVar2 = com.amazon.a.a.n.b.d.BACKGROUND;
        com.amazon.a.a.n.b.b a11 = com.amazon.a.a.n.b.b.a(dVar2.name());
        com.amazon.a.a.n.b.a aVar = new com.amazon.a.a.n.b.a(a11);
        hashMap.put(dVar, a10);
        hashMap.put(dVar2, a11);
        hashMap.put(com.amazon.a.a.n.b.d.FOREGROUND, aVar);
    }

    private void c() {
        this.f37431c.a(new com.amazon.a.a.c.c<com.amazon.a.a.a.a.c>() {
            public com.amazon.a.a.c.d b() {
                return com.amazon.a.a.c.d.MIDDLE;
            }

            public com.amazon.a.a.c.b a() {
                return com.amazon.a.a.a.a.d.DESTROY;
            }

            public void a(com.amazon.a.a.a.a.c cVar) {
                d.this.a();
            }
        });
    }

    public void a(com.amazon.a.a.n.b.d dVar, a aVar) {
        if (c.f37534a) {
            c cVar = f37429a;
            cVar.a("Enqueue task on pipeline id: " + dVar);
        }
        a(dVar, aVar, (a) new a() {
            public void a(a aVar, com.amazon.a.a.n.b.c cVar) {
                cVar.a(aVar);
            }
        });
    }

    public void b(com.amazon.a.a.n.b.d dVar, a aVar) {
        a(dVar, aVar, (a) new a() {
            public void a(a aVar, com.amazon.a.a.n.b.c cVar) {
                cVar.b(aVar);
            }
        });
    }

    public void e() {
        for (com.amazon.a.a.n.b.c b10 : this.f37433e.values()) {
            this.f37430b.b(b10);
        }
        c();
    }

    private boolean b() {
        return this.f37432d.get();
    }

    private void a(com.amazon.a.a.n.b.d dVar, a aVar, a aVar2) {
        if (!b()) {
            if (c.f37534a) {
                c cVar = f37429a;
                cVar.a("Populating Task: " + aVar);
            }
            this.f37430b.b(aVar);
            aVar2.a(aVar, a(dVar));
        } else if (c.f37535b) {
            c cVar2 = f37429a;
            cVar2.b("Task enqueued after TaskManager has been finished! Task: " + aVar);
        }
    }

    private com.amazon.a.a.n.b.c a(com.amazon.a.a.n.b.d dVar) {
        com.amazon.a.a.n.b.c cVar = this.f37433e.get(dVar);
        if (cVar != null) {
            return cVar;
        }
        throw new IllegalStateException("No pipeline registered with id: " + dVar);
    }

    public void a(com.amazon.a.a.n.b.d dVar, a aVar, final Date date) {
        a(dVar, aVar, (a) new a() {
            public void a(a aVar, com.amazon.a.a.n.b.c cVar) {
                cVar.a(aVar, date);
            }
        });
    }

    public void a(com.amazon.a.a.n.b.d dVar, a aVar, final long j10) {
        a(dVar, aVar, (a) new a() {
            public void a(a aVar, com.amazon.a.a.n.b.c cVar) {
                cVar.a(aVar, j10);
            }
        });
    }

    public void a() {
        if (this.f37432d.compareAndSet(false, true)) {
            if (c.f37534a) {
                f37429a.a("TaskManager finishing....");
            }
            for (com.amazon.a.a.n.b.c a10 : this.f37433e.values()) {
                a10.a();
            }
        }
    }
}
