package expo.modules.kotlin.sharedobjects;

import ae.u;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0017\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u001b\u0012\u0006\u0010\u0003\u001a\u00028\u0000\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u0017\u0010\u0003\u001a\u00028\u00008\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u001a\u0010\u0011\u001a\u00020\f8\u0016XD¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0012"}, d2 = {"Lexpo/modules/kotlin/sharedobjects/SharedRef;", "RefType", "Lexpo/modules/kotlin/sharedobjects/SharedObject;", "ref", "Lae/u;", "runtimeContext", "<init>", "(Ljava/lang/Object;Lae/u;)V", "c", "Ljava/lang/Object;", "T", "()Ljava/lang/Object;", "", "d", "Ljava/lang/String;", "Q", "()Ljava/lang/String;", "nativeRefType", "expo-modules-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public class SharedRef<RefType> extends SharedObject {

    /* renamed from: c  reason: collision with root package name */
    private final Object f60455c;

    /* renamed from: d  reason: collision with root package name */
    private final String f60456d;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ SharedRef(Object obj, u uVar, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(obj, (i10 & 2) != 0 ? null : uVar);
    }

    public String Q() {
        return this.f60456d;
    }

    public final Object T() {
        return this.f60455c;
    }

    public SharedRef(Object obj, u uVar) {
        super(uVar);
        this.f60455c = obj;
        this.f60456d = "unknown";
    }
}
