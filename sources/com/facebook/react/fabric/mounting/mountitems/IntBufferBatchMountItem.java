package com.facebook.react.fabric.mounting.mountitems;

import B7.a;
import M7.b;
import com.facebook.react.bridge.ReactMarker;
import com.facebook.react.bridge.ReactMarkerConstants;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.fabric.FabricUIManager;
import com.facebook.react.fabric.events.EventEmitterWrapper;
import com.facebook.react.fabric.mounting.MountingManager;
import com.facebook.react.fabric.mounting.SurfaceMountingManager;
import com.facebook.react.uimanager.C3413g0;
import z8.C4236a;

@a
final class IntBufferBatchMountItem implements BatchMountItem {
    static final int INSTRUCTION_CREATE = 2;
    static final int INSTRUCTION_DELETE = 4;
    static final int INSTRUCTION_FLAG_MULTIPLE = 1;
    static final int INSTRUCTION_INSERT = 8;
    static final int INSTRUCTION_REMOVE = 16;
    static final int INSTRUCTION_UPDATE_EVENT_EMITTER = 256;
    static final int INSTRUCTION_UPDATE_LAYOUT = 128;
    static final int INSTRUCTION_UPDATE_OVERFLOW_INSET = 1024;
    static final int INSTRUCTION_UPDATE_PADDING = 512;
    static final int INSTRUCTION_UPDATE_PROPS = 32;
    static final int INSTRUCTION_UPDATE_STATE = 64;
    static final String TAG = "IntBufferBatchMountItem";
    private final int mCommitNumber;
    private final int[] mIntBuffer;
    private final int mIntBufferLen;
    private final Object[] mObjBuffer;
    private final int mObjBufferLen;
    private final int mSurfaceId;

    IntBufferBatchMountItem(int i10, int[] iArr, Object[] objArr, int i11) {
        this.mSurfaceId = i10;
        this.mCommitNumber = i11;
        this.mIntBuffer = iArr;
        this.mObjBuffer = objArr;
        this.mIntBufferLen = iArr.length;
        this.mObjBufferLen = objArr.length;
    }

    private void beginMarkers(String str) {
        C4236a.c(0, "IntBufferBatchMountItem::" + str);
        int i10 = this.mCommitNumber;
        if (i10 > 0) {
            ReactMarker.logFabricMarker(ReactMarkerConstants.FABRIC_BATCH_EXECUTION_START, (String) null, i10);
        }
    }

    private void endMarkers() {
        int i10 = this.mCommitNumber;
        if (i10 > 0) {
            ReactMarker.logFabricMarker(ReactMarkerConstants.FABRIC_BATCH_EXECUTION_END, (String) null, i10);
        }
        C4236a.i(0);
    }

    private static String nameForInstructionString(int i10) {
        if (i10 == 2) {
            return "CREATE";
        }
        if (i10 == 4) {
            return "DELETE";
        }
        if (i10 == 8) {
            return "INSERT";
        }
        if (i10 == 16) {
            return "REMOVE";
        }
        if (i10 == 32) {
            return "UPDATE_PROPS";
        }
        if (i10 == 64) {
            return "UPDATE_STATE";
        }
        if (i10 == INSTRUCTION_UPDATE_LAYOUT) {
            return "UPDATE_LAYOUT";
        }
        if (i10 == INSTRUCTION_UPDATE_PADDING) {
            return "UPDATE_PADDING";
        }
        if (i10 == INSTRUCTION_UPDATE_OVERFLOW_INSET) {
            return "UPDATE_OVERFLOW_INSET";
        }
        if (i10 == INSTRUCTION_UPDATE_EVENT_EMITTER) {
            return "UPDATE_EVENT_EMITTER";
        }
        return "UNKNOWN";
    }

