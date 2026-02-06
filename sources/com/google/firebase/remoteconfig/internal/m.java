package com.google.firebase.remoteconfig.internal;

import Dc.o;
import Dc.q;
import Dc.s;
import Ea.e;
import android.text.format.DateUtils;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.installations.g;
import com.google.firebase.remoteconfig.internal.p;
import ic.C5027b;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import jc.C5046e;
import xb.C5276a;

public class m {

    /* renamed from: j  reason: collision with root package name */
    public static final long f57861j = TimeUnit.HOURS.toSeconds(12);

    /* renamed from: k  reason: collision with root package name */
    static final int[] f57862k = {2, 4, 8, 16, 32, 64, 128, 256};

    /* renamed from: a  reason: collision with root package name */
    private final C5046e f57863a;

    /* renamed from: b  reason: collision with root package name */
    private final C5027b f57864b;

    /* renamed from: c  reason: collision with root package name */
    private final Executor f57865c;

    /* renamed from: d  reason: collision with root package name */
    private final e f57866d;

    /* renamed from: e  reason: collision with root package name */
    private final Random f57867e;

    /* renamed from: f  reason: collision with root package name */
    private final f f57868f;

    /* renamed from: g  reason: collision with root package name */
    private final ConfigFetchHttpClient f57869g;

    /* renamed from: h  reason: collision with root package name */
    private final p f57870h;

    /* renamed from: i  reason: collision with root package name */
    private final Map f57871i;

    public static class a {

        /* renamed from: a  reason: collision with root package name */
        private final Date f57872a;

        /* renamed from: b  reason: collision with root package name */
        private final int f57873b;

        /* renamed from: c  reason: collision with root package name */
        private final g f57874c;

        /* renamed from: d  reason: collision with root package name */
        private final String f57875d;

        private a(Date date, int i10, g gVar, String str) {
            this.f57872a = date;
            this.f57873b = i10;
            this.f57874c = gVar;
            this.f57875d = str;
        }

        public static a a(Date date, g gVar) {
            return new a(date, 1, gVar, (String) null);
        }

        public static a b(g gVar, String str) {
            return new a(gVar.h(), 0, gVar, str);
        }

        public static a c(Date date) {
            return new a(date, 2, (g) null, (String) null);
        }

        public g d() {
            return this.f57874c;
        }

        /* access modifiers changed from: package-private */
        public String e() {
            return this.f57875d;
        }

        /* access modifiers changed from: package-private */
        public int f() {
            return this.f57873b;
        }
    }

    public enum b {
        BASE("BASE"),
        REALTIME("REALTIME");
        

        /* renamed from: a  reason: collision with root package name */
        private final String f57879a;

        private b(String str) {
            this.f57879a = str;
        }

        /* access modifiers changed from: package-private */
        public String b() {
            return this.f57879a;
        }
    }

    public m(C5046e eVar, C5027b bVar, Executor executor, e eVar2, Random random, f fVar, ConfigFetchHttpClient configFetchHttpClient, p pVar, Map map) {
        this.f57863a = eVar;
        this.f57864b = bVar;
        this.f57865c = executor;
        this.f57866d = eVar2;
        this.f57867e = random;
        this.f57868f = fVar;
        this.f57869g = configFetchHttpClient;
        this.f57870h = pVar;
        this.f57871i = map;
    }

    private p.a A(int i10, Date date) {
        if (t(i10)) {
            B(date);
        }
        return this.f57870h.b();
    }

    private void B(Date date) {
        int b10 = this.f57870h.b().b() + 1;
        this.f57870h.l(b10, new Date(date.getTime() + q(b10)));
    }

    private void C(Task task, Date date) {
        if (task.isSuccessful()) {
            this.f57870h.r(date);
            return;
        }
        Exception exception = task.getException();
        if (exception != null) {
            if (exception instanceof q) {
                this.f57870h.s();
            } else {
                this.f57870h.q();
            }
        }
    }

    private boolean f(long j10, Date date) {
        Date f10 = this.f57870h.f();
        if (f10.equals(p.f57890e)) {
            return false;
        }
        return date.before(new Date(f10.getTime() + TimeUnit.SECONDS.toMillis(j10)));
    }

    private s g(s sVar) {
        String str;
        int b10 = sVar.b();
        if (b10 == 401) {
            str = "The request did not have the required credentials. Please make sure your google-services.json is valid.";
        } else if (b10 == 403) {
            str = "The user is not authorized to access the project. Please make sure you are using the API key that corresponds to your Firebase project.";
        } else if (b10 == 429) {
            throw new o("The throttled response from the server was not handled correctly by the FRC SDK.");
        } else if (b10 != 500) {
            switch (b10) {
                case 502:
                case 503:
                case 504:
                    str = "The server is unavailable. Please try again later.";
                    break;
                default:
                    str = "The server returned an unexpected error.";
                    break;
            }
        } else {
            str = "There was an internal server error.";
        }
        int b11 = sVar.b();
        return new s(b11, "Fetch failed: " + str, (Throwable) sVar);
    }

