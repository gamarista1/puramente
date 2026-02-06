package com.bugsnag.android;

import com.bugsnag.android.K0;
import io.branch.rnbranch.RNBranchModule;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b\u0001\u0018\u0000 \r2\b\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u0002:\u0001\u000eB\u0011\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000bR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\fj\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011¨\u0006\u0012"}, d2 = {"Lcom/bugsnag/android/Severity;", "", "Lcom/bugsnag/android/K0$a;", "", "str", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Lcom/bugsnag/android/K0;", "writer", "Llf/M;", "toStream", "(Lcom/bugsnag/android/K0;)V", "Ljava/lang/String;", "Companion", "a", "ERROR", "WARNING", "INFO", "bugsnag-android-core_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public enum Severity implements K0.a {
    ERROR(RNBranchModule.NATIVE_INIT_SESSION_FINISHED_EVENT_ERROR),
    WARNING("warning"),
    INFO("info");
    
    public static final a Companion = null;
    /* access modifiers changed from: private */
    public final String str;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final Severity a(String str) {
            Severity[] values = Severity.values();
            int length = values.length;
            int i10 = 0;
            while (i10 < length) {
                Severity severity = values[i10];
                i10++;
                if (C6496s.c(severity.str, str)) {
                    return severity;
                }
            }
            return null;
        }

        private a() {
        }
    }

    static {
        Companion = new a((DefaultConstructorMarker) null);
    }

    private Severity(String str2) {
        this.str = str2;
    }

    public void toStream(K0 k02) {
        k02.j0(this.str);
    }
}
