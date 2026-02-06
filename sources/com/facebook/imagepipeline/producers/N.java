package com.facebook.imagepipeline.producers;

import W5.i;
import android.content.res.AssetFileDescriptor;
import android.content.res.Resources;
import c7.C3189i;
import i7.C3593b;
import java.io.IOException;
import java.util.concurrent.Executor;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;

public final class N extends L {

    /* renamed from: d  reason: collision with root package name */
    public static final a f39860d = new a((DefaultConstructorMarker) null);

    /* renamed from: c  reason: collision with root package name */
    private final Resources f39861c;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* access modifiers changed from: private */
        public final int b(C3593b bVar) {
            String path = bVar.v().getPath();
            if (path != null) {
                String substring = path.substring(1);
                C6496s.g(substring, "substring(...)");
                return Integer.parseInt(substring);
            }
            throw new IllegalStateException("Required value was null.");
        }

        private a() {
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public N(Executor executor, i iVar, Resources resources) {
        super(executor, iVar);
        C6496s.h(executor, "executor");
        C6496s.h(iVar, "pooledByteBufferFactory");
        C6496s.h(resources, "resources");
        this.f39861c = resources;
    }

    private final int g(C3593b bVar) {
        AssetFileDescriptor assetFileDescriptor = null;
        try {
            AssetFileDescriptor openRawResourceFd = this.f39861c.openRawResourceFd(f39860d.b(bVar));
            int length = (int) openRawResourceFd.getLength();
            try {
                openRawResourceFd.close();
                return length;
            } catch (IOException unused) {
                return length;
            }
        } catch (Resources.NotFoundException unused2) {
            if (assetFileDescriptor != null) {
                try {
                    assetFileDescriptor.close();
                } catch (IOException unused3) {
                }
            }
            return -1;
        } catch (Throwable th2) {
            if (assetFileDescriptor != null) {
                try {
                    assetFileDescriptor.close();
                } catch (IOException unused4) {
                }
            }
            throw th2;
        }
    }

    /* access modifiers changed from: protected */
    public C3189i d(C3593b bVar) {
        C6496s.h(bVar, "imageRequest");
        return e(this.f39861c.openRawResource(f39860d.b(bVar)), g(bVar));
    }

    /* access modifiers changed from: protected */
    public String f() {
        return "LocalResourceFetchProducer";
    }
}
