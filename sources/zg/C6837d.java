package zg;

import Fg.S;
import Of.C5483a;

/* renamed from: zg.d  reason: case insensitive filesystem */
public class C6837d extends C6834a implements C6840g {

    /* renamed from: c  reason: collision with root package name */
    private final C5483a f74004c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C6837d(C5483a aVar, S s10, C6840g gVar) {
        super(s10, gVar);
        if (aVar == null) {
            b(0);
        }
        if (s10 == null) {
            b(1);
        }
        this.f74004c = aVar;
    }

    private static /* synthetic */ void b(int i10) {
        String str;
        int i11;
        Throwable th2;
        if (i10 != 2) {
            str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        } else {
            str = "@NotNull method %s.%s must not return null";
        }
        if (i10 != 2) {
            i11 = 3;
        } else {
            i11 = 2;
        }
        Object[] objArr = new Object[i11];
        if (i10 == 1) {
            objArr[0] = "receiverType";
        } else if (i10 == 2) {
            objArr[0] = "kotlin/reflect/jvm/internal/impl/resolve/scopes/receivers/ExtensionReceiver";
        } else if (i10 != 3) {
            objArr[0] = "callableDescriptor";
        } else {
            objArr[0] = "newType";
        }
        if (i10 != 2) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/resolve/scopes/receivers/ExtensionReceiver";
        } else {
            objArr[1] = "getDeclarationDescriptor";
        }
        if (i10 != 2) {
            if (i10 != 3) {
                objArr[2] = "<init>";
            } else {
                objArr[2] = "replaceType";
            }
        }
        String format = String.format(str, objArr);
        if (i10 != 2) {
            th2 = new IllegalArgumentException(format);
        } else {
            th2 = new IllegalStateException(format);
        }
        throw th2;
    }

    public String toString() {
        return getType() + ": Ext {" + this.f74004c + "}";
    }
}
