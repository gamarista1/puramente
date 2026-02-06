package tc;

import com.google.firebase.perf.config.RemoteConfigManager;
import com.google.firebase.perf.config.a;
import com.google.firebase.perf.session.SessionManager;
import ic.C5027b;
import jc.C5046e;
import ub.C5230g;

/* renamed from: tc.a  reason: case insensitive filesystem */
public class C5209a {

    /* renamed from: a  reason: collision with root package name */
    private final C5230g f61660a;

    /* renamed from: b  reason: collision with root package name */
    private final C5046e f61661b;

    /* renamed from: c  reason: collision with root package name */
    private final C5027b f61662c;

    /* renamed from: d  reason: collision with root package name */
    private final C5027b f61663d;

    public C5209a(C5230g gVar, C5046e eVar, C5027b bVar, C5027b bVar2) {
        this.f61660a = gVar;
        this.f61661b = eVar;
        this.f61662c = bVar;
        this.f61663d = bVar2;
    }

    /* access modifiers changed from: package-private */
    public a a() {
        return a.g();
    }

    /* access modifiers changed from: package-private */
    public C5230g b() {
        return this.f61660a;
    }

    /* access modifiers changed from: package-private */
    public C5046e c() {
        return this.f61661b;
    }

    /* access modifiers changed from: package-private */
    public C5027b d() {
        return this.f61662c;
    }

    /* access modifiers changed from: package-private */
    public RemoteConfigManager e() {
        return RemoteConfigManager.getInstance();
    }

    /* access modifiers changed from: package-private */
    public SessionManager f() {
        return SessionManager.getInstance();
    }

    /* access modifiers changed from: package-private */
    public C5027b g() {
        return this.f61663d;
    }
}
