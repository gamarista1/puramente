package com.fasterxml.jackson.core.sym;

public final class Name1 extends Name {
    private static final Name1 EMPTY = new Name1("", 0, 0);

    /* renamed from: q  reason: collision with root package name */
    private final int f42700q;

    Name1(String str, int i10, int i11) {
        super(str, i10);
        this.f42700q = i11;
    }

    public static Name1 getEmptyName() {
        return EMPTY;
    }

    public boolean equals(int i10, int i11, int i12) {
        return false;
    }

    public boolean equals(int i10) {
        return i10 == this.f42700q;
    }

    public boolean equals(int i10, int i11) {
        return i10 == this.f42700q && i11 == 0;
    }

    public boolean equals(int[] iArr, int i10) {
        return i10 == 1 && iArr[0] == this.f42700q;
    }
}
