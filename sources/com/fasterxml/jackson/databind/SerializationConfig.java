package com.fasterxml.jackson.databind;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.PropertyAccessor;
import com.fasterxml.jackson.core.Base64Variant;
import com.fasterxml.jackson.core.FormatFeature;
import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.PrettyPrinter;
import com.fasterxml.jackson.core.util.DefaultPrettyPrinter;
import com.fasterxml.jackson.core.util.Instantiatable;
import com.fasterxml.jackson.databind.cfg.BaseSettings;
import com.fasterxml.jackson.databind.cfg.ConfigOverride;
import com.fasterxml.jackson.databind.cfg.ConfigOverrides;
import com.fasterxml.jackson.databind.cfg.ContextAttributes;
import com.fasterxml.jackson.databind.cfg.HandlerInstantiator;
import com.fasterxml.jackson.databind.cfg.MapperConfig;
import com.fasterxml.jackson.databind.cfg.MapperConfigBase;
import com.fasterxml.jackson.databind.introspect.ClassIntrospector;
import com.fasterxml.jackson.databind.introspect.SimpleMixInResolver;
import com.fasterxml.jackson.databind.introspect.VisibilityChecker;
import com.fasterxml.jackson.databind.jsontype.SubtypeResolver;
import com.fasterxml.jackson.databind.jsontype.TypeResolverBuilder;
import com.fasterxml.jackson.databind.ser.FilterProvider;
import com.fasterxml.jackson.databind.type.TypeFactory;
import com.fasterxml.jackson.databind.util.RootNameLookup;
import java.io.Serializable;
import java.text.DateFormat;
import java.util.Locale;
import java.util.TimeZone;

public final class SerializationConfig extends MapperConfigBase<SerializationFeature, SerializationConfig> implements Serializable {
    protected static final JsonInclude.Value DEFAULT_INCLUSION = JsonInclude.Value.empty();
    protected static final PrettyPrinter DEFAULT_PRETTY_PRINTER = new DefaultPrettyPrinter();
    private static final long serialVersionUID = 1;
    protected final PrettyPrinter _defaultPrettyPrinter;
    protected final FilterProvider _filterProvider;
    protected final int _formatWriteFeatures;
    protected final int _formatWriteFeaturesToChange;
    protected final int _generatorFeatures;
    protected final int _generatorFeaturesToChange;
    protected final int _serFeatures;
    protected final JsonInclude.Value _serializationInclusion;

    public SerializationConfig(BaseSettings baseSettings, SubtypeResolver subtypeResolver, SimpleMixInResolver simpleMixInResolver, RootNameLookup rootNameLookup, ConfigOverrides configOverrides) {
        super(baseSettings, subtypeResolver, simpleMixInResolver, rootNameLookup, configOverrides);
        this._serFeatures = MapperConfig.collectFeatureDefaults(SerializationFeature.class);
        this._filterProvider = null;
        this._defaultPrettyPrinter = DEFAULT_PRETTY_PRINTER;
        this._generatorFeatures = 0;
        this._generatorFeaturesToChange = 0;
        this._formatWriteFeatures = 0;
        this._formatWriteFeaturesToChange = 0;
        this._serializationInclusion = DEFAULT_INCLUSION;
    }

    private final SerializationConfig _withBase(BaseSettings baseSettings) {
        if (this._base == baseSettings) {
            return this;
        }
        return new SerializationConfig(this, baseSettings);
    }

    public PrettyPrinter constructDefaultPrettyPrinter() {
        PrettyPrinter prettyPrinter = this._defaultPrettyPrinter;
        if (prettyPrinter instanceof Instantiatable) {
            return (PrettyPrinter) ((Instantiatable) prettyPrinter).createInstance();
        }
        return prettyPrinter;
    }

    public AnnotationIntrospector getAnnotationIntrospector() {
        if (isEnabled(MapperFeature.USE_ANNOTATIONS)) {
            return super.getAnnotationIntrospector();
        }
        return AnnotationIntrospector.nopInstance();
    }

    public PrettyPrinter getDefaultPrettyPrinter() {
        return this._defaultPrettyPrinter;
    }

    public JsonInclude.Value getDefaultPropertyInclusion() {
        return this._serializationInclusion;
    }

    public FilterProvider getFilterProvider() {
        return this._filterProvider;
    }

    public final int getSerializationFeatures() {
        return this._serFeatures;
    }

