package com.swmansion.rnscreens.utils;

final class b {

    /* renamed from: a  reason: collision with root package name */
    private final int f59929a;

    /* renamed from: b  reason: collision with root package name */
    private final boolean f59930b;

    public b(int i10, boolean z10) {
        this.f59929a = i10;
        this.f59930b = z10;
    }

    public final int a() {
        return this.f59929a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f59929a == bVar.f59929a && this.f59930b == bVar.f59930b;
    }

    public int hashCode() {
        return (Integer.hashCode(this.f59929a) * 31) + Boolean.hashCode(this.f59930b);
    }

    public String toString() {
        int i10 = this.f59929a;
        boolean z10 = this.f59930b;
        return "CacheKey(fontSize=" + i10 + ", isTitleEmpty=" + z10 + ")";
    }
}
