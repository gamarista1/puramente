package kotlin;

import java.io.Serializable;
import kotlin.jvm.internal.C6496s;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\b\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u0001*\u0006\b\u0001\u0010\u0002 \u00012\u00060\u0003j\u0002`\u0004B\u0017\u0012\u0006\u0010\u0005\u001a\u00028\u0000\u0012\u0006\u0010\u0006\u001a\u00028\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00028\u0000HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00028\u0001HÆ\u0003¢\u0006\u0004\b\u000e\u0010\rJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0005\u001a\u00028\u00008\u0006¢\u0006\f\n\u0004\b\f\u0010\u0017\u001a\u0004\b\u0018\u0010\rR\u0017\u0010\u0006\u001a\u00028\u00018\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u0017\u001a\u0004\b\u0019\u0010\r¨\u0006\u001a"}, d2 = {"Lkotlin/Pair;", "A", "B", "Ljava/io/Serializable;", "Lkotlin/io/Serializable;", "first", "second", "<init>", "(Ljava/lang/Object;Ljava/lang/Object;)V", "", "toString", "()Ljava/lang/String;", "a", "()Ljava/lang/Object;", "b", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/Object;", "c", "d", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class Pair<A, B> implements Serializable {

    /* renamed from: a  reason: collision with root package name */
    private final Object f71742a;

    /* renamed from: b  reason: collision with root package name */
    private final Object f71743b;

    public Pair(Object obj, Object obj2) {
        this.f71742a = obj;
        this.f71743b = obj2;
    }

    public final Object a() {
        return this.f71742a;
    }

    public final Object b() {
        return this.f71743b;
    }

    public final Object c() {
        return this.f71742a;
    }

    public final Object d() {
        return this.f71743b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Pair)) {
            return false;
        }
        Pair pair = (Pair) obj;
        return C6496s.c(this.f71742a, pair.f71742a) && C6496s.c(this.f71743b, pair.f71743b);
    }

    public int hashCode() {
        Object obj = this.f71742a;
        int i10 = 0;
        int hashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        Object obj2 = this.f71743b;
        if (obj2 != null) {
            i10 = obj2.hashCode();
        }
        return hashCode + i10;
    }

    public String toString() {
        return '(' + this.f71742a + ", " + this.f71743b + ')';
    }
}
