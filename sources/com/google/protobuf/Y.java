package com.google.protobuf;

final class Y implements I {

    /* renamed from: a  reason: collision with root package name */
    private final K f58423a;

    /* renamed from: b  reason: collision with root package name */
    private final String f58424b;

    /* renamed from: c  reason: collision with root package name */
    private final Object[] f58425c;

    /* renamed from: d  reason: collision with root package name */
    private final int f58426d;

    Y(K k10, String str, Object[] objArr) {
        this.f58423a = k10;
        this.f58424b = str;
        this.f58425c = objArr;
        char charAt = str.charAt(0);
        if (charAt < 55296) {
            this.f58426d = charAt;
            return;
        }
        char c10 = charAt & 8191;
        int i10 = 13;
        int i11 = 1;
        while (true) {
            int i12 = i11 + 1;
            char charAt2 = str.charAt(i11);
            if (charAt2 >= 55296) {
                c10 |= (charAt2 & 8191) << i10;
                i10 += 13;
                i11 = i12;
            } else {
                this.f58426d = c10 | (charAt2 << i10);
                return;
            }
        }
    }

    public boolean a() {
        if ((this.f58426d & 2) == 2) {
            return true;
        }
        return false;
    }

    public K b() {
        return this.f58423a;
    }

    public V c() {
        if ((this.f58426d & 1) == 1) {
            return V.PROTO2;
        }
        return V.PROTO3;
    }

    /* access modifiers changed from: package-private */
    public Object[] d() {
        return this.f58425c;
    }

    /* access modifiers changed from: package-private */
    public String e() {
        return this.f58424b;
    }
}
