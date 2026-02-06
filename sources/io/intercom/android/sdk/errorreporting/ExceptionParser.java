package io.intercom.android.sdk.errorreporting;

import io.intercom.android.sdk.utilities.commons.TimeProvider;
import java.util.ArrayList;
import java.util.List;

class ExceptionParser {
    private static final String[] ALLOWED_PACKAGES = {"io.intercom.android.sdk", "java.", "kotlin.", "kotlinx.", "android.", "androidx.", "com.android.", "com.google."};
    private static final String INTERCOM_SDK_PACKAGE = "io.intercom.android.sdk";
    private static final String REDACTION_LINE = "[Non Intercom/OS method]";

    ExceptionParser() {
    }

    private List<ExceptionReport> createExceptionReports(Throwable th2) {
        ArrayList arrayList = new ArrayList();
        while (th2 != null) {
            arrayList.add(new ExceptionReport(th2.getClass().getName(), th2.getLocalizedMessage(), getStacktraceString(th2.getStackTrace())));
            th2 = th2.getCause();
        }
        return arrayList;
    }

    private String getStacktraceString(StackTraceElement[] stackTraceElementArr) {
        String str;
        StringBuilder sb2 = new StringBuilder();
        for (int i10 = 0; i10 < stackTraceElementArr.length; i10++) {
            StackTraceElement stackTraceElement = stackTraceElementArr[i10];
            if (isFromAllowedPackage(stackTraceElement)) {
                str = stackTraceElement.toString();
            } else {
                str = REDACTION_LINE;
            }
            sb2.append(str);
            if (i10 < stackTraceElementArr.length - 1) {
                sb2.append("\n");
            }
        }
        return sb2.toString();
    }

    private boolean isFromAllowedPackage(StackTraceElement stackTraceElement) {
        String className = stackTraceElement.getClassName();
        for (String startsWith : ALLOWED_PACKAGES) {
            if (className.startsWith(startsWith)) {
                return true;
            }
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    public boolean containsIntercomMethod(Throwable th2) {
        while (true) {
            if (th2 == null) {
                return false;
            }
            for (StackTraceElement className : th2.getStackTrace()) {
                if (className.getClassName().startsWith("io.intercom.android.sdk")) {
                    return true;
                }
            }
            th2 = th2.getCause();
        }
    }

    /* access modifiers changed from: package-private */
    public ErrorReport createReportFrom(Throwable th2) {
        return new ErrorReport(createExceptionReports(th2), TimeProvider.SYSTEM.currentTimeMillis());
    }
}
