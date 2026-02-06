package com.facebook.imagepipeline.producers;

import M5.d;
import V6.k;
import V6.x;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: com.facebook.imagepipeline.producers.g  reason: case insensitive filesystem */
public final class C3301g extends C3303i {

    /* renamed from: d  reason: collision with root package name */
    public static final a f39958d = new a((DefaultConstructorMarker) null);

    /* renamed from: com.facebook.imagepipeline.producers.g$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C3301g(x xVar, k kVar, d0 d0Var) {
        super(xVar, kVar, d0Var);
        C6496s.h(xVar, "memoryCache");
        C6496s.h(kVar, "cacheKeyFactory");
        C6496s.h(d0Var, "inputProducer");
    }

    /* access modifiers changed from: protected */
    public String d() {
        return "pipe_ui";
    }

    /* access modifiers changed from: protected */
    public String e() {
        return "BitmapMemoryCacheGetProducer";
    }

    /* access modifiers changed from: protected */
    public C3308n g(C3308n nVar, d dVar, boolean z10) {
        C6496s.h(nVar, "consumer");
        C6496s.h(dVar, "cacheKey");
        return nVar;
    }
}
