package expo.modules.kotlin.jni;

import je.C5052a;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u000b\b\u0007\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0011\u0010\f\u001a\u0004\u0018\u00010\u0005H\u0007¢\u0006\u0004\b\f\u0010\rJ\u0011\u0010\u000e\u001a\u0004\u0018\u00010\u0005H\u0007¢\u0006\u0004\b\u000e\u0010\rR\u001a\u0010\u0003\u001a\u00020\u00028\u0000X\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u000f\u0010\u0011R\u001c\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lexpo/modules/kotlin/jni/SingleType;", "", "Lje/a;", "expectedCppType", "", "Lexpo/modules/kotlin/jni/ExpectedType;", "parameterTypes", "<init>", "(Lje/a;[Lexpo/modules/kotlin/jni/ExpectedType;)V", "", "getCppType", "()I", "getFirstParameterType", "()Lexpo/modules/kotlin/jni/ExpectedType;", "getSecondParameterType", "a", "Lje/a;", "()Lje/a;", "b", "[Lexpo/modules/kotlin/jni/ExpectedType;", "expo-modules-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class SingleType {

    /* renamed from: a  reason: collision with root package name */
    private final C5052a f60450a;

    /* renamed from: b  reason: collision with root package name */
    private final ExpectedType[] f60451b;

    public SingleType(C5052a aVar, ExpectedType[] expectedTypeArr) {
        C6496s.h(aVar, "expectedCppType");
        this.f60450a = aVar;
        this.f60451b = expectedTypeArr;
    }

    public final C5052a a() {
        return this.f60450a;
    }

    public final int getCppType() {
        return this.f60450a.c();
    }

    public final ExpectedType getFirstParameterType() {
        ExpectedType[] expectedTypeArr = this.f60451b;
        if (expectedTypeArr != null) {
            return expectedTypeArr[0];
        }
        return null;
    }

    public final ExpectedType getSecondParameterType() {
        ExpectedType[] expectedTypeArr = this.f60451b;
        if (expectedTypeArr != null) {
            return expectedTypeArr[1];
        }
        return null;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ SingleType(C5052a aVar, ExpectedType[] expectedTypeArr, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(aVar, (i10 & 2) != 0 ? null : expectedTypeArr);
    }
}
