package expo.modules.kotlin.types;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0017\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u0001*\b\b\u0001\u0010\u0003*\u00020\u0001*\b\b\u0002\u0010\u0004*\u00020\u00012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0005B+\u0012\u0006\u0010\u0006\u001a\u00020\u0001\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lexpo/modules/kotlin/types/EitherOfThree;", "", "FirstType", "SecondType", "ThirdType", "Lexpo/modules/kotlin/types/Either;", "bareValue", "", "Lqe/u;", "deferredValue", "", "LFf/p;", "types", "<init>", "(Ljava/lang/Object;Ljava/util/List;Ljava/util/List;)V", "expo-modules-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public class EitherOfThree<FirstType, SecondType, ThirdType> extends Either<FirstType, SecondType> {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public EitherOfThree(Object obj, List list, List list2) {
        super(obj, list, list2);
        C6496s.h(obj, "bareValue");
        C6496s.h(list, "deferredValue");
        C6496s.h(list2, "types");
    }
}
