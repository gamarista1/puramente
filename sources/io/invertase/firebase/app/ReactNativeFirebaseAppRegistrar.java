package io.invertase.firebase.app;

import Cc.h;
import Eb.C4282c;
import androidx.annotation.Keep;
import com.google.firebase.components.ComponentRegistrar;
import java.util.Collections;
import java.util.List;

@Keep
public class ReactNativeFirebaseAppRegistrar implements ComponentRegistrar {
    public List<C4282c> getComponents() {
        return Collections.singletonList(h.b("react-native-firebase", c.f71135a));
    }
}
