package com.swmansion.reanimated;

import android.util.Log;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.uimanager.B0;
import com.facebook.react.uimanager.C3403b0;
import com.facebook.react.uimanager.ReanimatedUIManager;
import com.facebook.react.uimanager.UIManagerModule;
import com.facebook.react.uimanager.ViewManager;
import java.lang.reflect.Field;
import java.util.List;

public class ReanimatedUIManagerFactory {
    static UIManagerModule create(ReactApplicationContext reactApplicationContext, List<ViewManager> list, int i10) {
        B0 b02 = new B0((List) list);
        ReanimatedUIManager reanimatedUIManager = new ReanimatedUIManager(reactApplicationContext, list, i10);
        C3403b0 b0Var = new C3403b0(reactApplicationContext, b02, reanimatedUIManager.getEventDispatcher(), i10);
        Class<? super ReanimatedUIManager> superclass = ReanimatedUIManager.class.getSuperclass();
        if (superclass == null) {
            Log.e("reanimated", "unable to resolve super class of ReanimatedUIManager");
            return reanimatedUIManager;
        }
        try {
            Field declaredField = superclass.getDeclaredField("mUIImplementation");
            declaredField.setAccessible(true);
            try {
                Field declaredField2 = Field.class.getDeclaredField("accessFlags");
                declaredField2.setAccessible(true);
                declaredField2.setInt(declaredField, declaredField.getModifiers() & -17);
            } catch (IllegalAccessException | NoSuchFieldException e10) {
                e10.printStackTrace();
            }
            declaredField.set(reanimatedUIManager, b0Var);
        } catch (IllegalAccessException | NoSuchFieldException e11) {
            e11.printStackTrace();
        }
        return reanimatedUIManager;
    }
}
