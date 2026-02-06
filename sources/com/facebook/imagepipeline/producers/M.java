package com.facebook.imagepipeline.producers;

import W5.i;
import c7.C3189i;
import i7.C3593b;
import java.io.FileInputStream;
import java.util.concurrent.Executor;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;

public final class M extends L {

    /* renamed from: c  reason: collision with root package name */
    public static final a f39859c = new a((DefaultConstructorMarker) null);

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public M(Executor executor, i iVar) {
        super(executor, iVar);
        C6496s.h(executor, "executor");
        C6496s.h(iVar, "pooledByteBufferFactory");
    }

    /* access modifiers changed from: protected */
    public C3189i d(C3593b bVar) {
        C6496s.h(bVar, "imageRequest");
        return e(new FileInputStream(bVar.u().toString()), (int) bVar.u().length());
    }

    /* access modifiers changed from: protected */
    public String f() {
        return "LocalFileFetchProducer";
    }
}
