package com.facebook.imagepipeline.producers;

import W5.i;
import android.content.res.AssetFileDescriptor;
import android.content.res.AssetManager;
import c7.C3189i;
import i7.C3593b;
import java.io.IOException;
import java.util.concurrent.Executor;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;

public final class H extends L {

    /* renamed from: d  reason: collision with root package name */
    public static final a f39832d = new a((DefaultConstructorMarker) null);

    /* renamed from: c  reason: collision with root package name */
    private final AssetManager f39833c;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* access modifiers changed from: private */
        public final String b(C3593b bVar) {
            String path = bVar.v().getPath();
            C6496s.e(path);
            String substring = path.substring(1);
            C6496s.g(substring, "substring(...)");
            return substring;
        }

        private a() {
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public H(Executor executor, i iVar, AssetManager assetManager) {
        super(executor, iVar);
        C6496s.h(executor, "executor");
        C6496s.h(iVar, "pooledByteBufferFactory");
        C6496s.h(assetManager, "assetManager");
        this.f39833c = assetManager;
    }

    private final int g(C3593b bVar) {
        AssetFileDescriptor assetFileDescriptor = null;
        try {
            AssetFileDescriptor openFd = this.f39833c.openFd(f39832d.b(bVar));
            int length = (int) openFd.getLength();
            try {
                openFd.close();
                return length;
            } catch (IOException unused) {
                return length;
            }
        } catch (IOException unused2) {
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
        return e(this.f39833c.open(f39832d.b(bVar), 2), g(bVar));
    }

    /* access modifiers changed from: protected */
    public String f() {
        return "LocalAssetFetchProducer";
    }
}
