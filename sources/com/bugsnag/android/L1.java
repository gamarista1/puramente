package com.bugsnag.android;

import android.util.JsonReader;
import com.bugsnag.android.K0;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;

public final class L1 implements K0.a {

    /* renamed from: d  reason: collision with root package name */
    public static final a f38529d = new a((DefaultConstructorMarker) null);

    /* renamed from: a  reason: collision with root package name */
    private final String f38530a;

    /* renamed from: b  reason: collision with root package name */
    private final String f38531b;

    /* renamed from: c  reason: collision with root package name */
    private final String f38532c;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public L1 a(JsonReader jsonReader) {
            jsonReader.beginObject();
            String str = null;
            String str2 = null;
            String str3 = null;
            while (jsonReader.hasNext()) {
                String nextName = jsonReader.nextName();
                String nextString = jsonReader.nextString();
                if (nextName != null) {
                    int hashCode = nextName.hashCode();
                    if (hashCode != 3355) {
                        if (hashCode != 3373707) {
                            if (hashCode == 96619420 && nextName.equals("email")) {
                                str2 = nextString;
                            }
                        } else if (nextName.equals("name")) {
                            str3 = nextString;
                        }
                    } else if (nextName.equals("id")) {
                        str = nextString;
                    }
                }
            }
            L1 l12 = new L1(str, str2, str3);
            jsonReader.endObject();
            return l12;
        }

        private a() {
        }
    }

    public L1(String str, String str2, String str3) {
        this.f38530a = str;
        this.f38531b = str2;
        this.f38532c = str3;
    }

    public final String a() {
        return this.f38531b;
    }

    public final String b() {
        return this.f38530a;
    }

    public final String c() {
        return this.f38532c;
    }

    public boolean equals(Object obj) {
        Class<?> cls;
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            cls = null;
        } else {
            cls = obj.getClass();
        }
        if (!C6496s.c(L1.class, cls)) {
            return false;
        }
        if (obj != null) {
            L1 l12 = (L1) obj;
            if (C6496s.c(this.f38530a, l12.f38530a) && C6496s.c(this.f38531b, l12.f38531b) && C6496s.c(this.f38532c, l12.f38532c)) {
                return true;
            }
            return false;
        }
        throw new NullPointerException("null cannot be cast to non-null type com.bugsnag.android.User");
    }

    public int hashCode() {
        int i10;
        int i11;
        String str = this.f38530a;
        int i12 = 0;
        if (str == null) {
            i10 = 0;
        } else {
            i10 = str.hashCode();
        }
        int i13 = i10 * 31;
        String str2 = this.f38531b;
        if (str2 == null) {
            i11 = 0;
        } else {
            i11 = str2.hashCode();
        }
        int i14 = (i13 + i11) * 31;
        String str3 = this.f38532c;
        if (str3 != null) {
            i12 = str3.hashCode();
        }
        return i14 + i12;
    }

    public void toStream(K0 k02) {
        k02.n();
        k02.y("id").j0(this.f38530a);
        k02.y("email").j0(this.f38531b);
        k02.y("name").j0(this.f38532c);
        k02.t();
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ L1(String str, String str2, String str3, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? null : str, (i10 & 2) != 0 ? null : str2, (i10 & 4) != 0 ? null : str3);
    }
}
