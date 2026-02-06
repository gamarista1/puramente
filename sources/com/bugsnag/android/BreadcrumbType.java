package com.bugsnag.android;

import io.branch.rnbranch.RNBranchModule;
import io.intercom.android.sdk.models.Participant;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0011\b\u0001\u0018\u0000 \t2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0006\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0006\u0010\u0007R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\bj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012¨\u0006\u0013"}, d2 = {"Lcom/bugsnag/android/BreadcrumbType;", "", "", "type", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "toString", "()Ljava/lang/String;", "Ljava/lang/String;", "Companion", "a", "ERROR", "LOG", "MANUAL", "NAVIGATION", "PROCESS", "REQUEST", "STATE", "USER", "bugsnag-android-core_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public enum BreadcrumbType {
    ERROR(RNBranchModule.NATIVE_INIT_SESSION_FINISHED_EVENT_ERROR),
    LOG("log"),
    MANUAL("manual"),
    NAVIGATION("navigation"),
    PROCESS("process"),
    REQUEST("request"),
    STATE("state"),
    USER(Participant.USER_TYPE);
    
    public static final a Companion = null;
    /* access modifiers changed from: private */
    public final String type;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final BreadcrumbType a(String str) {
            BreadcrumbType[] values = BreadcrumbType.values();
            int length = values.length;
            int i10 = 0;
            BreadcrumbType breadcrumbType = null;
            boolean z10 = false;
            while (i10 < length) {
                BreadcrumbType breadcrumbType2 = values[i10];
                i10++;
                if (C6496s.c(breadcrumbType2.type, str)) {
                    if (z10) {
                        return null;
                    }
                    z10 = true;
                    breadcrumbType = breadcrumbType2;
                }
            }
            if (!z10) {
                return null;
            }
            return breadcrumbType;
        }

        private a() {
        }
    }

    static {
        Companion = new a((DefaultConstructorMarker) null);
    }

    private BreadcrumbType(String str) {
        this.type = str;
    }

    public String toString() {
        return this.type;
    }
}
