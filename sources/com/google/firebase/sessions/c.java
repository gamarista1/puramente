package com.google.firebase.sessions;

import Hc.J;
import Hc.z;
import Sg.p;
import java.util.Locale;
import java.util.UUID;
import kotlin.jvm.internal.C6494p;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ub.C5226c;
import ub.n;
import yf.C6787a;

public final class c {

    /* renamed from: f  reason: collision with root package name */
    public static final b f57961f = new b((DefaultConstructorMarker) null);

    /* renamed from: a  reason: collision with root package name */
    private final J f57962a;

    /* renamed from: b  reason: collision with root package name */
    private final C6787a f57963b;

    /* renamed from: c  reason: collision with root package name */
    private final String f57964c;

    /* renamed from: d  reason: collision with root package name */
    private int f57965d;

    /* renamed from: e  reason: collision with root package name */
    private z f57966e;

    /* synthetic */ class a extends C6494p implements C6787a {

        /* renamed from: a  reason: collision with root package name */
        public static final a f57967a = new a();

        a() {
            super(0, UUID.class, "randomUUID", "randomUUID()Ljava/util/UUID;", 0);
        }

        /* renamed from: i */
        public final UUID invoke() {
            return UUID.randomUUID();
        }
    }

    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final c a() {
            Object k10 = n.a(C5226c.f61678a).k(c.class);
            C6496s.g(k10, "Firebase.app[SessionGenerator::class.java]");
            return (c) k10;
        }

        private b() {
        }
    }

    public c(J j10, C6787a aVar) {
        C6496s.h(j10, "timeProvider");
        C6496s.h(aVar, "uuidGenerator");
        this.f57962a = j10;
        this.f57963b = aVar;
        this.f57964c = b();
        this.f57965d = -1;
    }

    private final String b() {
        String uuid = ((UUID) this.f57963b.invoke()).toString();
        C6496s.g(uuid, "uuidGenerator().toString()");
        String lowerCase = p.D(uuid, "-", "", false, 4, (Object) null).toLowerCase(Locale.ROOT);
        C6496s.g(lowerCase, "this as java.lang.String).toLowerCase(Locale.ROOT)");
        return lowerCase;
    }

    public final z a() {
        String b10;
        int i10 = this.f57965d + 1;
        this.f57965d = i10;
        if (i10 == 0) {
            b10 = this.f57964c;
        } else {
            b10 = b();
        }
        this.f57966e = new z(b10, this.f57964c, this.f57965d, this.f57962a.a());
        return c();
    }

    public final z c() {
        z zVar = this.f57966e;
        if (zVar != null) {
            return zVar;
        }
        C6496s.v("currentSession");
        return null;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(J j10, C6787a aVar, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(j10, (i10 & 2) != 0 ? a.f57967a : aVar);
    }
}
