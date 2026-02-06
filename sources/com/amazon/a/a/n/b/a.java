package com.amazon.a.a.n.b;

import com.amazon.a.a.c.b;
import com.amazon.a.a.c.f;
import com.amazon.a.a.k.d;
import com.amazon.a.a.o.c;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class a implements d, c {

    /* renamed from: a  reason: collision with root package name */
    private static final c f37405a = new c("ForegroundTaskPipeline");
    @com.amazon.a.a.k.a

    /* renamed from: b  reason: collision with root package name */
    private com.amazon.a.a.a.a f37406b;
    @com.amazon.a.a.k.a

    /* renamed from: c  reason: collision with root package name */
    private f f37407c;

    /* renamed from: d  reason: collision with root package name */
    private c f37408d = b.b("KIWI_UI");

    /* renamed from: e  reason: collision with root package name */
    private c f37409e;

    /* renamed from: f  reason: collision with root package name */
    private List<com.amazon.a.a.n.a> f37410f = new ArrayList();

    public a(c cVar) {
        this.f37409e = cVar;
    }

    private com.amazon.a.a.n.a c(final com.amazon.a.a.n.a aVar) {
        return new com.amazon.a.a.n.a() {
            public void a() {
                a.this.a(aVar, true);
            }

            public String toString() {
                return "Future:PostToUITask: " + aVar.toString();
            }
        };
    }

    public void b(com.amazon.a.a.n.a aVar) {
        a(aVar, true);
    }

    public void e() {
        this.f37407c.a(new com.amazon.a.a.c.c<com.amazon.a.a.a.a.a>() {
            public com.amazon.a.a.c.d b() {
                return com.amazon.a.a.c.d.MIDDLE;
            }

            public String toString() {
                return "ForegroundTaskPipeline:onResume listener";
            }

            public b a() {
                return com.amazon.a.a.a.a.b.RESUME;
            }

            public void a(com.amazon.a.a.a.a.a aVar) {
                a.this.b();
            }
        });
    }

    /* access modifiers changed from: private */
    public void b() {
        if (c.f37534a) {
            f37405a.a("Activity resumed, scheduling tasks on UI thread");
        }
        for (com.amazon.a.a.n.a b10 : this.f37410f) {
            b(b10);
        }
        this.f37410f.clear();
    }

    public void a(com.amazon.a.a.n.a aVar) {
        a(aVar, false);
    }

    /* access modifiers changed from: private */
    public void a(com.amazon.a.a.n.a aVar, boolean z10) {
        if (!this.f37406b.c()) {
            if (c.f37534a) {
                c cVar = f37405a;
                cVar.a("No UI visible to execute task: " + aVar + ", placing into pending queue until task is visible");
            }
            this.f37410f.add(aVar);
        } else if (z10) {
            this.f37408d.b(aVar);
        } else {
            this.f37408d.a(aVar);
        }
    }

    public void a(com.amazon.a.a.n.a aVar, Date date) {
        this.f37409e.a(c(aVar), date);
    }

    public void a(com.amazon.a.a.n.a aVar, long j10) {
        this.f37409e.a(c(aVar), j10);
    }

    public void a() {
        this.f37408d.a();
        this.f37409e.a();
        this.f37410f.clear();
    }
}
