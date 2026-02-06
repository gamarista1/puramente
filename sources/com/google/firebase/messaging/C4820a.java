package com.google.firebase.messaging;

import Zb.d;
import Zb.e;
import ac.C4458a;
import ac.C4459b;
import cc.C4477a;
import pc.C5134a;
import pc.C5135b;

/* renamed from: com.google.firebase.messaging.a  reason: case insensitive filesystem */
public final class C4820a implements C4458a {

    /* renamed from: a  reason: collision with root package name */
    public static final C4458a f57474a = new C4820a();

    /* renamed from: com.google.firebase.messaging.a$a  reason: collision with other inner class name */
    private static final class C0858a implements d {

        /* renamed from: a  reason: collision with root package name */
        static final C0858a f57475a = new C0858a();

        /* renamed from: b  reason: collision with root package name */
        private static final Zb.c f57476b = Zb.c.a("projectNumber").b(C4477a.b().c(1).a()).a();

        /* renamed from: c  reason: collision with root package name */
        private static final Zb.c f57477c = Zb.c.a("messageId").b(C4477a.b().c(2).a()).a();

        /* renamed from: d  reason: collision with root package name */
        private static final Zb.c f57478d = Zb.c.a("instanceId").b(C4477a.b().c(3).a()).a();

        /* renamed from: e  reason: collision with root package name */
        private static final Zb.c f57479e = Zb.c.a("messageType").b(C4477a.b().c(4).a()).a();

        /* renamed from: f  reason: collision with root package name */
        private static final Zb.c f57480f = Zb.c.a("sdkPlatform").b(C4477a.b().c(5).a()).a();

        /* renamed from: g  reason: collision with root package name */
        private static final Zb.c f57481g = Zb.c.a("packageName").b(C4477a.b().c(6).a()).a();

        /* renamed from: h  reason: collision with root package name */
        private static final Zb.c f57482h = Zb.c.a("collapseKey").b(C4477a.b().c(7).a()).a();

        /* renamed from: i  reason: collision with root package name */
        private static final Zb.c f57483i = Zb.c.a("priority").b(C4477a.b().c(8).a()).a();

        /* renamed from: j  reason: collision with root package name */
        private static final Zb.c f57484j = Zb.c.a("ttl").b(C4477a.b().c(9).a()).a();

        /* renamed from: k  reason: collision with root package name */
        private static final Zb.c f57485k = Zb.c.a("topic").b(C4477a.b().c(10).a()).a();

        /* renamed from: l  reason: collision with root package name */
        private static final Zb.c f57486l = Zb.c.a("bulkId").b(C4477a.b().c(11).a()).a();

        /* renamed from: m  reason: collision with root package name */
        private static final Zb.c f57487m = Zb.c.a("event").b(C4477a.b().c(12).a()).a();

        /* renamed from: n  reason: collision with root package name */
        private static final Zb.c f57488n = Zb.c.a("analyticsLabel").b(C4477a.b().c(13).a()).a();

        /* renamed from: o  reason: collision with root package name */
        private static final Zb.c f57489o = Zb.c.a("campaignId").b(C4477a.b().c(14).a()).a();

        /* renamed from: p  reason: collision with root package name */
        private static final Zb.c f57490p = Zb.c.a("composerLabel").b(C4477a.b().c(15).a()).a();

        private C0858a() {
        }

        /* renamed from: b */
        public void a(C5134a aVar, e eVar) {
            eVar.c(f57476b, aVar.l());
            eVar.f(f57477c, aVar.h());
            eVar.f(f57478d, aVar.g());
            eVar.f(f57479e, aVar.i());
            eVar.f(f57480f, aVar.m());
            eVar.f(f57481g, aVar.j());
            eVar.f(f57482h, aVar.d());
            eVar.b(f57483i, aVar.k());
            eVar.b(f57484j, aVar.o());
            eVar.f(f57485k, aVar.n());
            eVar.c(f57486l, aVar.b());
            eVar.f(f57487m, aVar.f());
            eVar.f(f57488n, aVar.a());
            eVar.c(f57489o, aVar.c());
            eVar.f(f57490p, aVar.e());
        }
    }

    /* renamed from: com.google.firebase.messaging.a$b */
    private static final class b implements d {

        /* renamed from: a  reason: collision with root package name */
        static final b f57491a = new b();

        /* renamed from: b  reason: collision with root package name */
        private static final Zb.c f57492b = Zb.c.a("messagingClientEvent").b(C4477a.b().c(1).a()).a();

        private b() {
        }

        /* renamed from: b */
        public void a(C5135b bVar, e eVar) {
            eVar.f(f57492b, bVar.a());
        }
    }

    /* renamed from: com.google.firebase.messaging.a$c */
    private static final class c implements d {

        /* renamed from: a  reason: collision with root package name */
        static final c f57493a = new c();

        /* renamed from: b  reason: collision with root package name */
        private static final Zb.c f57494b = Zb.c.d("messagingClientEventExtension");

        private c() {
        }

        public /* bridge */ /* synthetic */ void a(Object obj, Object obj2) {
            android.support.v4.media.session.c.a(obj);
            b((O) null, (e) obj2);
        }

        public void b(O o10, e eVar) {
            throw null;
        }
    }

    private C4820a() {
    }

    public void a(C4459b bVar) {
        bVar.a(O.class, c.f57493a);
        bVar.a(C5135b.class, b.f57491a);
        bVar.a(C5134a.class, C0858a.f57475a);
    }
}
