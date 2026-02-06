package com.bugsnag.android.ndk;

import Sg.C5541d;
import java.util.Collection;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\t\b\u0000\u0018\u0000 \n2\u00020\u0001:\u0001\u0006B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\u000b"}, d2 = {"Lcom/bugsnag/android/ndk/OpaqueValue;", "", "", "json", "<init>", "(Ljava/lang/String;)V", "a", "Ljava/lang/String;", "getJson", "()Ljava/lang/String;", "b", "bugsnag-plugin-android-ndk_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class OpaqueValue {

    /* renamed from: b  reason: collision with root package name */
    public static final a f38791b = new a((DefaultConstructorMarker) null);

    /* renamed from: a  reason: collision with root package name */
    private final String f38792a;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX WARNING: Code restructure failed: missing block: B:10:0x0021, code lost:
            throw r1;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:8:0x001d, code lost:
            r1 = move-exception;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:9:0x001e, code lost:
            wf.C6763c.a(r0, r4);
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.String a(java.lang.Object r4) {
            /*
                r3 = this;
                java.io.StringWriter r0 = new java.io.StringWriter
                r1 = 256(0x100, float:3.59E-43)
                r0.<init>(r1)
                com.bugsnag.android.K0 r1 = new com.bugsnag.android.K0     // Catch:{ all -> 0x001b }
                r1.<init>(r0)     // Catch:{ all -> 0x001b }
                r2 = 0
                r1.I0(r4, r2)     // Catch:{ all -> 0x001b }
                lf.M r4 = lf.C6514M.f71813a     // Catch:{ all -> 0x001b }
                r4 = 0
                wf.C6763c.a(r0, r4)
                java.lang.String r4 = r0.toString()
                return r4
            L_0x001b:
                r4 = move-exception
                throw r4     // Catch:{ all -> 0x001d }
            L_0x001d:
                r1 = move-exception
                wf.C6763c.a(r0, r4)
                throw r1
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bugsnag.android.ndk.OpaqueValue.a.a(java.lang.Object):java.lang.String");
        }

        public final boolean b(String str) {
            if (str.length() >= 64) {
                return false;
            }
            int i10 = 0;
            while (i10 < str.length()) {
                char charAt = str.charAt(i10);
                i10++;
                if (charAt > 127) {
                    byte[] bytes = str.getBytes(C5541d.f65029b);
                    C6496s.g(bytes, "this as java.lang.String).getBytes(charset)");
                    if (bytes.length < 64) {
                        return true;
                    }
                    return false;
                }
            }
            return true;
        }

        public final Object c(Object obj) {
            if ((obj instanceof Boolean) || (obj instanceof Number)) {
                return obj;
            }
            boolean z10 = obj instanceof String;
            if (z10 && b((String) obj)) {
                return obj;
            }
            if (z10 || (obj instanceof Map) || (obj instanceof Collection) || (obj instanceof Object[])) {
                return new OpaqueValue(a(obj));
            }
            return null;
        }

        private a() {
        }
    }

    public OpaqueValue(String str) {
        this.f38792a = str;
    }

    public static final Object makeSafe(Object obj) {
        return f38791b.c(obj);
    }

    public final String getJson() {
        return this.f38792a;
    }
}
