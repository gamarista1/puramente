package kotlin.jvm.internal;

import Ff.c;
import Ff.g;

/* renamed from: kotlin.jvm.internal.o  reason: case insensitive filesystem */
public abstract class C6493o extends C6484f implements C6492n, g {
    private final int arity;
    private final int flags;

    public C6493o(int i10) {
        this(i10, C6484f.NO_RECEIVER, (Class) null, (String) null, (String) null, 0);
    }

    /* access modifiers changed from: protected */
    public c computeReflected() {
        return O.a(this);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C6493o) {
            C6493o oVar = (C6493o) obj;
            if (!getName().equals(oVar.getName()) || !getSignature().equals(oVar.getSignature()) || this.flags != oVar.flags || this.arity != oVar.arity || !C6496s.c(getBoundReceiver(), oVar.getBoundReceiver()) || !C6496s.c(getOwner(), oVar.getOwner())) {
                return false;
            }
            return true;
        } else if (obj instanceof g) {
            return obj.equals(compute());
        } else {
            return false;
        }
    }

    public int getArity() {
        return this.arity;
    }

    public int hashCode() {
        int i10;
        if (getOwner() == null) {
            i10 = 0;
        } else {
            i10 = getOwner().hashCode() * 31;
        }
        return ((i10 + getName().hashCode()) * 31) + getSignature().hashCode();
    }

    public boolean isExternal() {
        return getReflected().isExternal();
    }

    public boolean isInfix() {
        return getReflected().isInfix();
    }

    public boolean isInline() {
        return getReflected().isInline();
    }

    public boolean isOperator() {
        return getReflected().isOperator();
    }

    public boolean isSuspend() {
        return getReflected().isSuspend();
    }

    public String toString() {
        c compute = compute();
        if (compute != this) {
            return compute.toString();
        }
        if ("<init>".equals(getName())) {
            return "constructor (Kotlin reflection is not available)";
        }
        return "function " + getName() + " (Kotlin reflection is not available)";
    }

    public C6493o(int i10, Object obj) {
        this(i10, obj, (Class) null, (String) null, (String) null, 0);
    }

    /* access modifiers changed from: protected */
    public g getReflected() {
        return (g) super.getReflected();
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C6493o(int i10, Object obj, Class cls, String str, String str2, int i11) {
        super(obj, cls, str, str2, (i11 & 1) == 1);
        this.arity = i10;
        this.flags = i11 >> 1;
    }
}