    private String h(long j10) {
        return String.format("Fetch is throttled. Please wait before calling fetch again: %s", new Object[]{DateUtils.formatElapsedTime(TimeUnit.MILLISECONDS.toSeconds(j10))});
    }

    private a k(String str, String str2, Date date, Map map) {
        try {
            a fetch = this.f57869g.fetch(this.f57869g.d(), str, str2, s(), this.f57870h.e(), map, p(), date);
            if (fetch.d() != null) {
                this.f57870h.o(fetch.d().k());
            }
            if (fetch.e() != null) {
                this.f57870h.n(fetch.e());
            }
            this.f57870h.j();
            return fetch;
        } catch (s e10) {
            p.a A10 = A(e10.b(), date);
            if (z(A10, e10.b())) {
                throw new q(A10.a().getTime());
            }
            throw g(e10);
        }
    }

    private Task l(String str, String str2, Date date, Map map) {
        try {
            a k10 = k(str, str2, date, map);
            if (k10.f() != 0) {
                return Tasks.forResult(k10);
            }
            return this.f57868f.k(k10.d()).onSuccessTask(this.f57865c, new l(k10));
        } catch (Dc.p e10) {
            return Tasks.forException(e10);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: m */
    public Task u(Task task, long j10, Map map) {
        Task<TContinuationResult> task2;
        Date date = new Date(this.f57866d.currentTimeMillis());
        if (task.isSuccessful() && f(j10, date)) {
            return Tasks.forResult(a.c(date));
        }
        Date o10 = o(date);
        if (o10 != null) {
            task2 = Tasks.forException(new q(h(o10.getTime() - date.getTime()), o10.getTime()));
        } else {
            Task id2 = this.f57863a.getId();
            Task a10 = this.f57863a.a(false);
            task2 = Tasks.whenAllComplete((Task<?>[]) new Task[]{id2, a10}).continueWithTask(this.f57865c, new j(this, id2, a10, date, map));
        }
        return task2.continueWithTask(this.f57865c, new k(this, date));
    }

    private Date o(Date date) {
        Date a10 = this.f57870h.b().a();
        if (date.before(a10)) {
            return a10;
        }
        return null;
    }

    private Long p() {
        C5276a aVar = (C5276a) this.f57864b.get();
        if (aVar == null) {
            return null;
        }
        return (Long) aVar.d(true).get("_fot");
    }

    private long q(int i10) {
        TimeUnit timeUnit = TimeUnit.MINUTES;
        int[] iArr = f57862k;
        long millis = timeUnit.toMillis((long) iArr[Math.min(i10, iArr.length) - 1]);
        return (millis / 2) + ((long) this.f57867e.nextInt((int) millis));
    }

    private Map s() {
        HashMap hashMap = new HashMap();
        C5276a aVar = (C5276a) this.f57864b.get();
        if (aVar == null) {
            return hashMap;
        }
        for (Map.Entry entry : aVar.d(false).entrySet()) {
            hashMap.put((String) entry.getKey(), entry.getValue().toString());
        }
        return hashMap;
    }

    private boolean t(int i10) {
        return i10 == 429 || i10 == 502 || i10 == 503 || i10 == 504;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ Task w(Task task, Task task2, Date date, Map map, Task task3) {
        if (!task.isSuccessful()) {
            return Tasks.forException(new o("Firebase Installations failed to get installation ID for fetch.", (Throwable) task.getException()));
        }
        if (!task2.isSuccessful()) {
            return Tasks.forException(new o("Firebase Installations failed to get installation auth token for fetch.", (Throwable) task2.getException()));
        }
        return l((String) task.getResult(), ((g) task2.getResult()).b(), date, map);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ Task x(Date date, Task task) {
        C(task, date);
        return task;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ Task y(Map map, Task task) {
        return u(task, 0, map);
    }

    private boolean z(p.a aVar, int i10) {
        if (aVar.b() > 1 || i10 == 429) {
            return true;
        }
        return false;
    }

    public Task i() {
        return j(this.f57870h.h());
    }

    public Task j(long j10) {
        HashMap hashMap = new HashMap(this.f57871i);
        hashMap.put("X-Firebase-RC-Fetch-Type", b.BASE.b() + "/" + 1);
        return this.f57868f.e().continueWithTask(this.f57865c, new h(this, j10, hashMap));
    }

    public Task n(b bVar, int i10) {
        HashMap hashMap = new HashMap(this.f57871i);
        hashMap.put("X-Firebase-RC-Fetch-Type", bVar.b() + "/" + i10);
        return this.f57868f.e().continueWithTask(this.f57865c, new i(this, hashMap));
    }

    public long r() {
        return this.f57870h.g();
    }
}