    @Deprecated
    public JsonInclude.Include getSerializationInclusion() {
        JsonInclude.Include valueInclusion = this._serializationInclusion.getValueInclusion();
        if (valueInclusion == JsonInclude.Include.USE_DEFAULTS) {
            return JsonInclude.Include.ALWAYS;
        }
        return valueInclusion;
    }

    public final boolean hasSerializationFeatures(int i10) {
        if ((this._serFeatures & i10) == i10) {
            return true;
        }
        return false;
    }

    public void initialize(JsonGenerator jsonGenerator) {
        PrettyPrinter constructDefaultPrettyPrinter;
        if (SerializationFeature.INDENT_OUTPUT.enabledIn(this._serFeatures) && jsonGenerator.getPrettyPrinter() == null && (constructDefaultPrettyPrinter = constructDefaultPrettyPrinter()) != null) {
            jsonGenerator.setPrettyPrinter(constructDefaultPrettyPrinter);
        }
        boolean enabledIn = SerializationFeature.WRITE_BIGDECIMAL_AS_PLAIN.enabledIn(this._serFeatures);
        int i10 = this._generatorFeaturesToChange;
        if (i10 != 0 || enabledIn) {
            int i11 = this._generatorFeatures;
            if (enabledIn) {
                int mask = JsonGenerator.Feature.WRITE_BIGDECIMAL_AS_PLAIN.getMask();
                i11 |= mask;
                i10 |= mask;
            }
            jsonGenerator.overrideStdFeatures(i11, i10);
        }
        int i12 = this._formatWriteFeaturesToChange;
        if (i12 != 0) {
            jsonGenerator.overrideFormatFeatures(this._formatWriteFeatures, i12);
        }
    }

    public <T extends BeanDescription> T introspect(JavaType javaType) {
        return getClassIntrospector().forSerialization(this, javaType, this);
    }

    public BeanDescription introspectClassAnnotations(JavaType javaType) {
        return getClassIntrospector().forClassAnnotations(this, javaType, this);
    }

    public BeanDescription introspectDirectClassAnnotations(JavaType javaType) {
        return getClassIntrospector().forDirectClassAnnotations(this, javaType, this);
    }

    public final boolean isEnabled(SerializationFeature serializationFeature) {
        return (serializationFeature.getMask() & this._serFeatures) != 0;
    }

    public String toString() {
        return "[SerializationConfig: flags=0x" + Integer.toHexString(this._serFeatures) + "]";
    }

    public boolean useRootWrapping() {
        PropertyName propertyName = this._rootName;
        if (propertyName != null) {
            return !propertyName.isEmpty();
        }
        return isEnabled(SerializationFeature.WRAP_ROOT_VALUE);
    }

    public SerializationConfig withDefaultPrettyPrinter(PrettyPrinter prettyPrinter) {
        if (this._defaultPrettyPrinter == prettyPrinter) {
            return this;
        }
        return new SerializationConfig(this, prettyPrinter);
    }

    public SerializationConfig withFeatures(SerializationFeature... serializationFeatureArr) {
        int i10 = this._serFeatures;
        int i11 = i10;
        for (SerializationFeature mask : serializationFeatureArr) {
            i11 |= mask.getMask();
        }
        if (i11 == this._serFeatures) {
            return this;
        }
        return new SerializationConfig(this, this._mapperFeatures, i11, this._generatorFeatures, this._generatorFeaturesToChange, this._formatWriteFeatures, this._formatWriteFeaturesToChange);
    }

    public SerializationConfig withFilters(FilterProvider filterProvider) {
        if (filterProvider == this._filterProvider) {
            return this;
        }
        return new SerializationConfig(this, filterProvider);
    }

    public SerializationConfig withPropertyInclusion(JsonInclude.Value value) {
        if (this._serializationInclusion.equals(value)) {
            return this;
        }
        return new SerializationConfig(this, value);
    }

    @Deprecated
    public SerializationConfig withSerializationInclusion(JsonInclude.Include include) {
        return withPropertyInclusion(DEFAULT_INCLUSION.withValueInclusion(include));
    }

