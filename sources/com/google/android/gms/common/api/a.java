package com.google.android.gms.common.api;

import android.content.Context;
import android.os.Looper;
import com.google.android.gms.common.api.f;
import com.google.android.gms.common.api.internal.C4494f;
import com.google.android.gms.common.api.internal.C4502n;
import com.google.android.gms.common.internal.C4518c;
import com.google.android.gms.common.internal.C4522e;
import com.google.android.gms.common.internal.C4529k;
import com.google.android.gms.common.internal.C4536s;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import ya.C5286c;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    private final C0818a f53918a;

    /* renamed from: b  reason: collision with root package name */
    private final g f53919b;

    /* renamed from: c  reason: collision with root package name */
    private final String f53920c;

    /* renamed from: com.google.android.gms.common.api.a$a  reason: collision with other inner class name */
    public static abstract class C0818a extends e {
        @Deprecated
        public f buildClient(Context context, Looper looper, C4522e eVar, Object obj, f.b bVar, f.c cVar) {
            return buildClient(context, looper, eVar, obj, (C4494f) bVar, (C4502n) cVar);
        }

        public f buildClient(Context context, Looper looper, C4522e eVar, Object obj, C4494f fVar, C4502n nVar) {
            throw new UnsupportedOperationException("buildClient must be implemented");
        }
    }

    public interface b {
    }

    public static class c {
    }

    public interface d {

        /* renamed from: V  reason: collision with root package name */
        public static final C0819a f53921V = new C0819a((p) null);

        /* renamed from: com.google.android.gms.common.api.a$d$a  reason: collision with other inner class name */
        public static final class C0819a implements d {
            /* synthetic */ C0819a(p pVar) {
            }
        }
    }

    public static abstract class e {
        public static final int API_PRIORITY_GAMES = 1;
        public static final int API_PRIORITY_OTHER = Integer.MAX_VALUE;
        public static final int API_PRIORITY_PLUS = 2;

        public List<Scope> getImpliedScopes(Object obj) {
            return Collections.emptyList();
        }

        public int getPriority() {
            return API_PRIORITY_OTHER;
        }
    }

    public interface f extends b {
        void connect(C4518c.C0821c cVar);

        void disconnect();

        void disconnect(String str);

        C5286c[] getAvailableFeatures();

        String getEndpointPackageName();

        String getLastDisconnectMessage();

        int getMinApkVersion();

        void getRemoteService(C4529k kVar, Set set);

        Set getScopesForConnectionlessNonSignIn();

        boolean isConnected();

        boolean isConnecting();

        void onUserSignOut(C4518c.e eVar);

        boolean requiresGooglePlayServices();

        boolean requiresSignIn();
    }

    public static final class g extends c {
    }

    public a(String str, C0818a aVar, g gVar) {
        C4536s.m(aVar, "Cannot construct an Api with a null ClientBuilder");
        C4536s.m(gVar, "Cannot construct an Api with a null ClientKey");
        this.f53920c = str;
        this.f53918a = aVar;
        this.f53919b = gVar;
    }

    public final C0818a a() {
        return this.f53918a;
    }

    public final c b() {
        return this.f53919b;
    }

    public final String c() {
        return this.f53920c;
    }
}
