package Jc;

import Jc.h;
import Tg.c;
import Tg.d;
import android.content.Context;
import android.os.Bundle;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import qf.C6658d;

public final class b implements h {

    /* renamed from: b  reason: collision with root package name */
    private static final a f51355b = new a((DefaultConstructorMarker) null);

    /* renamed from: a  reason: collision with root package name */
    private final Bundle f51356a;

    private static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public b(Context context) {
        C6496s.h(context, "context");
        Bundle bundle = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128).metaData;
        this.f51356a = bundle == null ? Bundle.EMPTY : bundle;
    }

    public Boolean a() {
        if (this.f51356a.containsKey("firebase_sessions_enabled")) {
            return Boolean.valueOf(this.f51356a.getBoolean("firebase_sessions_enabled"));
        }
        return null;
    }

    public Tg.a b() {
        if (this.f51356a.containsKey("firebase_sessions_sessions_restart_timeout")) {
            return Tg.a.f(c.s(this.f51356a.getInt("firebase_sessions_sessions_restart_timeout"), d.SECONDS));
        }
        return null;
    }

    public Double c() {
        if (this.f51356a.containsKey("firebase_sessions_sampling_rate")) {
            return Double.valueOf(this.f51356a.getDouble("firebase_sessions_sampling_rate"));
        }
        return null;
    }

    public Object d(C6658d dVar) {
        return h.a.a(this, dVar);
    }
}
