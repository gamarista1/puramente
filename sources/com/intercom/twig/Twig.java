package com.intercom.twig;

import android.util.Log;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

public class Twig {
    public static final int DISABLED = 8;
    private static final int MAX_LOG_LENGTH = 4000;
    private final boolean internalLoggingEnabled;
    private int logLevel;
    private final String tag;

    @Retention(RetentionPolicy.SOURCE)
    public @interface LogLevel {
    }

    public Twig(int i10, String str, boolean z10) {
        this.logLevel = i10;
        this.tag = str == null ? "Twig" : str;
        this.internalLoggingEnabled = z10;
    }

    private String getStackTraceString(Throwable th2) {
        StringWriter stringWriter = new StringWriter(256);
        PrintWriter printWriter = new PrintWriter(stringWriter, false);
        th2.printStackTrace(printWriter);
        printWriter.flush();
        return stringWriter.toString();
    }

    private void prepareLog(int i10, Throwable th2, String str, Object... objArr) {
        String str2;
        if (i10 >= this.logLevel) {
            String tag2 = getTag();
            if (str != null && str.length() == 0) {
                str = null;
            }
            if (str != null) {
                if (objArr.length > 0) {
                    str = String.format(str, objArr);
                }
                if (th2 != null) {
                    str2 = str + "\n" + getStackTraceString(th2);
                } else {
                    str2 = str;
                }
            } else if (th2 != null) {
                str2 = getStackTraceString(th2);
            } else {
                return;
            }
            log(i10, tag2, str2);
        }
    }

    private void printLog(int i10, String str, String str2) {
        if (i10 == 7) {
            Log.wtf(str, str2);
        } else {
            Log.println(i10, str, str2);
        }
    }

    public void d(String str, Object... objArr) {
        prepareLog(3, (Throwable) null, str, objArr);
    }

    public void e(String str, Object... objArr) {
        prepareLog(6, (Throwable) null, str, objArr);
    }

    /* access modifiers changed from: package-private */
    public int getLogLevel() {
        return this.logLevel;
    }

    public String getTag() {
        return this.tag;
    }

    public void i(String str, Object... objArr) {
        prepareLog(4, (Throwable) null, str, objArr);
    }

    public void internal(String str) {
        internal(this.tag, str);
    }

    /* access modifiers changed from: package-private */
    public void log(int i10, String str, Object... objArr) {
        prepareLog(i10, (Throwable) null, str, objArr);
    }

    public void setLogLevel(int i10) {
        this.logLevel = i10;
    }

    public void v(String str, Object... objArr) {
        prepareLog(2, (Throwable) null, str, objArr);
    }

    public void w(String str, Object... objArr) {
        prepareLog(5, (Throwable) null, str, objArr);
    }

    public void wtf(String str, Object... objArr) {
        prepareLog(7, (Throwable) null, str, objArr);
    }

    private void log(int i10, String str, String str2) {
        int min;
        if (str2.length() < MAX_LOG_LENGTH) {
            printLog(i10, str, str2);
            return;
        }
        int length = str2.length();
        int i11 = 0;
        while (i11 < length) {
            int indexOf = str2.indexOf(10, i11);
            if (indexOf == -1) {
                indexOf = length;
            }
            while (true) {
                min = Math.min(indexOf, i11 + MAX_LOG_LENGTH);
                printLog(i10, str, str2.substring(i11, min));
                if (min >= indexOf) {
                    break;
                }
                i11 = min;
            }
            i11 = min + 1;
        }
    }

    public void d(Throwable th2, String str, Object... objArr) {
        prepareLog(3, th2, str, objArr);
    }

    public void e(Throwable th2, String str, Object... objArr) {
        prepareLog(6, th2, str, objArr);
    }

    public void i(Throwable th2, String str, Object... objArr) {
        prepareLog(4, th2, str, objArr);
    }

    public void internal(String str, String str2) {
        if (this.internalLoggingEnabled) {
            Log.d(str, "INTERNAL: " + str2);
        }
    }

    public void v(Throwable th2, String str, Object... objArr) {
        prepareLog(2, th2, str, objArr);
    }

    public void w(Throwable th2, String str, Object... objArr) {
        prepareLog(5, th2, str, objArr);
    }

    public void wtf(Throwable th2, String str, Object... objArr) {
        prepareLog(7, th2, str, objArr);
    }

    public void d(Throwable th2) {
        prepareLog(3, th2, (String) null, new Object[0]);
    }

    public void e(Throwable th2) {
        prepareLog(6, th2, (String) null, new Object[0]);
    }

    public void i(Throwable th2) {
        prepareLog(4, th2, (String) null, new Object[0]);
    }

    public void v(Throwable th2) {
        prepareLog(2, th2, (String) null, new Object[0]);
    }

    public void w(Throwable th2) {
        prepareLog(5, th2, (String) null, new Object[0]);
    }

    public void wtf(Throwable th2) {
        prepareLog(7, th2, (String) null, new Object[0]);
    }
}
