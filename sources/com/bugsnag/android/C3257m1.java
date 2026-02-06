package com.bugsnag.android;

import Sg.p;
import java.io.File;
import java.util.UUID;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: com.bugsnag.android.m1  reason: case insensitive filesystem */
public final class C3257m1 {

    /* renamed from: d  reason: collision with root package name */
    public static final a f38778d = new a((DefaultConstructorMarker) null);

    /* renamed from: a  reason: collision with root package name */
    private String f38779a;

    /* renamed from: b  reason: collision with root package name */
    private final long f38780b;

    /* renamed from: c  reason: collision with root package name */
    private final String f38781c;

    /* renamed from: com.bugsnag.android.m1$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final C3257m1 a(Object obj, String str) {
            if (obj instanceof C3254l1) {
                str = ((C3254l1) obj).c();
            }
            return new C3257m1(str, System.currentTimeMillis(), UUID.randomUUID().toString());
        }

        public final String b(File file, String str) {
            if (file == null || !e(file)) {
                return str;
            }
            String str2 = null;
            String Z02 = p.Z0(file.getName(), '_', (String) null, 2, (Object) null);
            if (Z02.length() != 0) {
                str2 = Z02;
            }
            if (str2 == null) {
                return str;
            }
            return str2;
        }

        public final long c(File file) {
            String name = file.getName();
            if (e(file)) {
                name = p.R0(file.getName(), '_', (String) null, 2, (Object) null);
            }
            Long o10 = p.o(p.Z0(p.h1(name, d(file).length()), '_', (String) null, 2, (Object) null));
            if (o10 == null) {
                return -1;
            }
            return o10.longValue();
        }

        public final String d(File file) {
            String m12;
            String name = file.getName();
            String str = null;
            if (e(file)) {
                name = p.R0(file.getName(), '_', (String) null, 2, (Object) null);
            }
            if (name.length() >= 36) {
                str = name;
            }
            if (str == null || (m12 = p.m1(str, 36)) == null) {
                return "";
            }
            return m12;
        }

        public final boolean e(File file) {
            return p.u(file.getName(), "_v3.json", false, 2, (Object) null);
        }

        public final String f(String str, long j10, String str2) {
            return str + '_' + str2 + j10 + "_v3.json";
        }

        private a() {
        }
    }

    public C3257m1(String str, long j10, String str2) {
        this.f38779a = str;
        this.f38780b = j10;
        this.f38781c = str2;
    }

    public static final String b(File file, String str) {
        return f38778d.b(file, str);
    }

    public final String a() {
        return f38778d.f(this.f38779a, this.f38780b, this.f38781c);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3257m1)) {
            return false;
        }
        C3257m1 m1Var = (C3257m1) obj;
        return C6496s.c(this.f38779a, m1Var.f38779a) && this.f38780b == m1Var.f38780b && C6496s.c(this.f38781c, m1Var.f38781c);
    }

    public int hashCode() {
        return (((this.f38779a.hashCode() * 31) + Long.hashCode(this.f38780b)) * 31) + this.f38781c.hashCode();
    }

    public String toString() {
        return "SessionFilenameInfo(apiKey=" + this.f38779a + ", timestamp=" + this.f38780b + ", uuid=" + this.f38781c + ')';
    }
}
