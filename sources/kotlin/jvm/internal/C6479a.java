package kotlin.jvm.internal;

import Ff.f;
import java.io.Serializable;

/* renamed from: kotlin.jvm.internal.a  reason: case insensitive filesystem */
public class C6479a implements C6492n, Serializable {
    private final int arity;
    private final int flags;
    private final boolean isTopLevel;
    private final String name;
    private final Class owner;
    protected final Object receiver;
    private final String signature;

    public C6479a(int i10, Class cls, String str, String str2, int i11) {
        this(i10, C6484f.NO_RECEIVER, cls, str, str2, i11);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6479a)) {
            return false;
        }
        C6479a aVar = (C6479a) obj;
        if (this.isTopLevel != aVar.isTopLevel || this.arity != aVar.arity || this.flags != aVar.flags || !C6496s.c(this.receiver, aVar.receiver) || !C6496s.c(this.owner, aVar.owner) || !this.name.equals(aVar.name) || !this.signature.equals(aVar.signature)) {
            return false;
        }
        return true;
    }

    public int getArity() {
        return this.arity;
    }

    public f getOwner() {
        Class cls = this.owner;
        if (cls == null) {
            return null;
        }
        if (this.isTopLevel) {
            return O.c(cls);
        }
        return O.b(cls);
    }

    public int hashCode() {
        int i10;
        int i11;
        Object obj = this.receiver;
        int i12 = 0;
        if (obj != null) {
            i10 = obj.hashCode();
        } else {
            i10 = 0;
        }
        int i13 = i10 * 31;
        Class cls = this.owner;
        if (cls != null) {
            i12 = cls.hashCode();
        }
        int hashCode = (((((i13 + i12) * 31) + this.name.hashCode()) * 31) + this.signature.hashCode()) * 31;
        if (this.isTopLevel) {
            i11 = 1231;
        } else {
            i11 = 1237;
        }
        return ((((hashCode + i11) * 31) + this.arity) * 31) + this.flags;
    }

    public String toString() {
        return O.k(this);
    }

    public C6479a(int i10, Object obj, Class cls, String str, String str2, int i11) {
        this.receiver = obj;
        this.owner = cls;
        this.name = str;
        this.signature = str2;
        this.isTopLevel = (i11 & 1) == 1;
        this.arity = i10;
        this.flags = i11 >> 1;
    }
}
