package com.facebook.imagepipeline.producers;

import W5.i;
import android.content.ContentResolver;
import c7.C3189i;
import i7.C3593b;
import java.io.InputStream;
import java.util.concurrent.Executor;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;

public final class i0 extends L {

    /* renamed from: d  reason: collision with root package name */
    public static final a f39966d = new a((DefaultConstructorMarker) null);

    /* renamed from: c  reason: collision with root package name */
    private final ContentResolver f39967c;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public i0(Executor executor, i iVar, ContentResolver contentResolver) {
        super(executor, iVar);
        C6496s.h(executor, "executor");
        C6496s.h(iVar, "pooledByteBufferFactory");
        C6496s.h(contentResolver, "contentResolver");
        this.f39967c = contentResolver;
    }

    /* access modifiers changed from: protected */
    public C3189i d(C3593b bVar) {
        C6496s.h(bVar, "imageRequest");
        InputStream openInputStream = this.f39967c.openInputStream(bVar.v());
        if (openInputStream != null) {
            C3189i e10 = e(openInputStream, -1);
            C6496s.g(e10, "getEncodedImage(...)");
            return e10;
        }
        throw new IllegalStateException("ContentResolver returned null InputStream");
    }

    /* access modifiers changed from: protected */
    public String f() {
        return "QualifiedResourceFetchProducer";
    }
}
