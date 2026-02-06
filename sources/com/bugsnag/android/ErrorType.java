package com.bugsnag.android;

import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u000e\b\u0001\u0018\u0000 \t2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0003\u001a\u00020\u00028\u0000X\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\bj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000f¨\u0006\u0010"}, d2 = {"Lcom/bugsnag/android/ErrorType;", "", "", "desc", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Ljava/lang/String;", "getDesc$bugsnag_android_core_release", "()Ljava/lang/String;", "Companion", "a", "UNKNOWN", "ANDROID", "REACTNATIVEJS", "C", "DART", "bugsnag-android-core_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public enum ErrorType {
    UNKNOWN(""),
    ANDROID("android"),
    REACTNATIVEJS("reactnativejs"),
    C("c"),
    DART("dart");
    
    public static final a Companion = null;
    private final String desc;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final ErrorType a(String str) {
            ErrorType[] values = ErrorType.values();
            int length = values.length;
            int i10 = 0;
            while (i10 < length) {
                ErrorType errorType = values[i10];
                i10++;
                if (C6496s.c(errorType.getDesc$bugsnag_android_core_release(), str)) {
                    return errorType;
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

    private ErrorType(String str) {
        this.desc = str;
    }

    public static final ErrorType fromDescriptor(String str) {
        return Companion.a(str);
    }

    public final String getDesc$bugsnag_android_core_release() {
        return this.desc;
    }
}
