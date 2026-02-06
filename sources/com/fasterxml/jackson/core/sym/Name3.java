package com.fasterxml.jackson.core.sym;

public final class Name3 extends Name {

    /* renamed from: q1  reason: collision with root package name */
    private final int f42703q1;

    /* renamed from: q2  reason: collision with root package name */
    private final int f42704q2;

    /* renamed from: q3  reason: collision with root package name */
    private final int f42705q3;

    Name3(String str, int i10, int i11, int i12, int i13) {
        super(str, i10);
        this.f42703q1 = i11;
        this.f42704q2 = i12;
        this.f42705q3 = i13;
    }

    public boolean equals(int i10) {
        return false;
    }

    public boolean equals(int i10, int i11) {
        return false;
    }

    public boolean equals(int i10, int i11, int i12) {
        return this.f42703q1 == i10 && this.f42704q2 == i11 && this.f42705q3 == i12;
    }

    public boolean equals(int[] iArr, int i10) {
        return i10 == 3 && iArr[0] == this.f42703q1 && iArr[1] == this.f42704q2 && iArr[2] == this.f42705q3;
    }
}
