package Jc;

import kotlin.jvm.internal.C6496s;

public final class e {

    /* renamed from: a  reason: collision with root package name */
    private final Boolean f51385a;

    /* renamed from: b  reason: collision with root package name */
    private final Double f51386b;

    /* renamed from: c  reason: collision with root package name */
    private final Integer f51387c;

    /* renamed from: d  reason: collision with root package name */
    private final Integer f51388d;

    /* renamed from: e  reason: collision with root package name */
    private final Long f51389e;

    public e(Boolean bool, Double d10, Integer num, Integer num2, Long l10) {
        this.f51385a = bool;
        this.f51386b = d10;
        this.f51387c = num;
        this.f51388d = num2;
        this.f51389e = l10;
    }

    public final Integer a() {
        return this.f51388d;
    }

    public final Long b() {
        return this.f51389e;
    }

    public final Boolean c() {
        return this.f51385a;
    }

    public final Integer d() {
        return this.f51387c;
    }

    public final Double e() {
        return this.f51386b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        if (C6496s.c(this.f51385a, eVar.f51385a) && C6496s.c(this.f51386b, eVar.f51386b) && C6496s.c(this.f51387c, eVar.f51387c) && C6496s.c(this.f51388d, eVar.f51388d) && C6496s.c(this.f51389e, eVar.f51389e)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int i10;
        int i11;
        int i12;
        int i13;
        Boolean bool = this.f51385a;
        int i14 = 0;
        if (bool == null) {
            i10 = 0;
        } else {
            i10 = bool.hashCode();
        }
        int i15 = i10 * 31;
        Double d10 = this.f51386b;
        if (d10 == null) {
            i11 = 0;
        } else {
            i11 = d10.hashCode();
        }
        int i16 = (i15 + i11) * 31;
        Integer num = this.f51387c;
        if (num == null) {
            i12 = 0;
        } else {
            i12 = num.hashCode();
        }
        int i17 = (i16 + i12) * 31;
        Integer num2 = this.f51388d;
        if (num2 == null) {
            i13 = 0;
        } else {
            i13 = num2.hashCode();
        }
        int i18 = (i17 + i13) * 31;
        Long l10 = this.f51389e;
        if (l10 != null) {
            i14 = l10.hashCode();
        }
        return i18 + i14;
    }

    public String toString() {
        return "SessionConfigs(sessionEnabled=" + this.f51385a + ", sessionSamplingRate=" + this.f51386b + ", sessionRestartTimeout=" + this.f51387c + ", cacheDuration=" + this.f51388d + ", cacheUpdatedTime=" + this.f51389e + ')';
    }
}