    public void execute(MountingManager mountingManager) {
        int i10;
        int i11;
        long j10;
        int i12;
        int i13;
        int i14;
        boolean z10;
        SurfaceMountingManager surfaceManager = mountingManager.getSurfaceManager(this.mSurfaceId);
        if (surfaceManager == null) {
            U5.a.o(TAG, "Skipping batch of MountItems; no SurfaceMountingManager found for [%d].", Integer.valueOf(this.mSurfaceId));
        } else if (surfaceManager.isStopped()) {
            U5.a.o(TAG, "Skipping batch of MountItems; was stopped [%d].", Integer.valueOf(this.mSurfaceId));
        } else {
            if (b.h()) {
                U5.a.c(TAG, "Executing IntBufferBatchMountItem on surface [%d]", Integer.valueOf(this.mSurfaceId));
            }
            beginMarkers("mountViews");
            int i15 = 0;
            int i16 = 0;
            while (i15 < this.mIntBufferLen) {
                int[] iArr = this.mIntBuffer;
                int i17 = i15 + 1;
                int i18 = iArr[i15];
                int i19 = i18 & -2;
                if ((i18 & 1) != 0) {
                    int i20 = iArr[i17];
                    i17 = i15 + 2;
                    i10 = i20;
                } else {
                    i10 = 1;
                }
                long j11 = 0;
                C4236a.d(0, "IntBufferBatchMountItem::mountInstructions::" + nameForInstructionString(i19), new String[]{"numInstructions", String.valueOf(i10)}, 2);
                int i21 = i16;
                i15 = i17;
                int i22 = 0;
                while (i22 < i10) {
                    if (i19 == 2) {
                        String fabricComponentName = FabricNameComponentMapping.getFabricComponentName((String) this.mObjBuffer[i21]);
                        int[] iArr2 = this.mIntBuffer;
                        int i23 = iArr2[i15];
                        Object[] objArr = this.mObjBuffer;
                        ReadableMap readableMap = (ReadableMap) objArr[i21 + 1];
                        int i24 = i21 + 3;
                        C3413g0 g0Var = (C3413g0) objArr[i21 + 2];
                        i21 += 4;
                        EventEmitterWrapper eventEmitterWrapper = (EventEmitterWrapper) objArr[i24];
                        int i25 = i15 + 2;
                        if (iArr2[i15 + 1] == 1) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        i11 = i22;
                        surfaceManager.createView(fabricComponentName, i23, readableMap, g0Var, eventEmitterWrapper, z10);
                        i15 = i25;
                    } else {
                        i11 = i22;
                        if (i19 == 4) {
                            surfaceManager.deleteView(this.mIntBuffer[i15]);
                            i15++;
                        } else if (i19 == 8) {
                            int[] iArr3 = this.mIntBuffer;
                            int i26 = iArr3[i15];
                            int i27 = i15 + 2;
                            i15 += 3;
                            surfaceManager.addViewAt(iArr3[i15 + 1], i26, iArr3[i27]);
                        } else if (i19 == 16) {
                            int[] iArr4 = this.mIntBuffer;
                            int i28 = i15 + 2;
                            i15 += 3;
                            surfaceManager.removeViewAt(iArr4[i15], iArr4[i15 + 1], iArr4[i28]);
                        } else {
                            if (i19 == 32) {
                                i13 = i15 + 1;
                                i14 = i21 + 1;
                                surfaceManager.updateProps(this.mIntBuffer[i15], (ReadableMap) this.mObjBuffer[i21]);
                            } else if (i19 == 64) {
                                i13 = i15 + 1;
                                i14 = i21 + 1;
                                surfaceManager.updateState(this.mIntBuffer[i15], (C3413g0) this.mObjBuffer[i21]);
                            } else {
                                if (i19 == INSTRUCTION_UPDATE_LAYOUT) {
                                    int[] iArr5 = this.mIntBuffer;
                                    j10 = 0;
                                    surfaceManager.updateLayout(iArr5[i15], iArr5[i15 + 1], iArr5[i15 + 2], iArr5[i15 + 3], iArr5[i15 + 4], iArr5[i15 + 5], iArr5[i15 + 6], iArr5[i15 + 7]);
                                    i15 += 8;
                                } else {
                                    j10 = 0;
                                    if (i19 == INSTRUCTION_UPDATE_PADDING) {
                                        int[] iArr6 = this.mIntBuffer;
                                        i12 = i15 + 5;
                                        surfaceManager.updatePadding(iArr6[i15], iArr6[i15 + 1], iArr6[i15 + 2], iArr6[i15 + 3], iArr6[i15 + 4]);
                                    } else if (i19 == INSTRUCTION_UPDATE_OVERFLOW_INSET) {
                                        int[] iArr7 = this.mIntBuffer;
                                        i12 = i15 + 5;
                                        surfaceManager.updateOverflowInset(iArr7[i15], iArr7[i15 + 1], iArr7[i15 + 2], iArr7[i15 + 3], iArr7[i15 + 4]);
                                    } else if (i19 == INSTRUCTION_UPDATE_EVENT_EMITTER) {
                                        surfaceManager.updateEventEmitter(this.mIntBuffer[i15], (EventEmitterWrapper) this.mObjBuffer[i21]);
                                        i15++;
                                        i21++;
                                    } else {
                                        throw new IllegalArgumentException("Invalid type argument to IntBufferBatchMountItem: " + i19 + " at index: " + i15);
                                    }
                                    i15 = i12;
                                }
                                i22 = i11 + 1;
                                j11 = j10;
                            }
                            i15 = i13;
                            i21 = i14;
                        }
                    }
                    j10 = 0;
                    i22 = i11 + 1;
                    j11 = j10;
                }
                C4236a.i(j11);
                i16 = i21;
            }
            endMarkers();
        }
    }

