package kotlin.jvm.internal;

import Ff.c;
import Ff.l;

public abstract class I extends C6484f implements l {

    /* renamed from: a  reason: collision with root package name */
    private final boolean f71754a;

    public I() {
        this.f71754a = false;
    }

    public c compute() {
        if (this.f71754a) {
            return this;
        }
        return super.compute();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof I) {
            I i10 = (I) obj;
            if (!getOwner().equals(i10.getOwner()) || !getName().equals(i10.getName()) || !getSignature().equals(i10.getSignature()) || !C6496s.c(getBoundReceiver(), i10.getBoundReceiver())) {
                return false;
            }
            return true;
        } else if (obj instanceof l) {
            return obj.equals(compute());
        } else {
            return false;
        }
    }

    public int hashCode() {
        return (((getOwner().hashCode() * 31) + getName().hashCode()) * 31) + getSignature().hashCode();
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public l getReflected() {
        if (!this.f71754a) {
            return (l) super.getReflected();
        }
        throw new UnsupportedOperationException("Kotlin reflection is not yet supported for synthetic Java properties. Please follow/upvote https://youtrack.jetbrains.com/issue/KT-55980");
    }

    public String toString() {
        c compute = compute();
        if (compute != this) {
            return compute.toString();
        }
        return "property " + getName() + " (Kotlin reflection is not available)";
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public I(Object obj, Class cls, String str, String str2, int i10) {
        super(obj, cls, str, str2, (i10 & 1) == 1);
        boolean z10 = false;
        this.f71754a = (i10 & 2) == 2 ? true : z10;
    }
}