    public SerializationConfig withoutFeatures(SerializationFeature... serializationFeatureArr) {
        int i10 = this._serFeatures;
        int i11 = i10;
        for (SerializationFeature mask : serializationFeatureArr) {
            i11 &= ~mask.getMask();
        }
        if (i11 == this._serFeatures) {
            return this;
        }
        return new SerializationConfig(this, this._mapperFeatures, i11, this._generatorFeatures, this._generatorFeaturesToChange, this._formatWriteFeatures, this._formatWriteFeaturesToChange);
    }

    public JsonInclude.Value getDefaultPropertyInclusion(Class<?> cls) {
        JsonInclude.Value include;
        ConfigOverride findConfigOverride = findConfigOverride(cls);
        if (findConfigOverride == null || (include = findConfigOverride.getInclude()) == null) {
            return this._serializationInclusion;
        }
        return include;
    }

    public final boolean isEnabled(JsonGenerator.Feature feature, JsonFactory jsonFactory) {
        if ((feature.getMask() & this._generatorFeaturesToChange) == 0) {
            return jsonFactory.isEnabled(feature);
        }
        return (feature.getMask() & this._generatorFeatures) != 0;
    }

    public SerializationConfig withAppendedAnnotationIntrospector(AnnotationIntrospector annotationIntrospector) {
        return _withBase(this._base.withAppendedAnnotationIntrospector(annotationIntrospector));
    }

    public SerializationConfig withInsertedAnnotationIntrospector(AnnotationIntrospector annotationIntrospector) {
        return _withBase(this._base.withInsertedAnnotationIntrospector(annotationIntrospector));
    }

    public SerializationConfig withRootName(PropertyName propertyName) {
        if (propertyName == null) {
            if (this._rootName == null) {
                return this;
            }
        } else if (propertyName.equals(this._rootName)) {
            return this;
        }
        return new SerializationConfig(this, propertyName);
    }

    public SerializationConfig withView(Class<?> cls) {
        return this._view == cls ? this : new SerializationConfig(this, cls);
    }

    public SerializationConfig withVisibility(PropertyAccessor propertyAccessor, JsonAutoDetect.Visibility visibility) {
        return _withBase(this._base.withVisibility(propertyAccessor, visibility));
    }

