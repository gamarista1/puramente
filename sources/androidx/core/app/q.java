package androidx.core.app;

import android.os.Bundle;
import androidx.core.app.o;
import androidx.core.graphics.drawable.IconCompat;
import com.amazon.a.a.o.b;
import java.util.ArrayList;
import java.util.Set;

abstract class q {

    /* renamed from: a  reason: collision with root package name */
    private static final Object f15908a = new Object();

    /* renamed from: b  reason: collision with root package name */
    private static final Object f15909b = new Object();

    static Bundle a(o.b bVar) {
        int i10;
        Bundle bundle;
        Bundle bundle2 = new Bundle();
        IconCompat d10 = bVar.d();
        if (d10 != null) {
            i10 = d10.g();
        } else {
            i10 = 0;
        }
        bundle2.putInt("icon", i10);
        bundle2.putCharSequence(b.f37461S, bVar.h());
        bundle2.putParcelable("actionIntent", bVar.a());
        if (bVar.c() != null) {
            bundle = new Bundle(bVar.c());
        } else {
            bundle = new Bundle();
        }
        bundle.putBoolean("android.support.allowGeneratedReplies", bVar.b());
        bundle2.putBundle("extras", bundle);
        bundle2.putParcelableArray("remoteInputs", c(bVar.e()));
        bundle2.putBoolean("showsUserInterface", bVar.g());
        bundle2.putInt("semanticAction", bVar.f());
        return bundle2;
    }

    private static Bundle b(w wVar) {
        Bundle bundle = new Bundle();
        bundle.putString("resultKey", wVar.i());
        bundle.putCharSequence("label", wVar.h());
        bundle.putCharSequenceArray("choices", wVar.e());
        bundle.putBoolean("allowFreeFormInput", wVar.c());
        bundle.putBundle("extras", wVar.g());
        Set<String> d10 = wVar.d();
        if (d10 != null && !d10.isEmpty()) {
            ArrayList arrayList = new ArrayList(d10.size());
            for (String add : d10) {
                arrayList.add(add);
            }
            bundle.putStringArrayList("allowedDataTypes", arrayList);
        }
        return bundle;
    }

    private static Bundle[] c(w[] wVarArr) {
        if (wVarArr == null) {
            return null;
        }
        Bundle[] bundleArr = new Bundle[wVarArr.length];
        for (int i10 = 0; i10 < wVarArr.length; i10++) {
            bundleArr[i10] = b(wVarArr[i10]);
        }
        return bundleArr;
    }
}
