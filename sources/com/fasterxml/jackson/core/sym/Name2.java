package com.fasterxml.jackson.core.sym;

public final class Name2 extends Name {

    /* renamed from: q1  reason: collision with root package name */
    private final int f42701q1;

    /* renamed from: q2  reason: collision with root package name */
    private final int f42702q2;

    Name2(String str, int i10, int i11, int i12) {
        super(str, i10);
        this.f42701q1 = i11;
        this.f42702q2 = i12;
    }

    public boolean equals(int i10) {
        return false;
    }

    public boolean equals(int i10, int i11, int i12) {
        return false;
    }

    public boolean equals(int i10, int i11) {
        return i10 == this.f42701q1 && i11 == this.f42702q2;
    }

    public boolean equals(int[] iArr, int i10) {
        return i10 == 2 && iArr[0] == this.f42701q1 && iArr[1] == this.f42702q2;
    }
}