    public SerializationConfig without(MapperFeature... mapperFeatureArr) {
        int i10 = this._mapperFeatures;
        int i11 = i10;
        for (MapperFeature mask : mapperFeatureArr) {
            i11 &= ~mask.getMask();
        }
        if (i11 == this._mapperFeatures) {
            return this;
        }
        return new SerializationConfig(this, i11, this._serFeatures, this._generatorFeatures, this._generatorFeaturesToChange, this._formatWriteFeatures, this._formatWriteFeaturesToChange);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0006, code lost:
        r1 = r1.getInclude();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.fasterxml.jackson.annotation.JsonInclude.Value getDefaultPropertyInclusion(java.lang.Class<?> r1, com.fasterxml.jackson.annotation.JsonInclude.Value r2) {
        /*
            r0 = this;
            com.fasterxml.jackson.databind.cfg.ConfigOverride r1 = r0.findConfigOverride(r1)
            if (r1 == 0) goto L_0x000d
            com.fasterxml.jackson.annotation.JsonInclude$Value r1 = r1.getInclude()
            if (r1 == 0) goto L_0x000d
            return r1
        L_0x000d:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.SerializationConfig.getDefaultPropertyInclusion(java.lang.Class, com.fasterxml.jackson.annotation.JsonInclude$Value):com.fasterxml.jackson.annotation.JsonInclude$Value");
    }

    public SerializationConfig withFeatures(JsonGenerator.Feature... featureArr) {
        int i10 = this._generatorFeatures;
        int i11 = this._generatorFeaturesToChange;
        int i12 = i10;
        int i13 = i11;
        for (JsonGenerator.Feature mask : featureArr) {
            int mask2 = mask.getMask();
            i12 |= mask2;
            i13 |= mask2;
        }
        if (this._generatorFeatures == i12 && this._generatorFeaturesToChange == i13) {
            return this;
        }
        return new SerializationConfig(this, this._mapperFeatures, this._serFeatures, i12, i13, this._formatWriteFeatures, this._formatWriteFeaturesToChange);
    }

    public SerializationConfig withoutFeatures(JsonGenerator.Feature... featureArr) {
        int i10 = this._generatorFeatures;
        int i11 = this._generatorFeaturesToChange;
        int i12 = i10;
        int i13 = i11;
        for (JsonGenerator.Feature mask : featureArr) {
            int mask2 = mask.getMask();
            i12 &= ~mask2;
            i13 |= mask2;
        }
        if (this._generatorFeatures == i12 && this._generatorFeaturesToChange == i13) {
            return this;
        }
        return new SerializationConfig(this, this._mapperFeatures, this._serFeatures, i12, i13, this._formatWriteFeatures, this._formatWriteFeaturesToChange);
    }

    public SerializationConfig without(SerializationFeature serializationFeature) {
        int i10 = this._serFeatures & (~serializationFeature.getMask());
        if (i10 == this._serFeatures) {
            return this;
        }
        return new SerializationConfig(this, this._mapperFeatures, i10, this._generatorFeatures, this._generatorFeaturesToChange, this._formatWriteFeatures, this._formatWriteFeaturesToChange);
    }

    public SerializationConfig without(SerializationFeature serializationFeature, SerializationFeature... serializationFeatureArr) {
        int i10 = (~serializationFeature.getMask()) & this._serFeatures;
        int i11 = i10;
        for (SerializationFeature mask : serializationFeatureArr) {
            i11 &= ~mask.getMask();
        }
        if (i11 == this._serFeatures) {
            return this;
        }
        return new SerializationConfig(this, this._mapperFeatures, i11, this._generatorFeatures, this._generatorFeaturesToChange, this._formatWriteFeatures, this._formatWriteFeaturesToChange);
    }

    @Deprecated
    public SerializationConfig(BaseSettings baseSettings, SubtypeResolver subtypeResolver, SimpleMixInResolver simpleMixInResolver, RootNameLookup rootNameLookup) {
        this(baseSettings, subtypeResolver, simpleMixInResolver, rootNameLookup, (ConfigOverrides) null);
    }

    public SerializationConfig withFeatures(FormatFeature... formatFeatureArr) {
        int i10 = this._formatWriteFeatures;
        int i11 = this._formatWriteFeaturesToChange;
        int i12 = i10;
        int i13 = i11;
        for (FormatFeature mask : formatFeatureArr) {
            int mask2 = mask.getMask();
            i12 |= mask2;
            i13 |= mask2;
        }
        if (this._formatWriteFeatures == i12 && this._formatWriteFeaturesToChange == i13) {
            return this;
        }
        return new SerializationConfig(this, this._mapperFeatures, this._serFeatures, this._generatorFeatures, this._generatorFeaturesToChange, i12, i13);
    }

    public SerializationConfig withoutFeatures(FormatFeature... formatFeatureArr) {
        int i10 = this._formatWriteFeatures;
        int i11 = this._formatWriteFeaturesToChange;
        int i12 = i10;
        int i13 = i11;
        for (FormatFeature mask : formatFeatureArr) {
            int mask2 = mask.getMask();
            i12 &= ~mask2;
            i13 |= mask2;
        }
        if (this._formatWriteFeatures == i12 && this._formatWriteFeaturesToChange == i13) {
            return this;
        }
        return new SerializationConfig(this, this._mapperFeatures, this._serFeatures, this._generatorFeatures, this._generatorFeaturesToChange, i12, i13);
    }

    private SerializationConfig(SerializationConfig serializationConfig, SubtypeResolver subtypeResolver) {
        super(serializationConfig, subtypeResolver);
        this._serFeatures = serializationConfig._serFeatures;
        this._serializationInclusion = serializationConfig._serializationInclusion;
        this._filterProvider = serializationConfig._filterProvider;
        this._defaultPrettyPrinter = serializationConfig._defaultPrettyPrinter;
        this._generatorFeatures = serializationConfig._generatorFeatures;
        this._generatorFeaturesToChange = serializationConfig._generatorFeaturesToChange;
        this._formatWriteFeatures = serializationConfig._formatWriteFeatures;
        this._formatWriteFeaturesToChange = serializationConfig._formatWriteFeaturesToChange;
    }

    public SerializationConfig without(JsonGenerator.Feature feature) {
        int i10 = this._generatorFeatures & (~feature.getMask());
        int mask = this._generatorFeaturesToChange | feature.getMask();
        if (this._generatorFeatures == i10 && this._generatorFeaturesToChange == mask) {
            return this;
        }
        return new SerializationConfig(this, this._mapperFeatures, this._serFeatures, i10, mask, this._formatWriteFeatures, this._formatWriteFeaturesToChange);
    }

    public SerializationConfig without(FormatFeature formatFeature) {
        int i10 = this._formatWriteFeatures & (~formatFeature.getMask());
        int mask = this._formatWriteFeaturesToChange | formatFeature.getMask();
        if (this._formatWriteFeatures == i10 && this._formatWriteFeaturesToChange == mask) {
            return this;
        }
        return new SerializationConfig(this, this._mapperFeatures, this._serFeatures, this._generatorFeatures, this._generatorFeaturesToChange, i10, mask);
    }

    public SerializationConfig with(MapperFeature... mapperFeatureArr) {
        int i10 = this._mapperFeatures;
        int i11 = i10;
        for (MapperFeature mask : mapperFeatureArr) {
            i11 |= mask.getMask();
        }
        if (i11 == this._mapperFeatures) {
            return this;
        }
        return new SerializationConfig(this, i11, this._serFeatures, this._generatorFeatures, this._generatorFeaturesToChange, this._formatWriteFeatures, this._formatWriteFeaturesToChange);
    }

    private SerializationConfig(SerializationConfig serializationConfig, int i10, int i11, int i12, int i13, int i14, int i15) {
        super(serializationConfig, i10);
        this._serFeatures = i11;
        this._serializationInclusion = serializationConfig._serializationInclusion;
        this._filterProvider = serializationConfig._filterProvider;
        this._defaultPrettyPrinter = serializationConfig._defaultPrettyPrinter;
        this._generatorFeatures = i12;
        this._generatorFeaturesToChange = i13;
        this._formatWriteFeatures = i14;
        this._formatWriteFeaturesToChange = i15;
    }

    public SerializationConfig with(MapperFeature mapperFeature, boolean z10) {
        int i10;
        if (z10) {
            i10 = mapperFeature.getMask() | this._mapperFeatures;
        } else {
            i10 = (~mapperFeature.getMask()) & this._mapperFeatures;
        }
        int i11 = i10;
        if (i11 == this._mapperFeatures) {
            return this;
        }
        return new SerializationConfig(this, i11, this._serFeatures, this._generatorFeatures, this._generatorFeaturesToChange, this._formatWriteFeatures, this._formatWriteFeaturesToChange);
    }

    public SerializationConfig with(AnnotationIntrospector annotationIntrospector) {
        return _withBase(this._base.withAnnotationIntrospector(annotationIntrospector));
    }

    public SerializationConfig with(ClassIntrospector classIntrospector) {
        return _withBase(this._base.withClassIntrospector(classIntrospector));
    }

    public SerializationConfig with(DateFormat dateFormat) {
        SerializationConfig serializationConfig = new SerializationConfig(this, this._base.withDateFormat(dateFormat));
        if (dateFormat == null) {
            return serializationConfig.with(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS);
        }
        return serializationConfig.without(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS);
    }

    public SerializationConfig with(HandlerInstantiator handlerInstantiator) {
        return _withBase(this._base.withHandlerInstantiator(handlerInstantiator));
    }

    private SerializationConfig(SerializationConfig serializationConfig, BaseSettings baseSettings) {
        super(serializationConfig, baseSettings);
        this._serFeatures = serializationConfig._serFeatures;
        this._serializationInclusion = serializationConfig._serializationInclusion;
        this._filterProvider = serializationConfig._filterProvider;
        this._defaultPrettyPrinter = serializationConfig._defaultPrettyPrinter;
        this._generatorFeatures = serializationConfig._generatorFeatures;
        this._generatorFeaturesToChange = serializationConfig._generatorFeaturesToChange;
        this._formatWriteFeatures = serializationConfig._formatWriteFeatures;
        this._formatWriteFeaturesToChange = serializationConfig._formatWriteFeaturesToChange;
    }

    public SerializationConfig with(PropertyNamingStrategy propertyNamingStrategy) {
        return _withBase(this._base.withPropertyNamingStrategy(propertyNamingStrategy));
    }

    public SerializationConfig with(SubtypeResolver subtypeResolver) {
        return subtypeResolver == this._subtypeResolver ? this : new SerializationConfig(this, subtypeResolver);
    }

    public SerializationConfig with(TypeFactory typeFactory) {
        return _withBase(this._base.withTypeFactory(typeFactory));
    }

    public SerializationConfig with(TypeResolverBuilder<?> typeResolverBuilder) {
        return _withBase(this._base.withTypeResolverBuilder(typeResolverBuilder));
    }

    public SerializationConfig with(VisibilityChecker<?> visibilityChecker) {
        return _withBase(this._base.withVisibilityChecker(visibilityChecker));
    }

    public SerializationConfig with(Locale locale) {
        return _withBase(this._base.with(locale));
    }

    public SerializationConfig with(TimeZone timeZone) {
        return _withBase(this._base.with(timeZone));
    }

    public SerializationConfig with(Base64Variant base64Variant) {
        return _withBase(this._base.with(base64Variant));
    }

    public SerializationConfig with(ContextAttributes contextAttributes) {
        return contextAttributes == this._attributes ? this : new SerializationConfig(this, contextAttributes);
    }

    private SerializationConfig(SerializationConfig serializationConfig, FilterProvider filterProvider) {
        super(serializationConfig);
        this._serFeatures = serializationConfig._serFeatures;
        this._serializationInclusion = serializationConfig._serializationInclusion;
        this._filterProvider = filterProvider;
        this._defaultPrettyPrinter = serializationConfig._defaultPrettyPrinter;
        this._generatorFeatures = serializationConfig._generatorFeatures;
        this._generatorFeaturesToChange = serializationConfig._generatorFeaturesToChange;
        this._formatWriteFeatures = serializationConfig._formatWriteFeatures;
        this._formatWriteFeaturesToChange = serializationConfig._formatWriteFeaturesToChange;
    }

    public SerializationConfig with(SerializationFeature serializationFeature) {
        int mask = this._serFeatures | serializationFeature.getMask();
        if (mask == this._serFeatures) {
            return this;
        }
        return new SerializationConfig(this, this._mapperFeatures, mask, this._generatorFeatures, this._generatorFeaturesToChange, this._formatWriteFeatures, this._formatWriteFeaturesToChange);
    }

    public SerializationConfig with(SerializationFeature serializationFeature, SerializationFeature... serializationFeatureArr) {
        int mask = serializationFeature.getMask() | this._serFeatures;
        int i10 = mask;
        for (SerializationFeature mask2 : serializationFeatureArr) {
            i10 |= mask2.getMask();
        }
        if (i10 == this._serFeatures) {
            return this;
        }
        return new SerializationConfig(this, this._mapperFeatures, i10, this._generatorFeatures, this._generatorFeaturesToChange, this._formatWriteFeatures, this._formatWriteFeaturesToChange);
    }

    public SerializationConfig with(JsonGenerator.Feature feature) {
        int mask = this._generatorFeatures | feature.getMask();
        int mask2 = this._generatorFeaturesToChange | feature.getMask();
        if (this._generatorFeatures == mask && this._generatorFeaturesToChange == mask2) {
            return this;
        }
        return new SerializationConfig(this, this._mapperFeatures, this._serFeatures, mask, mask2, this._formatWriteFeatures, this._formatWriteFeaturesToChange);
    }

    private SerializationConfig(SerializationConfig serializationConfig, Class<?> cls) {
        super(serializationConfig, cls);
        this._serFeatures = serializationConfig._serFeatures;
        this._serializationInclusion = serializationConfig._serializationInclusion;
        this._filterProvider = serializationConfig._filterProvider;
        this._defaultPrettyPrinter = serializationConfig._defaultPrettyPrinter;
        this._generatorFeatures = serializationConfig._generatorFeatures;
        this._generatorFeaturesToChange = serializationConfig._generatorFeaturesToChange;
        this._formatWriteFeatures = serializationConfig._formatWriteFeatures;
        this._formatWriteFeaturesToChange = serializationConfig._formatWriteFeaturesToChange;
    }

    public SerializationConfig with(FormatFeature formatFeature) {
        int mask = this._formatWriteFeatures | formatFeature.getMask();
        int mask2 = this._formatWriteFeaturesToChange | formatFeature.getMask();
        if (this._formatWriteFeatures == mask && this._formatWriteFeaturesToChange == mask2) {
            return this;
        }
        return new SerializationConfig(this, this._mapperFeatures, this._serFeatures, this._generatorFeatures, this._generatorFeaturesToChange, mask, mask2);
    }

    private SerializationConfig(SerializationConfig serializationConfig, JsonInclude.Value value) {
        super(serializationConfig);
        this._serFeatures = serializationConfig._serFeatures;
        this._serializationInclusion = value;
        this._filterProvider = serializationConfig._filterProvider;
        this._defaultPrettyPrinter = serializationConfig._defaultPrettyPrinter;
        this._generatorFeatures = serializationConfig._generatorFeatures;
        this._generatorFeaturesToChange = serializationConfig._generatorFeaturesToChange;
        this._formatWriteFeatures = serializationConfig._formatWriteFeatures;
        this._formatWriteFeaturesToChange = serializationConfig._formatWriteFeaturesToChange;
    }

    private SerializationConfig(SerializationConfig serializationConfig, PropertyName propertyName) {
        super(serializationConfig, propertyName);
        this._serFeatures = serializationConfig._serFeatures;
        this._serializationInclusion = serializationConfig._serializationInclusion;
        this._filterProvider = serializationConfig._filterProvider;
        this._defaultPrettyPrinter = serializationConfig._defaultPrettyPrinter;
        this._generatorFeatures = serializationConfig._generatorFeatures;
        this._generatorFeaturesToChange = serializationConfig._generatorFeaturesToChange;
        this._formatWriteFeatures = serializationConfig._formatWriteFeatures;
        this._formatWriteFeaturesToChange = serializationConfig._formatWriteFeaturesToChange;
    }

    protected SerializationConfig(SerializationConfig serializationConfig, ContextAttributes contextAttributes) {
        super(serializationConfig, contextAttributes);
        this._serFeatures = serializationConfig._serFeatures;
        this._serializationInclusion = serializationConfig._serializationInclusion;
        this._filterProvider = serializationConfig._filterProvider;
        this._defaultPrettyPrinter = serializationConfig._defaultPrettyPrinter;
        this._generatorFeatures = serializationConfig._generatorFeatures;
        this._generatorFeaturesToChange = serializationConfig._generatorFeaturesToChange;
        this._formatWriteFeatures = serializationConfig._formatWriteFeatures;
        this._formatWriteFeaturesToChange = serializationConfig._formatWriteFeaturesToChange;
    }

    protected SerializationConfig(SerializationConfig serializationConfig, SimpleMixInResolver simpleMixInResolver) {
        super(serializationConfig, simpleMixInResolver);
        this._serFeatures = serializationConfig._serFeatures;
        this._serializationInclusion = serializationConfig._serializationInclusion;
        this._filterProvider = serializationConfig._filterProvider;
        this._defaultPrettyPrinter = serializationConfig._defaultPrettyPrinter;
        this._generatorFeatures = serializationConfig._generatorFeatures;
        this._generatorFeaturesToChange = serializationConfig._generatorFeaturesToChange;
        this._formatWriteFeatures = serializationConfig._formatWriteFeatures;
        this._formatWriteFeaturesToChange = serializationConfig._formatWriteFeaturesToChange;
    }

    protected SerializationConfig(SerializationConfig serializationConfig, PrettyPrinter prettyPrinter) {
        super(serializationConfig);
        this._serFeatures = serializationConfig._serFeatures;
        this._serializationInclusion = serializationConfig._serializationInclusion;
        this._filterProvider = serializationConfig._filterProvider;
        this._defaultPrettyPrinter = prettyPrinter;
        this._generatorFeatures = serializationConfig._generatorFeatures;
        this._generatorFeaturesToChange = serializationConfig._generatorFeaturesToChange;
        this._formatWriteFeatures = serializationConfig._formatWriteFeatures;
        this._formatWriteFeaturesToChange = serializationConfig._formatWriteFeaturesToChange;
    }

    protected SerializationConfig(SerializationConfig serializationConfig, SimpleMixInResolver simpleMixInResolver, RootNameLookup rootNameLookup, ConfigOverrides configOverrides) {
        super(serializationConfig, simpleMixInResolver, rootNameLookup, configOverrides);
        this._serFeatures = serializationConfig._serFeatures;
        this._serializationInclusion = serializationConfig._serializationInclusion;
        this._filterProvider = serializationConfig._filterProvider;
        this._defaultPrettyPrinter = serializationConfig._defaultPrettyPrinter;
        this._generatorFeatures = serializationConfig._generatorFeatures;
        this._generatorFeaturesToChange = serializationConfig._generatorFeaturesToChange;
        this._formatWriteFeatures = serializationConfig._formatWriteFeatures;
        this._formatWriteFeaturesToChange = serializationConfig._formatWriteFeaturesToChange;
    }
}
