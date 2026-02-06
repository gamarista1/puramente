package com.facebook;

import android.content.Intent;
import kotlin.jvm.internal.C6496s;
import o7.C3889e;

/* renamed from: com.facebook.n  reason: case insensitive filesystem */
public interface C3324n {

    /* renamed from: com.facebook.n$a */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        private final int f40198a;

        /* renamed from: b  reason: collision with root package name */
        private final int f40199b;

        /* renamed from: c  reason: collision with root package name */
        private final Intent f40200c;

        public a(int i10, int i11, Intent intent) {
            this.f40198a = i10;
            this.f40199b = i11;
            this.f40200c = intent;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f40198a == aVar.f40198a && this.f40199b == aVar.f40199b && C6496s.c(this.f40200c, aVar.f40200c);
        }

        public int hashCode() {
            int hashCode = ((Integer.hashCode(this.f40198a) * 31) + Integer.hashCode(this.f40199b)) * 31;
            Intent intent = this.f40200c;
            return hashCode + (intent == null ? 0 : intent.hashCode());
        }

        public String toString() {
            return "ActivityResultParameters(requestCode=" + this.f40198a + ", resultCode=" + this.f40199b + ", data=" + this.f40200c + ')';
        }
    }

    /* renamed from: com.facebook.n$b */
    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        public static final b f40201a = new b();

        private b() {
        }

        public static final C3324n a() {
            return new C3889e();
        }
    }

    boolean a(int i10, int i11, Intent intent);
}
