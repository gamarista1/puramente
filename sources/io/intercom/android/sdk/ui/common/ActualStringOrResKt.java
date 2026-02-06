package io.intercom.android.sdk.ui.common;

import Sg.p;
import android.content.Context;
import io.branch.rnbranch.RNBranchModule;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.C6496s;
import mf.C6565s;

@Metadata(d1 = {"\u0000\u001e\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u001a4\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\b\u0001\u0010\u0004\u001a\u00020\u00052\u001a\b\u0002\u0010\u0006\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00010\b0\u0007¨\u0006\t"}, d2 = {"parseString", "", "context", "Landroid/content/Context;", "stringRes", "", "params", "", "Lkotlin/Pair;", "intercom-sdk-ui_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class ActualStringOrResKt {
    public static final String parseString(Context context, int i10, List<Pair<String, String>> list) {
        C6496s.h(context, "context");
        C6496s.h(list, RNBranchModule.NATIVE_INIT_SESSION_FINISHED_EVENT_PARAMS);
        String string = context.getString(i10);
        C6496s.g(string, "getString(...)");
        String str = string;
        for (Pair pair : list) {
            str = p.D(str, '{' + ((String) pair.c()) + '}', (String) pair.d(), false, 4, (Object) null);
        }
        return str;
    }

    public static /* synthetic */ String parseString$default(Context context, int i10, List list, int i11, Object obj) {
        if ((i11 & 4) != 0) {
            list = C6565s.n();
        }
        return parseString(context, i10, list);
    }
}
