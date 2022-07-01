package com.thevoxelbox.voxelsniper.brush.property;

import java.util.ArrayList;
import java.util.List;

public class BrushPropertiesBuilder {

    private String name;
    private String permission;
    private final List<String> aliases = new ArrayList<>(1);
    private BrushPatternType brushPatternType;
    private BrushCreator creator;

    public BrushPropertiesBuilder name(String name) {
        this.name = name;
        return this;
    }

    public BrushPropertiesBuilder permission(String permission) {
        this.permission = permission;
        return this;
    }

    public BrushPropertiesBuilder alias(String alias) {
        this.aliases.add(alias);
        return this;
    }

    public BrushPropertiesBuilder brushPatternType(BrushPatternType brushPatternType) {
        this.brushPatternType = brushPatternType;
        return this;
    }

    public BrushPropertiesBuilder creator(BrushCreator creator) {
        this.creator = creator;
        return this;
    }

    public BrushProperties build() {
        if (this.name == null) {
            throw new RuntimeException("Brush name must be specified.");
        }
        if (this.brushPatternType == null) {
            throw new RuntimeException("Brush pattern type must be specified.");
        }
        if (this.creator == null) {
            throw new RuntimeException("Brush creator must be specified.");
        }
        return new BrushProperties(this.name, this.permission, this.aliases, this.brushPatternType, this.creator);
    }

}
