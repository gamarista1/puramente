package com.bugsnag.android;

import K4.k;
import Sg.p;
import com.amazon.a.a.o.b.f;
import io.intercom.android.sdk.tickets.create.model.CreateTicketViewModelKt;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import mf.C6565s;
import mf.Y;

/* renamed from: com.bugsnag.android.q0  reason: case insensitive filesystem */
public final class C3268q0 {

    /* renamed from: f  reason: collision with root package name */
    public static final a f38826f = new a((DefaultConstructorMarker) null);

    /* renamed from: a  reason: collision with root package name */
    private final String f38827a;

    /* renamed from: b  reason: collision with root package name */
    private final String f38828b;

    /* renamed from: c  reason: collision with root package name */
    private final long f38829c;

    /* renamed from: d  reason: collision with root package name */
    private final String f38830d;

    /* renamed from: e  reason: collision with root package name */
    private final Set f38831e;

    /* renamed from: com.bugsnag.android.q0$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ C3268q0 h(a aVar, Object obj, String str, String str2, long j10, k kVar, Boolean bool, int i10, Object obj2) {
            String str3;
            long j11;
            Boolean bool2;
            if ((i10 & 2) != 0) {
                str3 = UUID.randomUUID().toString();
            } else {
                str3 = str;
            }
            if ((i10 & 8) != 0) {
                j11 = System.currentTimeMillis();
            } else {
                j11 = j10;
            }
            if ((i10 & 32) != 0) {
                bool2 = null;
            } else {
                bool2 = bool;
            }
            return aVar.g(obj, str3, str2, j11, kVar, bool2);
        }

        public final String a(File file, k kVar) {
            String str;
            String w02 = p.w0(file.getName(), "_startupcrash.json");
            String str2 = w02;
            int b02 = p.b0(str2, "_", 0, false, 6, (Object) null) + 1;
            int b03 = p.b0(str2, "_", b02, false, 4, (Object) null);
            if (b02 == 0 || b03 == -1 || b03 <= b02) {
                str = null;
            } else {
                str = w02.substring(b02, b03);
                C6496s.g(str, "this as java.lang.String…ing(startIndex, endIndex)");
            }
            if (str == null) {
                return kVar.a();
            }
            return str;
        }

        public final Set b(Object obj) {
            if (obj instanceof C3262o0) {
                return ((C3262o0) obj).i().i();
            }
            return Y.d(ErrorType.C);
        }

        public final Set c(File file) {
            String name = file.getName();
            String str = name;
            int h02 = p.h0(str, "_", p.h0(name, "_", 0, false, 6, (Object) null) - 1, false, 4, (Object) null);
            int h03 = p.h0(str, "_", h02 - 1, false, 4, (Object) null) + 1;
            if (h03 >= h02) {
                return Y.e();
            }
            String substring = name.substring(h03, h02);
            C6496s.g(substring, "this as java.lang.String…ing(startIndex, endIndex)");
            List F02 = p.F0(substring, new String[]{f.f37529a}, false, 0, 6, (Object) null);
            ErrorType[] values = ErrorType.values();
            ArrayList arrayList = new ArrayList();
            int length = values.length;
            int i10 = 0;
            while (i10 < length) {
                ErrorType errorType = values[i10];
                i10++;
                if (F02.contains(errorType.getDesc$bugsnag_android_core_release())) {
                    arrayList.add(errorType);
                }
            }
            return C6565s.j1(arrayList);
        }

        public final String d(Object obj, Boolean bool) {
            if ((!(obj instanceof C3262o0) || !C6496s.c(((C3262o0) obj).f().m(), Boolean.TRUE)) && !C6496s.c(bool, Boolean.TRUE)) {
                return "";
            }
            return "startupcrash";
        }

        public final String e(File file) {
            String v10 = wf.k.v(file);
            boolean z10 = true;
            String substring = v10.substring(p.h0(v10, "_", 0, false, 6, (Object) null) + 1);
            C6496s.g(substring, "this as java.lang.String).substring(startIndex)");
            if (!C6496s.c(substring, "startupcrash")) {
                z10 = C6496s.c(substring, "not-jvm");
            }
            if (z10) {
                return substring;
            }
            return "";
        }

        public final long f(File file) {
            Long o10 = p.o(p.Y0(wf.k.v(file), "_", CreateTicketViewModelKt.EmailId));
            if (o10 == null) {
                return -1;
            }
            return o10.longValue();
        }

        public final C3268q0 g(Object obj, String str, String str2, long j10, k kVar, Boolean bool) {
            if (obj instanceof C3262o0) {
                str2 = ((C3262o0) obj).e();
            } else if (str2 == null || str2.length() == 0) {
                str2 = kVar.a();
            }
            return new C3268q0(str2, str, j10, d(obj, bool), b(obj));
        }

        public final C3268q0 i(File file, k kVar) {
            return new C3268q0(a(file, kVar), "", f(file), e(file), c(file));
        }

        public final String j(String str, String str2, long j10, String str3, Set set) {
            return j10 + '_' + str + '_' + T.b(set) + '_' + str2 + '_' + str3 + ".json";
        }

        private a() {
        }
    }

    public C3268q0(String str, String str2, long j10, String str3, Set set) {
        this.f38827a = str;
        this.f38828b = str2;
        this.f38829c = j10;
        this.f38830d = str3;
        this.f38831e = set;
    }

    public final String a() {
        return this.f38827a;
    }

    public final String b() {
        return f38826f.j(this.f38827a, this.f38828b, this.f38829c, this.f38830d, this.f38831e);
    }

    public final String c() {
        return this.f38827a;
    }

    public final Set d() {
        return this.f38831e;
    }

    public final boolean e() {
        return C6496s.c(this.f38830d, "startupcrash");
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3268q0)) {
            return false;
        }
        C3268q0 q0Var = (C3268q0) obj;
        return C6496s.c(this.f38827a, q0Var.f38827a) && C6496s.c(this.f38828b, q0Var.f38828b) && this.f38829c == q0Var.f38829c && C6496s.c(this.f38830d, q0Var.f38830d) && C6496s.c(this.f38831e, q0Var.f38831e);
    }

    public int hashCode() {
        return (((((((this.f38827a.hashCode() * 31) + this.f38828b.hashCode()) * 31) + Long.hashCode(this.f38829c)) * 31) + this.f38830d.hashCode()) * 31) + this.f38831e.hashCode();
    }

    public String toString() {
        return "EventFilenameInfo(apiKey=" + this.f38827a + ", uuid=" + this.f38828b + ", timestamp=" + this.f38829c + ", suffix=" + this.f38830d + ", errorTypes=" + this.f38831e + ')';
    }
}
