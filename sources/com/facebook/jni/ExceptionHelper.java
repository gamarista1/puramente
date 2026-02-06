package com.facebook.jni;

import com.facebook.jni.annotations.DoNotStrip;
import java.io.PrintWriter;
import java.io.StringWriter;

@DoNotStrip
class ExceptionHelper {
    ExceptionHelper() {
    }

    @DoNotStrip
    private static String getErrorDescription(Throwable th2) {
        StringWriter stringWriter = new StringWriter();
        th2.printStackTrace(new PrintWriter(stringWriter));
        return stringWriter.toString();
    }
}