    public int getSurfaceId() {
        return this.mSurfaceId;
    }

    public boolean isBatchEmpty() {
        if (this.mIntBufferLen == 0) {
            return true;
        }
        return false;
    }

    public String toString() {
        String str;
        int i10;
        int i11;
        try {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(String.format("IntBufferBatchMountItem [surface:%d]:\n", new Object[]{Integer.valueOf(this.mSurfaceId)}));
            int i12 = 0;
            int i13 = 0;
            while (i12 < this.mIntBufferLen) {
                int[] iArr = this.mIntBuffer;
                int i14 = i12 + 1;
                int i15 = iArr[i12];
                int i16 = i15 & -2;
                int i17 = 1;
                if ((i15 & 1) != 0) {
                    i17 = iArr[i14];
                    i14 = i12 + 2;
                }
                i12 = i14;
                int i18 = 0;
                while (true) {
                    if (i18 < i17) {
                        if (i16 == 2) {
                            String fabricComponentName = FabricNameComponentMapping.getFabricComponentName((String) this.mObjBuffer[i13]);
                            i13 += 4;
                            int i19 = i12 + 1;
                            i12 += 2;
                            sb2.append(String.format("CREATE [%d] - layoutable:%d - %s\n", new Object[]{Integer.valueOf(this.mIntBuffer[i12]), Integer.valueOf(this.mIntBuffer[i19]), fabricComponentName}));
                        } else if (i16 == 4) {
                            sb2.append(String.format("DELETE [%d]\n", new Object[]{Integer.valueOf(this.mIntBuffer[i12])}));
                            i12++;
                        } else if (i16 == 8) {
                            int i20 = i12 + 2;
                            i12 += 3;
                            sb2.append(String.format("INSERT [%d]->[%d] @%d\n", new Object[]{Integer.valueOf(this.mIntBuffer[i12]), Integer.valueOf(this.mIntBuffer[i12 + 1]), Integer.valueOf(this.mIntBuffer[i20])}));
                        } else if (i16 == 16) {
                            int i21 = i12 + 2;
                            i12 += 3;
                            sb2.append(String.format("REMOVE [%d]->[%d] @%d\n", new Object[]{Integer.valueOf(this.mIntBuffer[i12]), Integer.valueOf(this.mIntBuffer[i12 + 1]), Integer.valueOf(this.mIntBuffer[i21])}));
                        } else {
                            String str2 = "<hidden>";
                            if (i16 == 32) {
                                i10 = i13 + 1;
                                Object obj = this.mObjBuffer[i13];
                                if (FabricUIManager.IS_DEVELOPMENT_ENVIRONMENT) {
                                    if (obj != null) {
                                        str2 = obj.toString();
                                    } else {
                                        str2 = "<null>";
                                    }
                                }
                                i11 = i12 + 1;
                                sb2.append(String.format("UPDATE PROPS [%d]: %s\n", new Object[]{Integer.valueOf(this.mIntBuffer[i12]), str2}));
                            } else if (i16 == 64) {
                                i10 = i13 + 1;
                                C3413g0 g0Var = (C3413g0) this.mObjBuffer[i13];
                                if (FabricUIManager.IS_DEVELOPMENT_ENVIRONMENT) {
                                    if (g0Var != null) {
                                        str2 = g0Var.toString();
                                    } else {
                                        str2 = "<null>";
                                    }
                                }
                                i11 = i12 + 1;
                                sb2.append(String.format("UPDATE STATE [%d]: %s\n", new Object[]{Integer.valueOf(this.mIntBuffer[i12]), str2}));
                            } else if (i16 == INSTRUCTION_UPDATE_LAYOUT) {
                                int[] iArr2 = this.mIntBuffer;
                                int i22 = iArr2[i12];
                                int i23 = iArr2[i12 + 1];
                                int i24 = iArr2[i12 + 2];
                                int i25 = iArr2[i12 + 3];
                                int i26 = iArr2[i12 + 4];
                                int i27 = iArr2[i12 + 5];
                                int i28 = i12 + 7;
                                int i29 = iArr2[i12 + 6];
                                i12 += 8;
                                sb2.append(String.format("UPDATE LAYOUT [%d]->[%d]: x:%d y:%d w:%d h:%d displayType:%d layoutDirection: %d\n", new Object[]{Integer.valueOf(i23), Integer.valueOf(i22), Integer.valueOf(i24), Integer.valueOf(i25), Integer.valueOf(i26), Integer.valueOf(i27), Integer.valueOf(i29), Integer.valueOf(iArr2[i28])}));
                            } else if (i16 == INSTRUCTION_UPDATE_PADDING) {
                                int i30 = i12 + 4;
                                i12 += 5;
                                sb2.append(String.format("UPDATE PADDING [%d]: top:%d right:%d bottom:%d left:%d\n", new Object[]{Integer.valueOf(this.mIntBuffer[i12]), Integer.valueOf(this.mIntBuffer[i12 + 1]), Integer.valueOf(this.mIntBuffer[i12 + 2]), Integer.valueOf(this.mIntBuffer[i12 + 3]), Integer.valueOf(this.mIntBuffer[i30])}));
                            } else if (i16 == INSTRUCTION_UPDATE_OVERFLOW_INSET) {
                                int i31 = i12 + 4;
                                i12 += 5;
                                sb2.append(String.format("UPDATE OVERFLOWINSET [%d]: left:%d top:%d right:%d bottom:%d\n", new Object[]{Integer.valueOf(this.mIntBuffer[i12]), Integer.valueOf(this.mIntBuffer[i12 + 1]), Integer.valueOf(this.mIntBuffer[i12 + 2]), Integer.valueOf(this.mIntBuffer[i12 + 3]), Integer.valueOf(this.mIntBuffer[i31])}));
                            } else if (i16 == INSTRUCTION_UPDATE_EVENT_EMITTER) {
                                i13++;
                                sb2.append(String.format("UPDATE EVENTEMITTER [%d]\n", new Object[]{Integer.valueOf(this.mIntBuffer[i12])}));
                                i12++;
                            } else {
                                String str3 = TAG;
                                U5.a.m(str3, "String so far: " + sb2.toString());
                                throw new IllegalArgumentException("Invalid type argument to IntBufferBatchMountItem: " + i16 + " at index: " + i12);
                            }
                            i12 = i11;
                            i13 = i10;
                        }
                        i18++;
                    }
                }
            }
            return sb2.toString();
        } catch (Exception e10) {
            U5.a.n(TAG, "Caught exception trying to print", e10);
            StringBuilder sb3 = new StringBuilder();
            for (int i32 = 0; i32 < this.mIntBufferLen; i32++) {
                sb3.append(this.mIntBuffer[i32]);
                sb3.append(", ");
            }
            U5.a.m(TAG, sb3.toString());
            for (int i33 = 0; i33 < this.mObjBufferLen; i33++) {
                String str4 = TAG;
                Object obj2 = this.mObjBuffer[i33];
                if (obj2 != null) {
                    str = obj2.toString();
                } else {
                    str = "null";
                }
                U5.a.m(str4, str);
            }
            return "";
        }
    }
}
