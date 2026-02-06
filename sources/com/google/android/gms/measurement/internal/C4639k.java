package com.google.android.gms.measurement.internal;

/* renamed from: com.google.android.gms.measurement.internal.k  reason: case insensitive filesystem */
enum C4639k {
    UNSET('0'),
    REMOTE_DEFAULT('1'),
    REMOTE_DELEGATION('2'),
    MANIFEST('3'),
    INITIALIZATION('4'),
    API('5'),
    CHILD_ACCOUNT('6'),
    TCF('7'),
    REMOTE_ENFORCED_DEFAULT('8'),
    FAILSAFE('9');
    
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public final char f55180a;

    private C4639k(char c10) {
        this.f55180a = c10;
    }

    public static C4639k b(char c10) {
        for (C4639k kVar : values()) {
            if (kVar.f55180a == c10) {
                return kVar;
            }
        }
        return UNSET;
    }
}
