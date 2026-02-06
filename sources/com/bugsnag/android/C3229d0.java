package com.bugsnag.android;

import android.util.JsonReader;
import com.bugsnag.android.K0;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: com.bugsnag.android.d0  reason: case insensitive filesystem */
final class C3229d0 implements K0.a {

    /* renamed from: b  reason: collision with root package name */
    public static final a f38686b = new a((DefaultConstructorMarker) null);

    /* renamed from: a  reason: collision with root package name */
    private final String f38687a;

    /* renamed from: com.bugsnag.android.d0$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public C3229d0 a(JsonReader jsonReader) {
            String str;
            jsonReader.beginObject();
            if (!jsonReader.hasNext() || !C6496s.c("id", jsonReader.nextName())) {
                str = null;
            } else {
                str = jsonReader.nextString();
            }
            return new C3229d0(str);
        }

        private a() {
        }
    }

    public C3229d0(String str) {
        this.f38687a = str;
    }

    public final String a() {
        return this.f38687a;
    }

    public void toStream(K0 k02) {
        k02.n();
        k02.y("id");
        k02.j0(a());
        k02.t();
    }
}
