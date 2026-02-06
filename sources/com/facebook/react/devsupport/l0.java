package com.facebook.react.devsupport;

import I7.j;
import com.facebook.react.bridge.JavaOnlyArray;
import com.facebook.react.bridge.JavaOnlyMap;
import com.facebook.react.interfaces.exceptionmanager.ReactJsExceptionHandler;
import com.revenuecat.purchases.common.Constants;
import io.intercom.android.sdk.metrics.MetricTracker;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

public abstract class l0 {

    /* renamed from: a  reason: collision with root package name */
    private static final Pattern f40858a = Pattern.compile("^(?:(.*?)@)?(.*?)\\:([0-9]+)\\:([0-9]+)$");

    /* renamed from: b  reason: collision with root package name */
    private static final Pattern f40859b = Pattern.compile("\\s*(?:at)\\s*(.+?)\\s*[@(](.*):([0-9]+):([0-9]+)[)]$");

    public static class a implements j {

        /* renamed from: a  reason: collision with root package name */
        private final String f40860a;

        /* renamed from: b  reason: collision with root package name */
        private final String f40861b;

        /* renamed from: c  reason: collision with root package name */
        private final int f40862c;

        /* renamed from: d  reason: collision with root package name */
        private final int f40863d;

        /* renamed from: e  reason: collision with root package name */
        private final String f40864e;

        /* renamed from: f  reason: collision with root package name */
        private final boolean f40865f;

        public int a() {
            return this.f40862c;
        }

        public String b() {
            return this.f40861b;
        }

        public boolean c() {
            return this.f40865f;
        }

        public int getColumn() {
            return this.f40863d;
        }

        public String getFile() {
            return this.f40860a;
        }

        public String getFileName() {
            return this.f40864e;
        }

        private a(String str, String str2, String str3, int i10, int i11) {
            this.f40860a = str;
            this.f40864e = str2;
            this.f40861b = str3;
            this.f40862c = i10;
            this.f40863d = i11;
            this.f40865f = false;
        }
    }

    public static j[] a(Throwable th2) {
        StackTraceElement[] stackTrace = th2.getStackTrace();
        j[] jVarArr = new j[stackTrace.length];
        for (int i10 = 0; i10 < stackTrace.length; i10++) {
            jVarArr[i10] = new a(stackTrace[i10].getClassName(), stackTrace[i10].getFileName(), stackTrace[i10].getMethodName(), stackTrace[i10].getLineNumber(), -1);
        }
        return jVarArr;
    }

    public static JavaOnlyMap b(ReactJsExceptionHandler.ParsedError parsedError) {
        List<ReactJsExceptionHandler.ParsedError.StackFrame> stack = parsedError.getStack();
        ArrayList arrayList = new ArrayList();
        for (ReactJsExceptionHandler.ParsedError.StackFrame next : stack) {
            JavaOnlyMap javaOnlyMap = new JavaOnlyMap();
            if (next.getColumn() != null) {
                javaOnlyMap.putDouble("column", (double) next.getColumn().intValue());
            }
            if (next.getLineNumber() != null) {
                javaOnlyMap.putDouble("lineNumber", (double) next.getLineNumber().intValue());
            }
            javaOnlyMap.putString("file", next.getFile());
            javaOnlyMap.putString("methodName", next.getMethodName());
            arrayList.add(javaOnlyMap);
        }
        JavaOnlyMap javaOnlyMap2 = new JavaOnlyMap();
        javaOnlyMap2.putString(MetricTracker.Object.MESSAGE, parsedError.getMessage());
        if (parsedError.getOriginalMessage() != null) {
            javaOnlyMap2.putString("originalMessage", parsedError.getOriginalMessage());
        }
        if (parsedError.getName() != null) {
            javaOnlyMap2.putString("name", parsedError.getName());
        }
        if (parsedError.getComponentStack() != null) {
            javaOnlyMap2.putString("componentStack", parsedError.getComponentStack());
        }
        javaOnlyMap2.putArray("stack", JavaOnlyArray.from(arrayList));
        javaOnlyMap2.putInt("id", parsedError.getId());
        javaOnlyMap2.putBoolean("isFatal", parsedError.isFatal());
        javaOnlyMap2.putMap("extraData", parsedError.getExtraData());
        return javaOnlyMap2;
    }

    public static String c(j jVar) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(jVar.getFileName());
        int a10 = jVar.a();
        if (a10 > 0) {
            sb2.append(Constants.SUBS_ID_BASE_PLAN_ID_SEPARATOR);
            sb2.append(a10);
            int column = jVar.getColumn();
            if (column > 0) {
                sb2.append(Constants.SUBS_ID_BASE_PLAN_ID_SEPARATOR);
                sb2.append(column);
            }
        }
        return sb2.toString();
    }
}
