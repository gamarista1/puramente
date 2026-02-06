package f2;

import android.view.View;

/* renamed from: f2.a  reason: case insensitive filesystem */
public final class C1966a {

    /* renamed from: a  reason: collision with root package name */
    public final View f19915a;

    /* renamed from: b  reason: collision with root package name */
    public final int f19916b;

    /* renamed from: c  reason: collision with root package name */
    public final String f19917c;

    /* renamed from: f2.a$a  reason: collision with other inner class name */
    public static final class C0343a {

        /* renamed from: a  reason: collision with root package name */
        private final View f19918a;

        /* renamed from: b  reason: collision with root package name */
        private final int f19919b;

        /* renamed from: c  reason: collision with root package name */
        private String f19920c;

        public C0343a(View view, int i10) {
            this.f19918a = view;
            this.f19919b = i10;
        }

        public C1966a a() {
            return new C1966a(this.f19918a, this.f19919b, this.f19920c);
        }

        public C0343a b(String str) {
            this.f19920c = str;
            return this;
        }
    }

    public C1966a(View view, int i10, String str) {
        this.f19915a = view;
        this.f19916b = i10;
        this.f19917c = str;
    }
}
