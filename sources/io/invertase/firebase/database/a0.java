package io.invertase.firebase.database;

import android.content.Context;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import io.invertase.firebase.common.b;
import java.util.Map;

public class a0 extends b {
    a0(Context context, String str) {
        super(context, str);
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void l(TaskCompletionSource taskCompletionSource, Gb.b bVar, com.google.firebase.database.b bVar2) {
        if (bVar != null) {
            taskCompletionSource.setException(new N(bVar.f(), bVar.g(), bVar.h()));
        } else {
            taskCompletionSource.setResult(null);
        }
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void m(TaskCompletionSource taskCompletionSource, Gb.b bVar, com.google.firebase.database.b bVar2) {
        if (bVar != null) {
            taskCompletionSource.setException(new N(bVar.f(), bVar.g(), bVar.h()));
        } else {
            taskCompletionSource.setResult(null);
        }
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void n(TaskCompletionSource taskCompletionSource, Gb.b bVar, com.google.firebase.database.b bVar2) {
        if (bVar != null) {
            taskCompletionSource.setException(new N(bVar.f(), bVar.g(), bVar.h()));
        } else {
            taskCompletionSource.setResult(null);
        }
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void o(TaskCompletionSource taskCompletionSource, Gb.b bVar, com.google.firebase.database.b bVar2) {
        if (bVar != null) {
            taskCompletionSource.setException(new N(bVar.f(), bVar.g(), bVar.h()));
        } else {
            taskCompletionSource.setResult(null);
        }
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void p(TaskCompletionSource taskCompletionSource, Gb.b bVar, com.google.firebase.database.b bVar2) {
        if (bVar != null) {
            taskCompletionSource.setException(new N(bVar.f(), bVar.g(), bVar.h()));
        } else {
            taskCompletionSource.setResult(null);
        }
    }

    /* access modifiers changed from: package-private */
    public Task q(String str, String str2, String str3) {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        P.b(str, str2).f(str3).N(new Y(taskCompletionSource));
        return taskCompletionSource.getTask();
    }

    /* access modifiers changed from: package-private */
    public Task r(String str, String str2, String str3, Object obj) {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        P.b(str, str2).f(str3).R(obj, new V(taskCompletionSource));
        return taskCompletionSource.getTask();
    }

    /* access modifiers changed from: package-private */
    public Task s(String str, String str2, String str3, Object obj) {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        P.b(str, str2).f(str3).P(obj, new Z(taskCompletionSource));
        return taskCompletionSource.getTask();
    }

    /* access modifiers changed from: package-private */
    public Task t(String str, String str2, String str3, Object obj, Object obj2) {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        P.b(str, str2).f(str3).S(obj, obj2, new W(taskCompletionSource));
        return taskCompletionSource.getTask();
    }

    /* access modifiers changed from: package-private */
    public Task u(String str, String str2, String str3, Map map) {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        P.b(str, str2).f(str3).U(map, new X(taskCompletionSource));
        return taskCompletionSource.getTask();
    }
}
