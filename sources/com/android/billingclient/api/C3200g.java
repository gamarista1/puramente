package com.android.billingclient.api;

/* renamed from: com.android.billingclient.api.g  reason: case insensitive filesystem */
public final class C3200g {

    /* renamed from: a  reason: collision with root package name */
    private final boolean f38273a;

    /* renamed from: b  reason: collision with root package name */
    private final boolean f38274b;

    /* renamed from: com.android.billingclient.api.g$a */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        private boolean f38275a;

        /* renamed from: b  reason: collision with root package name */
        private boolean f38276b;

        private a() {
        }

        public C3200g a() {
            if (this.f38275a) {
                return new C3200g(true, this.f38276b);
            }
            throw new IllegalArgumentException("Pending purchases for one-time products must be supported.");
        }

        public a b() {
            this.f38275a = true;
            return this;
        }

        public a c() {
            this.f38276b = true;
            return this;
        }
    }

    private C3200g(boolean z10, boolean z11) {
        this.f38273a = z10;
        this.f38274b = z11;
    }

    public static a c() {
        return new a();
    }

    /* access modifiers changed from: package-private */
    public boolean a() {
        return this.f38273a;
    }

    /* access modifiers changed from: package-private */
    public boolean b() {
        return this.f38274b;
    }
}
