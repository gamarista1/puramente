package com.bugsnag.android;

import android.util.JsonReader;
import com.bugsnag.android.C3229d0;
import java.io.File;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.nio.channels.OverlappingFileLockException;
import java.util.UUID;
import kotlin.jvm.internal.C6494p;
import kotlin.jvm.internal.DefaultConstructorMarker;
import yf.C6787a;
import yf.C6798l;

/* renamed from: com.bugsnag.android.e0  reason: case insensitive filesystem */
public final class C3232e0 implements C3235f0 {

    /* renamed from: e  reason: collision with root package name */
    public static final a f38690e = new a((DefaultConstructorMarker) null);

    /* renamed from: a  reason: collision with root package name */
    private final File f38691a;

    /* renamed from: b  reason: collision with root package name */
    private final C6787a f38692b;

    /* renamed from: c  reason: collision with root package name */
    private final S0 f38693c;

    /* renamed from: d  reason: collision with root package name */
    private final y1 f38694d;

    /* renamed from: com.bugsnag.android.e0$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    /* renamed from: com.bugsnag.android.e0$b */
    /* synthetic */ class b extends C6494p implements C6798l {
        b(Object obj) {
            super(1, obj, C3229d0.a.class, "fromReader", "fromReader(Landroid/util/JsonReader;)Lcom/bugsnag/android/DeviceId;", 0);
        }

        /* renamed from: i */
        public final C3229d0 invoke(JsonReader jsonReader) {
            return ((C3229d0.a) this.receiver).a(jsonReader);
        }
    }

    public C3232e0(File file, C6787a aVar, S0 s02) {
        this.f38691a = file;
        this.f38692b = aVar;
        this.f38693c = s02;
        try {
            file.createNewFile();
        } catch (Throwable th2) {
            this.f38693c.b("Failed to created device ID file", th2);
        }
        this.f38694d = new y1(this.f38691a);
    }

    private final C3229d0 b() {
        if (this.f38691a.length() <= 0) {
            return null;
        }
        try {
            return (C3229d0) this.f38694d.b(new b(C3229d0.f38686b));
        } catch (Throwable th2) {
            this.f38693c.b("Failed to load device ID", th2);
            return null;
        }
    }

    private final String c(FileChannel fileChannel, UUID uuid) {
        String str;
        FileLock e10 = e(fileChannel);
        String str2 = null;
        if (e10 == null) {
            return null;
        }
        try {
            C3229d0 b10 = b();
            if (b10 != null) {
                str2 = b10.a();
            }
            if (str2 != null) {
                str = b10.a();
            } else {
                C3229d0 d0Var = new C3229d0(uuid.toString());
                this.f38694d.c(d0Var);
                str = d0Var.a();
            }
            return str;
        } finally {
            e10.release();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0019, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:?, code lost:
        wf.C6763c.a(r1, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x001d, code lost:
        throw r2;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final java.lang.String d(java.util.UUID r4) {
        /*
            r3 = this;
            r0 = 0
            java.io.FileOutputStream r1 = new java.io.FileOutputStream     // Catch:{ IOException -> 0x0015 }
            java.io.File r2 = r3.f38691a     // Catch:{ IOException -> 0x0015 }
            r1.<init>(r2)     // Catch:{ IOException -> 0x0015 }
            java.nio.channels.FileChannel r1 = r1.getChannel()     // Catch:{ IOException -> 0x0015 }
            java.lang.String r4 = r3.c(r1, r4)     // Catch:{ all -> 0x0017 }
            wf.C6763c.a(r1, r0)     // Catch:{ IOException -> 0x0015 }
            r0 = r4
            goto L_0x0025
        L_0x0015:
            r4 = move-exception
            goto L_0x001e
        L_0x0017:
            r4 = move-exception
            throw r4     // Catch:{ all -> 0x0019 }
        L_0x0019:
            r2 = move-exception
            wf.C6763c.a(r1, r4)     // Catch:{ IOException -> 0x0015 }
            throw r2     // Catch:{ IOException -> 0x0015 }
        L_0x001e:
            com.bugsnag.android.S0 r1 = r3.f38693c
            java.lang.String r2 = "Failed to persist device ID"
            r1.b(r2, r4)
        L_0x0025:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bugsnag.android.C3232e0.d(java.util.UUID):java.lang.String");
    }

    private final FileLock e(FileChannel fileChannel) {
        int i10 = 0;
        while (i10 < 20) {
            i10++;
            try {
                return fileChannel.tryLock();
            } catch (OverlappingFileLockException unused) {
                Thread.sleep(25);
            }
        }
        return null;
    }

    public String a(boolean z10) {
        String str;
        try {
            C3229d0 b10 = b();
            if (b10 == null) {
                str = null;
            } else {
                str = b10.a();
            }
            if (str != null) {
                return b10.a();
            }
            if (z10) {
                return d((UUID) this.f38692b.invoke());
            }
            return null;
        } catch (Throwable th2) {
            this.f38693c.b("Failed to load device ID", th2);
            return null;
        }
    }
}
