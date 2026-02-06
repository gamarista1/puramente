package Bg;

import kotlin.jvm.internal.C6496s;
import ng.b;

/* renamed from: Bg.y  reason: case insensitive filesystem */
public final class C5338y {

    /* renamed from: a  reason: collision with root package name */
    private final Object f62589a;

    /* renamed from: b  reason: collision with root package name */
    private final Object f62590b;

    /* renamed from: c  reason: collision with root package name */
    private final Object f62591c;

    /* renamed from: d  reason: collision with root package name */
    private final Object f62592d;

    /* renamed from: e  reason: collision with root package name */
    private final String f62593e;

    /* renamed from: f  reason: collision with root package name */
    private final b f62594f;

    public C5338y(Object obj, Object obj2, Object obj3, Object obj4, String str, b bVar) {
        C6496s.h(str, "filePath");
        C6496s.h(bVar, "classId");
        this.f62589a = obj;
        this.f62590b = obj2;
        this.f62591c = obj3;
        this.f62592d = obj4;
        this.f62593e = str;
        this.f62594f = bVar;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5338y)) {
            return false;
        }
        C5338y yVar = (C5338y) obj;
        if (C6496s.c(this.f62589a, yVar.f62589a) && C6496s.c(this.f62590b, yVar.f62590b) && C6496s.c(this.f62591c, yVar.f62591c) && C6496s.c(this.f62592d, yVar.f62592d) && C6496s.c(this.f62593e, yVar.f62593e) && C6496s.c(this.f62594f, yVar.f62594f)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int i10;
        int i11;
        int i12;
        Object obj = this.f62589a;
        int i13 = 0;
        if (obj == null) {
            i10 = 0;
        } else {
            i10 = obj.hashCode();
        }
        int i14 = i10 * 31;
        Object obj2 = this.f62590b;
        if (obj2 == null) {
            i11 = 0;
        } else {
            i11 = obj2.hashCode();
        }
        int i15 = (i14 + i11) * 31;
        Object obj3 = this.f62591c;
        if (obj3 == null) {
            i12 = 0;
        } else {
            i12 = obj3.hashCode();
        }
        int i16 = (i15 + i12) * 31;
        Object obj4 = this.f62592d;
        if (obj4 != null) {
            i13 = obj4.hashCode();
        }
        return ((((i16 + i13) * 31) + this.f62593e.hashCode()) * 31) + this.f62594f.hashCode();
    }

    public String toString() {
        return "IncompatibleVersionErrorData(actualVersion=" + this.f62589a + ", compilerVersion=" + this.f62590b + ", languageVersion=" + this.f62591c + ", expectedVersion=" + this.f62592d + ", filePath=" + this.f62593e + ", classId=" + this.f62594f + ')';
    }
}
