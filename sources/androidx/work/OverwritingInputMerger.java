package androidx.work;

import androidx.work.C1840g;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\u0007\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Landroidx/work/OverwritingInputMerger;", "Landroidx/work/l;", "<init>", "()V", "", "Landroidx/work/g;", "inputs", "a", "(Ljava/util/List;)Landroidx/work/g;", "work-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class OverwritingInputMerger extends l {
    public C1840g a(List list) {
        C6496s.h(list, "inputs");
        C1840g.a aVar = new C1840g.a();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Map h10 = ((C1840g) it.next()).h();
            C6496s.g(h10, "input.keyValueMap");
            linkedHashMap.putAll(h10);
        }
        aVar.d(linkedHashMap);
        C1840g a10 = aVar.a();
        C6496s.g(a10, "output.build()");
        return a10;
    }
}
