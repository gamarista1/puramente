package expo.modules.kotlin.jni;

import je.C5052a;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.T;
import mf.C6559l;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000f\b\u0007\u0018\u0000 \u00182\u00020\u0001:\u0001\u0012B\u001b\u0012\u0012\u0010\u0004\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00030\u0002\"\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006B\u001d\b\u0016\u0012\u0012\u0010\b\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00070\u0002\"\u00020\u0007¢\u0006\u0004\b\u0005\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0007¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\r\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00030\u0002H\u0007¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\u0003H\u0007¢\u0006\u0004\b\u000f\u0010\u0010J\u0018\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u0000H\u0002¢\u0006\u0004\b\u0012\u0010\u0013R\u001c\u0010\u0004\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00030\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0014R\u0014\u0010\u0017\u001a\u00020\n8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016¨\u0006\u0019"}, d2 = {"Lexpo/modules/kotlin/jni/ExpectedType;", "", "", "Lexpo/modules/kotlin/jni/SingleType;", "innerPossibleTypes", "<init>", "([Lexpo/modules/kotlin/jni/SingleType;)V", "Lje/a;", "expectedTypes", "([Lje/a;)V", "", "getCombinedTypes", "()I", "getPossibleTypes", "()[Lexpo/modules/kotlin/jni/SingleType;", "getFirstType", "()Lexpo/modules/kotlin/jni/SingleType;", "other", "a", "(Lexpo/modules/kotlin/jni/ExpectedType;)Lexpo/modules/kotlin/jni/ExpectedType;", "[Lexpo/modules/kotlin/jni/SingleType;", "b", "I", "innerCombinedTypes", "c", "expo-modules-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ExpectedType {

    /* renamed from: c  reason: collision with root package name */
    public static final a f60423c = new a((DefaultConstructorMarker) null);

    /* renamed from: d  reason: collision with root package name */
    public static final int f60424d = 8;

    /* renamed from: a  reason: collision with root package name */
    private final SingleType[] f60425a;

    /* renamed from: b  reason: collision with root package name */
    private final int f60426b;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final ExpectedType a() {
            return new ExpectedType(C5052a.STRING, C5052a.INT);
        }

        public final ExpectedType b(ExpectedType expectedType) {
            C6496s.h(expectedType, "parameterType");
            return new ExpectedType(new SingleType(C5052a.LIST, new ExpectedType[]{expectedType}));
        }

        public final ExpectedType c(ExpectedType expectedType) {
            C6496s.h(expectedType, "valueType");
            return new ExpectedType(new SingleType(C5052a.MAP, new ExpectedType[]{expectedType}));
        }

        public final ExpectedType d(ExpectedType expectedType) {
            C6496s.h(expectedType, "parameterType");
            return new ExpectedType(new SingleType(C5052a.PRIMITIVE_ARRAY, new ExpectedType[]{expectedType}));
        }

        public final ExpectedType e(C5052a aVar) {
            C6496s.h(aVar, "parameterType");
            return new ExpectedType(new SingleType(C5052a.PRIMITIVE_ARRAY, new ExpectedType[]{new ExpectedType(aVar)}));
        }

        private a() {
        }
    }

    public ExpectedType(SingleType... singleTypeArr) {
        C6496s.h(singleTypeArr, "innerPossibleTypes");
        this.f60425a = singleTypeArr;
        int i10 = 0;
        for (SingleType cppType : singleTypeArr) {
            i10 |= cppType.getCppType();
        }
        this.f60426b = i10;
    }

    public final ExpectedType a(ExpectedType expectedType) {
        C6496s.h(expectedType, "other");
        T t10 = new T(2);
        t10.b(this.f60425a);
        t10.b(expectedType.f60425a);
        return new ExpectedType((SingleType[]) t10.d(new SingleType[t10.c()]));
    }

    public final int getCombinedTypes() {
        return this.f60426b;
    }

    public final SingleType getFirstType() {
        return (SingleType) C6559l.b0(this.f60425a);
    }

    public final SingleType[] getPossibleTypes() {
        return this.f60425a;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public ExpectedType(je.C5052a... r9) {
        /*
            r8 = this;
            java.lang.String r0 = "expectedTypes"
            kotlin.jvm.internal.C6496s.h(r9, r0)
            java.util.ArrayList r0 = new java.util.ArrayList
            int r1 = r9.length
            r0.<init>(r1)
            int r1 = r9.length
            r2 = 0
            r3 = r2
        L_0x000e:
            if (r3 >= r1) goto L_0x001f
            r4 = r9[r3]
            expo.modules.kotlin.jni.SingleType r5 = new expo.modules.kotlin.jni.SingleType
            r6 = 2
            r7 = 0
            r5.<init>(r4, r7, r6, r7)
            r0.add(r5)
            int r3 = r3 + 1
            goto L_0x000e
        L_0x001f:
            expo.modules.kotlin.jni.SingleType[] r9 = new expo.modules.kotlin.jni.SingleType[r2]
            java.lang.Object[] r9 = r0.toArray(r9)
            expo.modules.kotlin.jni.SingleType[] r9 = (expo.modules.kotlin.jni.SingleType[]) r9
            int r0 = r9.length
            java.lang.Object[] r9 = java.util.Arrays.copyOf(r9, r0)
            expo.modules.kotlin.jni.SingleType[] r9 = (expo.modules.kotlin.jni.SingleType[]) r9
            r8.<init>((expo.modules.kotlin.jni.SingleType[]) r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: expo.modules.kotlin.jni.ExpectedType.<init>(je.a[]):void");
    }
}
