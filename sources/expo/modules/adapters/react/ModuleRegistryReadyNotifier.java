package expo.modules.adapters.react;

import Md.b;
import com.facebook.react.bridge.BaseJavaModule;

public class ModuleRegistryReadyNotifier extends BaseJavaModule {
    private b mModuleRegistry;

    public ModuleRegistryReadyNotifier(b bVar) {
        this.mModuleRegistry = bVar;
    }

    public String getName() {
        return "ModuleRegistryReadyNotifier";
    }

    public void initialize() {
        this.mModuleRegistry.a();
    }
}
